package defpackage;

import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class yj7 extends j9p {
    public final bc6<?> e;

    public yj7(bc6<?> bc6Var) {
        this.e = bc6Var;
    }

    @Override // defpackage.j9p
    public final boolean k() {
        return true;
    }

    @Override // defpackage.j9p
    public final void l(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        m9p m9pVarJ = j();
        bc6<?> bc6Var = this.e;
        Throwable thN = bc6Var.n(m9pVarJ);
        if (bc6Var.w()) {
            v1b<?> v1bVar = bc6Var.d;
            v1bVar.getClass();
            yre yreVar = (yre) v1bVar;
            long j = yre.v;
            loop0: while (true) {
                Object objectVolatile = s0o.a.getObjectVolatile(yreVar, j);
                toe0 toe0Var = zre.b;
                if (Intrinsics.g(objectVolatile, toe0Var)) {
                    do {
                        unsafe = s0o.a;
                        if (unsafe.compareAndSwapObject(yreVar, yre.v, toe0Var, thN)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(yreVar, j) == toe0Var);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = s0o.a;
                        if (unsafe2.compareAndSwapObject(yreVar, yre.v, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(yreVar, j) == objectVolatile);
                }
            }
        }
        bc6Var.cancel(thN);
        if (bc6Var.w()) {
            return;
        }
        bc6Var.l();
    }
}
