// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sctp_getaddrs_old {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("assoc_id"),
        Constants$root.C_INT$LAYOUT.withName("addr_num"),
        Constants$root.C_POINTER$LAYOUT.withName("addrs")
    ).withName("sctp_getaddrs_old");
    public static MemoryLayout $LAYOUT() {
        return sctp_getaddrs_old.$struct$LAYOUT;
    }
    static final VarHandle assoc_id$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("assoc_id"));
    public static VarHandle assoc_id$VH() {
        return sctp_getaddrs_old.assoc_id$VH;
    }
    public static int assoc_id$get(MemorySegment seg) {
        return (int)sctp_getaddrs_old.assoc_id$VH.get(seg);
    }
    public static void assoc_id$set( MemorySegment seg, int x) {
        sctp_getaddrs_old.assoc_id$VH.set(seg, x);
    }
    public static int assoc_id$get(MemorySegment seg, long index) {
        return (int)sctp_getaddrs_old.assoc_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void assoc_id$set(MemorySegment seg, long index, int x) {
        sctp_getaddrs_old.assoc_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle addr_num$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("addr_num"));
    public static VarHandle addr_num$VH() {
        return sctp_getaddrs_old.addr_num$VH;
    }
    public static int addr_num$get(MemorySegment seg) {
        return (int)sctp_getaddrs_old.addr_num$VH.get(seg);
    }
    public static void addr_num$set( MemorySegment seg, int x) {
        sctp_getaddrs_old.addr_num$VH.set(seg, x);
    }
    public static int addr_num$get(MemorySegment seg, long index) {
        return (int)sctp_getaddrs_old.addr_num$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void addr_num$set(MemorySegment seg, long index, int x) {
        sctp_getaddrs_old.addr_num$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle addrs$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("addrs"));
    public static VarHandle addrs$VH() {
        return sctp_getaddrs_old.addrs$VH;
    }
    public static MemoryAddress addrs$get(MemorySegment seg) {
        return (MemoryAddress)sctp_getaddrs_old.addrs$VH.get(seg);
    }
    public static void addrs$set( MemorySegment seg, MemoryAddress x) {
        sctp_getaddrs_old.addrs$VH.set(seg, x);
    }
    public static MemoryAddress addrs$get(MemorySegment seg, long index) {
        return (MemoryAddress)sctp_getaddrs_old.addrs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void addrs$set(MemorySegment seg, long index, MemoryAddress x) {
        sctp_getaddrs_old.addrs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


