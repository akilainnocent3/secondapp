package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class vsn {
    public final BigDecimal a;
    public final BigDecimal b;
    public final BigDecimal c;

    public vsn(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsn)) {
            return false;
        }
        vsn vsnVar = (vsn) obj;
        return this.a.equals(vsnVar.a) && this.b.equals(vsnVar.b) && this.c.equals(vsnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dd3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantRacingBetLimitInfo(minStakeLimit=");
        sb.append(this.a);
        sb.append(", maxStakeLimit=");
        sb.append(this.b);
        sb.append(", maxPayoutLimit=");
        return mh2.a(")", sb, this.c);
    }
}
