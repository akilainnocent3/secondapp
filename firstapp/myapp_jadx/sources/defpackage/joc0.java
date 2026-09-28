package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class joc0 {
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
    public final boolean q;
    public final List<koc0> r;
    public final List<bpc0> s;
    public final List<dpc0> t;
    public final List<epc0> u;
    public final List<loc0> v;
    public final z0f w;

    public joc0(String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, long j, String str5, String str6, BigDecimal bigDecimal4, int i, int i2, BigDecimal bigDecimal5, boolean z, boolean z2, boolean z3, List<koc0> list, List<bpc0> list2, List<dpc0> list3, List<epc0> list4, List<loc0> list5, z0f z0fVar) {
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
        this.q = z3;
        this.r = list;
        this.s = list2;
        this.t = list3;
        this.u = list4;
        this.v = list5;
        this.w = z0fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joc0)) {
            return false;
        }
        joc0 joc0Var = (joc0) obj;
        return this.a.equals(joc0Var.a) && this.b.equals(joc0Var.b) && this.c.equals(joc0Var.c) && this.d.equals(joc0Var.d) && Intrinsics.g(this.e, joc0Var.e) && Intrinsics.g(this.f, joc0Var.f) && Intrinsics.g(this.g, joc0Var.g) && this.h == joc0Var.h && this.i.equals(joc0Var.i) && this.j.equals(joc0Var.j) && Intrinsics.g(this.k, joc0Var.k) && this.l == joc0Var.l && this.m == joc0Var.m && this.n.equals(joc0Var.n) && this.o == joc0Var.o && this.p == joc0Var.p && this.q == joc0Var.q && Intrinsics.g(this.r, joc0Var.r) && Intrinsics.g(this.s, joc0Var.s) && Intrinsics.g(this.t, joc0Var.t) && Intrinsics.g(this.u, joc0Var.u) && Intrinsics.g(this.v, joc0Var.v) && Intrinsics.g(this.w, joc0Var.w);
    }

    public final int hashCode() {
        int iA = ai50.a(ai50.a(ai50.a(ai50.a(ai50.a(mtg0.a(mtg0.a(mtg0.a(dd3.a(this.n, gpp.a(this.m, gpp.a(this.l, dd3.a(this.k, gmf0.a(gmf0.a(f87.a(dd3.a(this.g, dd3.a(this.f, dd3.a(this.e, gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), this.h, 31), 31, this.i), 31, this.j), 31), 31), 31), 31), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
        z0f z0fVar = this.w;
        return iA + (z0fVar == null ? 0 : z0fVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyLegendsTicket(id=", this.a, ", number=", this.b, ", betTypeString=");
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
        sbA.append(", hasDoubleOrNothing=");
        sbA.append(this.q);
        sbA.append(", bets=");
        sbA.append(this.r);
        qjk.a(", events=", ", markets=", sbA, this.s, this.t);
        qjk.a(", outcomes=", ", betBuilders=", sbA, this.u, this.v);
        sbA.append(", doubleOrNothingDetail=");
        sbA.append(this.w);
        sbA.append(")");
        return sbA.toString();
    }
}
