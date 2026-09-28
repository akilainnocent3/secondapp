package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class hvc0 {
    public final BigDecimal a;
    public final BigDecimal b;
    public final BigDecimal c;

    public hvc0(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvc0)) {
            return false;
        }
        hvc0 hvc0Var = (hvc0) obj;
        return this.a.equals(hvc0Var.a) && this.b.equals(hvc0Var.b) && this.c.equals(hvc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dd3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyPenaltyBetLimitInfo(minStakeLimit=");
        sb.append(this.a);
        sb.append(", maxStakeLimit=");
        sb.append(this.b);
        sb.append(", maxPayoutLimit=");
        return mh2.a(")", sb, this.c);
    }
}
