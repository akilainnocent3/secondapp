package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public final class q590 {
    public short[] a;
    public int b;
    public final boolean c;

    public q590(int i, int i2) {
        this.c = true;
        this.a = new short[i];
    }

    public final void a(int i) {
        short[] sArrE = this.a;
        int i2 = this.b;
        if (i2 == sArrE.length) {
            sArrE = e(Math.max(8, (int) (i2 * 1.75f)));
        }
        int i3 = this.b;
        this.b = i3 + 1;
        sArrE[i3] = (short) i;
    }

    public final void b(short s) {
        short[] sArrE = this.a;
        int i = this.b;
        if (i == sArrE.length) {
            sArrE = e(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.b;
        this.b = i2 + 1;
        sArrE[i2] = s;
    }

    public final void c(short[] sArr, int i) {
        short[] sArrE = this.a;
        int i2 = this.b + i;
        if (i2 > sArrE.length) {
            sArrE = e(Math.max(Math.max(8, i2), (int) (this.b * 1.75f)));
        }
        System.arraycopy(sArr, 0, sArrE, this.b, i);
        this.b += i;
    }

    public final short d(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        ks40.a(this.b, efe0.a(i, "index can't be >= size: ", " >= "));
        return (short) 0;
    }

    public final short[] e(int i) {
        short[] sArr = new short[i];
        System.arraycopy(this.a, 0, sArr, 0, Math.min(this.b, i));
        this.a = sArr;
        return sArr;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (this.c && (obj instanceof q590)) {
            q590 q590Var = (q590) obj;
            if (q590Var.c && (i = this.b) == q590Var.b) {
                short[] sArr = this.a;
                short[] sArr2 = q590Var.a;
                for (int i2 = 0; i2 < i; i2++) {
                    if (sArr[i2] == sArr2[i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final short[] f(int i) {
        if (i < 0) {
            hb5.a(hce0.a(i, "newSize must be >= 0: "));
            return null;
        }
        if (i > this.a.length) {
            e(Math.max(8, i));
        }
        this.b = i;
        return this.a;
    }

    public final int hashCode() {
        if (!this.c) {
            return super.hashCode();
        }
        short[] sArr = this.a;
        int i = this.b;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + sArr[i3];
        }
        return i2;
    }

    public final String toString() {
        if (this.b == 0) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        short[] sArr = this.a;
        j9e0 j9e0Var = new j9e0(32);
        j9e0Var.b('[');
        j9e0Var.a(sArr[0]);
        for (int i = 1; i < this.b; i++) {
            j9e0Var.c(", ");
            j9e0Var.a(sArr[i]);
        }
        j9e0Var.b(']');
        return j9e0Var.toString();
    }

    public q590() {
        this(16, 0);
    }
}
