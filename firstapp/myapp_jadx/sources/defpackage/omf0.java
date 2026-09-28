package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class omf0 {
    public static final pmf0[] b = {new pmf0(0), new pmf0(4294967296L), new pmf0(8589934592L)};
    public static final long c = d2l.g(Float.NaN, 0);
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean d(long j) {
        return (j & 1095216660480L) == 8589934592L;
    }

    public static final boolean e(long j) {
        return (j & 1095216660480L) == 4294967296L;
    }

    public static String f(long j) {
        long jB = b(j);
        if (pmf0.a(jB, 0L)) {
            return "Unspecified";
        }
        if (pmf0.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!pmf0.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof omf0) {
            return this.a == ((omf0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f(this.a);
    }
}
