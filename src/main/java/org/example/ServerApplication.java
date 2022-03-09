package org.example;

import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import jdk.incubator.foreign.ValueLayout;
import netinet.in.in_addr;
import netinet.in.sockaddr_in;
import netinet.sctp.sctp_sndrcvinfo;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import static netinet.sctp.sctp_h.*;

public class ServerApplication {
    public static void main(String[] args) throws Exception {
        System.load("/usr/lib/x86_64-linux-gnu/libsctp.so");
        short localPort = 5000;
        List<InetAddress> addresses = List.of(
                InetAddress.getByName("127.0.0.1"),
                InetAddress.getByName("127.0.0.2"),
                InetAddress.getByName("127.0.0.3")
        );
        if (addresses.isEmpty()) {
            throw new IllegalStateException("Need an address to bind");
        }
        try (ResourceScope scope = ResourceScope.newSharedScope()) {
            int socket = socket(AF_INET(), SOCK_STREAM(), IPPROTO_SCTP());
            System.out.println("Socket: " + socket);
            for (int i = 0; i < addresses.size(); i++) {
                InetAddress inetAddress = addresses.get(i);
                var address = createAddressSegment(inetAddress.getAddress(), localPort);
                int result = Integer.MIN_VALUE;
                if (i == 0) {
                    result = bind(socket, address, (int) sockaddr_in.sizeof());
                } else {
                    result = sctp_bindx(socket, address, 1, SCTP_BINDX_ADD_ADDR());
                }
                System.out.printf("Bind result for %s: %s%n", inetAddress.getHostAddress(),
                                  result < 0 ? "FAILED!" : "OK!");
            }
            System.out.println("Listen result: " + listen(socket, 1));
            MemorySegment clientAddress = sockaddr_in.allocate(SegmentAllocator.implicitAllocator());
            MemorySegment addressLength = MemorySegment.allocateNative(Long.BYTES, scope);
            addressLength.setAtIndex(ValueLayout.OfLong.JAVA_LONG, 0, sockaddr_in.sizeof());
            int accept = accept(socket, clientAddress, addressLength);
            System.out.println("Accepted socket: " + accept);
            if (accept == -1) {
                throw new IllegalStateException("Client could not connect");
            }
            CompletableFuture<Void> future = listenSocket(accept, scope);
            System.out.println("Connected port: " + Short.reverseBytes(sockaddr_in.sin_port$get(clientAddress)));
            TimeUnit.SECONDS.sleep(5);
            var messageString = "hello";
            MemorySegment message = MemorySegment.allocateNative(messageString.length() + 1, scope);
            message.setUtf8String(0, messageString);
            for (int i = 0; i < 5; i++) {
                MemorySegment sendInfo = sctp_sndrcvinfo.allocate(scope);
                sctp_sndrcvinfo.sinfo_stream$set(sendInfo, (short) 8);
                sctp_sndrcvinfo.sinfo_ppid$set(sendInfo, Integer.reverseBytes(100));
                int writtenBytes = sctp_send(accept, message, message.byteSize(), sendInfo, 0);
                System.out.printf("Written bytes in %d repeat: %d%n", i + 1, writtenBytes);
                TimeUnit.SECONDS.sleep(2);
            }
            future.get();
            System.err.println("System closed!");
        }
    }

    private static CompletableFuture<Void> listenSocket(int clientSocket, ResourceScope scope) {
        return CompletableFuture.runAsync(() -> {
            try {
                MemorySegment buffer = MemorySegment.allocateNative(1024, scope);
                do {
                    MemorySegment receiveInfo = sctp_sndrcvinfo.allocate(scope);
                    MemorySegment fromAddress = sockaddr_in.allocate(scope);
                    MemorySegment fromAddressLength = MemorySegment.allocateNative(ValueLayout.OfLong.JAVA_LONG, scope);
                    fromAddressLength.set(ValueLayout.OfLong.JAVA_LONG, 0, sockaddr_in.sizeof());
                    MemorySegment flags = MemorySegment.allocateNative(ValueLayout.OfLong.JAVA_INT, scope);
                    flags.set(ValueLayout.OfInt.JAVA_INT, 0, 0);
                    int receivedBytes = sctp_recvmsg(clientSocket, buffer, buffer.byteSize(),
                                                     fromAddress, fromAddressLength, receiveInfo, flags);
                    if (receivedBytes < 0) {
                        System.err.println("Client disconnected!");
                        break;
                    }
                    int address = Integer.reverseBytes(in_addr.s_addr$get(sockaddr_in.sin_addr$slice(fromAddress)));
                    InetAddress inetAddress = InetAddress.getByAddress(BigInteger.valueOf(address).toByteArray());
                    String fromAddressString = inetAddress.getHostAddress();
                    byte[] messageBytes = new byte[receivedBytes];
                    buffer.asByteBuffer().get(messageBytes, 0, receivedBytes);
                    String receivedMessageString = new String(Arrays.copyOfRange(messageBytes, 0, receivedBytes - 2));
                    System.out.printf("From %s message is '%s'%n", fromAddressString, receivedMessageString);
                } while (true);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        });
    }

    private static MemorySegment createAddressSegment(byte[] host, short port) {
        MemorySegment address = sockaddr_in.allocate(SegmentAllocator.implicitAllocator());
        sockaddr_in.sin_family$set(address, (short) AF_INET());
        sockaddr_in.sin_port$set(address, Short.reverseBytes(port));
        int reversed = Integer.reverseBytes(ByteBuffer.wrap(host).getInt());
        in_addr.s_addr$set(sockaddr_in.sin_addr$slice(address), reversed);
        return address;
    }
}