package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class csh0 {
    public static final long a = ywh.a(0.0f, 0.0f);
    public static final float b = 3.1415927f;
    public static final float c = 6.2831855f;

    public static final float a(float f, float f2) {
        float fAtan2 = (float) Math.atan2(f2, f);
        float f3 = c;
        return (fAtan2 + f3) % f3;
    }

    public static final long b(float f, float f2) {
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (fSqrt > 0.0f) {
            return ywh.a(f / fSqrt, f2 / fSqrt);
        }
        hb5.a("Required distance greater than zero");
        return 0L;
    }

    public static final float c(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final float d(float f, float f2) {
        return ((f % f2) + f2) % f2;
    }

    public static long e(float f, float f2) {
        double d = f2;
        return a020.h(a020.i(f, ywh.a((float) Math.cos(d), (float) Math.sin(d))), a);
    }
}
