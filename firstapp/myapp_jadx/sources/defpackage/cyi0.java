package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class cyi0 implements p480 {
    public final ayi0 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public cyi0(ayi0 ayi0Var, int i, long j, long j2) {
        this.a = ayi0Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) ayi0Var.c);
        this.d = j3;
        this.e = a(j3);
    }

    public final long a(long j) {
        long j2 = j * ((long) this.b);
        long j3 = this.a.b;
        String str = jrh0.a;
        return jrh0.V(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // defpackage.p480
    public final p480.a d(long j) {
        ayi0 ayi0Var = this.a;
        long j2 = (((long) ayi0Var.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.d - 1;
        long j4 = jrh0.j(j2, 0L, j3);
        int i = ayi0Var.c;
        long j5 = this.c;
        long jA = a(j4);
        r480 r480Var = new r480(jA, (((long) i) * j4) + j5);
        if (jA >= j || j4 == j3) {
            return new p480.a(r480Var, r480Var);
        }
        long j6 = j4 + 1;
        return new p480.a(r480Var, new r480(a(j6), (((long) i) * j6) + j5));
    }

    @Override // defpackage.p480
    public final boolean g() {
        return true;
    }

    @Override // defpackage.p480
    public final long k() {
        return this.e;
    }
}
