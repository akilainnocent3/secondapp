package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t1d0 implements Serializable {
    public final String a;
    public final String b;
    public final BigDecimal c;
    public final BigDecimal d;
    public final List<o5d0> e;

    public t1d0(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, List<o5d0> list) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = bigDecimal;
        this.d = bigDecimal2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1d0)) {
            return false;
        }
        t1d0 t1d0Var = (t1d0) obj;
        return this.a.equals(t1d0Var.a) && this.b.equals(t1d0Var.b) && Intrinsics.g(this.c, t1d0Var.c) && Intrinsics.g(this.d, t1d0Var.d) && Intrinsics.g(this.e, t1d0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dd3.a(this.d, dd3.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyPenaltySettleRoundTicket(id=", this.a, ", betTypeString=", this.b, ", totalReturn=");
        iib0.b(sbA, this.c, ", withholdingTax=", this.d, ", bets=");
        return ng1.a(sbA, this.e, ")");
    }
}
