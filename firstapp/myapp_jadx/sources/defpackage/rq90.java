package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rq90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final long g;
    public final String h;
    public final String i;
    public final BigDecimal j;
    public final int k;
    public final List<uq90> l;
    public final List<fr90> m;
    public final BigDecimal n;
    public final Integer o;

    public rq90(String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, long j, String str5, String str6, BigDecimal bigDecimal3, int i, List<uq90> list, List<fr90> list2, BigDecimal bigDecimal4, Integer num) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        list.getClass();
        list2.getClass();
        bigDecimal4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bigDecimal;
        this.f = bigDecimal2;
        this.g = j;
        this.h = str5;
        this.i = str6;
        this.j = bigDecimal3;
        this.k = i;
        this.l = list;
        this.m = list2;
        this.n = bigDecimal4;
        this.o = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq90)) {
            return false;
        }
        rq90 rq90Var = (rq90) obj;
        return this.a.equals(rq90Var.a) && this.b.equals(rq90Var.b) && this.c.equals(rq90Var.c) && this.d.equals(rq90Var.d) && Intrinsics.g(this.e, rq90Var.e) && Intrinsics.g(this.f, rq90Var.f) && this.g == rq90Var.g && this.h.equals(rq90Var.h) && this.i.equals(rq90Var.i) && Intrinsics.g(this.j, rq90Var.j) && this.k == rq90Var.k && Intrinsics.g(this.l, rq90Var.l) && Intrinsics.g(this.m, rq90Var.m) && Intrinsics.g(this.n, rq90Var.n) && Intrinsics.g(this.o, rq90Var.o);
    }

    public final int hashCode() {
        int iA = dd3.a(this.n, ai50.a(ai50.a(gpp.a(this.k, dd3.a(this.j, gmf0.a(gmf0.a(f87.a(dd3.a(this.f, dd3.a(this.e, gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), this.g, 31), 31, this.h), 31, this.i), 31), 31), 31, this.l), 31, this.m), 31);
        Integer num = this.o;
        return iA + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimulationTicket(ticketId=", this.a, ", ticketNumber=", this.b, ", betTypeString=");
        hxa.c(sbA, this.c, ", sportId=", this.d, ", totalStake=");
        iib0.b(sbA, this.e, ", totalReturn=", this.f, ", createTimestamp=");
        em5.a(this.g, ", roundId=", this.h, sbA);
        sbA.append(", giftId=");
        sbA.append(this.i);
        sbA.append(", giftAmount=");
        sbA.append(this.j);
        sbA.append(", giftKind=");
        sbA.append(this.k);
        sbA.append(", bets=");
        sbA.append(this.l);
        sbA.append(", events=");
        sbA.append(this.m);
        sbA.append(", withholdingTax=");
        sbA.append(this.n);
        sbA.append(", flexibleMinWinnings=");
        sbA.append(this.o);
        sbA.append(")");
        return sbA.toString();
    }
}
