package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
public final class ltz {
    public static final BigDecimal c;
    public static final BigDecimal d;
    public final BigDecimal a;
    public final BigDecimal b;

    static {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0.0d);
        bigDecimalValueOf.getClass();
        c = bigDecimalValueOf;
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(50L);
        bigDecimalValueOf2.getClass();
        d = bigDecimalValueOf2;
    }

    public ltz(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltz)) {
            return false;
        }
        ltz ltzVar = (ltz) obj;
        return this.a.equals(ltzVar.a) && this.b.equals(ltzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PartnerWithdrawFeeConfig(rate=" + this.a + ", maxAmount=" + this.b + ")";
    }
}
