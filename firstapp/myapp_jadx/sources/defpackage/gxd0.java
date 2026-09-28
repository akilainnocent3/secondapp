package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class gxd0<T> extends rxd0 {
    public o4 c;
    public int d;
    public int e;

    public gxd0(long j, o4 o4Var) {
        super(j);
        this.c = o4Var;
    }

    @Override // defpackage.rxd0
    public final void a(rxd0 rxd0Var) {
        synchronized (l6a0.a) {
            rxd0Var.getClass();
            this.c = ((gxd0) rxd0Var).c;
            this.d = ((gxd0) rxd0Var).d;
            this.e = ((gxd0) rxd0Var).e;
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.rxd0
    public final rxd0 b() {
        return c(n5a0.g().g());
    }

    @Override // defpackage.rxd0
    public final rxd0 c(long j) {
        return new gxd0(j, this.c);
    }
}
