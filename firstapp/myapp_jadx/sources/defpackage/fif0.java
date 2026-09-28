package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fif0 implements fff0 {
    public final /* synthetic */ iif0 a;

    public fif0(iif0 iif0Var) {
        this.a = iif0Var;
    }

    @Override // defpackage.fff0
    public final void b(long j) {
        vkf0 vkf0VarD;
        iif0 iif0Var = this.a;
        long jA = r880.a(iif0Var.h(true));
        n6s n6sVar = iif0Var.d;
        if (n6sVar == null || (vkf0VarD = n6sVar.d()) == null) {
            return;
        }
        long jE = vkf0VarD.e(jA);
        iif0Var.p = jE;
        iif0Var.o(new gly(jE));
        iif0Var.r = 0L;
        iif0Var.p(lcl.a);
        iif0Var.t(false);
    }

    @Override // defpackage.fff0
    public final void c() {
        iif0 iif0Var = this.a;
        iif0Var.p(null);
        iif0Var.o(null);
    }

    @Override // defpackage.fff0
    public final void d() {
        iif0 iif0Var = this.a;
        iif0Var.p(null);
        iif0Var.o(null);
    }

    @Override // defpackage.fff0
    public final void e(long j) {
        vkf0 vkf0VarD;
        zdl zdlVar;
        iif0 iif0Var = this.a;
        iif0Var.r = gly.f(iif0Var.r, j);
        n6s n6sVar = iif0Var.d;
        if (n6sVar == null || (vkf0VarD = n6sVar.d()) == null) {
            return;
        }
        iif0Var.o(new gly(gly.f(iif0Var.p, iif0Var.r)));
        mly mlyVar = iif0Var.b;
        gly glyVarF = iif0Var.f();
        glyVarF.getClass();
        int iA = mlyVar.a(vkf0VarD.b(glyVarF.a, true));
        long jA = vlf0.a(iA, iA);
        if (ulf0.b(jA, iif0Var.j().b)) {
            return;
        }
        n6s n6sVar2 = iif0Var.d;
        if ((n6sVar2 == null || ((Boolean) ((x5a0) n6sVar2.q).getValue()).booleanValue()) && (zdlVar = iif0Var.l) != null) {
            zdlVar.a(9);
        }
        iif0Var.c.invoke(iif0.b(iif0Var.j().a, jA));
        iif0Var.x = new ulf0(jA);
    }

    @Override // defpackage.fff0
    public final void a() {
    }

    @Override // defpackage.fff0
    public final void onCancel() {
    }
}
