package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hkw {
    public static final long a = d2l.f(14);

    public static final long a(long j, long j2) {
        if (!omf0.d(j2)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) omf0.f(j2)) + '.');
        }
        if (omf0.d(j)) {
            ds1.a(omf0.f(j2), "Cannot convert Em to Px when style.fontSize is Em (", "). Please declare the style.fontSize with Sp units instead.");
            return 0L;
        }
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            float fC = omf0.c(j2);
            d2l.a(j);
            return d2l.g(omf0.c(j) * fC, j3);
        }
        float fC2 = omf0.c(j2);
        long j4 = a;
        d2l.a(j4);
        return gkw.a(fC2, j4, j4 & 1095216660480L);
    }
}
