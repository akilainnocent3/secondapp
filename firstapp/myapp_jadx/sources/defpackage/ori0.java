package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ori0 {
    public final int a;
    public final String b;
    public final String c;
    public final double d;
    public final boolean e;
    public final double f;
    public final oti0 g;
    public final String h;
    public final uf00<j58> i;
    public final float j;
    public final boolean k;
    public final String l;
    public final double m;
    public final boolean n;

    public ori0(int i, String str, String str2, double d, boolean z, double d2, oti0 oti0Var, String str3, uf00<j58> uf00Var, float f, boolean z2, String str4, double d3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        uf00Var.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = z;
        this.f = d2;
        this.g = oti0Var;
        this.h = str3;
        this.i = uf00Var;
        this.j = f;
        this.k = z2;
        this.l = str4;
        this.m = d3;
        this.n = Math.abs(d3) > 1.0E-7d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ori0)) {
            return false;
        }
        ori0 ori0Var = (ori0) obj;
        return this.a == ori0Var.a && Intrinsics.g(this.b, ori0Var.b) && Intrinsics.g(this.c, ori0Var.c) && Double.compare(this.d, ori0Var.d) == 0 && this.e == ori0Var.e && Double.compare(this.f, ori0Var.f) == 0 && this.g == ori0Var.g && Intrinsics.g(this.h, ori0Var.h) && Intrinsics.g(this.i, ori0Var.i) && Float.compare(this.j, ori0Var.j) == 0 && this.k == ori0Var.k && this.l.equals(ori0Var.l) && Double.compare(this.m, ori0Var.m) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.m) + gmf0.a(mtg0.a(tvh.a(this.j, yvz.a(this.i, gmf0.a((this.g.hashCode() + nrg0.a(mtg0.a(nrg0.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h), 31), 31), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WDHistoryRecord(id=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", date=");
        sb.append(this.c);
        sb.append(", stake=");
        sb.append(this.d);
        sb.append(", isWin=");
        sb.append(this.e);
        sb.append(", amount=");
        sb.append(this.f);
        sb.append(", risk=");
        sb.append(this.g);
        sb.append(", ticketId=");
        sb.append(this.h);
        sb.append(", arrangement=");
        sb.append(this.i);
        sb.append(", angle=");
        sb.append(this.j);
        sb.append(", isExpend=");
        sb.append(this.k);
        sb.append(", multiplier=");
        sb.append(this.l);
        sb.append(", giftAmount=");
        return org0.a(sb, this.m, ')');
    }
}
