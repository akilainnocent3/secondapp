package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class dc6 {
    public static final /* synthetic */ int a = 0;

    public static final bc6 a(v1b v1bVar) {
        Unsafe unsafe;
        bc6 bc6Var;
        bc6 bc6Var2;
        if (!(v1bVar instanceof yre)) {
            return new bc6(1, v1bVar);
        }
        yre yreVar = (yre) v1bVar;
        toe0 toe0Var = zre.b;
        long j = yre.v;
        loop0: while (true) {
            unsafe = s0o.a;
            Object objectVolatile = unsafe.getObjectVolatile(yreVar, j);
            bc6Var = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(yreVar, j, toe0Var);
                bc6Var2 = null;
                break;
            }
            if (objectVolatile instanceof bc6) {
                do {
                    unsafe = s0o.a;
                    if (unsafe.compareAndSwapObject(yreVar, yre.v, objectVolatile, toe0Var)) {
                        bc6Var2 = (bc6) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(yreVar, j) == objectVolatile);
            } else if (objectVolatile != toe0Var && !(objectVolatile instanceof Throwable)) {
                ogf.a(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (bc6Var2 != null) {
            long j2 = bc6.v;
            Object objectVolatile2 = unsafe.getObjectVolatile(bc6Var2, j2);
            if (!(objectVolatile2 instanceof bn8) || ((bn8) objectVolatile2).d == null) {
                unsafe.putIntVolatile(bc6Var2, bc6.f, 536870911);
                unsafe.putObjectVolatile(bc6Var2, j2, fc.a);
                bc6Var = bc6Var2;
            } else {
                bc6Var2.l();
            }
            if (bc6Var != null) {
                return bc6Var;
            }
        }
        return new bc6(2, v1bVar);
    }
}
