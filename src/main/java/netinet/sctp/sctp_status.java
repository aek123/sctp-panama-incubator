// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sctp_status {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("sstat_assoc_id"),
        Constants$root.C_INT$LAYOUT.withName("sstat_state"),
        Constants$root.C_INT$LAYOUT.withName("sstat_rwnd"),
        Constants$root.C_SHORT$LAYOUT.withName("sstat_unackdata"),
        Constants$root.C_SHORT$LAYOUT.withName("sstat_penddata"),
        Constants$root.C_SHORT$LAYOUT.withName("sstat_instrms"),
        Constants$root.C_SHORT$LAYOUT.withName("sstat_outstrms"),
        Constants$root.C_INT$LAYOUT.withName("sstat_fragmentation_point"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("spinfo_assoc_id"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("ss_family"),
                MemoryLayout.sequenceLayout(118, Constants$root.C_CHAR$LAYOUT).withName("__ss_padding"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("__ss_align")
            ).withName("spinfo_address"),
            Constants$root.C_INT$LAYOUT.withName("spinfo_state"),
            Constants$root.C_INT$LAYOUT.withName("spinfo_cwnd"),
            Constants$root.C_INT$LAYOUT.withName("spinfo_srtt"),
            Constants$root.C_INT$LAYOUT.withName("spinfo_rto"),
            Constants$root.C_INT$LAYOUT.withName("spinfo_mtu")
        ).withName("sstat_primary")
    ).withName("sctp_status");
    public static MemoryLayout $LAYOUT() {
        return sctp_status.$struct$LAYOUT;
    }
    static final VarHandle sstat_assoc_id$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sstat_assoc_id"));
    public static VarHandle sstat_assoc_id$VH() {
        return sctp_status.sstat_assoc_id$VH;
    }
    public static int sstat_assoc_id$get(MemorySegment seg) {
        return (int)sctp_status.sstat_assoc_id$VH.get(seg);
    }
    public static void sstat_assoc_id$set( MemorySegment seg, int x) {
        sctp_status.sstat_assoc_id$VH.set(seg, x);
    }
    public static int sstat_assoc_id$get(MemorySegment seg, long index) {
        return (int)sctp_status.sstat_assoc_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sstat_assoc_id$set(MemorySegment seg, long index, int x) {
        sctp_status.sstat_assoc_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sstat_state$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sstat_state"));
    public static VarHandle sstat_state$VH() {
        return sctp_status.sstat_state$VH;
    }
    public static int sstat_state$get(MemorySegment seg) {
        return (int)sctp_status.sstat_state$VH.get(seg);
    }
    public static void sstat_state$set( MemorySegment seg, int x) {
        sctp_status.sstat_state$VH.set(seg, x);
    }
    public static int sstat_state$get(MemorySegment seg, long index) {
        return (int)sctp_status.sstat_state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sstat_state$set(MemorySegment seg, long index, int x) {
        sctp_status.sstat_state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sstat_rwnd$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sstat_rwnd"));
    public static VarHandle sstat_rwnd$VH() {
        return sctp_status.sstat_rwnd$VH;
    }
    public static int sstat_rwnd$get(MemorySegment seg) {
        return (int)sctp_status.sstat_rwnd$VH.get(seg);
    }
    public static void sstat_rwnd$set( MemorySegment seg, int x) {
        sctp_status.sstat_rwnd$VH.set(seg, x);
    }
    public static int sstat_rwnd$get(MemorySegment seg, long index) {
        return (int)sctp_status.sstat_rwnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sstat_rwnd$set(MemorySegment seg, long index, int x) {
        sctp_status.sstat_rwnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sstat_unackdata$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sstat_unackdata"));
    public static VarHandle sstat_unackdata$VH() {
        return sctp_status.sstat_unackdata$VH;
    }
    public static short sstat_unackdata$get(MemorySegment seg) {
        return (short)sctp_status.sstat_unackdata$VH.get(seg);
    }
    public static void sstat_unackdata$set( MemorySegment seg, short x) {
        sctp_status.sstat_unackdata$VH.set(seg, x);
    }
    public static short sstat_unackdata$get(MemorySegment seg, long index) {
        return (short)sctp_status.sstat_unackdata$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sstat_unackdata$set(MemorySegment seg, long index, short x) {
        sctp_status.sstat_unackdata$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sstat_penddata$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sstat_penddata"));
    public static VarHandle sstat_penddata$VH() {
        return sctp_status.sstat_penddata$VH;
    }
    public static short sstat_penddata$get(MemorySegment seg) {
        return (short)sctp_status.sstat_penddata$VH.get(seg);
    }
    public static void sstat_penddata$set( MemorySegment seg, short x) {
        sctp_status.sstat_penddata$VH.set(seg, x);
    }
    public static short sstat_penddata$get(MemorySegment seg, long index) {
        return (short)sctp_status.sstat_penddata$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sstat_penddata$set(MemorySegment seg, long index, short x) {
        sctp_status.sstat_penddata$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sstat_instrms$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sstat_instrms"));
    public static VarHandle sstat_instrms$VH() {
        return sctp_status.sstat_instrms$VH;
    }
    public static short sstat_instrms$get(MemorySegment seg) {
        return (short)sctp_status.sstat_instrms$VH.get(seg);
    }
    public static void sstat_instrms$set( MemorySegment seg, short x) {
        sctp_status.sstat_instrms$VH.set(seg, x);
    }
    public static short sstat_instrms$get(MemorySegment seg, long index) {
        return (short)sctp_status.sstat_instrms$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sstat_instrms$set(MemorySegment seg, long index, short x) {
        sctp_status.sstat_instrms$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sstat_outstrms$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sstat_outstrms"));
    public static VarHandle sstat_outstrms$VH() {
        return sctp_status.sstat_outstrms$VH;
    }
    public static short sstat_outstrms$get(MemorySegment seg) {
        return (short)sctp_status.sstat_outstrms$VH.get(seg);
    }
    public static void sstat_outstrms$set( MemorySegment seg, short x) {
        sctp_status.sstat_outstrms$VH.set(seg, x);
    }
    public static short sstat_outstrms$get(MemorySegment seg, long index) {
        return (short)sctp_status.sstat_outstrms$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sstat_outstrms$set(MemorySegment seg, long index, short x) {
        sctp_status.sstat_outstrms$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sstat_fragmentation_point$VH = $struct$LAYOUT.varHandle(
            PathElement.groupElement("sstat_fragmentation_point"));
    public static VarHandle sstat_fragmentation_point$VH() {
        return sctp_status.sstat_fragmentation_point$VH;
    }
    public static int sstat_fragmentation_point$get(MemorySegment seg) {
        return (int)sctp_status.sstat_fragmentation_point$VH.get(seg);
    }
    public static void sstat_fragmentation_point$set( MemorySegment seg, int x) {
        sctp_status.sstat_fragmentation_point$VH.set(seg, x);
    }
    public static int sstat_fragmentation_point$get(MemorySegment seg, long index) {
        return (int)sctp_status.sstat_fragmentation_point$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sstat_fragmentation_point$set(MemorySegment seg, long index, int x) {
        sctp_status.sstat_fragmentation_point$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment sstat_primary$slice(MemorySegment seg) {
        return seg.asSlice(24, 152);
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


