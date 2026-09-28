package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class eon {
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
    public final List<fon> q;
    public final List<uon> r;
    public final List<won> s;
    public final List<xon> t;

    public eon(String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, long j, String str5, String str6, BigDecimal bigDecimal4, int i, int i2, BigDecimal bigDecimal5, boolean z, boolean z2, List<fon> list, List<uon> list2, List<won> list3, List<xon> list4) {
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
        if (!(obj instanceof eon)) {
            return false;
        }
        eon eonVar = (eon) obj;
        return this.a.equals(eonVar.a) && this.b.equals(eonVar.b) && this.c.equals(eonVar.c) && this.d.equals(eonVar.d) && Intrinsics.g(this.e, eonVar.e) && Intrinsics.g(this.f, eonVar.f) && Intrinsics.g(this.g, eonVar.g) && this.h == eonVar.h && this.i.equals(eonVar.i) && this.j.equals(eonVar.j) && Intrinsics.g(this.k, eonVar.k) && this.l == eonVar.l && this.m == eonVar.m && this.n.equals(eonVar.n) && this.o == eonVar.o && this.p == eonVar.p && Intrinsics.g(this.q, eonVar.q) && Intrinsics.g(this.r, eonVar.r) && Intrinsics.g(this.s, eonVar.s) && Intrinsics.g(this.t, eonVar.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + ai50.a(ai50.a(ai50.a(mtg0.a(mtg0.a(dd3.a(this.n, gpp.a(this.m, gpp.a(this.l, dd3.a(this.k, gmf0.a(gmf0.a(f87.a(dd3.a(this.g, dd3.a(this.f, dd3.a(this.e, gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), this.h, 31), 31, this.i), 31, this.j), 31), 31), 31), 31), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantBasketballTicket(id=", this.a, ", number=", this.b, ", betTypeString=");
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
