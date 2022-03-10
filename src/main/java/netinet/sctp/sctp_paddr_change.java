// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sctp_paddr_change {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("spc_type"),
        Constants$root.C_SHORT$LAYOUT.withName("spc_flags"),
        Constants$root.C_INT$LAYOUT.withName("spc_length"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("ss_family"),
            MemoryLayout.sequenceLayout(118, Constants$root.C_CHAR$LAYOUT).withName("__ss_padding"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("__ss_align")
        ).withName("spc_aaddr"),
        Constants$root.C_INT$LAYOUT.withName("spc_state"),
        Constants$root.C_INT$LAYOUT.withName("spc_error"),
        Constants$root.C_INT$LAYOUT.withName("spc_assoc_id")
    ).withName("sctp_paddr_change");
    public static MemoryLayout $LAYOUT() {
        return sctp_paddr_change.$struct$LAYOUT;
    }
    static final VarHandle spc_type$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("spc_type"));
    public static VarHandle spc_type$VH() {
        return sctp_paddr_change.spc_type$VH;
    }
    public static short spc_type$get(MemorySegment seg) {
        return (short)sctp_paddr_change.spc_type$VH.get(seg);
    }
    public static void spc_type$set( MemorySegment seg, short x) {
        sctp_paddr_change.spc_type$VH.set(seg, x);
    }
    public static short spc_type$get(MemorySegment seg, long index) {
        return (short)sctp_paddr_change.spc_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void spc_type$set(MemorySegment seg, long index, short x) {
        sctp_paddr_change.spc_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle spc_flags$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("spc_flags"));
    public static VarHandle spc_flags$VH() {
        return sctp_paddr_change.spc_flags$VH;
    }
    public static short spc_flags$get(MemorySegment seg) {
        return (short)sctp_paddr_change.spc_flags$VH.get(seg);
    }
    public static void spc_flags$set( MemorySegment seg, short x) {
        sctp_paddr_change.spc_flags$VH.set(seg, x);
    }
    public static short spc_flags$get(MemorySegment seg, long index) {
        return (short)sctp_paddr_change.spc_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void spc_flags$set(MemorySegment seg, long index, short x) {
        sctp_paddr_change.spc_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle spc_length$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("spc_length"));
    public static VarHandle spc_length$VH() {
        return sctp_paddr_change.spc_length$VH;
    }
    public static int spc_length$get(MemorySegment seg) {
        return (int)sctp_paddr_change.spc_length$VH.get(seg);
    }
    public static void spc_length$set( MemorySegment seg, int x) {
        sctp_paddr_change.spc_length$VH.set(seg, x);
    }
    public static int spc_length$get(MemorySegment seg, long index) {
        return (int)sctp_paddr_change.spc_length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void spc_length$set(MemorySegment seg, long index, int x) {
        sctp_paddr_change.spc_length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment spc_aaddr$slice(MemorySegment seg) {
        return seg.asSlice(8, 128);
    }
    static final VarHandle spc_state$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("spc_state"));
    public static VarHandle spc_state$VH() {
        return sctp_paddr_change.spc_state$VH;
    }
    public static int spc_state$get(MemorySegment seg) {
        return (int)sctp_paddr_change.spc_state$VH.get(seg);
    }
    public static void spc_state$set( MemorySegment seg, int x) {
        sctp_paddr_change.spc_state$VH.set(seg, x);
    }
    public static int spc_state$get(MemorySegment seg, long index) {
        return (int)sctp_paddr_change.spc_state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void spc_state$set(MemorySegment seg, long index, int x) {
        sctp_paddr_change.spc_state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle spc_error$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("spc_error"));
    public static VarHandle spc_error$VH() {
        return sctp_paddr_change.spc_error$VH;
    }
    public static int spc_error$get(MemorySegment seg) {
        return (int)sctp_paddr_change.spc_error$VH.get(seg);
    }
    public static void spc_error$set( MemorySegment seg, int x) {
        sctp_paddr_change.spc_error$VH.set(seg, x);
    }
    public static int spc_error$get(MemorySegment seg, long index) {
        return (int)sctp_paddr_change.spc_error$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void spc_error$set(MemorySegment seg, long index, int x) {
        sctp_paddr_change.spc_error$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle spc_assoc_id$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("spc_assoc_id"));
    public static VarHandle spc_assoc_id$VH() {
        return sctp_paddr_change.spc_assoc_id$VH;
    }
    public static int spc_assoc_id$get(MemorySegment seg) {
        return (int)sctp_paddr_change.spc_assoc_id$VH.get(seg);
    }
    public static void spc_assoc_id$set( MemorySegment seg, int x) {
        sctp_paddr_change.spc_assoc_id$VH.set(seg, x);
    }
    public static int spc_assoc_id$get(MemorySegment seg, long index) {
        return (int)sctp_paddr_change.spc_assoc_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void spc_assoc_id$set(MemorySegment seg, long index, int x) {
        sctp_paddr_change.spc_assoc_id$VH.set(seg.asSlice(index*sizeof()), x);
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

