package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class q78 {
    public static long a(int i, int i2) {
        long j = 1;
        if (i == i2 || i2 == 0) {
            return 1L;
        }
        if (i2 == 1 || i2 == i - 1) {
            return i;
        }
        if (i > 61) {
            hb5.a("Input too large");
            return 0L;
        }
        if (i2 > i / 2) {
            return a(i, i - i2);
        }
        int i3 = (i - i2) + 1;
        for (int i4 = 1; i4 <= i2; i4++) {
            j = (j * ((long) i3)) / ((long) i4);
            i3++;
        }
        return j;
    }
}
