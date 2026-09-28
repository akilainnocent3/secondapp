package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pnv extends r2i0 implements jel {
    public dnf0 i;
    public float[] j;
    public float[] k;
    public short[] l;
    public final i58 m;
    public uc80 n;

    public pnv(String str) {
        super(str);
        this.m = new i58(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override // defpackage.jel
    public final uc80 a() {
        return this.n;
    }

    @Override // defpackage.jel
    public final void b(dnf0 dnf0Var) {
        if (dnf0Var != null) {
            this.i = dnf0Var;
        } else {
            hb5.a("region cannot be null.");
        }
    }

    @Override // defpackage.jel
    public final void c() {
        float f;
        float fA;
        float f2;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        if (fArr2 == null || fArr2.length != fArr.length) {
            fArr2 = new float[fArr.length];
            this.k = fArr2;
        }
        int length = fArr2.length;
        dnf0 dnf0Var = this.i;
        int i = 0;
        float f3 = 1.0f;
        if (dnf0Var != null) {
            float f4 = dnf0Var.b;
            oc0 oc0Var = dnf0Var.a;
            float f5 = dnf0Var.c;
            int i2 = dnf0Var.j;
            int i3 = dnf0Var.k;
            float width = oc0Var.b.getWidth();
            float height = oc0Var.b.getHeight();
            int i4 = dnf0Var.n;
            if (i4 == 90) {
                float f6 = dnf0Var.m;
                float fA2 = zen.a(f6 - dnf0Var.i, i2, width, f4);
                float f7 = dnf0Var.l;
                float fA3 = zen.a(f7 - dnf0Var.h, i3, height, f5);
                float f8 = f6 / width;
                float f9 = f7 / height;
                while (i < length) {
                    int i5 = i + 1;
                    fArr2[i] = (fArr[i5] * f8) + fA2;
                    fArr2[i5] = hxa.a(1.0f, fArr[i], f9, fA3);
                    i += 2;
                }
                return;
            }
            if (i4 == 180) {
                float f10 = dnf0Var.l;
                float fA4 = zen.a(f10 - dnf0Var.h, i2, width, f4);
                float f11 = f5 - (dnf0Var.i / height);
                float f12 = f10 / width;
                float f13 = dnf0Var.m / height;
                while (i < length) {
                    fArr2[i] = hxa.a(1.0f, fArr[i], f12, fA4);
                    int i6 = i + 1;
                    fArr2[i6] = hxa.a(1.0f, fArr[i6], f13, f11);
                    i += 2;
                }
                return;
            }
            if (i4 == 270) {
                float f14 = f4 - (dnf0Var.i / width);
                float f15 = f5 - (dnf0Var.h / height);
                float f16 = dnf0Var.m / width;
                float f17 = dnf0Var.l / height;
                while (i < length) {
                    int i7 = i + 1;
                    fArr2[i] = hxa.a(1.0f, fArr[i7], f16, f14);
                    fArr2[i7] = (fArr[i] * f17) + f15;
                    i += 2;
                }
                return;
            }
            f = f4 - (dnf0Var.h / width);
            float f18 = dnf0Var.m;
            fA = zen.a(f18 - dnf0Var.i, i3, height, f5);
            float f19 = f18 / height;
            f3 = dnf0Var.l / width;
            f2 = f19;
        } else if (dnf0Var == null) {
            f = 0.0f;
            f2 = 1.0f;
            fA = 0.0f;
        } else {
            f = dnf0Var.b;
            fA = dnf0Var.c;
            f3 = dnf0Var.d - f;
            f2 = dnf0Var.e - fA;
        }
        while (i < length) {
            fArr2[i] = (fArr[i] * f3) + f;
            int i8 = i + 1;
            fArr2[i8] = (fArr[i8] * f2) + fA;
            i += 2;
        }
    }

    @Override // defpackage.jel
    public final dnf0 d() {
        return this.i;
    }

    @Override // defpackage.r2i0
    public final void g(g1a0 g1a0Var, int i, int i2, float[] fArr, int i3) {
        uc80 uc80Var = this.n;
        if (uc80Var != null) {
            uc80Var.a(g1a0Var, this);
        }
        super.g(g1a0Var, 0, i2, fArr, i3);
    }

    public final void h(pnv pnvVar) {
        this.e = pnvVar.e;
        this.f = pnvVar.f;
        this.j = pnvVar.j;
        this.l = pnvVar.l;
        this.g = pnvVar.g;
    }
}
