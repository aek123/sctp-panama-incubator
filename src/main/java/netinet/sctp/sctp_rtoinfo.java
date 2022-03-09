// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sctp_rtoinfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("srto_assoc_id"),
        Constants$root.C_INT$LAYOUT.withName("srto_initial"),
        Constants$root.C_INT$LAYOUT.withName("srto_max"),
        Constants$root.C_INT$LAYOUT.withName("srto_min")
    ).withName("sctp_rtoinfo");
    public static MemoryLayout $LAYOUT() {
        return sctp_rtoinfo.$struct$LAYOUT;
    }
    static final VarHandle srto_assoc_id$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("srto_assoc_id"));
    public static VarHandle srto_assoc_id$VH() {
        return sctp_rtoinfo.srto_assoc_id$VH;
    }
    public static int srto_assoc_id$get(MemorySegment seg) {
        return (int)sctp_rtoinfo.srto_assoc_id$VH.get(seg);
    }
    public static void srto_assoc_id$set( MemorySegment seg, int x) {
        sctp_rtoinfo.srto_assoc_id$VH.set(seg, x);
    }
    public static int srto_assoc_id$get(MemorySegment seg, long index) {
        return (int)sctp_rtoinfo.srto_assoc_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void srto_assoc_id$set(MemorySegment seg, long index, int x) {
        sctp_rtoinfo.srto_assoc_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle srto_initial$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("srto_initial"));
    public static VarHandle srto_initial$VH() {
        return sctp_rtoinfo.srto_initial$VH;
    }
    public static int srto_initial$get(MemorySegment seg) {
        return (int)sctp_rtoinfo.srto_initial$VH.get(seg);
    }
    public static void srto_initial$set( MemorySegment seg, int x) {
        sctp_rtoinfo.srto_initial$VH.set(seg, x);
    }
    public static int srto_initial$get(MemorySegment seg, long index) {
        return (int)sctp_rtoinfo.srto_initial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void srto_initial$set(MemorySegment seg, long index, int x) {
        sctp_rtoinfo.srto_initial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle srto_max$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("srto_max"));
    public static VarHandle srto_max$VH() {
        return sctp_rtoinfo.srto_max$VH;
    }
    public static int srto_max$get(MemorySegment seg) {
        return (int)sctp_rtoinfo.srto_max$VH.get(seg);
    }
    public static void srto_max$set( MemorySegment seg, int x) {
        sctp_rtoinfo.srto_max$VH.set(seg, x);
    }
    public static int srto_max$get(MemorySegment seg, long index) {
        return (int)sctp_rtoinfo.srto_max$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void srto_max$set(MemorySegment seg, long index, int x) {
        sctp_rtoinfo.srto_max$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle srto_min$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("srto_min"));
    public static VarHandle srto_min$VH() {
        return sctp_rtoinfo.srto_min$VH;
    }
    public static int srto_min$get(MemorySegment seg) {
        return (int)sctp_rtoinfo.srto_min$VH.get(seg);
    }
    public static void srto_min$set( MemorySegment seg, int x) {
        sctp_rtoinfo.srto_min$VH.set(seg, x);
    }
    public static int srto_min$get(MemorySegment seg, long index) {
        return (int)sctp_rtoinfo.srto_min$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void srto_min$set(MemorySegment seg, long index, int x) {
        sctp_rtoinfo.srto_min$VH.set(seg.asSlice(index*sizeof()), x);
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


