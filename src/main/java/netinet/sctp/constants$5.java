// Generated by jextract

package netinet.sctp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$5 {

    static final FunctionDescriptor sctp_bindx$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sctp_bindx$MH = RuntimeHelper.downcallHandle(
        "sctp_bindx",
        constants$5.sctp_bindx$FUNC, false
    );
    static final FunctionDescriptor sctp_connectx$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sctp_connectx$MH = RuntimeHelper.downcallHandle(
        "sctp_connectx",
        constants$5.sctp_connectx$FUNC, false
    );
    static final FunctionDescriptor sctp_peeloff$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sctp_peeloff$MH = RuntimeHelper.downcallHandle(
        "sctp_peeloff",
        constants$5.sctp_peeloff$FUNC, false
    );
    static final FunctionDescriptor sctp_peeloff_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sctp_peeloff_flags$MH = RuntimeHelper.downcallHandle(
        "sctp_peeloff_flags",
        constants$5.sctp_peeloff_flags$FUNC, false
    );
    static final FunctionDescriptor sctp_opt_info$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sctp_opt_info$MH = RuntimeHelper.downcallHandle(
        "sctp_opt_info",
        constants$5.sctp_opt_info$FUNC, false
    );
    static final FunctionDescriptor sctp_getpaddrs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sctp_getpaddrs$MH = RuntimeHelper.downcallHandle(
        "sctp_getpaddrs",
        constants$5.sctp_getpaddrs$FUNC, false
    );
}


