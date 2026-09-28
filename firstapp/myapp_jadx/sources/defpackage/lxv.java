package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class lxv implements b580 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public lxv(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? jrh0.O(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair<Long, Long> a(long j, long[] jArr, long[] jArr2) {
        int iE = jrh0.e(jArr, j, true);
        long j2 = jArr[iE];
        long j3 = jArr2[iE];
        int i = iE + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.p480
    public final p480.a d(long j) {
        Pair<Long, Long> pairA = a(jrh0.Z(jrh0.j(j, 0L, this.c)), this.b, this.a);
        r480 r480Var = new r480(jrh0.O(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new p480.a(r480Var, r480Var);
    }

    @Override // defpackage.b580
    public final long f() {
        return -1L;
    }

    @Override // defpackage.p480
    public final boolean g() {
        return true;
    }

    @Override // defpackage.b580
    public final long h(long j) {
        return jrh0.O(((Long) a(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.b580
    public final int j() {
        return -2147483647;
    }

    @Override // defpackage.p480
    public final long k() {
        return this.c;
    }
}
