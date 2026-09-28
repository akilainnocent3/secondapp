package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class efn implements p480 {
    public final jjt a;
    public final jjt b;
    public long c;

    public efn(long j, long[] jArr, long[] jArr2) {
        jjt jjtVar;
        jjt jjtVar2;
        ly0.b(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            jjtVar = new jjt(length);
            this.a = jjtVar;
            jjtVar2 = new jjt(length);
            this.b = jjtVar2;
        } else {
            int i = length + 1;
            jjtVar = new jjt(i);
            this.a = jjtVar;
            jjtVar2 = new jjt(i);
            this.b = jjtVar2;
            jjtVar.a(0L);
            jjtVar2.a(0L);
        }
        jjtVar.b(jArr);
        jjtVar2.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.p480
    public final p480.a d(long j) {
        jjt jjtVar = this.b;
        if (jjtVar.a == 0) {
            r480 r480Var = r480.c;
            return new p480.a(r480Var, r480Var);
        }
        int iB = jrh0.b(jjtVar, j);
        long jC = jjtVar.c(iB);
        jjt jjtVar2 = this.a;
        r480 r480Var2 = new r480(jC, jjtVar2.c(iB));
        if (jC == j || iB == jjtVar.a - 1) {
            return new p480.a(r480Var2, r480Var2);
        }
        int i = iB + 1;
        return new p480.a(r480Var2, new r480(jjtVar.c(i), jjtVar2.c(i)));
    }

    @Override // defpackage.p480
    public final boolean g() {
        return this.b.a > 0;
    }

    @Override // defpackage.p480
    public final long k() {
        return this.c;
    }
}
