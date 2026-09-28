package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class wef extends crz {
    public final qx80 f;
    public final hx80 i;
    public final yef v;
    public float w = 1.0f;
    public l58 y;

    public wef(qx80 qx80Var, hx80 hx80Var, yef yefVar) {
        this.f = qx80Var;
        this.i = hx80Var;
        this.v = yefVar;
        asr asrVar = asr.a;
    }

    @Override // defpackage.crz
    public final boolean a(float f) {
        this.w = f;
        return true;
    }

    @Override // defpackage.crz
    public final boolean b(l58 l58Var) {
        this.y = l58Var;
        return true;
    }

    @Override // defpackage.crz
    public final long i() {
        return 9205357640488583168L;
    }

    @Override // defpackage.crz
    public final void j(tcf tcfVar) {
        xef xefVarD = this.v.d(this.f, tcfVar.d(), tcfVar.getLayoutDirection(), tcfVar, this.i);
        hx80 hx80Var = xefVarD.i;
        hx80 hx80Var2 = this.i;
        float fC1 = tcfVar.C1(j7f.c(hx80Var2.c));
        float fC2 = tcfVar.C1(j7f.d(hx80Var2.c));
        tcfVar.F1().a.i(fC1, fC2);
        try {
            xefVarD.b(tcfVar, this.y, tcfVar.d(), hx80Var.e, f.d(this.w * hx80Var.f, 0.0f, 1.0f), hx80Var.d);
        } finally {
            tcfVar.F1().a.i(-fC1, -fC2);
        }
    }
}
