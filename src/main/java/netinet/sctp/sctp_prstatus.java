// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sctp_prstatus {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("sprstat_assoc_id"),
        Constants$root.C_SHORT$LAYOUT.withName("sprstat_sid"),
        Constants$root.C_SHORT$LAYOUT.withName("sprstat_policy"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("sprstat_abandoned_unsent"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("sprstat_abandoned_sent")
    ).withName("sctp_prstatus");
    public static MemoryLayout $LAYOUT() {
        return sctp_prstatus.$struct$LAYOUT;
    }
    static final VarHandle sprstat_assoc_id$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sprstat_assoc_id"));
    public static VarHandle sprstat_assoc_id$VH() {
        return sctp_prstatus.sprstat_assoc_id$VH;
    }
    public static int sprstat_assoc_id$get(MemorySegment seg) {
        return (int)sctp_prstatus.sprstat_assoc_id$VH.get(seg);
    }
    public static void sprstat_assoc_id$set( MemorySegment seg, int x) {
        sctp_prstatus.sprstat_assoc_id$VH.set(seg, x);
    }
    public static int sprstat_assoc_id$get(MemorySegment seg, long index) {
        return (int)sctp_prstatus.sprstat_assoc_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sprstat_assoc_id$set(MemorySegment seg, long index, int x) {
        sctp_prstatus.sprstat_assoc_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sprstat_sid$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sprstat_sid"));
    public static VarHandle sprstat_sid$VH() {
        return sctp_prstatus.sprstat_sid$VH;
    }
    public static short sprstat_sid$get(MemorySegment seg) {
        return (short)sctp_prstatus.sprstat_sid$VH.get(seg);
    }
    public static void sprstat_sid$set( MemorySegment seg, short x) {
        sctp_prstatus.sprstat_sid$VH.set(seg, x);
    }
    public static short sprstat_sid$get(MemorySegment seg, long index) {
        return (short)sctp_prstatus.sprstat_sid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sprstat_sid$set(MemorySegment seg, long index, short x) {
        sctp_prstatus.sprstat_sid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sprstat_policy$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sprstat_policy"));
    public static VarHandle sprstat_policy$VH() {
        return sctp_prstatus.sprstat_policy$VH;
    }
    public static short sprstat_policy$get(MemorySegment seg) {
        return (short)sctp_prstatus.sprstat_policy$VH.get(seg);
    }
    public static void sprstat_policy$set( MemorySegment seg, short x) {
        sctp_prstatus.sprstat_policy$VH.set(seg, x);
    }
    public static short sprstat_policy$get(MemorySegment seg, long index) {
        return (short)sctp_prstatus.sprstat_policy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sprstat_policy$set(MemorySegment seg, long index, short x) {
        sctp_prstatus.sprstat_policy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sprstat_abandoned_unsent$VH = $struct$LAYOUT.varHandle(
            PathElement.groupElement("sprstat_abandoned_unsent"));
    public static VarHandle sprstat_abandoned_unsent$VH() {
        return sctp_prstatus.sprstat_abandoned_unsent$VH;
    }
    public static long sprstat_abandoned_unsent$get(MemorySegment seg) {
        return (long)sctp_prstatus.sprstat_abandoned_unsent$VH.get(seg);
    }
    public static void sprstat_abandoned_unsent$set( MemorySegment seg, long x) {
        sctp_prstatus.sprstat_abandoned_unsent$VH.set(seg, x);
    }
    public static long sprstat_abandoned_unsent$get(MemorySegment seg, long index) {
        return (long)sctp_prstatus.sprstat_abandoned_unsent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sprstat_abandoned_unsent$set(MemorySegment seg, long index, long x) {
        sctp_prstatus.sprstat_abandoned_unsent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sprstat_abandoned_sent$VH = $struct$LAYOUT.varHandle(
            PathElement.groupElement("sprstat_abandoned_sent"));
    public static VarHandle sprstat_abandoned_sent$VH() {
        return sctp_prstatus.sprstat_abandoned_sent$VH;
    }
    public static long sprstat_abandoned_sent$get(MemorySegment seg) {
        return (long)sctp_prstatus.sprstat_abandoned_sent$VH.get(seg);
    }
    public static void sprstat_abandoned_sent$set( MemorySegment seg, long x) {
        sctp_prstatus.sprstat_abandoned_sent$VH.set(seg, x);
    }
    public static long sprstat_abandoned_sent$get(MemorySegment seg, long index) {
        return (long)sctp_prstatus.sprstat_abandoned_sent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sprstat_abandoned_sent$set(MemorySegment seg, long index, long x) {
        sctp_prstatus.sprstat_abandoned_sent$VH.set(seg.asSlice(index*sizeof()), x);
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


