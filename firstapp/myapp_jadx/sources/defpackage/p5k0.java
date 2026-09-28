package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p5k0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final BigDecimal g;
    public final long h;
    public final String i;
    public final String j;
    public final BigDecimal k;
    public final int l;
    public final int m;
    public final BigDecimal n;
    public final boolean o;
    public final boolean p;
    public final List<q5k0> q;
    public final List<j6k0> r;
    public final List<l6k0> s;
    public final List<n6k0> t;
    public final List<r5k0> u;

    public p5k0(String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, long j, String str5, String str6, BigDecimal bigDecimal4, int i, int i2, BigDecimal bigDecimal5, boolean z, boolean z2, List<q5k0> list, List<j6k0> list2, List<l6k0> list3, List<n6k0> list4, List<r5k0> list5) {
        lp.a(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, list);
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bigDecimal;
        this.f = bigDecimal2;
        this.g = bigDecimal3;
        this.h = j;
        this.i = str5;
        this.j = str6;
        this.k = bigDecimal4;
        this.l = i;
        this.m = i2;
        this.n = bigDecimal5;
        this.o = z;
        this.p = z2;
        this.q = list;
        this.r = list2;
        this.s = list3;
        this.t = list4;
        this.u = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5k0)) {
            return false;
        }
        p5k0 p5k0Var = (p5k0) obj;
        return this.a.equals(p5k0Var.a) && this.b.equals(p5k0Var.b) && this.c.equals(p5k0Var.c) && this.d.equals(p5k0Var.d) && Intrinsics.g(this.e, p5k0Var.e) && Intrinsics.g(this.f, p5k0Var.f) && Intrinsics.g(this.g, p5k0Var.g) && this.h == p5k0Var.h && this.i.equals(p5k0Var.i) && this.j.equals(p5k0Var.j) && Intrinsics.g(this.k, p5k0Var.k) && this.l == p5k0Var.l && this.m == p5k0Var.m && this.n.equals(p5k0Var.n) && this.o == p5k0Var.o && this.p == p5k0Var.p && Intrinsics.g(this.q, p5k0Var.q) && Intrinsics.g(this.r, p5k0Var.r) && Intrinsics.g(this.s, p5k0Var.s) && Intrinsics.g(this.t, p5k0Var.t) && Intrinsics.g(this.u, p5k0Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + ai50.a(ai50.a(ai50.a(ai50.a(mtg0.a(mtg0.a(dd3.a(this.n, gpp.a(this.m, gpp.a(this.l, dd3.a(this.k, gmf0.a(gmf0.a(f87.a(dd3.a(this.g, dd3.a(this.f, dd3.a(this.e, gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), this.h, 31), 31, this.i), 31, this.j), 31), 31), 31), 31), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("WorldCupTicket(id=", this.a, ", number=", this.b, ", betTypeString=");
        hxa.c(sbA, this.c, ", sportId=", this.d, ", totalStake=");
        iib0.b(sbA, this.e, ", totalReturn=", this.f, ", withholdingTax=");
        sbA.append(this.g);
        sbA.append(", createTimestampMillis=");
        sbA.append(this.h);
        hxa.c(sbA, ", roundId=", this.i, ", giftId=", this.j);
        sbA.append(", giftAmount=");
        sbA.append(this.k);
        sbA.append(", giftKind=");
        sbA.append(this.l);
        sbA.append(", flexibleFitSize=");
        sbA.append(this.m);
        sbA.append(", totalOdds=");
        sbA.append(this.n);
        u8.a(", isSettled=", ", isWin=", sbA, this.o, this.p);
        qjk.a(", bets=", ", events=", sbA, this.q, this.r);
        qjk.a(", markets=", ", outcomes=", sbA, this.s, this.t);
        return ka1.a(sbA, ", betBuilders=", this.u, ")");
    }
}
