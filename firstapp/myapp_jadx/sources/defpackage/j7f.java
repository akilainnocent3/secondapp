package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j7f {
    public final long a;

    public static long a(float f, float f2, int i, long j) {
        if ((i & 1) != 0) {
            f = c(j);
        }
        if ((i & 2) != 0) {
            f2 = d(j);
        }
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String e(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) g7f.c(c(j))) + ", " + ((Object) g7f.c(d(j))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j7f) {
            return this.a == ((j7f) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
