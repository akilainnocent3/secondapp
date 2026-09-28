package defpackage;

import defpackage.doa;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public abstract class doa<N extends doa<N>> {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = s0o.a;
        a = unsafe.objectFieldOffset(doa.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(doa.class.getDeclaredField("_prev$volatile"));
    }

    public doa(f580 f580Var) {
        this._prev$volatile = f580Var;
    }

    public final void a() {
        s0o.a.putObjectVolatile(this, b, (Object) null);
    }

    public final N c() {
        Object objectVolatile = s0o.a.getObjectVolatile(this, a);
        if (objectVolatile == coa.a) {
            return null;
        }
        return (N) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        doa doaVar;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = s0o.a;
            long j = b;
            doa doaVar2 = (doa) unsafe2.getObjectVolatile(this, j);
            while (doaVar2 != null && doaVar2.d()) {
                doaVar2 = (doa) s0o.a.getObjectVolatile(doaVar2, j);
            }
            doa doaVarC = c();
            doaVarC.getClass();
            do {
                doaVar = doaVarC;
                if (!doaVar.d()) {
                    break;
                } else {
                    doaVarC = doaVar.c();
                }
            } while (doaVarC != null);
            while (true) {
                Object objectVolatile = s0o.a.getObjectVolatile(doaVar, j);
                doa doaVar3 = ((doa) objectVolatile) == null ? null : doaVar2;
                while (true) {
                    unsafe = s0o.a;
                    if (unsafe.compareAndSwapObject(doaVar, b, objectVolatile, doaVar3)) {
                        break;
                    } else if (unsafe.getObjectVolatile(doaVar, j) != objectVolatile) {
                    }
                }
            }
            if (doaVar2 != null) {
                unsafe.putObjectVolatile(doaVar2, a, doaVar);
            }
            if (!doaVar.d() || doaVar.c() == null) {
                if (doaVar2 == null || !doaVar2.d()) {
                    return;
                }
            }
        }
    }
}
