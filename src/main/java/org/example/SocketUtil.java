package org.example;

import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.ValueLayout;
import netinet.in.in_addr;
import netinet.in.sockaddr_in;
import netinet.sctp.sctp_event_subscribe;
import netinet.sctp.sctp_initmsg;
import netinet.sctp.sctp_sndrcvinfo;

import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static netinet.sctp.sctp_h.*;

public class SocketUtil {

    private SocketUtil() {
    }

    public static void connectClient(ResourceScope scope, int socket, List<InetAddress> addressList, short remotePort) {
        if (addressList.size() < 1) {
            throw new IllegalArgumentException("There is no address to connect.");
        } else {
            MemorySegment addresses = sockaddr_in.allocateArray(addressList.size(), scope);

            addresses.spliterator(sockaddr_in.$LAYOUT());
            MemorySegment nill = MemorySegment.allocateNative(Integer.BYTES, scope);
            nill.set(ValueLayout.JAVA_INT, 0, 0);
            int connectx = sctp_connectx(socket, addresses, addressList.size(), nill);
            if (connectx < 0) {
                throw new IllegalStateException("Connectx failure");
            }
        }
    }

    public static int createSocket(ResourceScope scope, List<InetAddress> addresses, short localPort) {
        int socket = socket(AF_INET(), SOCK_STREAM(), IPPROTO_SCTP());
        if (socket < 0) {
            throw new IllegalStateException("Socket creation failure");
        }
        if (setEventSubscriptions(scope, socket) < 0) {
            throw new IllegalStateException("SCTP_EVENT_SUBSCRIBE event set failure");
        }
        if (setInitMessage(scope, socket) < 0) {
            throw new IllegalStateException("SCTP_INITMSG event set failure");
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

    private static int setEventSubscriptions(ResourceScope scope, int socket) {
        MemorySegment sctpEventSubscribe = sctp_event_subscribe.allocate(scope);
        sctp_event_subscribe.sctp_data_io_event$set(sctpEventSubscribe, (byte) 1);
        sctp_event_subscribe.sctp_shutdown_event$set(sctpEventSubscribe, (byte) 1);
        sctp_event_subscribe.sctp_association_event$set(sctpEventSubscribe, (byte) 1);
        return setsockopt(socket, IPPROTO_SCTP(), SCTP_EVENTS(), sctpEventSubscribe, ((int) sctp_event_subscribe.sizeof()));
    }

    private static int setInitMessage(ResourceScope scope, int socket) {
        MemorySegment initMessage = sctp_initmsg.allocate(scope);
        sctp_initmsg.sinit_num_ostreams$set(initMessage, (short) 17);
        sctp_initmsg.sinit_max_instreams$set(initMessage, (short) 17);
        sctp_initmsg.sinit_max_attempts$set(initMessage, (short) 10);
        sctp_initmsg.sinit_max_init_timeo$set(initMessage, (short) 100);
        return setsockopt(socket, IPPROTO_SCTP(), SCTP_INITMSG(), initMessage, ((int) sctp_initmsg.sizeof()));
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
