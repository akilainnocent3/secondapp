package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qf4 extends d.c implements qcf, mfy, qln {
    public zk40.a D;
    public mmd E;
    public hx80 F;
    public nln G;
    public boolean H;
    public Function1<? super qln, Unit> I;
    public float J;
    public float K;
    public long L;
    public long M;
    public float N;
    public int O;

    public qf4() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008b  */
    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        if (!this.H) {
            this.H = true;
            nfy.a(this, new pf4(this));
        }
        hx80 hx80Var = this.F;
        nln nlnVarB = this.G;
        float density = this.J / getDensity();
        float density2 = this.K / getDensity();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.L >> 32)) / getDensity();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.L & 4294967295L)) / getDensity();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        if (nlnVarB == null || hx80Var == null || !g7f.b(hx80Var.a, density) || !g7f.b(hx80Var.b, density2)) {
            hx80 hx80Var2 = new hx80(density, this.M, density2, jFloatToRawIntBits, this.N, this.O);
            this.F = hx80Var2;
            nlnVarB = pkd.g(this).getGraphicsContext().b().b(this.D, hx80Var2);
            this.G = nlnVarB;
        } else {
            long j = hx80Var.e;
            long j2 = this.M;
            int i = j58.n;
            if (!nbh0.a(j, j2) || hx80Var.f != this.N || hx80Var.d != this.O || !j7f.b(hx80Var.c, jFloatToRawIntBits)) {
                hx80 hx80Var3 = new hx80(density, this.M, density2, jFloatToRawIntBits, this.N, this.O);
                this.F = hx80Var3;
                nlnVarB = pkd.g(this).getGraphicsContext().b().b(this.D, hx80Var3);
                this.G = nlnVarB;
            }
        }
        nlnVarB.g(wsrVar, wsrVar.a.d(), 1.0f, null);
        wsrVar.b2();
    }

    @Override // defpackage.qln
    public final void C0(float f) {
        if (this.J == 20.0f) {
            return;
        }
        this.J = 20.0f;
        p2();
    }

    @Override // defpackage.qln
    public final void b(float f) {
        if (this.N == f) {
            return;
        }
        this.N = f;
        p2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qf4)) {
            return false;
        }
        qf4 qf4Var = (qf4) obj;
        if (this.N != qf4Var.N || !Intrinsics.g(this.D, qf4Var.D) || this.I != qf4Var.I || this.J != qf4Var.J || this.K != qf4Var.K || !gly.c(this.L, qf4Var.L)) {
            return false;
        }
        long j = this.M;
        long j2 = qf4Var.M;
        int i = j58.n;
        return nbh0.a(j, j2) && this.O == qf4Var.O;
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        mmd mmdVar = this.E;
        if (mmdVar != null) {
            return mmdVar.getDensity();
        }
        return 1.0f;
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        mmd mmdVar = pkd.f(this).N;
        if (Intrinsics.g(this.E, mmdVar)) {
            return;
        }
        this.E = mmdVar;
        this.I.invoke(this);
        p2();
    }

    public final int hashCode() {
        int iA = f87.a(tvh.a(this.K, tvh.a(this.J, w57.b((this.D.hashCode() + (Float.hashCode(this.N) * 31)) * 31, 31, this.I), 31), 31), this.L, 31);
        long j = this.M;
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Integer.hashCode(this.O) + f87.a(iA, j, 961);
    }

    @Override // defpackage.qln
    public final void j1(long j) {
        if (gly.c(this.L, j)) {
            return;
        }
        this.L = j;
        p2();
    }

    @Override // defpackage.qln
    public final void m(long j) {
        if (j == 16) {
            int i = j58.n;
            j = j58.b;
        }
        long j2 = this.M;
        int i2 = j58.n;
        if (nbh0.a(j2, j)) {
            return;
        }
        this.M = j;
        p2();
    }

    public final void p2() {
        this.F = null;
        this.G = null;
        rcf.a(this);
    }

    @Override // defpackage.qln
    public final void r1(float f) {
        if (this.K == f) {
            return;
        }
        this.K = f;
        p2();
    }

    @Override // defpackage.mfy
    public final void t0() {
        p2();
        this.H = false;
    }

    @Override // defpackage.okd, defpackage.s020
    public final void x() {
        if (this.C) {
            mmd mmdVar = pkd.f(this).N;
            if (Intrinsics.g(this.E, mmdVar)) {
                return;
            }
            this.E = mmdVar;
            this.I.invoke(this);
            p2();
        }
    }

    @Override // defpackage.mmd
    public final float y1() {
        mmd mmdVar = this.E;
        if (mmdVar != null) {
            return mmdVar.y1();
        }
        return 1.0f;
    }
}
