package defpackage;

import kotlin.jvm.functions.Function2;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class coa {
    public static final toe0 a = new toe0("CLOSED");

    public static final <S extends f580<S>> Object a(S s, long j, Function2<? super Long, ? super S, ? extends S> function2) {
        Unsafe unsafe;
        long j2;
        while (true) {
            f580 f580Var = s;
            while (true) {
                if (f580Var.d >= j && !f580Var.d()) {
                    return f580Var;
                }
                Object objectVolatile = s0o.a.getObjectVolatile(f580Var, doa.a);
                toe0 toe0Var = a;
                if (objectVolatile == toe0Var) {
                    return toe0Var;
                }
                s = (S) ((doa) objectVolatile);
                if (s != null) {
                    break;
                }
                S sInvoke = function2.invoke(Long.valueOf(f580Var.d + 1), f580Var);
                do {
                    unsafe = s0o.a;
                    j2 = doa.a;
                    if (unsafe.compareAndSwapObject(f580Var, j2, (Object) null, sInvoke)) {
                        if (f580Var.d()) {
                            f580Var.e();
                        }
                        f580Var = sInvoke;
                        break;
                    }
                } while (unsafe.getObjectVolatile(f580Var, j2) == null);
            }
        }
    }
}
