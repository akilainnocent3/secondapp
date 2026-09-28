package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m2i extends wil {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public kyh n0;
    public HashMap<String, Float> o0;
    public HashMap<String, Float> p0;
    public HashMap<String, Float> q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public m2i(rwd0 rwd0Var, rwd0.d dVar) {
        super(rwd0Var, dVar);
        this.r0 = 0;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = 2;
        this.z0 = 2;
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = -1;
        this.H0 = 0;
        this.I0 = 0.5f;
        this.J0 = 0.5f;
        this.K0 = 0.5f;
        this.L0 = 0.5f;
        if (dVar == rwd0.d.f) {
            this.H0 = 1;
        }
    }

    @Override // defpackage.wil, defpackage.rwa, defpackage.eq40, defpackage.e6h
    public final void apply() {
        s();
        b(this.n0);
        kyh kyhVar = this.n0;
        kyhVar.a1 = this.H0;
        kyhVar.Y0 = this.r0;
        int i = this.G0;
        if (i != -1) {
            kyhVar.Z0 = i;
        }
        int i2 = this.C0;
        if (i2 != 0) {
            kyhVar.B0 = i2;
        }
        int i3 = this.E0;
        if (i3 != 0) {
            kyhVar.x0 = i3;
        }
        int i4 = this.D0;
        if (i4 != 0) {
            kyhVar.C0 = i4;
        }
        int i5 = this.F0;
        if (i5 != 0) {
            kyhVar.y0 = i5;
        }
        int i6 = this.B0;
        if (i6 != 0) {
            kyhVar.U0 = i6;
        }
        int i7 = this.A0;
        if (i7 != 0) {
            kyhVar.V0 = i7;
        }
        float f = this.h;
        if (f != 0.5f) {
            kyhVar.O0 = f;
        }
        float f2 = this.K0;
        if (f2 != 0.5f) {
            kyhVar.Q0 = f2;
        }
        float f3 = this.L0;
        if (f3 != 0.5f) {
            kyhVar.S0 = f3;
        }
        float f4 = this.i;
        if (f4 != 0.5f) {
            kyhVar.P0 = f4;
        }
        float f5 = this.I0;
        if (f5 != 0.5f) {
            kyhVar.R0 = f5;
        }
        float f6 = this.J0;
        if (f6 != 0.5f) {
            kyhVar.T0 = f6;
        }
        int i8 = this.z0;
        if (i8 != 2) {
            kyhVar.W0 = i8;
        }
        int i9 = this.y0;
        if (i9 != 2) {
            kyhVar.X0 = i9;
        }
        int i10 = this.s0;
        if (i10 != -1) {
            kyhVar.J0 = i10;
        }
        int i11 = this.t0;
        if (i11 != -1) {
            kyhVar.L0 = i11;
        }
        int i12 = this.u0;
        if (i12 != -1) {
            kyhVar.N0 = i12;
        }
        int i13 = this.v0;
        if (i13 != -1) {
            kyhVar.I0 = i13;
        }
        int i14 = this.w0;
        if (i14 != -1) {
            kyhVar.K0 = i14;
        }
        int i15 = this.x0;
        if (i15 != -1) {
            kyhVar.M0 = i15;
        }
        r();
    }

    @Override // defpackage.wil
    public final yil s() {
        kyh kyhVar = this.n0;
        if (kyhVar != null) {
            return kyhVar;
        }
        kyh kyhVar2 = new kyh();
        this.n0 = kyhVar2;
        return kyhVar2;
    }
}
