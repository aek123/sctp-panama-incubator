// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sctp_paddrthlds {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("spt_assoc_id"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("ss_family"),
            MemoryLayout.sequenceLayout(118, Constants$root.C_CHAR$LAYOUT).withName("__ss_padding"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("__ss_align")
        ).withName("spt_address"),
        Constants$root.C_SHORT$LAYOUT.withName("spt_pathmaxrxt"),
        Constants$root.C_SHORT$LAYOUT.withName("spt_pathpfthld"),
        MemoryLayout.paddingLayout(32)
    ).withName("sctp_paddrthlds");
    public static MemoryLayout $LAYOUT() {
        return sctp_paddrthlds.$struct$LAYOUT;
    }
    static final VarHandle spt_assoc_id$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("spt_assoc_id"));
    public static VarHandle spt_assoc_id$VH() {
        return sctp_paddrthlds.spt_assoc_id$VH;
    }
    public static int spt_assoc_id$get(MemorySegment seg) {
        return (int)sctp_paddrthlds.spt_assoc_id$VH.get(seg);
    }
    public static void spt_assoc_id$set( MemorySegment seg, int x) {
        sctp_paddrthlds.spt_assoc_id$VH.set(seg, x);
    }
    public static int spt_assoc_id$get(MemorySegment seg, long index) {
        return (int)sctp_paddrthlds.spt_assoc_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void spt_assoc_id$set(MemorySegment seg, long index, int x) {
        sctp_paddrthlds.spt_assoc_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment spt_address$slice(MemorySegment seg) {
        return seg.asSlice(8, 128);
    }
    static final VarHandle spt_pathmaxrxt$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("spt_pathmaxrxt"));
    public static VarHandle spt_pathmaxrxt$VH() {
        return sctp_paddrthlds.spt_pathmaxrxt$VH;
    }
    public static short spt_pathmaxrxt$get(MemorySegment seg) {
        return (short)sctp_paddrthlds.spt_pathmaxrxt$VH.get(seg);
    }
    public static void spt_pathmaxrxt$set( MemorySegment seg, short x) {
        sctp_paddrthlds.spt_pathmaxrxt$VH.set(seg, x);
    }
    public static short spt_pathmaxrxt$get(MemorySegment seg, long index) {
        return (short)sctp_paddrthlds.spt_pathmaxrxt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void spt_pathmaxrxt$set(MemorySegment seg, long index, short x) {
        sctp_paddrthlds.spt_pathmaxrxt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle spt_pathpfthld$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("spt_pathpfthld"));
    public static VarHandle spt_pathpfthld$VH() {
        return sctp_paddrthlds.spt_pathpfthld$VH;
    }
    public static short spt_pathpfthld$get(MemorySegment seg) {
        return (short)sctp_paddrthlds.spt_pathpfthld$VH.get(seg);
    }
    public static void spt_pathpfthld$set( MemorySegment seg, short x) {
        sctp_paddrthlds.spt_pathpfthld$VH.set(seg, x);
    }
    public static short spt_pathpfthld$get(MemorySegment seg, long index) {
        return (short)sctp_paddrthlds.spt_pathpfthld$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void spt_pathpfthld$set(MemorySegment seg, long index, short x) {
        sctp_paddrthlds.spt_pathpfthld$VH.set(seg.asSlice(index*sizeof()), x);
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


