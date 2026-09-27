package v4;

import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f139988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f139989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f139990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f139991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f139992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f139993f;

    public b0(int i10, int i11, float[] fArr) {
        boolean z10 = false;
        zi.l0.e(i10 > 0, "Input channel count must be positive.");
        zi.l0.e(i11 > 0, "Output channel count must be positive.");
        zi.l0.e(fArr.length == i10 * i11, "Coefficient array length is invalid.");
        this.f139988a = i10;
        this.f139989b = i11;
        this.f139990c = a(fArr);
        int i12 = 0;
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        while (i12 < i10) {
            int i13 = 0;
            while (i13 < i11) {
                float fI = i(i12, i13);
                boolean z14 = i12 == i13;
                if (fI != 1.0f && z14) {
                    z13 = false;
                }
                if (fI != 0.0f) {
                    z11 = false;
                    if (!z14) {
                        z12 = false;
                    }
                }
                i13++;
            }
            i12++;
        }
        this.f139991d = z11;
        boolean z15 = n() && z12;
        this.f139992e = z15;
        if (z15 && z13) {
            z10 = true;
        }
        this.f139993f = z10;
    }

    @qj.a
    public static float[] a(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (fArr[i10] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i10 + " is negative.");
            }
        }
        return fArr;
    }

    public static float[] b(int i10, int i11) {
        if (i10 == i11) {
            return k(i11);
        }
        if (i10 == 1 && i11 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i10 == 2 && i11 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i10 + "->" + i11 + " are not yet implemented.");
    }

    public static float[] c(int i10, int i11) {
        if (i11 == 1) {
            return f(i10);
        }
        if (i11 == 2) {
            return g(i10);
        }
        if (i10 == i11) {
            return k(i11);
        }
        throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i10 + "->" + i11 + " are not implemented.");
    }

    public static b0 d(@k.e0(from = 1, to = 2) int i10, @k.e0(from = 1, to = 2) int i11) {
        return new b0(i10, i11, b(i10, i11));
    }

    public static b0 e(@k.e0(from = 1, to = 6) int i10, @k.e0(from = 1, to = 2) int i11) {
        return new b0(i10, i11, c(i10, i11));
    }

    public static float[] f(int i10) {
        switch (i10) {
            case 1:
                return new float[]{1.0f};
            case 2:
                return new float[]{0.7071f, 0.7071f};
            case 3:
                return new float[]{0.7071f, 0.7071f, 1.0f};
            case 4:
                return new float[]{0.7071f, 0.7071f, 0.5f, 0.5f};
            case 5:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.5f, 0.5f};
            case 6:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.7071f, 0.5f, 0.5f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i10 + "->1 are not implemented.");
        }
    }

    public static float[] g(int i10) {
        switch (i10) {
            case 1:
                return new float[]{0.7071f, 0.7071f};
            case 2:
                return new float[]{1.0f, 0.0f, 0.0f, 1.0f};
            case 3:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 1.0f, 0.7071f};
            case 4:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071f};
            case 5:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.0f, 0.7071f};
            case 6:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.5f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.5f, 0.0f, 0.7071f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i10 + "->2 are not implemented.");
        }
    }

    public static float[] k(int i10) {
        float[] fArr = new float[i10 * i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr[(i10 * i11) + i11] = 1.0f;
        }
        return fArr;
    }

    public int h() {
        return this.f139988a;
    }

    public float i(int i10, int i11) {
        return this.f139990c[(i10 * this.f139989b) + i11];
    }

    public int j() {
        return this.f139989b;
    }

    public boolean l() {
        return this.f139992e;
    }

    public boolean m() {
        return this.f139993f;
    }

    public boolean n() {
        return this.f139988a == this.f139989b;
    }

    public boolean o() {
        return this.f139991d;
    }

    public b0 p(float f10) {
        float[] fArr = new float[this.f139990c.length];
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.f139990c;
            if (i10 >= fArr2.length) {
                return new b0(this.f139988a, this.f139989b, fArr);
            }
            fArr[i10] = fArr2[i10] * f10;
            i10++;
        }
    }
}
