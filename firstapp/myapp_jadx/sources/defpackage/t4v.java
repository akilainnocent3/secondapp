package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class t4v implements mpg.a {
    public final /* synthetic */ y4v a;

    public t4v(y4v y4vVar) {
        this.a = y4vVar;
    }

    @Override // mpg.a
    public final void f(bs3 bs3Var) {
        this.a.q0(bs3Var);
    }

    @Override // mpg.a
    public final void g(bs3 bs3Var) {
        y4v y4vVar = this.a;
        tlo tloVarP0 = y4vVar.p0();
        BigDecimal bigDecimal = sqo.a;
        ((n4p) tloVarP0).I(sqo.b(bs3Var.a, bs3Var.b, bs3Var.c));
        y4vVar.t0(bs3Var, false);
        b5v b5vVar = y4vVar.B;
        if (b5vVar != null) {
            b5vVar.u0();
        }
    }

    @Override // mpg.a
    public final void h(mpg mpgVar) {
        b5v b5vVar = this.a.B;
        if (b5vVar != null) {
            b5vVar.J(mpgVar);
        }
    }
}
