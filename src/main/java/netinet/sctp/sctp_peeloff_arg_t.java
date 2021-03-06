// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class sctp_peeloff_arg_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("associd"),
        Constants$root.C_INT$LAYOUT.withName("sd")
    );
    public static MemoryLayout $LAYOUT() {
        return sctp_peeloff_arg_t.$struct$LAYOUT;
    }
    static final VarHandle associd$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("associd"));
    public static VarHandle associd$VH() {
        return sctp_peeloff_arg_t.associd$VH;
    }
    public static int associd$get(MemorySegment seg) {
        return (int)sctp_peeloff_arg_t.associd$VH.get(seg);
    }
    public static void associd$set( MemorySegment seg, int x) {
        sctp_peeloff_arg_t.associd$VH.set(seg, x);
    }
    public static int associd$get(MemorySegment seg, long index) {
        return (int)sctp_peeloff_arg_t.associd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void associd$set(MemorySegment seg, long index, int x) {
        sctp_peeloff_arg_t.associd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sd$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("sd"));
    public static VarHandle sd$VH() {
        return sctp_peeloff_arg_t.sd$VH;
    }
    public static int sd$get(MemorySegment seg) {
        return (int)sctp_peeloff_arg_t.sd$VH.get(seg);
    }
    public static void sd$set( MemorySegment seg, int x) {
        sctp_peeloff_arg_t.sd$VH.set(seg, x);
    }
    public static int sd$get(MemorySegment seg, long index) {
        return (int)sctp_peeloff_arg_t.sd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sd$set(MemorySegment seg, long index, int x) {
        sctp_peeloff_arg_t.sd$VH.set(seg.asSlice(index*sizeof()), x);
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


