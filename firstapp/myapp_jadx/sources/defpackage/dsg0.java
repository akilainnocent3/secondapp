package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dsg0 implements gjh0 {
    public final esg0 a;
    public final mw0<lh4> b;
    public final lh4 c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j;
    public final svh0 k = new svh0();

    public dsg0(esg0 esg0Var, mx90 mx90Var) {
        if (esg0Var == null) {
            hb5.a("data cannot be null.");
            throw null;
        }
        mw0<mh4> mw0Var = esg0Var.d;
        mw0<lh4> mw0Var2 = mx90Var.b;
        this.a = esg0Var;
        this.b = new mw0<>(mw0Var.b, true);
        mw0.b<mh4> it = mw0Var.iterator();
        while (it.hasNext()) {
            this.b.a(mw0Var2.get(it.next().a));
        }
        this.c = mw0Var2.get(esg0Var.e.a);
        this.d = esg0Var.f;
        this.e = esg0Var.g;
        this.f = esg0Var.h;
        this.g = esg0Var.i;
        this.h = esg0Var.j;
        this.i = esg0Var.k;
    }

    @Override // defpackage.gjh0
    public final void a(mx90.a aVar) {
        float f = this.d;
        boolean z = false;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i == 0 && this.e == 0.0f && this.f == 0.0f && this.g == 0.0f && this.h == 0.0f && this.i == 0.0f) {
            return;
        }
        esg0 esg0Var = this.a;
        boolean z2 = esg0Var.s;
        boolean z3 = esg0Var.r;
        mw0<lh4> mw0Var = this.b;
        lh4 lh4Var = this.c;
        if (z2) {
            float f2 = this.e;
            float f3 = this.f;
            if (z3) {
                float f4 = this.g;
                float f5 = this.h;
                float f6 = this.i;
                lh4[] lh4VarArr = mw0Var.a;
                int i2 = mw0Var.b;
                int i3 = 0;
                while (i3 < i2) {
                    lh4 lh4Var2 = lh4VarArr[i3];
                    float f7 = f6;
                    lh4Var2.e(((lh4Var.l + esg0Var.m) * f2) + lh4Var2.l, ((lh4Var.m + esg0Var.n) * f3) + lh4Var2.m, ((lh4Var.n + esg0Var.l) * f) + lh4Var2.n, ((((lh4Var.o - 1.0f) + esg0Var.o) * f4) + 1.0f) * lh4Var2.o, ((((lh4Var.p - 1.0f) + esg0Var.p) * f5) + 1.0f) * lh4Var2.p, lh4Var2.q, ((lh4Var.r + esg0Var.q) * f7) + lh4Var2.r);
                    i3++;
                    f6 = f7;
                }
                return;
            }
            float f8 = this.g;
            float f9 = this.h;
            float f10 = this.i;
            lh4[] lh4VarArr2 = mw0Var.a;
            int i4 = mw0Var.b;
            int i5 = 0;
            while (i5 < i4) {
                lh4 lh4Var3 = lh4VarArr2[i5];
                float f11 = lh4Var3.n;
                if (i != 0) {
                    f11 += ((lh4Var.n - f11) + esg0Var.l) * f;
                }
                float f12 = f11;
                float f13 = lh4Var3.l;
                float f14 = lh4Var3.m;
                float f15 = f10;
                float f16 = (((lh4Var.l - f13) + esg0Var.m) * f2) + f13;
                float f17 = (((lh4Var.m - f14) + esg0Var.n) * f3) + f14;
                float f18 = lh4Var3.o;
                float f19 = lh4Var3.p;
                if (f8 != z && f18 != z) {
                    f18 = ((((lh4Var.o - f18) + esg0Var.o) * f8) + f18) / f18;
                }
                float f20 = f18;
                if (f9 != z && f19 != z) {
                    f19 = ((((lh4Var.p - f19) + esg0Var.p) * f9) + f19) / f19;
                }
                float f21 = f19;
                float f22 = lh4Var3.r;
                if (f15 != z) {
                    f22 += ((lh4Var.r - f22) + esg0Var.q) * f15;
                }
                lh4Var3.e(f16, f17, f12, f20, f21, lh4Var3.q, f22);
                i5++;
                f10 = f15;
                z = z;
            }
            return;
        }
        float f23 = this.e;
        float f24 = this.f;
        svh0 svh0Var = this.k;
        boolean z4 = true;
        if (z3) {
            float f25 = this.g;
            float f26 = this.h;
            float f27 = this.i;
            if (f23 == 0.0f && f24 == 0.0f) {
                z4 = false;
            }
            float f28 = lh4Var.s;
            float f29 = lh4Var.t;
            float f30 = lh4Var.v;
            float f31 = lh4Var.w;
            float f32 = (f28 * f31) - (f29 * f30) > 0.0f ? 0.017453292f : -0.017453292f;
            float f33 = esg0Var.l * f32;
            float f34 = esg0Var.q * f32;
            lh4[] lh4VarArr3 = mw0Var.a;
            int i6 = 0;
            for (int i7 = mw0Var.b; i6 < i7; i7 = i7) {
                int i8 = i6;
                lh4 lh4Var4 = lh4VarArr3[i6];
                float f35 = f;
                if (i != 0) {
                    float f36 = lh4Var4.s;
                    float f37 = lh4Var4.t;
                    float f38 = lh4Var4.v;
                    float f39 = lh4Var4.w;
                    float fB = tpf.b(f30, f28) + f33;
                    if (fB > 3.1415927f) {
                        fB -= 6.2831855f;
                    } else if (fB < -3.1415927f) {
                        fB += 6.2831855f;
                    }
                    double d = fB * f35;
                    float fCos = (float) Math.cos(d);
                    float fSin = (float) Math.sin(d);
                    lh4Var4.s = (fCos * f36) - (fSin * f38);
                    lh4Var4.t = (fCos * f37) - (fSin * f39);
                    lh4Var4.v = (fCos * f38) + (fSin * f36);
                    lh4Var4.w = (fCos * f39) + (fSin * f37);
                }
                if (z4) {
                    float f40 = esg0Var.m;
                    float f41 = esg0Var.n;
                    svh0Var.a = f40;
                    svh0Var.b = f41;
                    lh4Var.b(svh0Var);
                    lh4Var4.u = (svh0Var.a * f23) + lh4Var4.u;
                    lh4Var4.x = (svh0Var.b * f24) + lh4Var4.x;
                }
                if (f25 != 0.0f) {
                    float fSqrt = (((((float) Math.sqrt((f30 * f30) + (f28 * f28))) - 1.0f) + esg0Var.o) * f25) + 1.0f;
                    lh4Var4.s *= fSqrt;
                    lh4Var4.v *= fSqrt;
                }
                if (f26 != 0.0f) {
                    float fSqrt2 = (((((float) Math.sqrt((f31 * f31) + (f29 * f29))) - 1.0f) + esg0Var.p) * f26) + 1.0f;
                    lh4Var4.t *= fSqrt2;
                    lh4Var4.w *= fSqrt2;
                }
                if (f27 > 0.0f) {
                    float fB2 = tpf.b(f31, f29) - tpf.b(f30, f28);
                    if (fB2 > 3.1415927f) {
                        fB2 -= 6.2831855f;
                    } else if (fB2 < -3.1415927f) {
                        fB2 += 6.2831855f;
                    }
                    float f42 = lh4Var4.t;
                    float f43 = lh4Var4.w;
                    float fB3 = (((fB2 - 1.5707964f) + f34) * f27) + tpf.b(f43, f42);
                    float fSqrt3 = (float) Math.sqrt((f43 * f43) + (f42 * f42));
                    double d2 = fB3;
                    lh4Var4.t = ((float) Math.cos(d2)) * fSqrt3;
                    lh4Var4.w = ((float) Math.sin(d2)) * fSqrt3;
                }
                lh4Var4.d();
                i6 = i8 + 1;
                f = f35;
                f26 = f26;
            }
            return;
        }
        float f44 = this.g;
        float f45 = this.h;
        float f46 = this.i;
        if (f23 == 0.0f && f24 == 0.0f) {
            z4 = false;
        }
        float f47 = lh4Var.s;
        float f48 = lh4Var.t;
        float f49 = lh4Var.v;
        float f50 = lh4Var.w;
        float f51 = (f47 * f50) - (f48 * f49) > 0.0f ? 0.017453292f : -0.017453292f;
        float f52 = esg0Var.l * f51;
        float f53 = esg0Var.q * f51;
        lh4[] lh4VarArr4 = mw0Var.a;
        int i9 = mw0Var.b;
        int i10 = 0;
        while (i10 < i9) {
            int i11 = i10;
            lh4 lh4Var5 = lh4VarArr4[i10];
            float f54 = f44;
            if (i != 0) {
                float f55 = lh4Var5.s;
                float f56 = lh4Var5.t;
                float f57 = lh4Var5.v;
                float f58 = lh4Var5.w;
                float fB4 = (tpf.b(f49, f47) - tpf.b(f57, f55)) + f52;
                if (fB4 > 3.1415927f) {
                    fB4 -= 6.2831855f;
                } else if (fB4 < -3.1415927f) {
                    fB4 += 6.2831855f;
                }
                double d3 = fB4 * f;
                float fCos2 = (float) Math.cos(d3);
                float fSin2 = (float) Math.sin(d3);
                lh4Var5.s = (fCos2 * f55) - (fSin2 * f57);
                lh4Var5.t = (fCos2 * f56) - (fSin2 * f58);
                lh4Var5.v = (f57 * fCos2) + (fSin2 * f55);
                lh4Var5.w = (fCos2 * f58) + (fSin2 * f56);
            }
            if (z4) {
                float f59 = esg0Var.m;
                float f60 = esg0Var.n;
                svh0Var.a = f59;
                svh0Var.b = f60;
                lh4Var.b(svh0Var);
                float f61 = lh4Var5.u;
                lh4Var5.u = hxa.a(svh0Var.a, f61, f23, f61);
                float f62 = lh4Var5.x;
                lh4Var5.x = hxa.a(svh0Var.b, f62, f24, f62);
            }
            if (f54 != 0.0f) {
                float f63 = lh4Var5.s;
                float f64 = lh4Var5.v;
                float fSqrt4 = (float) Math.sqrt((f64 * f64) + (f63 * f63));
                if (fSqrt4 != 0.0f) {
                    fSqrt4 = ((((((float) Math.sqrt((f49 * f49) + (f47 * f47))) - fSqrt4) + esg0Var.o) * f54) + fSqrt4) / fSqrt4;
                }
                lh4Var5.s *= fSqrt4;
                lh4Var5.v *= fSqrt4;
            }
            if (f45 != 0.0f) {
                float f65 = lh4Var5.t;
                float f66 = lh4Var5.w;
                float fSqrt5 = (float) Math.sqrt((f66 * f66) + (f65 * f65));
                if (fSqrt5 != 0.0f) {
                    fSqrt5 = ((((((float) Math.sqrt((f50 * f50) + (f48 * f48))) - fSqrt5) + esg0Var.p) * f45) + fSqrt5) / fSqrt5;
                }
                lh4Var5.t *= fSqrt5;
                lh4Var5.w *= fSqrt5;
            }
            if (f46 > 0.0f) {
                float f67 = lh4Var5.t;
                float f68 = lh4Var5.w;
                float fB5 = tpf.b(f68, f67);
                float fB6 = (tpf.b(f50, f48) - tpf.b(f49, f47)) - (fB5 - tpf.b(lh4Var5.v, lh4Var5.s));
                if (fB6 > 3.1415927f) {
                    fB6 -= 6.2831855f;
                } else if (fB6 < -3.1415927f) {
                    fB6 += 6.2831855f;
                }
                float fSqrt6 = (float) Math.sqrt((f68 * f68) + (f67 * f67));
                double d4 = ((fB6 + f53) * f46) + fB5;
                lh4Var5.t = ((float) Math.cos(d4)) * fSqrt6;
                lh4Var5.w = ((float) Math.sin(d4)) * fSqrt6;
            }
            lh4Var5.d();
            i10 = i11 + 1;
            f52 = f52;
            i = i;
            f23 = f23;
            f44 = f54;
            f45 = f45;
            f53 = f53;
        }
    }

    public final String toString() {
        return this.a.a;
    }
}
