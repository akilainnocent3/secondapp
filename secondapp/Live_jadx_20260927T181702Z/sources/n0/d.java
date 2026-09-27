package n0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f115543c = "cubic(0.4, 0.0, 0.2, 1)";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f115544d = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f115545e = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f115546f = "cubic(1, 1, 0, 0)";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f115547g = "cubic(0.36, 0, 0.66, -0.56)";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f115548h = "cubic(0.34, 1.56, 0.64, 1)";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f115553m = "anticipate";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f115554n = "overshoot";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f115556a = "identity";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f115542b = new d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f115551k = "standard";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f115550j = "accelerate";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f115549i = "decelerate";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f115552l = "linear";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String[] f115555o = {f115551k, f115550j, f115549i, f115552l};

    public static d c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new q(str);
        }
        if (str.startsWith("Schlick")) {
            return new n(str);
        }
        switch (str) {
            case "accelerate":
                return new a(f115544d);
            case "decelerate":
                return new a(f115545e);
            case "anticipate":
                return new a(f115547g);
            case "linear":
                return new a(f115546f);
            case "overshoot":
                return new a(f115548h);
            case "standard":
                return new a(f115543c);
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f115555o));
                return f115542b;
        }
    }

    public double b(double d10) {
        return 1.0d;
    }

    public String toString() {
        return this.f115556a;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static double f115557t = 0.01d;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static double f115558u = 1.0E-4d;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public double f115559p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public double f115560q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public double f115561r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public double f115562s;

        public a(String str) {
            this.f115556a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f115559p = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i10 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i10);
            this.f115560q = Double.parseDouble(str.substring(i10, iIndexOf3).trim());
            int i11 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i11);
            this.f115561r = Double.parseDouble(str.substring(i11, iIndexOf4).trim());
            int i12 = iIndexOf4 + 1;
            this.f115562s = Double.parseDouble(str.substring(i12, str.indexOf(41, i12)).trim());
        }

        @Override // n0.d
        public double a(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > f115557t) {
                d11 *= 0.5d;
                d12 = f(d12) < d10 ? d12 + d11 : d12 - d11;
            }
            double d13 = d12 - d11;
            double dF = f(d13);
            double d14 = d12 + d11;
            double dF2 = f(d14);
            double dG = g(d13);
            return (((g(d14) - dG) * (d10 - dF)) / (dF2 - dF)) + dG;
        }

        @Override // n0.d
        public double b(double d10) {
            double d11 = 0.5d;
            double d12 = 0.5d;
            while (d11 > f115558u) {
                d11 *= 0.5d;
                d12 = f(d12) < d10 ? d12 + d11 : d12 - d11;
            }
            double d13 = d12 - d11;
            double d14 = d12 + d11;
            return (g(d14) - g(d13)) / (f(d14) - f(d13));
        }

        public final double d(double d10) {
            double d11 = 1.0d - d10;
            double d12 = this.f115559p;
            double d13 = this.f115561r;
            return (d11 * 3.0d * d11 * d12) + (d11 * 6.0d * d10 * (d13 - d12)) + (3.0d * d10 * d10 * (1.0d - d13));
        }

        public final double e(double d10) {
            double d11 = 1.0d - d10;
            double d12 = this.f115560q;
            double d13 = this.f115562s;
            return (d11 * 3.0d * d11 * d12) + (d11 * 6.0d * d10 * (d13 - d12)) + (3.0d * d10 * d10 * (1.0d - d13));
        }

        public final double f(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            return (this.f115559p * d11 * d12 * d10) + (this.f115561r * d12 * d10 * d10) + (d10 * d10 * d10);
        }

        public final double g(double d10) {
            double d11 = 1.0d - d10;
            double d12 = 3.0d * d11;
            return (this.f115560q * d11 * d12 * d10) + (this.f115562s * d12 * d10 * d10) + (d10 * d10 * d10);
        }

        public void h(double d10, double d11, double d12, double d13) {
            this.f115559p = d10;
            this.f115560q = d11;
            this.f115561r = d12;
            this.f115562s = d13;
        }

        public a(double d10, double d11, double d12, double d13) {
            h(d10, d11, d12, d13);
        }
    }

    public double a(double d10) {
        return d10;
    }
}
