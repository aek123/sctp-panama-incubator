// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class __kernel_sockaddr_storage {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("ss_family"),
                MemoryLayout.sequenceLayout(126, Constants$root.C_CHAR$LAYOUT).withName("__data")
            ).withName("$anon$0"),
            Constants$root.C_POINTER$LAYOUT.withName("__align")
        ).withName("$anon$0")
    ).withName("__kernel_sockaddr_storage");
    public static MemoryLayout $LAYOUT() {
        return __kernel_sockaddr_storage.$struct$LAYOUT;
    }
    static final VarHandle ss_family$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("$anon$0"), PathElement.groupElement("$anon$0"), PathElement.groupElement("ss_family"));
    public static VarHandle ss_family$VH() {
        return __kernel_sockaddr_storage.ss_family$VH;
    }
    public static short ss_family$get(MemorySegment seg) {
        return (short)__kernel_sockaddr_storage.ss_family$VH.get(seg);
    }
    public static void ss_family$set( MemorySegment seg, short x) {
        __kernel_sockaddr_storage.ss_family$VH.set(seg, x);
    }
    public static short ss_family$get(MemorySegment seg, long index) {
        return (short)__kernel_sockaddr_storage.ss_family$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_family$set(MemorySegment seg, long index, short x) {
        __kernel_sockaddr_storage.ss_family$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __data$slice(MemorySegment seg) {
        return seg.asSlice(2, 126);
    }
    static final VarHandle __align$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("$anon$0"), PathElement.groupElement("__align"));
    public static VarHandle __align$VH() {
        return __kernel_sockaddr_storage.__align$VH;
    }
    public static MemoryAddress __align$get(MemorySegment seg) {
        return (MemoryAddress)__kernel_sockaddr_storage.__align$VH.get(seg);
    }
    public static void __align$set( MemorySegment seg, MemoryAddress x) {
        __kernel_sockaddr_storage.__align$VH.set(seg, x);
    }
    public static MemoryAddress __align$get(MemorySegment seg, long index) {
        return (MemoryAddress)__kernel_sockaddr_storage.__align$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __align$set(MemorySegment seg, long index, MemoryAddress x) {
        __kernel_sockaddr_storage.__align$VH.set(seg.asSlice(index*sizeof()), x);
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


