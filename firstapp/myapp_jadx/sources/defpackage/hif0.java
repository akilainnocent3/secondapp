package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hif0 implements fff0 {
    public final /* synthetic */ iif0 a;
    public final /* synthetic */ boolean b;

    public hif0(iif0 iif0Var, boolean z) {
        this.a = iif0Var;
        this.b = z;
    }

    @Override // defpackage.fff0
    public final void a() {
        vkf0 vkf0VarD;
        boolean z = this.b;
        lcl lclVar = z ? lcl.b : lcl.c;
        iif0 iif0Var = this.a;
        iif0Var.p(lclVar);
        long jA = r880.a(iif0Var.h(z));
        n6s n6sVar = iif0Var.d;
        if (n6sVar == null || (vkf0VarD = n6sVar.d()) == null) {
            return;
        }
        long jE = vkf0VarD.e(jA);
        iif0Var.p = jE;
        iif0Var.o(new gly(jE));
        iif0Var.r = 0L;
        iif0Var.u = -1;
        n6s n6sVar2 = iif0Var.d;
        if (n6sVar2 != null) {
            ((x5a0) n6sVar2.q).setValue(Boolean.TRUE);
        }
        iif0Var.t(false);
    }

    @Override // defpackage.fff0
    public final void c() {
        iif0 iif0Var = this.a;
        iif0Var.p(null);
        iif0Var.o(null);
        iif0Var.t(true);
    }

    @Override // defpackage.fff0
    public final void d() {
        iif0 iif0Var = this.a;
        iif0Var.p(null);
        iif0Var.o(null);
        iif0Var.t(true);
    }

    @Override // defpackage.fff0
    public final void e(long j) {
        iif0 iif0Var = this.a;
        long jF = gly.f(iif0Var.r, j);
        iif0Var.r = jF;
        iif0Var.o(new gly(gly.f(iif0Var.p, jF)));
        ijf0 ijf0VarJ = iif0Var.j();
        gly glyVarF = iif0Var.f();
        glyVarF.getClass();
        iif0Var.u(ijf0VarJ, glyVarF.a, false, this.b, w780.a.d, true);
        iif0Var.t(false);
    }

    @Override // defpackage.fff0
    public final void onCancel() {
    }

    @Override // defpackage.fff0
    public final void b(long j) {
    }
}
