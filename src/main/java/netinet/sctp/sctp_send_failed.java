// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sctp_send_failed {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("ssf_type"),
        Constants$root.C_SHORT$LAYOUT.withName("ssf_flags"),
        Constants$root.C_INT$LAYOUT.withName("ssf_length"),
        Constants$root.C_INT$LAYOUT.withName("ssf_error"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("sinfo_stream"),
            Constants$root.C_SHORT$LAYOUT.withName("sinfo_ssn"),
            Constants$root.C_SHORT$LAYOUT.withName("sinfo_flags"),
            MemoryLayout.paddingLayout(16),
            Constants$root.C_INT$LAYOUT.withName("sinfo_ppid"),
            Constants$root.C_INT$LAYOUT.withName("sinfo_context"),
            Constants$root.C_INT$LAYOUT.withName("sinfo_timetolive"),
            Constants$root.C_INT$LAYOUT.withName("sinfo_tsn"),
            Constants$root.C_INT$LAYOUT.withName("sinfo_cumtsn"),
            Constants$root.C_INT$LAYOUT.withName("sinfo_assoc_id")
        ).withName("ssf_info"),
        Constants$root.C_INT$LAYOUT.withName("ssf_assoc_id"),
        MemoryLayout.sequenceLayout(0, Constants$root.C_CHAR$LAYOUT).withName("ssf_data")
    ).withName("sctp_send_failed");
    public static MemoryLayout $LAYOUT() {
        return sctp_send_failed.$struct$LAYOUT;
    }
    static final VarHandle ssf_type$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("ssf_type"));
    public static VarHandle ssf_type$VH() {
        return sctp_send_failed.ssf_type$VH;
    }
    public static short ssf_type$get(MemorySegment seg) {
        return (short)sctp_send_failed.ssf_type$VH.get(seg);
    }
    public static void ssf_type$set( MemorySegment seg, short x) {
        sctp_send_failed.ssf_type$VH.set(seg, x);
    }
    public static short ssf_type$get(MemorySegment seg, long index) {
        return (short)sctp_send_failed.ssf_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ssf_type$set(MemorySegment seg, long index, short x) {
        sctp_send_failed.ssf_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ssf_flags$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("ssf_flags"));
    public static VarHandle ssf_flags$VH() {
        return sctp_send_failed.ssf_flags$VH;
    }
    public static short ssf_flags$get(MemorySegment seg) {
        return (short)sctp_send_failed.ssf_flags$VH.get(seg);
    }
    public static void ssf_flags$set( MemorySegment seg, short x) {
        sctp_send_failed.ssf_flags$VH.set(seg, x);
    }
    public static short ssf_flags$get(MemorySegment seg, long index) {
        return (short)sctp_send_failed.ssf_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ssf_flags$set(MemorySegment seg, long index, short x) {
        sctp_send_failed.ssf_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ssf_length$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("ssf_length"));
    public static VarHandle ssf_length$VH() {
        return sctp_send_failed.ssf_length$VH;
    }
    public static int ssf_length$get(MemorySegment seg) {
        return (int)sctp_send_failed.ssf_length$VH.get(seg);
    }
    public static void ssf_length$set( MemorySegment seg, int x) {
        sctp_send_failed.ssf_length$VH.set(seg, x);
    }
    public static int ssf_length$get(MemorySegment seg, long index) {
        return (int)sctp_send_failed.ssf_length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ssf_length$set(MemorySegment seg, long index, int x) {
        sctp_send_failed.ssf_length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ssf_error$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("ssf_error"));
    public static VarHandle ssf_error$VH() {
        return sctp_send_failed.ssf_error$VH;
    }
    public static int ssf_error$get(MemorySegment seg) {
        return (int)sctp_send_failed.ssf_error$VH.get(seg);
    }
    public static void ssf_error$set( MemorySegment seg, int x) {
        sctp_send_failed.ssf_error$VH.set(seg, x);
    }
    public static int ssf_error$get(MemorySegment seg, long index) {
        return (int)sctp_send_failed.ssf_error$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ssf_error$set(MemorySegment seg, long index, int x) {
        sctp_send_failed.ssf_error$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ssf_info$slice(MemorySegment seg) {
        return seg.asSlice(12, 32);
    }
    static final VarHandle ssf_assoc_id$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("ssf_assoc_id"));
    public static VarHandle ssf_assoc_id$VH() {
        return sctp_send_failed.ssf_assoc_id$VH;
    }
    public static int ssf_assoc_id$get(MemorySegment seg) {
        return (int)sctp_send_failed.ssf_assoc_id$VH.get(seg);
    }
    public static void ssf_assoc_id$set( MemorySegment seg, int x) {
        sctp_send_failed.ssf_assoc_id$VH.set(seg, x);
    }
    public static int ssf_assoc_id$get(MemorySegment seg, long index) {
        return (int)sctp_send_failed.ssf_assoc_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ssf_assoc_id$set(MemorySegment seg, long index, int x) {
        sctp_send_failed.ssf_assoc_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ssf_data$slice(MemorySegment seg) {
        return seg.asSlice(48, 0);
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

