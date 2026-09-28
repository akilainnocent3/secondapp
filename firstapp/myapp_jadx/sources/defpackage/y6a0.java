package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y6a0 {
    public final nsz a = new nsz(8);
    public int b;

    public final long a(jcd jcdVar) {
        nsz nszVar = this.a;
        int i = 0;
        jcdVar.c(nszVar.a, 0, 1, false);
        int i2 = nszVar.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        jcdVar.c(nszVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (nszVar.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }
}
