package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class uxd0<T> extends rxd0 {
    public zg00<? extends T> c;
    public int d;

    public uxd0(long j, zg00<? extends T> zg00Var) {
        super(j);
        this.c = zg00Var;
    }

    @Override // defpackage.rxd0
    public final void a(rxd0 rxd0Var) {
        synchronized (s6a0.a) {
            rxd0Var.getClass();
            this.c = ((uxd0) rxd0Var).c;
            this.d = ((uxd0) rxd0Var).d;
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.rxd0
    public final rxd0 b() {
        return new uxd0(n5a0.g().g(), this.c);
    }

    @Override // defpackage.rxd0
    public final rxd0 c(long j) {
        return new uxd0(j, this.c);
    }
}
