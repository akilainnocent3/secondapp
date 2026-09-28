package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
public final class xu1 {
    public static final xu1 c = new xu1(new BigDecimal(0), "--");
    public final String a;
    public final BigDecimal b;

    public xu1(BigDecimal bigDecimal, String str) {
        this.a = str;
        this.b = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu1)) {
            return false;
        }
        xu1 xu1Var = (xu1) obj;
        return this.a.equals(xu1Var.a) && this.b.equals(xu1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BalanceInfoUiState(displayBalance=" + this.a + ", amount=" + this.b + ")";
    }
}
