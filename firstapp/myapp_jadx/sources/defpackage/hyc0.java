package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class hyc0 {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final boolean d;

    public hyc0(String str, String str2, BigDecimal bigDecimal, boolean z) {
        this.a = str;
        this.b = bigDecimal;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyc0)) {
            return false;
        }
        hyc0 hyc0Var = (hyc0) obj;
        return this.a.equals(hyc0Var.a) && this.b.equals(hyc0Var.b) && this.c.equals(hyc0Var.c) && this.d == hyc0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return x9d.a(this.c, ", enable=", ")", yz80.a(this.b, "SportyPenaltyMarketOutcome(id=", this.a, ", odds=", ", description="), this.d);
    }
}
