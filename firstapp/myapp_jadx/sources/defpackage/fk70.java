package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fk70 {
    public final String a;
    public final sj70 b;
    public final String c;
    public final String d;
    public final String e;
    public final BigDecimal f;
    public final BigDecimal g;
    public final BigDecimal h;
    public final long i;
    public final String j;
    public final BigDecimal k;
    public final int l;
    public final BigDecimal m;
    public final List<gk70> n;
    public final List<tk70> o;
    public final List<vk70> p;
    public final List<wk70> q;

    public fk70(String str, sj70 sj70Var, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, long j, String str5, BigDecimal bigDecimal4, int i, BigDecimal bigDecimal5, List<gk70> list, List<tk70> list2, List<vk70> list3, List<wk70> list4) {
        lp.a(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, list);
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = str;
        this.b = sj70Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = bigDecimal;
        this.g = bigDecimal2;
        this.h = bigDecimal3;
        this.i = j;
        this.j = str5;
        this.k = bigDecimal4;
        this.l = i;
        this.m = bigDecimal5;
        this.n = list;
        this.o = list2;
        this.p = list3;
        this.q = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk70)) {
            return false;
        }
        fk70 fk70Var = (fk70) obj;
        return this.a.equals(fk70Var.a) && this.b == fk70Var.b && this.c.equals(fk70Var.c) && this.d.equals(fk70Var.d) && this.e.equals(fk70Var.e) && Intrinsics.g(this.f, fk70Var.f) && Intrinsics.g(this.g, fk70Var.g) && Intrinsics.g(this.h, fk70Var.h) && this.i == fk70Var.i && this.j.equals(fk70Var.j) && Intrinsics.g(this.k, fk70Var.k) && this.l == fk70Var.l && this.m.equals(fk70Var.m) && Intrinsics.g(this.n, fk70Var.n) && Intrinsics.g(this.o, fk70Var.o) && Intrinsics.g(this.p, fk70Var.p) && Intrinsics.g(this.q, fk70Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + ai50.a(ai50.a(ai50.a(dd3.a(this.m, gpp.a(this.l, dd3.a(this.k, gmf0.a(f87.a(dd3.a(this.h, dd3.a(this.g, dd3.a(this.f, gmf0.a(gmf0.a(gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31), 31), this.i, 31), 31, this.j), 31), 31), 31), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledFootballTicket(id=");
        sb.append(this.a);
        sb.append(", settlementStatus=");
        sb.append(this.b);
        sb.append(", number=");
        hxa.c(sb, this.c, ", betTypeString=", this.d, ", sportId=");
        sb.append(this.e);
        sb.append(", totalStake=");
        sb.append(this.f);
        sb.append(", totalReturn=");
        iib0.b(sb, this.g, ", withholdingTax=", this.h, ", createTimestampMillis=");
        em5.a(this.i, ", giftId=", this.j, sb);
        sb.append(", giftAmount=");
        sb.append(this.k);
        sb.append(", giftKind=");
        sb.append(this.l);
        sb.append(", totalOdds=");
        sb.append(this.m);
        sb.append(", bets=");
        sb.append(this.n);
        qjk.a(", events=", ", markets=", sb, this.o, this.p);
        return ka1.a(sb, ", outcomes=", this.q, ")");
    }
}
