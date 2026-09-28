package defpackage;

import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
public final class j250 {
    public static final /* synthetic */ int a = 0;

    public static final double a(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final String b(int i, long j) {
        if (j >= 0) {
            String string = Long.toString(j, CharsKt.checkRadix(i));
            string.getClass();
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j3, CharsKt.checkRadix(i));
        string2.getClass();
        sb.append(string2);
        String string3 = Long.toString(j4, CharsKt.checkRadix(i));
        string3.getClass();
        sb.append(string3);
        return sb.toString();
    }
}
