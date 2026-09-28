package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class nln extends crz {
    public final qx80 f;
    public final hx80 i;
    public final pln v;
    public float w = 1.0f;
    public l58 y;

    public nln(qx80 qx80Var, hx80 hx80Var, pln plnVar) {
        this.f = qx80Var;
        this.i = hx80Var;
        this.v = plnVar;
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
        oln olnVarA = this.v.a(this.f, tcfVar.d(), tcfVar.getLayoutDirection(), tcfVar, this.i);
        l58 l58Var = this.y;
        long jD = tcfVar.d();
        hx80 hx80Var = this.i;
        olnVarA.b(tcfVar, l58Var, jD, hx80Var.e, f.d(this.w * hx80Var.f, 0.0f, 1.0f), hx80Var.d);
    }

    @Override // defpackage.crz
    public final void d(asr asrVar) {
    }
}
