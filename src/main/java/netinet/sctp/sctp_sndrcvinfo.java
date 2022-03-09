// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sctp_sndrcvinfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    ).withName("sctp_sndrcvinfo");
    public static MemoryLayout $LAYOUT() {
        return sctp_sndrcvinfo.$struct$LAYOUT;
    }
    static final VarHandle sinfo_stream$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sinfo_stream"));
    public static VarHandle sinfo_stream$VH() {
        return sctp_sndrcvinfo.sinfo_stream$VH;
    }
    public static short sinfo_stream$get(MemorySegment seg) {
        return (short)sctp_sndrcvinfo.sinfo_stream$VH.get(seg);
    }
    public static void sinfo_stream$set( MemorySegment seg, short x) {
        sctp_sndrcvinfo.sinfo_stream$VH.set(seg, x);
    }
    public static short sinfo_stream$get(MemorySegment seg, long index) {
        return (short)sctp_sndrcvinfo.sinfo_stream$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sinfo_stream$set(MemorySegment seg, long index, short x) {
        sctp_sndrcvinfo.sinfo_stream$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sinfo_ssn$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sinfo_ssn"));
    public static VarHandle sinfo_ssn$VH() {
        return sctp_sndrcvinfo.sinfo_ssn$VH;
    }
    public static short sinfo_ssn$get(MemorySegment seg) {
        return (short)sctp_sndrcvinfo.sinfo_ssn$VH.get(seg);
    }
    public static void sinfo_ssn$set( MemorySegment seg, short x) {
        sctp_sndrcvinfo.sinfo_ssn$VH.set(seg, x);
    }
    public static short sinfo_ssn$get(MemorySegment seg, long index) {
        return (short)sctp_sndrcvinfo.sinfo_ssn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sinfo_ssn$set(MemorySegment seg, long index, short x) {
        sctp_sndrcvinfo.sinfo_ssn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sinfo_flags$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sinfo_flags"));
    public static VarHandle sinfo_flags$VH() {
        return sctp_sndrcvinfo.sinfo_flags$VH;
    }
    public static short sinfo_flags$get(MemorySegment seg) {
        return (short)sctp_sndrcvinfo.sinfo_flags$VH.get(seg);
    }
    public static void sinfo_flags$set( MemorySegment seg, short x) {
        sctp_sndrcvinfo.sinfo_flags$VH.set(seg, x);
    }
    public static short sinfo_flags$get(MemorySegment seg, long index) {
        return (short)sctp_sndrcvinfo.sinfo_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sinfo_flags$set(MemorySegment seg, long index, short x) {
        sctp_sndrcvinfo.sinfo_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sinfo_ppid$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sinfo_ppid"));
    public static VarHandle sinfo_ppid$VH() {
        return sctp_sndrcvinfo.sinfo_ppid$VH;
    }
    public static int sinfo_ppid$get(MemorySegment seg) {
        return (int)sctp_sndrcvinfo.sinfo_ppid$VH.get(seg);
    }
    public static void sinfo_ppid$set( MemorySegment seg, int x) {
        sctp_sndrcvinfo.sinfo_ppid$VH.set(seg, x);
    }
    public static int sinfo_ppid$get(MemorySegment seg, long index) {
        return (int)sctp_sndrcvinfo.sinfo_ppid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sinfo_ppid$set(MemorySegment seg, long index, int x) {
        sctp_sndrcvinfo.sinfo_ppid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sinfo_context$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sinfo_context"));
    public static VarHandle sinfo_context$VH() {
        return sctp_sndrcvinfo.sinfo_context$VH;
    }
    public static int sinfo_context$get(MemorySegment seg) {
        return (int)sctp_sndrcvinfo.sinfo_context$VH.get(seg);
    }
    public static void sinfo_context$set( MemorySegment seg, int x) {
        sctp_sndrcvinfo.sinfo_context$VH.set(seg, x);
    }
    public static int sinfo_context$get(MemorySegment seg, long index) {
        return (int)sctp_sndrcvinfo.sinfo_context$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sinfo_context$set(MemorySegment seg, long index, int x) {
        sctp_sndrcvinfo.sinfo_context$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sinfo_timetolive$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sinfo_timetolive"));
    public static VarHandle sinfo_timetolive$VH() {
        return sctp_sndrcvinfo.sinfo_timetolive$VH;
    }
    public static int sinfo_timetolive$get(MemorySegment seg) {
        return (int)sctp_sndrcvinfo.sinfo_timetolive$VH.get(seg);
    }
    public static void sinfo_timetolive$set( MemorySegment seg, int x) {
        sctp_sndrcvinfo.sinfo_timetolive$VH.set(seg, x);
    }
    public static int sinfo_timetolive$get(MemorySegment seg, long index) {
        return (int)sctp_sndrcvinfo.sinfo_timetolive$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sinfo_timetolive$set(MemorySegment seg, long index, int x) {
        sctp_sndrcvinfo.sinfo_timetolive$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sinfo_tsn$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sinfo_tsn"));
    public static VarHandle sinfo_tsn$VH() {
        return sctp_sndrcvinfo.sinfo_tsn$VH;
    }
    public static int sinfo_tsn$get(MemorySegment seg) {
        return (int)sctp_sndrcvinfo.sinfo_tsn$VH.get(seg);
    }
    public static void sinfo_tsn$set( MemorySegment seg, int x) {
        sctp_sndrcvinfo.sinfo_tsn$VH.set(seg, x);
    }
    public static int sinfo_tsn$get(MemorySegment seg, long index) {
        return (int)sctp_sndrcvinfo.sinfo_tsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sinfo_tsn$set(MemorySegment seg, long index, int x) {
        sctp_sndrcvinfo.sinfo_tsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sinfo_cumtsn$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sinfo_cumtsn"));
    public static VarHandle sinfo_cumtsn$VH() {
        return sctp_sndrcvinfo.sinfo_cumtsn$VH;
    }
    public static int sinfo_cumtsn$get(MemorySegment seg) {
        return (int)sctp_sndrcvinfo.sinfo_cumtsn$VH.get(seg);
    }
    public static void sinfo_cumtsn$set( MemorySegment seg, int x) {
        sctp_sndrcvinfo.sinfo_cumtsn$VH.set(seg, x);
    }
    public static int sinfo_cumtsn$get(MemorySegment seg, long index) {
        return (int)sctp_sndrcvinfo.sinfo_cumtsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sinfo_cumtsn$set(MemorySegment seg, long index, int x) {
        sctp_sndrcvinfo.sinfo_cumtsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sinfo_assoc_id$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sinfo_assoc_id"));
    public static VarHandle sinfo_assoc_id$VH() {
        return sctp_sndrcvinfo.sinfo_assoc_id$VH;
    }
    public static int sinfo_assoc_id$get(MemorySegment seg) {
        return (int)sctp_sndrcvinfo.sinfo_assoc_id$VH.get(seg);
    }
    public static void sinfo_assoc_id$set( MemorySegment seg, int x) {
        sctp_sndrcvinfo.sinfo_assoc_id$VH.set(seg, x);
    }
    public static int sinfo_assoc_id$get(MemorySegment seg, long index) {
        return (int)sctp_sndrcvinfo.sinfo_assoc_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sinfo_assoc_id$set(MemorySegment seg, long index, int x) {
        sctp_sndrcvinfo.sinfo_assoc_id$VH.set(seg.asSlice(index*sizeof()), x);
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


