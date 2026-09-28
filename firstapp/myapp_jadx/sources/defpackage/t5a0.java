package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public class t5a0 extends oxd0 implements isw, w5a0<Float> {
    public a b;

    public static final class a extends rxd0 {
        public float c;

        public a(long j, float f) {
            super(j);
            this.c = f;
        }

        @Override // defpackage.rxd0
        public final void a(rxd0 rxd0Var) {
            rxd0Var.getClass();
            this.c = ((a) rxd0Var).c;
        }

        @Override // defpackage.rxd0
        public final rxd0 b() {
            return c(n5a0.g().g());
        }

        @Override // defpackage.rxd0
        public final rxd0 c(long j) {
            return new a(j, this.c);
        }
    }

    public t5a0(float f) {
        c5a0 c5a0VarG = n5a0.g();
        a aVar = new a(c5a0VarG.g(), f);
        if (!(c5a0VarG instanceof s2l)) {
            aVar.b = new a(1L, f);
        }
        this.b = aVar;
    }

    @Override // defpackage.isw
    public final void A(float f) {
        c5a0 c5a0VarG;
        a aVar = (a) n5a0.e(this.b);
        if (aVar.c == f) {
            return;
        }
        a aVar2 = this.b;
        synchronized (n5a0.c) {
            c5a0.e.getClass();
            c5a0VarG = n5a0.g();
            ((a) n5a0.m(aVar2, this, c5a0VarG, aVar)).c = f;
            Unit unit = Unit.a;
        }
        n5a0.k(c5a0VarG, this);
    }

    @Override // defpackage.w5a0
    public final y5a0<Float> h() {
        return bbe0.b;
    }

    @Override // defpackage.isw
    public final float j() {
        return ((a) n5a0.r(this.b, this)).c;
    }

    @Override // defpackage.nxd0
    public final void n(rxd0 rxd0Var) {
        this.b = (a) rxd0Var;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((a) n5a0.e(this.b)).c + ")@" + hashCode();
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
