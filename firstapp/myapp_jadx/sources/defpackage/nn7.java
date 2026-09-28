package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nn7 implements p480 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public nn7(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.p480
    public final p480.a d(long j) {
        long[] jArr = this.e;
        int iE = jrh0.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.c;
        r480 r480Var = new r480(j2, jArr2[iE]);
        if (j2 >= j || iE == this.a - 1) {
            return new p480.a(r480Var, r480Var);
        }
        int i = iE + 1;
        return new p480.a(r480Var, new r480(jArr[i], jArr2[i]));
    }

    @Override // defpackage.p480
    public final boolean g() {
        return true;
    }

    @Override // defpackage.p480
    public final long k() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
