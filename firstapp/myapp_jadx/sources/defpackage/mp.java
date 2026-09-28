package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mp {
    public final String a;
    public final String b;
    public final String c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final long g;
    public final String h;
    public final BigDecimal i;
    public final int j;
    public final int k;
    public final BigDecimal l;
    public final List<oq> m;

    public mp(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, long j, String str4, BigDecimal bigDecimal4, int i, int i2, BigDecimal bigDecimal5, List<oq> list) {
        lp.a(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, list);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bigDecimal;
        this.e = bigDecimal2;
        this.f = bigDecimal3;
        this.g = j;
        this.h = str4;
        this.i = bigDecimal4;
        this.j = i;
        this.k = i2;
        this.l = bigDecimal5;
        this.m = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp)) {
            return false;
        }
        mp mpVar = (mp) obj;
        return this.a.equals(mpVar.a) && this.b.equals(mpVar.b) && this.c.equals(mpVar.c) && Intrinsics.g(this.d, mpVar.d) && Intrinsics.g(this.e, mpVar.e) && Intrinsics.g(this.f, mpVar.f) && this.g == mpVar.g && this.h.equals(mpVar.h) && Intrinsics.g(this.i, mpVar.i) && this.j == mpVar.j && this.k == mpVar.k && this.l.equals(mpVar.l) && Intrinsics.g(this.m, mpVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + dd3.a(this.l, gpp.a(this.k, gpp.a(this.j, dd3.a(this.i, gmf0.a(f87.a(dd3.a(this.f, dd3.a(this.e, dd3.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), this.g, 31), 31, this.h), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("AfricanCupSettleRoundTicket(id=", this.a, ", number=", this.b, ", betTypeString=");
        sbA.append(this.c);
        sbA.append(", totalStake=");
        sbA.append(this.d);
        sbA.append(", totalReturn=");
        iib0.b(sbA, this.e, ", withholdingTax=", this.f, ", createTimestampMillis=");
        em5.a(this.g, ", giftId=", this.h, sbA);
        sbA.append(", giftAmount=");
        sbA.append(this.i);
        sbA.append(", giftKind=");
        sbA.append(this.j);
        sbA.append(", flexibleFitSize=");
        sbA.append(this.k);
        sbA.append(", totalOdds=");
        sbA.append(this.l);
        return ka1.a(sbA, ", bets=", this.m, ")");
    }
}
