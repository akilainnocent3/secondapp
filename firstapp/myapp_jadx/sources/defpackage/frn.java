package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class frn {
    public final String a;
    public final String b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final boolean g;
    public final List<irn> h;

    public frn(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, List list, boolean z) {
        lp.a(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, list);
        this.a = str;
        this.b = str2;
        this.c = bigDecimal;
        this.d = bigDecimal2;
        this.e = bigDecimal3;
        this.f = bigDecimal4;
        this.g = z;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frn)) {
            return false;
        }
        frn frnVar = (frn) obj;
        return this.a.equals(frnVar.a) && this.b.equals(frnVar.b) && Intrinsics.g(this.c, frnVar.c) && Intrinsics.g(this.d, frnVar.d) && Intrinsics.g(this.e, frnVar.e) && Intrinsics.g(this.f, frnVar.f) && this.g == frnVar.g && Intrinsics.g(this.h, frnVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + mtg0.a(dd3.a(this.f, dd3.a(this.e, dd3.a(this.d, dd3.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantFootballTicketBet(id=", this.a, ", groupId=", this.b, ", stake=");
        iib0.b(sbA, this.c, ", potentialWin=", this.d, ", withholdingTax=");
        iib0.b(sbA, this.e, ", bonus=", this.f, ", hit=");
        sbA.append(this.g);
        sbA.append(", details=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
