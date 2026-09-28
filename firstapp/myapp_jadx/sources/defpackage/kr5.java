package defpackage;

import androidx.compose.ui.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kr5 extends d.c implements jr5, mfy, aj5 {
    public final mr5 D;
    public boolean E;
    public bo70 F;
    public Function1<? super mr5, scf> G;

    public static final class a extends qlr implements Function0<t6l> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final t6l invoke() {
            kr5 kr5Var = kr5.this;
            bo70 bo70Var = kr5Var.F;
            if (bo70Var == null) {
                bo70Var = new bo70();
                kr5Var.F = bo70Var;
            }
            if (bo70Var.b == null) {
                t6l graphicsContext = pkd.g(kr5Var).getGraphicsContext();
                bo70Var.d();
                bo70Var.b = graphicsContext;
            }
            return bo70Var;
        }
    }

    public kr5(mr5 mr5Var, Function1<? super mr5, scf> function1) {
        this.D = mr5Var;
        this.G = function1;
        mr5Var.a = this;
        new a();
    }

    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        boolean z = this.E;
        mr5 mr5Var = this.D;
        if (!z) {
            mr5Var.b = null;
            nfy.a(this, new lr5(this, mr5Var));
            if (mr5Var.b == null) {
                throw w20.a("DrawResult not defined, did you forget to call onDraw?");
            }
            this.E = true;
        }
        scf scfVar = mr5Var.b;
        scfVar.getClass();
        scfVar.a.invoke(wsrVar);
    }

    @Override // defpackage.jr5
    public final void W0() {
        bo70 bo70Var = this.F;
        if (bo70Var != null) {
            bo70Var.d();
        }
        this.E = false;
        this.D.b = null;
        rcf.a(this);
    }

    @Override // defpackage.aj5
    public final long d() {
        return kc6.d(pkd.d(this, 128).c);
    }

    @Override // defpackage.aj5
    public final mmd getDensity() {
        return pkd.f(this).N;
    }

    @Override // defpackage.aj5
    public final asr getLayoutDirection() {
        return pkd.f(this).O;
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        bo70 bo70Var = this.F;
        if (bo70Var != null) {
            bo70Var.d();
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void j2() {
        W0();
    }

    @Override // defpackage.okd
    public final void l0() {
        W0();
    }

    @Override // defpackage.qcf
    public final void s1() {
        W0();
    }

    @Override // defpackage.mfy
    public final void t0() {
        W0();
    }

    @Override // defpackage.okd, defpackage.s020
    public final void x() {
        W0();
    }
}
