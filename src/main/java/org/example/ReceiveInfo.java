package org.example;

import jdk.incubator.foreign.MemorySegment;
import netinet.in.in_addr;
import netinet.in.sockaddr_in;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;

public record ReceiveInfo(MemorySegment sendReceiveInfo, MemorySegment fromAddress, int receivedBytes) {

    public InetAddress getAddress() throws UnknownHostException {
        int address = Integer.reverseBytes(in_addr.s_addr$get(sockaddr_in.sin_addr$slice(fromAddress)));
        return InetAddress.getByAddress(BigInteger.valueOf(address).toByteArray());
    }
}
