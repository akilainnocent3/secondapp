package n0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class p implements r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final double f115690l = Double.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f115693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f115694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f115695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f115696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f115697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f115698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f115699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f115700j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f115691a = 0.5d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f115692b = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f115701k = 0;

    @Override // n0.r
    public float a() {
        return 0.0f;
    }

    @Override // n0.r
    public float b(float f10) {
        return this.f115698h;
    }

    @Override // n0.r
    public String c(String str, float f10) {
        return null;
    }

    @Override // n0.r
    public boolean d() {
        double d10 = ((double) this.f115697g) - this.f115694d;
        double d11 = this.f115693c;
        double d12 = this.f115698h;
        return Math.sqrt((((d12 * d12) * ((double) this.f115699i)) + ((d11 * d10) * d10)) / d11) <= ((double) this.f115700j);
    }

    public final void e(double d10) {
        if (d10 <= 0.0d) {
            return;
        }
        double d11 = this.f115693c;
        double d12 = this.f115691a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) this.f115699i)) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / ((double) iSqrt);
        int i10 = 0;
        while (i10 < iSqrt) {
            float f10 = this.f115697g;
            double d14 = this.f115694d;
            float f11 = this.f115698h;
            double d15 = d11;
            double d16 = ((-d11) * (((double) f10) - d14)) - (((double) f11) * d12);
            float f12 = this.f115699i;
            double d17 = d12;
            double d18 = ((double) f11) + (((d16 / ((double) f12)) * d13) / 2.0d);
            double d19 = ((((-((((double) f10) + ((d13 * d18) / 2.0d)) - d14)) * d15) - (d18 * d17)) / ((double) f12)) * d13;
            double d20 = ((double) f11) + (d19 / 2.0d);
            float f13 = f11 + ((float) d19);
            this.f115698h = f13;
            float f14 = f10 + ((float) (d20 * d13));
            this.f115697g = f14;
            int i11 = this.f115701k;
            if (i11 > 0) {
                if (f14 < 0.0f && (i11 & 1) == 1) {
                    this.f115697g = -f14;
                    this.f115698h = -f13;
                }
                float f15 = this.f115697g;
                if (f15 > 1.0f && (i11 & 2) == 2) {
                    this.f115697g = 2.0f - f15;
                    this.f115698h = -this.f115698h;
                }
            }
            i10++;
            d11 = d15;
            d12 = d17;
        }
    }

    public float f() {
        double d10 = this.f115693c;
        return ((float) (((-d10) * (((double) this.f115697g) - this.f115694d)) - (this.f115691a * ((double) this.f115698h)))) / this.f115699i;
    }

    public void g(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    @Override // n0.r
    public float getInterpolation(float f10) {
        e(f10 - this.f115696f);
        this.f115696f = f10;
        if (d()) {
            this.f115697g = (float) this.f115694d;
        }
        return this.f115697g;
    }

    public void h(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        this.f115694d = f11;
        this.f115691a = f15;
        this.f115692b = false;
        this.f115697g = f10;
        this.f115695e = f12;
        this.f115693c = f14;
        this.f115699i = f13;
        this.f115700j = f16;
        this.f115701k = i10;
        this.f115696f = 0.0f;
    }
}
