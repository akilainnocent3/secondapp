package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public class s5a0 extends oxd0 implements fsw, w5a0<Double> {
    public a b;

    public static final class a extends rxd0 {
        public double c;

        public a(double d, long j) {
            super(j);
            this.c = d;
        }

        @Override // defpackage.rxd0
        public final void a(rxd0 rxd0Var) {
            rxd0Var.getClass();
            this.c = ((a) rxd0Var).c;
        }

        @Override // defpackage.rxd0
        public final rxd0 b() {
            return c(this.a);
        }

        @Override // defpackage.rxd0
        public final rxd0 c(long j) {
            return new a(this.c, j);
        }
    }

    public s5a0(double d) {
        c5a0 c5a0VarG = n5a0.g();
        a aVar = new a(d, c5a0VarG.g());
        if (!(c5a0VarG instanceof s2l)) {
            aVar.b = new a(d, 1L);
        }
        this.b = aVar;
    }

    @Override // defpackage.fsw
    public final double getDoubleValue() {
        return ((a) n5a0.r(this.b, this)).c;
    }

    @Override // defpackage.w5a0
    public final y5a0<Double> h() {
        return bbe0.b;
    }

    @Override // defpackage.nxd0
    public final void n(rxd0 rxd0Var) {
        this.b = (a) rxd0Var;
    }

    @Override // defpackage.fsw
    public final void t(double d) {
        c5a0 c5a0VarG;
        a aVar = (a) n5a0.e(this.b);
        if (aVar.c == d) {
            return;
        }
        a aVar2 = this.b;
        synchronized (n5a0.c) {
            c5a0.e.getClass();
            c5a0VarG = n5a0.g();
            ((a) n5a0.m(aVar2, this, c5a0VarG, aVar)).c = d;
            Unit unit = Unit.a;
        }
        n5a0.k(c5a0VarG, this);
    }

    public final String toString() {
        return "MutableDoubleState(value=" + ((a) n5a0.e(this.b)).c + ")@" + hashCode();
    }

    @Override // defpackage.nxd0
    public final rxd0 v() {
        return this.b;
    }

    @Override // defpackage.nxd0
    public final rxd0 x(rxd0 rxd0Var, rxd0 rxd0Var2, rxd0 rxd0Var3) {
        if (((a) rxd0Var2).c == ((a) rxd0Var3).c) {
            return rxd0Var2;
        }
        return null;
    }
}
