// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sctp_sack_info {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("sack_assoc_id"),
        Constants$root.C_INT$LAYOUT.withName("sack_delay"),
        Constants$root.C_INT$LAYOUT.withName("sack_freq")
    ).withName("sctp_sack_info");
    public static MemoryLayout $LAYOUT() {
        return sctp_sack_info.$struct$LAYOUT;
    }
    static final VarHandle sack_assoc_id$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sack_assoc_id"));
    public static VarHandle sack_assoc_id$VH() {
        return sctp_sack_info.sack_assoc_id$VH;
    }
    public static int sack_assoc_id$get(MemorySegment seg) {
        return (int)sctp_sack_info.sack_assoc_id$VH.get(seg);
    }
    public static void sack_assoc_id$set( MemorySegment seg, int x) {
        sctp_sack_info.sack_assoc_id$VH.set(seg, x);
    }
    public static int sack_assoc_id$get(MemorySegment seg, long index) {
        return (int)sctp_sack_info.sack_assoc_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sack_assoc_id$set(MemorySegment seg, long index, int x) {
        sctp_sack_info.sack_assoc_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sack_delay$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sack_delay"));
    public static VarHandle sack_delay$VH() {
        return sctp_sack_info.sack_delay$VH;
    }
    public static int sack_delay$get(MemorySegment seg) {
        return (int)sctp_sack_info.sack_delay$VH.get(seg);
    }
    public static void sack_delay$set( MemorySegment seg, int x) {
        sctp_sack_info.sack_delay$VH.set(seg, x);
    }
    public static int sack_delay$get(MemorySegment seg, long index) {
        return (int)sctp_sack_info.sack_delay$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sack_delay$set(MemorySegment seg, long index, int x) {
        sctp_sack_info.sack_delay$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sack_freq$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sack_freq"));
    public static VarHandle sack_freq$VH() {
        return sctp_sack_info.sack_freq$VH;
    }
    public static int sack_freq$get(MemorySegment seg) {
        return (int)sctp_sack_info.sack_freq$VH.get(seg);
    }
    public static void sack_freq$set( MemorySegment seg, int x) {
        sctp_sack_info.sack_freq$VH.set(seg, x);
    }
    public static int sack_freq$get(MemorySegment seg, long index) {
        return (int)sctp_sack_info.sack_freq$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sack_freq$set(MemorySegment seg, long index, int x) {
        sctp_sack_info.sack_freq$VH.set(seg.asSlice(index*sizeof()), x);
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

