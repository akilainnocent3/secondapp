package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ite {
    public static final int a(long j, long j2) {
        boolean zD = d(j);
        if (zD != d(j2)) {
            return zD ? -1 : 1;
        }
        int iSignum = (int) Math.signum(b(j) - b(j2));
        if (Math.min(b(j), b(j2)) >= 0.0f && c(j) != c(j2)) {
            return c(j) ? -1 : 1;
        }
        return iSignum;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean c(long j) {
        return (j & 2) != 0;
    }

    public static final boolean d(long j) {
        return (j & 1) != 0;
    }
}
