// Generated by jextract

package netinet.in;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$5 {

    static final  GroupLayout in6addr_any$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("__u6_addr8"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_SHORT$LAYOUT).withName("__u6_addr16"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_INT$LAYOUT).withName("__u6_addr32")
        ).withName("__in6_u")
    ).withName("in6_addr");
    static final MemorySegment in6addr_any$SEGMENT = RuntimeHelper.lookupGlobalVariable("in6addr_any", constants$5.in6addr_any$LAYOUT);
    static final  GroupLayout in6addr_loopback$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("__u6_addr8"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_SHORT$LAYOUT).withName("__u6_addr16"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_INT$LAYOUT).withName("__u6_addr32")
        ).withName("__in6_u")
    ).withName("in6_addr");
    static final MemorySegment in6addr_loopback$SEGMENT = RuntimeHelper.lookupGlobalVariable("in6addr_loopback", constants$5.in6addr_loopback$LAYOUT);
    static final FunctionDescriptor ntohl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle ntohl$MH = RuntimeHelper.downcallHandle(
        "ntohl",
        constants$5.ntohl$FUNC, false
    );
    static final FunctionDescriptor ntohs$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle ntohs$MH = RuntimeHelper.downcallHandle(
        "ntohs",
        constants$5.ntohs$FUNC, false
    );
    static final FunctionDescriptor htonl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle htonl$MH = RuntimeHelper.downcallHandle(
        "htonl",
        constants$5.htonl$FUNC, false
    );
    static final FunctionDescriptor htons$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle htons$MH = RuntimeHelper.downcallHandle(
        "htons",
        constants$5.htons$FUNC, false
    );
}


