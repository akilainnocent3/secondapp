package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v4b {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + jjf.a(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + jjf.a(Float.intBitsToFloat(i)) + ", " + jjf.a(Float.intBitsToFloat(i2)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v4b) {
            return this.a == ((v4b) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
