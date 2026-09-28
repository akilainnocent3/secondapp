package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yk70 {
    public final String a;
    public final sj70 b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;
    public final List<xk70> g;

    public yk70(String str, sj70 sj70Var, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, List<xk70> list) {
        lp.a(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, list);
        this.a = str;
        this.b = sj70Var;
        this.c = bigDecimal;
        this.d = bigDecimal2;
        this.e = bigDecimal3;
        this.f = bigDecimal4;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk70)) {
            return false;
        }
        yk70 yk70Var = (yk70) obj;
        return this.a.equals(yk70Var.a) && this.b == yk70Var.b && Intrinsics.g(this.c, yk70Var.c) && Intrinsics.g(this.d, yk70Var.d) && Intrinsics.g(this.e, yk70Var.e) && Intrinsics.g(this.f, yk70Var.f) && Intrinsics.g(this.g, yk70Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dd3.a(this.f, dd3.a(this.e, dd3.a(this.d, dd3.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledFootballTicketSubBet(id=");
        sb.append(this.a);
        sb.append(", settlementStatus=");
        sb.append(this.b);
        sb.append(", stake=");
        iib0.b(sb, this.c, ", potentialWin=", this.d, ", withholdingTax=");
        iib0.b(sb, this.e, ", bonus=", this.f, ", selections=");
        return ng1.a(sb, this.g, ")");
    }
}
