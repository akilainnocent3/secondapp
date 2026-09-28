package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class et00 implements gjh0 {
    public float A;
    public float B;
    public final ft00 a;
    public final lh4 b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j = true;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public final mx90 z;

    public et00(ft00 ft00Var, mx90 mx90Var) {
        if (ft00Var == null) {
            hb5.a("data cannot be null.");
            throw null;
        }
        this.a = ft00Var;
        this.z = mx90Var;
        this.b = mx90Var.b.get(ft00Var.d.a);
        this.c = ft00Var.l;
        this.d = ft00Var.m;
        this.e = ft00Var.n;
        this.f = ft00Var.o;
        this.g = ft00Var.p;
        this.h = ft00Var.q;
        this.i = ft00Var.r;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:132:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:135:0x030e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0330  */
    /* JADX WARN: Code duplicated, block: B:139:0x035e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0378  */
    @Override // defpackage.gjh0
    public final void a(mx90.a aVar) {
        float f;
        float f2;
        float f3;
        boolean z;
        float f4;
        float fPow;
        float f5;
        float f6;
        float f7;
        float f8;
        float fCos;
        float fSin;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14 = this.i;
        if (f14 == 0.0f) {
            return;
        }
        ft00 ft00Var = this.a;
        boolean z2 = ft00Var.e > 0.0f;
        boolean z3 = ft00Var.f > 0.0f;
        boolean z4 = ft00Var.g > 0.0f || ft00Var.i > 0.0f;
        boolean z5 = ft00Var.h > 0.0f;
        lh4 lh4Var = this.b;
        float f15 = lh4Var.a.d;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        if (z2) {
                            lh4Var.u = (this.q * f14 * ft00Var.e) + lh4Var.u;
                        }
                        if (z3) {
                            lh4Var.x = (this.s * f14 * ft00Var.f) + lh4Var.x;
                        }
                    }
                    f2 = f14;
                    f = 0.0f;
                }
                if (z4) {
                    f10 = this.u * f2;
                    f11 = ft00Var.i;
                    f12 = ft00Var.g;
                    if (f11 > f) {
                        if (f12 > f) {
                            f13 = f10 * f12;
                            double d = f13;
                            float fSin2 = (float) Math.sin(d);
                            float fCos2 = (float) Math.cos(d);
                            float f16 = lh4Var.t;
                            float f17 = lh4Var.w;
                            lh4Var.t = (fCos2 * f16) - (fSin2 * f17);
                            lh4Var.w = (fCos2 * f17) + (fSin2 * f16);
                        } else {
                            f13 = f;
                        }
                        double d2 = (f10 * ft00Var.i) + f13;
                        float fSin3 = (float) Math.sin(d2);
                        float fCos3 = (float) Math.cos(d2);
                        float f18 = lh4Var.s;
                        float f19 = lh4Var.v;
                        lh4Var.s = (fCos3 * f18) - (fSin3 * f19);
                        lh4Var.v = (fCos3 * f19) + (fSin3 * f18);
                    } else {
                        double d3 = f10 * f12;
                        float fSin4 = (float) Math.sin(d3);
                        float fCos4 = (float) Math.cos(d3);
                        float f20 = lh4Var.s;
                        float f21 = lh4Var.v;
                        lh4Var.s = (fCos4 * f20) - (fSin4 * f21);
                        lh4Var.v = (f21 * fCos4) + (f20 * fSin4);
                        float f22 = lh4Var.t;
                        float f23 = lh4Var.w;
                        lh4Var.t = (fCos4 * f22) - (fSin4 * f23);
                        lh4Var.w = (fCos4 * f23) + (fSin4 * f22);
                    }
                }
                if (z5) {
                    float f24 = (this.w * f2 * ft00Var.h) + 1.0f;
                    lh4Var.s *= f24;
                    lh4Var.v *= f24;
                }
                if (aVar != mx90.a.c) {
                    this.o = lh4Var.s * f15;
                    this.p = f15 * lh4Var.v;
                }
                lh4Var.d();
            }
            b();
            mx90 mx90Var = this.z;
            float fMax = Math.max(mx90Var.p - this.B, 0.0f);
            float f25 = this.A + fMax;
            this.A = f25;
            this.B = mx90Var.p;
            float f26 = lh4Var.u;
            float f27 = lh4Var.x;
            f = 0.0f;
            if (this.j) {
                this.j = false;
                this.k = f26;
                this.l = f27;
                f2 = f14;
            } else {
                float f28 = this.c;
                float f29 = ft00Var.k;
                f2 = f14;
                float f30 = mx90Var.a.l;
                float f31 = ft00Var.j * fMax;
                float fAbs = Math.abs(mx90Var.o) * f31;
                float fAbs2 = Math.abs(mx90Var.n) * f31;
                if (z2 || z3) {
                    f3 = f28;
                    if (z2) {
                        float f32 = (this.k - f26) * f3;
                        float f33 = this.q;
                        if (f32 > fAbs2) {
                            f7 = f33;
                            f8 = fAbs2;
                        } else {
                            f7 = f33;
                            f8 = -fAbs2;
                            if (f32 >= f8) {
                                f8 = f32;
                            }
                        }
                        this.q = f7 + f8;
                        this.k = f26;
                    }
                    if (z3) {
                        float f34 = (this.l - f27) * f3;
                        float f35 = this.s;
                        if (f34 > fAbs) {
                            f6 = fAbs;
                        } else {
                            f6 = -fAbs;
                            if (f34 >= f6) {
                                f6 = f34;
                            }
                        }
                        this.s = f35 + f6;
                        this.l = f27;
                    }
                    if (f25 >= f29) {
                        z = z2;
                        f4 = f29;
                        float fPow2 = (float) Math.pow(this.e, f29 * 60.0f);
                        float f36 = this.f * f4;
                        float f37 = this.d;
                        float f38 = this.g * f30 * mx90Var.n;
                        float f39 = this.h * f30 * mx90Var.o;
                        while (true) {
                            if (z) {
                                float f40 = this.r;
                                f5 = fPow2;
                                float f41 = this.q;
                                float f42 = ((f38 - (f41 * f37)) * f36) + f40;
                                this.q = (f42 * f4) + f41;
                                this.r = f42 * f5;
                            } else {
                                f5 = fPow2;
                            }
                            if (z3) {
                                float f43 = this.t;
                                float f44 = this.s;
                                float f45 = f43 - (((f44 * f37) + f39) * f36);
                                this.s = (f45 * f4) + f44;
                                this.t = f45 * f5;
                            }
                            f25 -= f4;
                            if (f25 < f4) {
                                break;
                            } else {
                                fPow2 = f5;
                            }
                        }
                        fPow = f5;
                    } else {
                        z = z2;
                        f4 = f29;
                        fPow = -1.0f;
                    }
                    if (z) {
                        lh4Var.u = (this.q * f2 * ft00Var.e) + lh4Var.u;
                    }
                    if (z3) {
                        lh4Var.x = (this.s * f2 * ft00Var.f) + lh4Var.x;
                    }
                } else {
                    f3 = f28;
                    f4 = f29;
                    fPow = -1.0f;
                }
                if (z4 || z5) {
                    float fB = tpf.b(lh4Var.v, lh4Var.s);
                    float f46 = this.m - lh4Var.u;
                    float f47 = this.n - lh4Var.x;
                    if (f46 <= fAbs2) {
                        fAbs2 = -fAbs2;
                        if (f46 >= fAbs2) {
                            fAbs2 = f46;
                        }
                    }
                    if (f47 <= fAbs) {
                        fAbs = -fAbs;
                        if (f47 >= fAbs) {
                            fAbs = f47;
                        }
                    }
                    if (z4) {
                        f9 = (ft00Var.g + ft00Var.i) * f2;
                        float fB2 = tpf.b(this.p + fAbs, this.o + fAbs2) - fB;
                        float f48 = this.u;
                        float f49 = fB2 - (f48 * f9);
                        float fCeil = ((f49 - (((float) Math.ceil((0.15915494f * f49) - 0.5f)) * 6.2831855f)) * f3) + f48;
                        this.u = fCeil;
                        double d4 = (fCeil * f9) + fB;
                        fCos = (float) Math.cos(d4);
                        fSin = (float) Math.sin(d4);
                        if (z5) {
                            float f50 = lh4Var.s;
                            float f51 = lh4Var.v;
                            float fSqrt = ((float) Math.sqrt((f51 * f51) + (f50 * f50))) * f15;
                            if (fSqrt > 0.0f) {
                                this.w = ((((fAbs * fSin) + (fAbs2 * fCos)) * f3) / fSqrt) + this.w;
                            }
                        }
                    } else {
                        double d5 = fB;
                        fCos = (float) Math.cos(d5);
                        fSin = (float) Math.sin(d5);
                        float f52 = lh4Var.s;
                        float f53 = lh4Var.v;
                        float fSqrt2 = ((float) Math.sqrt((f53 * f53) + (f52 * f52))) * f15;
                        if (fSqrt2 > 0.0f) {
                            this.w = ((((fAbs * fSin) + (fAbs2 * fCos)) * f3) / fSqrt2) + this.w;
                        }
                        f9 = 0.0f;
                    }
                    float f54 = this.A;
                    if (f54 >= f4) {
                        if (fPow == -1.0f) {
                            fPow = (float) Math.pow(this.e, f4 * 60.0f);
                        }
                        float f55 = this.f * f4;
                        float f56 = this.d;
                        float f57 = this.g;
                        float f58 = this.h;
                        float f59 = f15 / f30;
                        while (true) {
                            f54 -= f4;
                            float f60 = f55;
                            if (z5) {
                                float f61 = this.x;
                                float f62 = this.w;
                                float f63 = ((((f57 * fCos) - (f58 * fSin)) - (f62 * f56)) * f60) + f61;
                                this.w = (f63 * f4) + f62;
                                this.x = f63 * fPow;
                            }
                            if (z4) {
                                float f64 = this.v;
                                float f65 = ((fCos * f58) + (fSin * f57)) * f59;
                                float f66 = this.u;
                                float f67 = f64 - (((f66 * f56) + f65) * f60);
                                float f68 = (f67 * f4) + f66;
                                this.u = f68;
                                this.v = f67 * fPow;
                                if (f54 < f4) {
                                    break;
                                }
                                double d6 = (f68 * f9) + fB;
                                fCos = (float) Math.cos(d6);
                                fSin = (float) Math.sin(d6);
                                f55 = f60;
                                fPow = fPow;
                            } else {
                                if (f54 < f4) {
                                    break;
                                }
                                f55 = f60;
                                fPow = fPow;
                            }
                        }
                    } else {
                        f54 = f54;
                    }
                    f25 = f54;
                }
                this.A = f25;
            }
            this.m = lh4Var.u;
            this.n = lh4Var.x;
            if (z4) {
                f10 = this.u * f2;
                f11 = ft00Var.i;
                f12 = ft00Var.g;
                if (f11 > f) {
                    if (f12 > f) {
                        f13 = f10 * f12;
                        double d7 = f13;
                        float fSin5 = (float) Math.sin(d7);
                        float fCos5 = (float) Math.cos(d7);
                        float f110 = lh4Var.t;
                        float f111 = lh4Var.w;
                        lh4Var.t = (fCos5 * f110) - (fSin5 * f111);
                        lh4Var.w = (fCos5 * f111) + (fSin5 * f110);
                    } else {
                        f13 = f;
                    }
                    double d8 = (f10 * ft00Var.i) + f13;
                    float fSin6 = (float) Math.sin(d8);
                    float fCos6 = (float) Math.cos(d8);
                    float f112 = lh4Var.s;
                    float f113 = lh4Var.v;
                    lh4Var.s = (fCos6 * f112) - (fSin6 * f113);
                    lh4Var.v = (fCos6 * f113) + (fSin6 * f112);
                } else {
                    double d9 = f10 * f12;
                    float fSin7 = (float) Math.sin(d9);
                    float fCos7 = (float) Math.cos(d9);
                    float f210 = lh4Var.s;
                    float f211 = lh4Var.v;
                    lh4Var.s = (fCos7 * f210) - (fSin7 * f211);
                    lh4Var.v = (f211 * fCos7) + (f210 * fSin7);
                    float f212 = lh4Var.t;
                    float f213 = lh4Var.w;
                    lh4Var.t = (fCos7 * f212) - (fSin7 * f213);
                    lh4Var.w = (fCos7 * f213) + (fSin7 * f212);
                }
            }
            if (z5) {
                float f214 = (this.w * f2 * ft00Var.h) + 1.0f;
                lh4Var.s *= f214;
                lh4Var.v *= f214;
            }
            if (aVar != mx90.a.c) {
                this.o = lh4Var.s * f15;
                this.p = f15 * lh4Var.v;
            }
            lh4Var.d();
        }
    }

    public final void b() {
        this.A = 0.0f;
        this.B = this.z.p;
        this.j = true;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = 0.0f;
        this.w = 0.0f;
        this.x = 0.0f;
    }

    public final String toString() {
        return this.a.a;
    }
}
