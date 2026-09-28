package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f4o {
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
    public final List<g4o> q;
    public final List<u4o> r;
    public final List<w4o> s;
    public final List<x4o> t;

    public f4o(String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, long j, String str5, String str6, BigDecimal bigDecimal4, int i, int i2, BigDecimal bigDecimal5, boolean z, boolean z2, List<g4o> list, List<u4o> list2, List<w4o> list3, List<x4o> list4) {
        lp.a(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, list);
        list2.getClass();
        list3.getClass();
        list4.getClass();
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4o)) {
            return false;
        }
        f4o f4oVar = (f4o) obj;
        return this.a.equals(f4oVar.a) && this.b.equals(f4oVar.b) && this.c.equals(f4oVar.c) && this.d.equals(f4oVar.d) && Intrinsics.g(this.e, f4oVar.e) && Intrinsics.g(this.f, f4oVar.f) && Intrinsics.g(this.g, f4oVar.g) && this.h == f4oVar.h && this.i.equals(f4oVar.i) && this.j.equals(f4oVar.j) && Intrinsics.g(this.k, f4oVar.k) && this.l == f4oVar.l && this.m == f4oVar.m && this.n.equals(f4oVar.n) && this.o == f4oVar.o && this.p == f4oVar.p && Intrinsics.g(this.q, f4oVar.q) && Intrinsics.g(this.r, f4oVar.r) && Intrinsics.g(this.s, f4oVar.s) && Intrinsics.g(this.t, f4oVar.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + ai50.a(ai50.a(ai50.a(mtg0.a(mtg0.a(dd3.a(this.n, gpp.a(this.m, gpp.a(this.l, dd3.a(this.k, gmf0.a(gmf0.a(f87.a(dd3.a(this.g, dd3.a(this.f, dd3.a(this.e, gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), this.h, 31), 31, this.i), 31, this.j), 31), 31), 31), 31), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantRacingTicket(id=", this.a, ", number=", this.b, ", betTypeString=");
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
        sbA.append(")");
        return sbA.toString();
    }
}
