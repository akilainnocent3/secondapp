package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class r2i0 extends b21 {
    public static int h;
    public final int c;
    public r2i0 d;
    public int[] e;
    public float[] f;
    public int g;

    public r2i0(String str) {
        int i;
        super(str);
        synchronized (r2i0.class) {
            i = h;
            h = i + 1;
        }
        this.c = i;
        this.d = this;
    }

    public void g(g1a0 g1a0Var, int i, int i2, float[] fArr, int i3) {
        int i4 = ((i2 >> 1) * 2) + i3;
        owh owhVar = g1a0Var.g;
        lh4 lh4Var = g1a0Var.b;
        float[] fArr2 = this.f;
        int[] iArr = this.e;
        if (iArr == null) {
            if (owhVar.b > 0) {
                fArr2 = owhVar.a;
            }
            float f = lh4Var.u;
            float f2 = lh4Var.x;
            float f3 = lh4Var.s;
            float f4 = lh4Var.t;
            float f5 = lh4Var.v;
            float f6 = lh4Var.w;
            int i5 = i;
            for (int i6 = i3; i6 < i4; i6 += 2) {
                float f7 = fArr2[i5];
                float f8 = fArr2[i5 + 1];
                fArr[i6] = (f8 * f4) + (f7 * f3) + f;
                fArr[i6 + 1] = (f8 * f6) + (f7 * f5) + f2;
                i5 += 2;
            }
            return;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9 += 2) {
            int i10 = iArr[i7];
            i7 += i10 + 1;
            i8 += i10;
        }
        lh4[] lh4VarArr = lh4Var.b.b.a;
        if (owhVar.b == 0) {
            int i11 = i8 * 3;
            int i12 = i3;
            while (i12 < i4) {
                int i13 = i7 + 1;
                int i14 = iArr[i7] + i13;
                float f9 = 0.0f;
                float f10 = 0.0f;
                while (i13 < i14) {
                    lh4 lh4Var2 = lh4VarArr[iArr[i13]];
                    float f11 = fArr2[i11];
                    float f12 = fArr2[i11 + 1];
                    float f13 = fArr2[i11 + 2];
                    f9 += ((lh4Var2.t * f12) + (lh4Var2.s * f11) + lh4Var2.u) * f13;
                    f10 += ((f12 * lh4Var2.w) + (f11 * lh4Var2.v) + lh4Var2.x) * f13;
                    i13++;
                    i11 += 3;
                }
                fArr[i12] = f9;
                fArr[i12 + 1] = f10;
                i12 += 2;
                i7 = i13;
            }
            return;
        }
        float[] fArr3 = owhVar.a;
        int i15 = i8 * 3;
        int i16 = i8 << 1;
        int i17 = i7;
        int i18 = i15;
        int i19 = i3;
        while (i19 < i4) {
            int i20 = i17 + 1;
            int i21 = iArr[i17] + i20;
            float f14 = 0.0f;
            float f15 = 0.0f;
            while (i20 < i21) {
                lh4 lh4Var3 = lh4VarArr[iArr[i20]];
                float f16 = fArr2[i18] + fArr3[i16];
                float f17 = fArr2[i18 + 1] + fArr3[i16 + 1];
                float f18 = fArr2[i18 + 2];
                f14 += ((lh4Var3.t * f17) + (lh4Var3.s * f16) + lh4Var3.u) * f18;
                f15 += ((f17 * lh4Var3.w) + (f16 * lh4Var3.v) + lh4Var3.x) * f18;
                i20++;
                i18 += 3;
                i16 += 2;
                iArr = iArr;
            }
            fArr[i19] = f14;
            fArr[i19 + 1] = f15;
            i19 += 2;
            iArr = iArr;
            i17 = i20;
        }
    }
}
