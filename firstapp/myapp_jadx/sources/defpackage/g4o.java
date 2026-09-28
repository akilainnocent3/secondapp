package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g4o implements Serializable {
    public final String a;
    public final String b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final boolean i;
    public final List<h4o> v;

    public g4o(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, List list, boolean z) {
        lp.a(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, list);
        this.a = str;
        this.b = str2;
        this.c = bigDecimal;
        this.d = bigDecimal2;
        this.e = bigDecimal3;
        this.f = bigDecimal4;
        this.i = z;
        this.v = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4o)) {
            return false;
        }
        g4o g4oVar = (g4o) obj;
        return this.a.equals(g4oVar.a) && this.b.equals(g4oVar.b) && Intrinsics.g(this.c, g4oVar.c) && Intrinsics.g(this.d, g4oVar.d) && Intrinsics.g(this.e, g4oVar.e) && Intrinsics.g(this.f, g4oVar.f) && this.i == g4oVar.i && Intrinsics.g(this.v, g4oVar.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + mtg0.a(dd3.a(this.f, dd3.a(this.e, dd3.a(this.d, dd3.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantRacingTicketBet(id=", this.a, ", groupId=", this.b, ", stake=");
        iib0.b(sbA, this.c, ", potentialWin=", this.d, ", withholdingTax=");
        iib0.b(sbA, this.e, ", bonus=", this.f, ", hit=");
        sbA.append(this.i);
        sbA.append(", details=");
        sbA.append(this.v);
        sbA.append(")");
        return sbA.toString();
    }
}
