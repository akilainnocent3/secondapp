package te;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f136573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f136574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f136575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f136576f;

    public f0(int i10, int i11, float[] fArr) {
        boolean z10 = false;
        eh.a.b(i10 > 0, "Input channel count must be positive.");
        eh.a.b(i11 > 0, "Output channel count must be positive.");
        eh.a.b(fArr.length == i10 * i11, "Coefficient array length is invalid.");
        this.f136571a = i10;
        this.f136572b = i11;
        this.f136573c = a(fArr);
        int i12 = 0;
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        while (i12 < i10) {
            int i13 = 0;
            while (i13 < i11) {
                float fE = e(i12, i13);
                boolean z14 = i12 == i13;
                if (fE != 1.0f && z14) {
                    z13 = false;
                }
                if (fE != 0.0f) {
                    z11 = false;
                    if (!z14) {
                        z12 = false;
                    }
                }
                i13++;
            }
            i12++;
        }
        this.f136574d = z11;
        boolean z15 = j() && z12;
        this.f136575e = z15;
        if (z15 && z13) {
            z10 = true;
        }
        this.f136576f = z10;
    }

    public static float[] a(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            if (fArr[i10] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i10 + " is negative.");
            }
        }
        return fArr;
    }

    public static f0 b(int i10, int i11) {
        return new f0(i10, i11, c(i10, i11));
    }

    public static float[] c(int i10, int i11) {
        if (i10 == i11) {
            return g(i11);
        }
        if (i10 == 1 && i11 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i10 == 2 && i11 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i10 + "->" + i11 + " are not yet implemented.");
    }

    public static float[] g(int i10) {
        float[] fArr = new float[i10 * i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr[(i10 * i11) + i11] = 1.0f;
        }
        return fArr;
    }

    public int d() {
        return this.f136571a;
    }

    public float e(int i10, int i11) {
        return this.f136573c[(i10 * this.f136572b) + i11];
    }

    public int f() {
        return this.f136572b;
    }

    public boolean h() {
        return this.f136575e;
    }

    public boolean i() {
        return this.f136576f;
    }

    public boolean j() {
        return this.f136571a == this.f136572b;
    }

    public boolean k() {
        return this.f136574d;
    }

    public f0 l(float f10) {
        float[] fArr = new float[this.f136573c.length];
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.f136573c;
            if (i10 >= fArr2.length) {
                return new f0(this.f136571a, this.f136572b, fArr);
            }
            fArr[i10] = fArr2[i10] * f10;
            i10++;
        }
    }
}
