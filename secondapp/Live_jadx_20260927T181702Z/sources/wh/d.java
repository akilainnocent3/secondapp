package wh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f143037a = 1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f143038b = 21.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f143039c = 3.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double f143040d = 4.5d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f143041e = 7.0d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double f143042f = 0.04d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final double f143043g = 0.4d;

    public static double a(double d10, double d11) {
        if (d10 >= 0.0d && d10 <= 100.0d) {
            double dT = c.t(d10);
            double d12 = ((dT + 5.0d) / d11) - 5.0d;
            if (d12 >= 0.0d && d12 <= 100.0d) {
                double dF = f(dT, d12);
                double dAbs = Math.abs(dF - d11);
                if (dF < d11 && dAbs > 0.04d) {
                    return -1.0d;
                }
                double dP = c.p(d12) - 0.4d;
                if (dP >= 0.0d && dP <= 100.0d) {
                    return dP;
                }
            }
        }
        return -1.0d;
    }

    public static double b(double d10, double d11) {
        return Math.max(0.0d, a(d10, d11));
    }

    public static double c(double d10, double d11) {
        if (d10 >= 0.0d && d10 <= 100.0d) {
            double dT = c.t(d10);
            double d12 = ((dT + 5.0d) * d11) - 5.0d;
            if (d12 >= 0.0d && d12 <= 100.0d) {
                double dF = f(d12, dT);
                double dAbs = Math.abs(dF - d11);
                if (dF < d11 && dAbs > 0.04d) {
                    return -1.0d;
                }
                double dP = c.p(d12) + 0.4d;
                if (dP >= 0.0d && dP <= 100.0d) {
                    return dP;
                }
            }
        }
        return -1.0d;
    }

    public static double d(double d10, double d11) {
        double dC = c(d10, d11);
        if (dC < 0.0d) {
            return 100.0d;
        }
        return dC;
    }

    public static double e(double d10, double d11) {
        return f(c.t(d10), c.t(d11));
    }

    public static double f(double d10, double d11) {
        double dMax = Math.max(d10, d11);
        if (dMax != d11) {
            d10 = d11;
        }
        return (dMax + 5.0d) / (d10 + 5.0d);
    }
}
