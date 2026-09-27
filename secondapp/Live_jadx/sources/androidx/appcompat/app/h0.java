package androidx.appcompat.app;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static h0 f6401d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f6402e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f6403f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f6404g = 0.017453292f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f6405h = 9.0E-4f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f6406i = -0.10471976f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f6407j = 0.0334196f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f6408k = 3.49066E-4f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f6409l = 5.236E-6f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f6410m = 0.4092797f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f6411n = 946728000000L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6414c;

    public static h0 b() {
        if (f6401d == null) {
            f6401d = new h0();
        }
        return f6401d;
    }

    public void a(long j10, double d10, double d11) {
        float f10 = (j10 - f6411n) / 8.64E7f;
        float f11 = (0.01720197f * f10) + 6.24006f;
        double d12 = f11;
        double dSin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * f11) * 3.4906598739326E-4d) + (Math.sin(f11 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d13 = (-d11) / 360.0d;
        double dRound = ((double) (Math.round(((double) (f10 - 9.0E-4f)) - d13) + 9.0E-4f)) + d13 + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d14 = 0.01745329238474369d * d10;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d14) * Math.sin(dAsin))) / (Math.cos(d14) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f6414c = 1;
            this.f6412a = -1L;
            this.f6413b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f6414c = 0;
                this.f6412a = -1L;
                this.f6413b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f6412a = Math.round((dRound + dAcos) * 8.64E7d) + f6411n;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + f6411n;
            this.f6413b = jRound;
            if (jRound >= j10 || this.f6412a <= j10) {
                this.f6414c = 1;
            } else {
                this.f6414c = 0;
            }
        }
    }
}
