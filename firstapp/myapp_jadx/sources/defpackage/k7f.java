package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k7f {
    public final long a;

    public static final long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String d(long j) {
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) g7f.c(c(j))) + " x " + ((Object) g7f.c(b(j)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k7f) {
            return this.a == ((k7f) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
