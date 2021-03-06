// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sctp_pdapi_event {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("pdapi_type"),
        Constants$root.C_SHORT$LAYOUT.withName("pdapi_flags"),
        Constants$root.C_INT$LAYOUT.withName("pdapi_length"),
        Constants$root.C_INT$LAYOUT.withName("pdapi_indication"),
        Constants$root.C_INT$LAYOUT.withName("pdapi_assoc_id"),
        Constants$root.C_INT$LAYOUT.withName("pdapi_stream"),
        Constants$root.C_INT$LAYOUT.withName("pdapi_seq")
    ).withName("sctp_pdapi_event");
    public static MemoryLayout $LAYOUT() {
        return sctp_pdapi_event.$struct$LAYOUT;
    }
    static final VarHandle pdapi_type$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("pdapi_type"));
    public static VarHandle pdapi_type$VH() {
        return sctp_pdapi_event.pdapi_type$VH;
    }
    public static short pdapi_type$get(MemorySegment seg) {
        return (short)sctp_pdapi_event.pdapi_type$VH.get(seg);
    }
    public static void pdapi_type$set( MemorySegment seg, short x) {
        sctp_pdapi_event.pdapi_type$VH.set(seg, x);
    }
    public static short pdapi_type$get(MemorySegment seg, long index) {
        return (short)sctp_pdapi_event.pdapi_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pdapi_type$set(MemorySegment seg, long index, short x) {
        sctp_pdapi_event.pdapi_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pdapi_flags$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("pdapi_flags"));
    public static VarHandle pdapi_flags$VH() {
        return sctp_pdapi_event.pdapi_flags$VH;
    }
    public static short pdapi_flags$get(MemorySegment seg) {
        return (short)sctp_pdapi_event.pdapi_flags$VH.get(seg);
    }
    public static void pdapi_flags$set( MemorySegment seg, short x) {
        sctp_pdapi_event.pdapi_flags$VH.set(seg, x);
    }
    public static short pdapi_flags$get(MemorySegment seg, long index) {
        return (short)sctp_pdapi_event.pdapi_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pdapi_flags$set(MemorySegment seg, long index, short x) {
        sctp_pdapi_event.pdapi_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pdapi_length$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("pdapi_length"));
    public static VarHandle pdapi_length$VH() {
        return sctp_pdapi_event.pdapi_length$VH;
    }
    public static int pdapi_length$get(MemorySegment seg) {
        return (int)sctp_pdapi_event.pdapi_length$VH.get(seg);
    }
    public static void pdapi_length$set( MemorySegment seg, int x) {
        sctp_pdapi_event.pdapi_length$VH.set(seg, x);
    }
    public static int pdapi_length$get(MemorySegment seg, long index) {
        return (int)sctp_pdapi_event.pdapi_length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pdapi_length$set(MemorySegment seg, long index, int x) {
        sctp_pdapi_event.pdapi_length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pdapi_indication$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("pdapi_indication"));
    public static VarHandle pdapi_indication$VH() {
        return sctp_pdapi_event.pdapi_indication$VH;
    }
    public static int pdapi_indication$get(MemorySegment seg) {
        return (int)sctp_pdapi_event.pdapi_indication$VH.get(seg);
    }
    public static void pdapi_indication$set( MemorySegment seg, int x) {
        sctp_pdapi_event.pdapi_indication$VH.set(seg, x);
    }
    public static int pdapi_indication$get(MemorySegment seg, long index) {
        return (int)sctp_pdapi_event.pdapi_indication$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pdapi_indication$set(MemorySegment seg, long index, int x) {
        sctp_pdapi_event.pdapi_indication$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pdapi_assoc_id$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("pdapi_assoc_id"));
    public static VarHandle pdapi_assoc_id$VH() {
        return sctp_pdapi_event.pdapi_assoc_id$VH;
    }
    public static int pdapi_assoc_id$get(MemorySegment seg) {
        return (int)sctp_pdapi_event.pdapi_assoc_id$VH.get(seg);
    }
    public static void pdapi_assoc_id$set( MemorySegment seg, int x) {
        sctp_pdapi_event.pdapi_assoc_id$VH.set(seg, x);
    }
    public static int pdapi_assoc_id$get(MemorySegment seg, long index) {
        return (int)sctp_pdapi_event.pdapi_assoc_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pdapi_assoc_id$set(MemorySegment seg, long index, int x) {
        sctp_pdapi_event.pdapi_assoc_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pdapi_stream$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("pdapi_stream"));
    public static VarHandle pdapi_stream$VH() {
        return sctp_pdapi_event.pdapi_stream$VH;
    }
    public static int pdapi_stream$get(MemorySegment seg) {
        return (int)sctp_pdapi_event.pdapi_stream$VH.get(seg);
    }
    public static void pdapi_stream$set( MemorySegment seg, int x) {
        sctp_pdapi_event.pdapi_stream$VH.set(seg, x);
    }
    public static int pdapi_stream$get(MemorySegment seg, long index) {
        return (int)sctp_pdapi_event.pdapi_stream$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pdapi_stream$set(MemorySegment seg, long index, int x) {
        sctp_pdapi_event.pdapi_stream$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pdapi_seq$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("pdapi_seq"));
    public static VarHandle pdapi_seq$VH() {
        return sctp_pdapi_event.pdapi_seq$VH;
    }
    public static int pdapi_seq$get(MemorySegment seg) {
        return (int)sctp_pdapi_event.pdapi_seq$VH.get(seg);
    }
    public static void pdapi_seq$set( MemorySegment seg, int x) {
        sctp_pdapi_event.pdapi_seq$VH.set(seg, x);
    }
    public static int pdapi_seq$get(MemorySegment seg, long index) {
        return (int)sctp_pdapi_event.pdapi_seq$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pdapi_seq$set(MemorySegment seg, long index, int x) {
        sctp_pdapi_event.pdapi_seq$VH.set(seg.asSlice(index*sizeof()), x);
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


