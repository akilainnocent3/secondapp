package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jjt {
    public int a;
    public long[] b;

    public jjt(int i) {
        this.b = new long[i];
    }

    public final void a(long j) {
        int i = this.a;
        long[] jArrCopyOf = this.b;
        if (i == jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i * 2);
            this.b = jArrCopyOf;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        jArrCopyOf[i2] = j;
    }

    public final void b(long[] jArr) {
        int length = this.a + jArr.length;
        long[] jArrCopyOf = this.b;
        if (length > jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(jArrCopyOf.length * 2, length));
            this.b = jArrCopyOf;
        }
        System.arraycopy(jArr, 0, jArrCopyOf, this.a, jArr.length);
        this.a = length;
    }

    public final long c(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        ks40.a(this.a, efe0.a(i, "Invalid index ", ", size is "));
        return 0L;
    }

    public jjt() {
        this(32);
    }
}
