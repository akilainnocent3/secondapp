package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xef0 extends tkd implements yma, bef0 {
    public yzf0 F;
    public Function1<? super v1b<? super Unit>, ? extends Object> G;
    public Function1<? super v1b<? super Unit>, ? extends Object> H;
    public Function1<? super urr, lk40> I;
    public jvd0 J;
    public final mae K = a6a0.b(new Function0() { // from class: vef0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            xef0 xef0Var = this.a;
            return xef0Var.C ? nef0.a(xef0Var) : aef0.b;
        }
    });
    public lk40 L = lk40.e;

    public xef0(yzf0 yzf0Var, cif0 cif0Var, dif0 dif0Var, aif0 aif0Var) {
        this.F = yzf0Var;
        this.G = cif0Var;
        this.H = dif0Var;
        this.I = aif0Var;
    }

    @Override // defpackage.bef0
    public final long Q0(urr urrVar) {
        return S0(urrVar).e();
    }

    @Override // defpackage.bef0
    public final lk40 S0(urr urrVar) {
        if (!this.C) {
            return this.L;
        }
        lk40 lk40VarInvoke = this.I.invoke(urrVar);
        if (lk40VarInvoke == null) {
            return this.L;
        }
        this.L = lk40VarInvoke;
        return lk40VarInvoke;
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        this.F.a = this;
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        this.F.a = null;
    }

    @Override // defpackage.bef0
    public final aef0 k0() {
        return (aef0) this.K.getValue();
    }
}
