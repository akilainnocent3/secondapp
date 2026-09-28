package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class vac0 {
    public final BigDecimal a;
    public final BigDecimal b;
    public final BigDecimal c;

    public vac0(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vac0)) {
            return false;
        }
        vac0 vac0Var = (vac0) obj;
        return this.a.equals(vac0Var.a) && this.b.equals(vac0Var.b) && this.c.equals(vac0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dd3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyLegendsBetLimitInfo(minStakeLimit=");
        sb.append(this.a);
        sb.append(", maxStakeLimit=");
        sb.append(this.b);
        sb.append(", maxPayoutLimit=");
        return mh2.a(")", sb, this.c);
    }
}
