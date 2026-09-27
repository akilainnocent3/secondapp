package wh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class x6 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x6 f143219k = a(50.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f143220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f143221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f143222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f143223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f143224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f143225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double[] f143226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f143227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f143228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f143229j;

    public x6(double d10, double d11, double d12, double d13, double d14, double d15, double[] dArr, double d16, double d17, double d18) {
        this.f143225f = d10;
        this.f143220a = d11;
        this.f143221b = d12;
        this.f143222c = d13;
        this.f143223d = d14;
        this.f143224e = d15;
        this.f143226g = dArr;
        this.f143227h = d16;
        this.f143228i = d17;
        this.f143229j = d18;
    }

    public static x6 a(double d10) {
        return l(c.r(), (c.t(50.0d) * 63.66197723675813d) / 100.0d, d10, 2.0d, false);
    }

    public static x6 l(double[] dArr, double d10, double d11, double d12, boolean z10) {
        double dMax = Math.max(0.1d, d11);
        double[][] dArr2 = b.f143018k;
        double d13 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d14 = dArr3[0] * d13;
        double d15 = dArr[1];
        double d16 = d14 + (dArr3[1] * d15);
        double d17 = dArr[2];
        double d18 = d16 + (dArr3[2] * d17);
        double[] dArr4 = dArr2[1];
        double d19 = (dArr4[0] * d13) + (dArr4[1] * d15) + (dArr4[2] * d17);
        double[] dArr5 = dArr2[2];
        double d20 = (d13 * dArr5[0]) + (d15 * dArr5[1]) + (d17 * dArr5[2]);
        double d21 = (d12 / 10.0d) + 0.8d;
        double d22 = d21 >= 0.9d ? w5.d(0.59d, 0.69d, (d21 - 0.9d) * 10.0d) : w5.d(0.525d, 0.59d, (d21 - 0.8d) * 10.0d);
        double dA = w5.a(0.0d, 1.0d, z10 ? 1.0d : (1.0d - (Math.exp(((-d10) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d21);
        double[] dArr6 = {(((100.0d / d18) * dA) + 1.0d) - dA, (((100.0d / d19) * dA) + 1.0d) - dA, (((100.0d / d20) * dA) + 1.0d) - dA};
        double d23 = 5.0d * d10;
        double d24 = 1.0d / (d23 + 1.0d);
        double d25 = d24 * d24 * d24 * d24;
        double d26 = 1.0d - d25;
        double dCbrt = (d25 * d10) + (d26 * 0.1d * d26 * Math.cbrt(d23));
        double dT = c.t(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dT) + 1.48d;
        double dPow = 0.725d / Math.pow(dT, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d18) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d19) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d20) / 100.0d, 0.42d)};
        double d27 = dArr7[0];
        double d28 = (d27 * 400.0d) / (d27 + 27.13d);
        double d29 = dArr7[1];
        double d30 = (d29 * 400.0d) / (d29 + 27.13d);
        double d31 = dArr7[2];
        double[] dArr8 = {d28, d30, (400.0d * d31) / (d31 + 27.13d)};
        return new x6(dT, ((dArr8[0] * 2.0d) + dArr8[1] + (dArr8[2] * 0.05d)) * dPow, dPow, dPow, d22, d21, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public double b() {
        return this.f143220a;
    }

    public double c() {
        return this.f143223d;
    }

    public double d() {
        return this.f143227h;
    }

    public double e() {
        return this.f143228i;
    }

    public double f() {
        return this.f143225f;
    }

    public double g() {
        return this.f143221b;
    }

    public double h() {
        return this.f143224e;
    }

    public double i() {
        return this.f143222c;
    }

    public double[] j() {
        return this.f143226g;
    }

    public double k() {
        return this.f143229j;
    }
}
