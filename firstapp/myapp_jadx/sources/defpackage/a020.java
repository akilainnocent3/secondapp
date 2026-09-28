package defpackage;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class a020 {
    public static final long a(float f, long j) {
        return ywh.a(d(j) / f, e(j) / f);
    }

    public static final float b(long j, long j2) {
        return (e(j2) * e(j)) + (d(j2) * d(j));
    }

    public static final long c(long j) {
        float fSqrt = (float) Math.sqrt((e(j) * e(j)) + (d(j) * d(j)));
        if (fSqrt > 0.0f) {
            return a(fSqrt, j);
        }
        hb5.a("Can't get the direction of a 0-length vector");
        return 0L;
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float e(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long f(long j, long j2) {
        return ywh.a(d(j) - d(j2), e(j) - e(j2));
    }

    public static final String g(String str) {
        String string = str != null ? StringsKt.t0(str).toString() : null;
        return string == null ? "" : string;
    }

    public static final long h(long j, long j2) {
        return ywh.a(d(j2) + d(j), e(j2) + e(j));
    }

    public static final long i(float f, long j) {
        return ywh.a(d(j) * f, e(j) * f);
    }

    public static final long j(long j, yy80.a aVar) {
        long jA = aVar.a(d(j), e(j));
        return ywh.a(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
    }
}
