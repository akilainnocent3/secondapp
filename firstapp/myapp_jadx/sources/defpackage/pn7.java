package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class pn7 {
    public final np1 a;
    public final njg0 b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public pn7(int i, np1 np1Var, njg0 njg0Var) {
        int i2 = np1Var.d;
        this.a = np1Var;
        int iA = np1Var.a();
        boolean z = true;
        if (iA != 1 && iA != 2) {
            z = false;
        }
        ly0.b(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) np1Var.b) * 1000000;
        long j2 = np1Var.c;
        String str = jrh0.a;
        this.e = jrh0.V(i2, j, j2, RoundingMode.DOWN);
        this.b = njg0Var;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final r480 a(int i) {
        return new r480((this.e / ((long) this.f)) * ((long) this.n[i]), this.m[i]);
    }

    public final p480.a b(long j) {
        if (this.k == 0) {
            r480 r480Var = new r480(0L, this.l);
            return new p480.a(r480Var, r480Var);
        }
        int i = (int) (j / (this.e / ((long) this.f)));
        int iD = jrh0.d(this.n, i, true, true);
        if (this.n[iD] == i) {
            r480 r480VarA = a(iD);
            return new p480.a(r480VarA, r480VarA);
        }
        r480 r480VarA2 = a(iD);
        int i2 = iD + 1;
        return i2 < this.m.length ? new p480.a(r480VarA2, a(i2)) : new p480.a(r480VarA2, r480VarA2);
    }
}
