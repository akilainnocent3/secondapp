package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class guh implements p480 {
    public final huh a;
    public final long b;

    public guh(huh huhVar, long j) {
        this.a = huhVar;
        this.b = j;
    }

    @Override // defpackage.p480
    public final p480.a d(long j) {
        huh huhVar = this.a;
        ly0.g(huhVar.k);
        huh.a aVar = huhVar.k;
        long[] jArr = aVar.a;
        long[] jArr2 = aVar.b;
        int iE = jrh0.e(jArr, jrh0.j((((long) huhVar.e) * j) / 1000000, 0L, huhVar.j - 1), false);
        long j2 = iE == -1 ? 0L : jArr[iE];
        long j3 = iE != -1 ? jArr2[iE] : 0L;
        int i = huhVar.e;
        long j4 = (j2 * 1000000) / ((long) i);
        long j5 = this.b;
        r480 r480Var = new r480(j4, j3 + j5);
        if (j4 == j || iE == jArr.length - 1) {
            return new p480.a(r480Var, r480Var);
        }
        int i2 = iE + 1;
        return new p480.a(r480Var, new r480((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
    }

    @Override // defpackage.p480
    public final boolean g() {
        return true;
    }

    @Override // defpackage.p480
    public final long k() {
        return this.a.b();
    }
}
