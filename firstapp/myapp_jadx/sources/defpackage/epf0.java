package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class epf0 extends j9p {
    public static final /* synthetic */ long i = s0o.a.objectFieldOffset(epf0.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public wse f;

    public static void n(int i2) {
        throw new IllegalStateException(("Illegal state " + i2).toString());
    }

    @Override // defpackage.j9p
    public final boolean k() {
        return true;
    }

    @Override // defpackage.j9p
    public final void l(Throwable th) {
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = i;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                n(intVolatile);
                throw null;
            }
            epf0 epf0Var = this;
            if (unsafe.compareAndSwapInt(epf0Var, i, intVolatile, 2)) {
                epf0Var.e.interrupt();
                unsafe.putIntVolatile(epf0Var, j, 3);
                return;
            }
            this = epf0Var;
        }
    }

    public final void m() {
        epf0 epf0Var;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = i;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                epf0Var = this;
                if (unsafe.compareAndSwapInt(epf0Var, j, intVolatile, 1)) {
                    wse wseVar = epf0Var.f;
                    if (wseVar != null) {
                        wseVar.dispose();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(intVolatile);
                        throw null;
                    }
                }
                epf0Var = this;
            }
            this = epf0Var;
        }
    }
}
