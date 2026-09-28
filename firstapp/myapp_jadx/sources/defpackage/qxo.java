package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qxo {
    public final int a;
    public final long b;

    public qxo(long j, int i) {
        this.b = j;
        this.a = i;
    }

    public static qxo a(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new qxo(j, i3);
    }
}
