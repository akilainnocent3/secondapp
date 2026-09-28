package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ojg0 {
    public final fjg0 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public ojg0(fjg0 fjg0Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        ly0.b(iArr.length == jArr2.length);
        ly0.b(jArr.length == jArr2.length);
        ly0.b(iArr2.length == jArr2.length);
        this.a = fjg0Var;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int iA = jrh0.a(jArr, j, true); iA < jArr.length; iA++) {
            if ((this.g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
