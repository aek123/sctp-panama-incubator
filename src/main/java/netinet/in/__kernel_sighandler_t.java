// Generated by jextract

package netinet.in;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface __kernel_sighandler_t {

    void apply(int x0);
    static NativeSymbol allocate(__kernel_sighandler_t fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(__kernel_sighandler_t.class, fi, constants$1.__kernel_sighandler_t$FUNC, "(I)V", scope);
    }
    static __kernel_sighandler_t ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("__kernel_sighandler_t::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int x0) -> {
            try {
                constants$1.__kernel_sighandler_t$MH.invokeExact(symbol, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


