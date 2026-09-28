package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class g070 {
    public final BigDecimal a;
    public final BigDecimal b;
    public final BigDecimal c;

    public g070(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g070)) {
            return false;
        }
        g070 g070Var = (g070) obj;
        return this.a.equals(g070Var.a) && this.b.equals(g070Var.b) && this.c.equals(g070Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dd3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledFootballBetLimitInfo(minStakeLimit=");
        sb.append(this.a);
        sb.append(", maxStakeLimit=");
        sb.append(this.b);
        sb.append(", maxPayoutLimit=");
        return mh2.a(")", sb, this.c);
    }
}
