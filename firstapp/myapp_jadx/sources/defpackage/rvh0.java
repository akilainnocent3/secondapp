package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rvh0 implements b580 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public rvh0(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = i;
    }

    @Override // defpackage.p480
    public final p480.a d(long j) {
        long[] jArr = this.a;
        int iE = jrh0.e(jArr, j, true);
        long j2 = jArr[iE];
        long[] jArr2 = this.b;
        r480 r480Var = new r480(j2, jArr2[iE]);
        if (j2 >= j || iE == jArr.length - 1) {
            return new p480.a(r480Var, r480Var);
        }
        int i = iE + 1;
        return new p480.a(r480Var, new r480(jArr[i], jArr2[i]));
    }

    @Override // defpackage.b580
    public final long f() {
        return this.d;
    }

    @Override // defpackage.p480
    public final boolean g() {
        return true;
    }

    @Override // defpackage.b580
    public final long h(long j) {
        return this.a[jrh0.e(this.b, j, true)];
    }

    @Override // defpackage.b580
    public final int j() {
        return this.e;
    }

    @Override // defpackage.p480
    public final long k() {
        return this.c;
    }
}
