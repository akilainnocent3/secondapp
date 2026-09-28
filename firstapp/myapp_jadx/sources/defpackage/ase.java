package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class ase<T> extends vn70<T> {
    public static final /* synthetic */ long f = s0o.a.objectFieldOffset(ase.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.vn70, defpackage.m9p
    public final void n(Object obj) {
        p(obj);
    }

    @Override // defpackage.vn70, defpackage.m9p
    public final void p(Object obj) {
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    zre.b(yzo.b(this.e), gn8.a(obj));
                    return;
                } else {
                    ib5.a("Already resumed");
                    return;
                }
            }
            ase<T> aseVar = this;
            if (unsafe.compareAndSwapInt(aseVar, j, 0, 2)) {
                return;
            } else {
                this = aseVar;
            }
        }
    }
}
