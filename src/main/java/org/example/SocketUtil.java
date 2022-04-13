package org.example;

import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.ValueLayout;
import netinet.in.in_addr;
import netinet.in.sockaddr_in;
import netinet.sctp.sctp_sndrcvinfo;

import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static netinet.sctp.sctp_h.*;

public class SocketUtil {

    private SocketUtil() {
    }

    public static void connectClient(ResourceScope scope, int socket, List<InetAddress> addresses, short remotePort) {
        if (addresses.size() < 1) {
            throw new IllegalArgumentException("There is no address to connect.");
        } else if (addresses.size() == 1) {
            MemorySegment addressSegment = createAddressSegment(scope, addresses.get(0).getAddress(), remotePort);
            int connect = connect(socket, addressSegment, ((int) sockaddr_in.sizeof()));
            if (connect < 0) {
                throw new IllegalStateException("Could not connect to server.");
            }
        } else {
            // TODO: implement
        }
    }

    public static int createSocket(ResourceScope scope, List<InetAddress> addresses, short localPort) {
        int socket = socket(AF_INET(), SOCK_STREAM(), IPPROTO_SCTP());
        if (socket < 0) {
            throw new IllegalStateException("Socket creation failure");
        }
        for (int i = 0; i < addresses.size(); i++) {
            InetAddress inetAddress = addresses.get(i);
            var address = createAddressSegment(scope, inetAddress.getAddress(), localPort);
            int bindResult;
            if (i == 0) {
                bindResult = bind(socket, address, (int) sockaddr_in.sizeof());
            } else {
                bindResult = sctp_bindx(socket, address, 1, SCTP_BINDX_ADD_ADDR());
            }
            if (bindResult < 0) {
                throw new IllegalStateException("%s:%d cannot bind to socket".formatted(inetAddress.getHostAddress(), localPort));
            }
        }
        return socket;
    }

    private static MemorySegment createAddressSegment(ResourceScope scope, byte[] host, short port) {
        MemorySegment address = sockaddr_in.allocate(scope);
        sockaddr_in.sin_family$set(address, (short) AF_INET());
        sockaddr_in.sin_port$set(address, Short.reverseBytes(port));
        int reversed = Integer.reverseBytes(ByteBuffer.wrap(host).getInt());
        in_addr.s_addr$set(sockaddr_in.sin_addr$slice(address), reversed);
        return address;
    }

    public static void sendMessage(ResourceScope scope, int clientSocket, String messageString) {
        int bytesSize = messageString.getBytes(StandardCharsets.UTF_8).length + 1;
        MemorySegment message = MemorySegment.allocateNative(bytesSize, scope);
        message.setUtf8String(0, messageString);
        MemorySegment sendInfo = sctp_sndrcvinfo.allocate(scope);
        sctp_sndrcvinfo.sinfo_stream$set(sendInfo, (short) 8);
        sctp_sndrcvinfo.sinfo_ppid$set(sendInfo, Integer.reverseBytes(100));
        int writtenBytes = sctp_send(clientSocket, message, message.byteSize(), sendInfo, 0);
        if (writtenBytes < 0) {
            throw new IllegalStateException("Send failed!!!");
        }
    }

    public static ReceiveInfo receiveMessage(ResourceScope scope, MemorySegment buffer, int socket) {
        MemorySegment receiveInfo = sctp_sndrcvinfo.allocate(scope);
        MemorySegment fromAddress = sockaddr_in.allocate(scope);
        MemorySegment fromAddressLength = MemorySegment.allocateNative(ValueLayout.JAVA_LONG, scope);
        fromAddressLength.set(ValueLayout.JAVA_LONG, 0, sockaddr_in.sizeof());
        MemorySegment flags = MemorySegment.allocateNative(ValueLayout.JAVA_INT, scope);
        flags.set(ValueLayout.JAVA_INT, 0, 0);
        int receivedBytes = sctp_recvmsg(socket, buffer, buffer.byteSize(),
                                         fromAddress, fromAddressLength, receiveInfo, flags);
        return new ReceiveInfo(receiveInfo, fromAddress, receivedBytes);
    }

    public static AcceptInfo acceptClient(ResourceScope scope, int serverSocket) {
        MemorySegment clientAddress = sockaddr_in.allocate(scope);
        MemorySegment addressLength = MemorySegment.allocateNative(Long.BYTES, scope);
        addressLength.setAtIndex(ValueLayout.JAVA_LONG, 0, sockaddr_in.sizeof());
        int accept = accept(serverSocket, clientAddress, addressLength);
        return new AcceptInfo(clientAddress, accept);
    }
}
