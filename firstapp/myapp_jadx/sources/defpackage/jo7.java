package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jo7 {
    public int[] a;
    public int b;
    public int c;
    public int d;

    public jo7() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.d = iHighestOneBit - 1;
        this.a = new int[iHighestOneBit];
    }

    public final void a(int i) {
        int[] iArr = this.a;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        int i4 = this.b;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                b9p.a("Max array capacity exceeded");
                return;
            }
            int[] iArr2 = new int[i6];
            xx0.d(0, i4, length, iArr, iArr2);
            xx0.d(i5, 0, this.b, this.a, iArr2);
            this.a = iArr2;
            this.b = 0;
            this.c = length;
            this.d = i6 - 1;
        }
    }
}
