package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ern {
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
    public final List<frn> q;
    public final List<asn> r;
    public final List<csn> s;
    public final List<dsn> t;
    public final List<grn> u;

    public ern(String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, long j, String str5, String str6, BigDecimal bigDecimal4, int i, int i2, BigDecimal bigDecimal5, boolean z, boolean z2, List<frn> list, List<asn> list2, List<csn> list3, List<dsn> list4, List<grn> list5) {
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
        if (!(obj instanceof ern)) {
            return false;
        }
        ern ernVar = (ern) obj;
        return this.a.equals(ernVar.a) && this.b.equals(ernVar.b) && this.c.equals(ernVar.c) && this.d.equals(ernVar.d) && Intrinsics.g(this.e, ernVar.e) && Intrinsics.g(this.f, ernVar.f) && Intrinsics.g(this.g, ernVar.g) && this.h == ernVar.h && this.i.equals(ernVar.i) && this.j.equals(ernVar.j) && Intrinsics.g(this.k, ernVar.k) && this.l == ernVar.l && this.m == ernVar.m && this.n.equals(ernVar.n) && this.o == ernVar.o && this.p == ernVar.p && Intrinsics.g(this.q, ernVar.q) && Intrinsics.g(this.r, ernVar.r) && Intrinsics.g(this.s, ernVar.s) && Intrinsics.g(this.t, ernVar.t) && Intrinsics.g(this.u, ernVar.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + ai50.a(ai50.a(ai50.a(ai50.a(mtg0.a(mtg0.a(dd3.a(this.n, gpp.a(this.m, gpp.a(this.l, dd3.a(this.k, gmf0.a(gmf0.a(f87.a(dd3.a(this.g, dd3.a(this.f, dd3.a(this.e, gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), this.h, 31), 31, this.i), 31, this.j), 31), 31), 31), 31), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantFootballTicket(id=", this.a, ", number=", this.b, ", betTypeString=");
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
