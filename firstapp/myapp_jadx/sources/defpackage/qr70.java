package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qr70 extends tkd implements yma, mfy {
    public fr70 F;
    public i3z G;
    public boolean H;
    public boolean I;
    public svh J;
    public psw K;
    public qa5 L;
    public boolean M;
    public sfz N;
    public br70 O;
    public okd P;
    public tfz Q;
    public sfz R;
    public boolean S;

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        this.S = t2();
        s2();
        if (this.O == null) {
            fr70 fr70Var = this.F;
            sfz sfzVar = this.M ? this.R : this.N;
            br70 br70Var = new br70(this.L, this.J, this.K, this.G, sfzVar, fr70Var, this.H, this.S);
            p2(br70Var);
            this.O = br70Var;
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        okd okdVar = this.P;
        if (okdVar != null) {
            q2(okdVar);
        }
    }

    @Override // defpackage.okd
    public final void l0() {
        boolean zT2 = t2();
        if (this.S != zT2) {
            this.S = zT2;
            fr70 fr70Var = this.F;
            i3z i3zVar = this.G;
            boolean z = this.M;
            sfz sfzVar = z ? this.R : this.N;
            u2(this.L, this.J, this.K, i3zVar, sfzVar, fr70Var, z, this.H, this.I);
        }
    }

    public final void s2() {
        okd okdVar = this.P;
        if (okdVar != null) {
            if (okdVar.i().C) {
                return;
            }
            p2(okdVar);
            return;
        }
        if (this.M) {
            nfy.a(this, new nfg(this, 2));
        }
        sfz sfzVar = this.M ? this.R : this.N;
        if (sfzVar != null) {
            okd okdVarI = sfzVar.i();
            if (okdVarI.i().C) {
                return;
            }
            p2(okdVarI);
            this.P = okdVarI;
        }
    }

    @Override // defpackage.mfy
    public final void t0() {
        tfz tfzVar = (tfz) zma.a(this, ufz.a);
        if (Intrinsics.g(tfzVar, this.Q)) {
            return;
        }
        this.Q = tfzVar;
        this.R = null;
        okd okdVar = this.P;
        if (okdVar != null) {
            q2(okdVar);
        }
        this.P = null;
        s2();
        br70 br70Var = this.O;
        if (br70Var != null) {
            fr70 fr70Var = this.F;
            i3z i3zVar = this.G;
            sfz sfzVar = this.M ? this.R : this.N;
            br70Var.B2(this.L, this.J, this.K, i3zVar, sfzVar, fr70Var, this.H, this.S);
        }
    }

    public final boolean t2() {
        asr asrVar = asr.a;
        if (this.C) {
            asrVar = pkd.f(this).O;
        }
        i3z i3zVar = this.G;
        boolean z = this.I;
        return (asrVar != asr.b || i3zVar == i3z.a) ? !z : z;
    }

    public final void u2(qa5 qa5Var, svh svhVar, psw pswVar, i3z i3zVar, sfz sfzVar, fr70 fr70Var, boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.F = fr70Var;
        this.G = i3zVar;
        boolean z5 = true;
        if (this.M != z) {
            this.M = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (Intrinsics.g(this.N, sfzVar)) {
            z5 = false;
        } else {
            this.N = sfzVar;
        }
        if (z4 || (z5 && !z)) {
            okd okdVar = this.P;
            if (okdVar != null) {
                q2(okdVar);
            }
            this.P = null;
            s2();
        }
        this.H = z2;
        this.I = z3;
        this.J = svhVar;
        this.K = pswVar;
        this.L = qa5Var;
        boolean zT2 = t2();
        this.S = zT2;
        br70 br70Var = this.O;
        if (br70Var != null) {
            br70Var.B2(qa5Var, svhVar, pswVar, i3zVar, this.M ? this.R : this.N, fr70Var, z2, zT2);
        }
    }
}
