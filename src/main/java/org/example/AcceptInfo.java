package org.example;

import jdk.incubator.foreign.MemorySegment;
import netinet.in.sockaddr_in;

import java.net.InetAddress;
import java.net.StandardProtocolFamily;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.net.StandardProtocolFamily.INET;
import static java.net.StandardProtocolFamily.INET6;
import static netinet.in.in_h.AF_INET;
import static netinet.in.in_h.AF_INET6;

public record AcceptInfo(MemorySegment socketAddress, int clientSocket) {

    public short getPort() {
        return Short.reverseBytes(sockaddr_in.sin_port$get(socketAddress));
    }

    public StandardProtocolFamily getFamily() {
        int family = sockaddr_in.sin_family$get(socketAddress);
        if (family == AF_INET()) {
            return INET;
        } else if (family == AF_INET6()) {
            return INET6;
        } else {
            throw new IllegalStateException("Unexpected protocol family from client");
        }
    }

    public List<InetAddress> clientAddresses() throws UnknownHostException {
        ByteBuffer buffer = sockaddr_in.sin_addr$slice(socketAddress).asByteBuffer();
        return switch (getFamily()) {
            case INET -> getInetAddresses(buffer, 4);
            case INET6 -> getInetAddresses(buffer, 16);
            default -> Collections.emptyList();
        };
    }

    private List<InetAddress> getInetAddresses(ByteBuffer buffer, int size) throws UnknownHostException {
        List<InetAddress> addresses = new ArrayList<>();
        for (int i = 0; i < buffer.limit() / size; i++) {
            byte[] addressBytes = new byte[size];
            buffer.get(addressBytes);
            addresses.add(InetAddress.getByAddress(addressBytes));
        }
        return addresses;
    }
}
