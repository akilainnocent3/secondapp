package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qs40 extends b21 implements jel {
    public dnf0 c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public final float[] k;
    public final float[] l;
    public final i58 m;
    public uc80 n;

    public qs40(String str) {
        super(str);
        this.f = 1.0f;
        this.g = 1.0f;
        this.k = new float[8];
        this.l = new float[8];
        this.m = new i58(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override // defpackage.jel
    public final uc80 a() {
        return this.n;
    }

    @Override // defpackage.jel
    public final void b(dnf0 dnf0Var) {
        if (dnf0Var != null) {
            this.c = dnf0Var;
        } else {
            hb5.a("region cannot be null.");
        }
    }

    @Override // defpackage.jel
    public final void c() {
        float f;
        float f2;
        boolean z;
        dnf0 dnf0Var = this.c;
        float[] fArr = this.k;
        if (dnf0Var == null) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 1.0f;
            fArr[6] = 1.0f;
            fArr[7] = 0.0f;
            return;
        }
        float f3 = this.i;
        float f4 = this.j;
        float f5 = f3 / 2.0f;
        float f6 = f4 / 2.0f;
        float f7 = dnf0Var.h;
        int i = dnf0Var.j;
        int i2 = dnf0Var.k;
        float f8 = dnf0Var.l;
        float f9 = ((f7 / f8) * f3) + (-f5);
        float f10 = dnf0Var.i;
        float f11 = dnf0Var.m;
        float f12 = ((f10 / f11) * f4) + (-f6);
        if (dnf0Var.n == 90) {
            f = f5 - ((((f8 - f7) - i2) / f8) * f3);
            f2 = f6 - ((((f11 - f10) - i) / f11) * f4);
            z = true;
        } else {
            f = f5 - ((((f8 - f7) - i) / f8) * f3);
            f2 = f6 - ((((f11 - f10) - i2) / f11) * f4);
            z = false;
        }
        float f13 = this.f;
        float f14 = this.g;
        float f15 = f9 * f13;
        float f16 = f12 * f14;
        float f17 = f * f13;
        float f18 = f2 * f14;
        double d = this.h * 0.017453292f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f19 = this.d;
        float f20 = this.e;
        float f21 = (f15 * fCos) + f19;
        float f22 = f15 * fSin;
        float f23 = (f16 * fCos) + f20;
        float f24 = f16 * fSin;
        float f25 = (f17 * fCos) + f19;
        float f26 = f17 * fSin;
        float f27 = (fCos * f18) + f20;
        float f28 = f18 * fSin;
        float[] fArr2 = this.l;
        fArr2[0] = f21 - f24;
        fArr2[1] = f23 + f22;
        fArr2[2] = f21 - f28;
        fArr2[3] = f27 + f22;
        fArr2[4] = f25 - f28;
        fArr2[5] = f27 + f26;
        fArr2[6] = f25 - f24;
        fArr2[7] = f23 + f26;
        dnf0 dnf0Var2 = this.c;
        if (z) {
            float f29 = dnf0Var2.d;
            fArr[0] = f29;
            float f30 = dnf0Var2.c;
            fArr[1] = f30;
            fArr[2] = f29;
            float f31 = dnf0Var2.e;
            fArr[3] = f31;
            float f32 = dnf0Var2.b;
            fArr[4] = f32;
            fArr[5] = f31;
            fArr[6] = f32;
            fArr[7] = f30;
            return;
        }
        float f33 = dnf0Var2.d;
        fArr[0] = f33;
        float f34 = dnf0Var2.e;
        fArr[1] = f34;
        float f35 = dnf0Var2.b;
        fArr[2] = f35;
        fArr[3] = f34;
        fArr[4] = f35;
        float f36 = dnf0Var2.c;
        fArr[5] = f36;
        fArr[6] = f33;
        fArr[7] = f36;
    }

    @Override // defpackage.jel
    public final dnf0 d() {
        return this.c;
    }

    public final void g(g1a0 g1a0Var, float[] fArr, int i) {
        uc80 uc80Var = this.n;
        if (uc80Var != null) {
            uc80Var.a(g1a0Var, this);
        }
        lh4 lh4Var = g1a0Var.b;
        float f = lh4Var.u;
        float f2 = lh4Var.x;
        float f3 = lh4Var.s;
        float f4 = lh4Var.t;
        float f5 = lh4Var.v;
        float f6 = lh4Var.w;
        float[] fArr2 = this.l;
        float f7 = fArr2[6];
        float f8 = fArr2[7];
        fArr[i] = (f8 * f4) + (f7 * f3) + f;
        fArr[i + 1] = (f8 * f6) + (f7 * f5) + f2;
        float f9 = fArr2[0];
        float f10 = fArr2[1];
        fArr[i + 2] = (f10 * f4) + (f9 * f3) + f;
        fArr[i + 3] = (f10 * f6) + (f9 * f5) + f2;
        float f11 = fArr2[2];
        float f12 = fArr2[3];
        fArr[i + 4] = (f12 * f4) + (f11 * f3) + f;
        fArr[i + 5] = (f12 * f6) + (f11 * f5) + f2;
        float f13 = fArr2[4];
        float f14 = fArr2[5];
        fArr[i + 6] = (f4 * f14) + (f3 * f13) + f;
        fArr[i + 7] = (f14 * f6) + (f13 * f5) + f2;
    }
}
