package org.example;

import jdk.incubator.foreign.MemorySegment;

public record ReceiveInfo(MemorySegment sendReceiveInfo, MemorySegment fromAddress, int receivedBytes) {
}
