package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w3o implements Serializable {
    public final BigDecimal A;
    public final List<g4o> B;
    public final String a;
    public final String b;
    public final String c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final long i;
    public final String v;
    public final BigDecimal w;
    public final int y;
    public final int z;

    public w3o(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, long j, String str4, BigDecimal bigDecimal4, int i, int i2, BigDecimal bigDecimal5, List<g4o> list) {
        lp.a(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, list);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bigDecimal;
        this.e = bigDecimal2;
        this.f = bigDecimal3;
        this.i = j;
        this.v = str4;
        this.w = bigDecimal4;
        this.y = i;
        this.z = i2;
        this.A = bigDecimal5;
        this.B = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3o)) {
            return false;
        }
        w3o w3oVar = (w3o) obj;
        return this.a.equals(w3oVar.a) && this.b.equals(w3oVar.b) && this.c.equals(w3oVar.c) && Intrinsics.g(this.d, w3oVar.d) && Intrinsics.g(this.e, w3oVar.e) && Intrinsics.g(this.f, w3oVar.f) && this.i == w3oVar.i && this.v.equals(w3oVar.v) && Intrinsics.g(this.w, w3oVar.w) && this.y == w3oVar.y && this.z == w3oVar.z && this.A.equals(w3oVar.A) && Intrinsics.g(this.B, w3oVar.B);
    }

    public final int hashCode() {
        return this.B.hashCode() + dd3.a(this.A, gpp.a(this.z, gpp.a(this.y, dd3.a(this.w, gmf0.a(f87.a(dd3.a(this.f, dd3.a(this.e, dd3.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), this.i, 31), 31, this.v), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantRacingSettleRoundTicket(id=", this.a, ", number=", this.b, ", betTypeString=");
        sbA.append(this.c);
        sbA.append(", totalStake=");
        sbA.append(this.d);
        sbA.append(", totalReturn=");
        iib0.b(sbA, this.e, ", withholdingTax=", this.f, ", createTimestampMillis=");
        em5.a(this.i, ", giftId=", this.v, sbA);
        sbA.append(", giftAmount=");
        sbA.append(this.w);
        sbA.append(", giftKind=");
        sbA.append(this.y);
        sbA.append(", flexibleFitSize=");
        sbA.append(this.z);
        sbA.append(", totalOdds=");
        sbA.append(this.A);
        return ka1.a(sbA, ", bets=", this.B, ")");
    }
}
