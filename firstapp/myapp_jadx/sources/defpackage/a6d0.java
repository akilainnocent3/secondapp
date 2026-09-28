package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class a6d0 implements Serializable {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final boolean e;

    public a6d0(String str, BigDecimal bigDecimal, String str2, String str3, boolean z) {
        this.a = str;
        this.b = bigDecimal;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6d0)) {
            return false;
        }
        a6d0 a6d0Var = (a6d0) obj;
        return this.a.equals(a6d0Var.a) && this.b.equals(a6d0Var.b) && this.c.equals(a6d0Var.c) && this.d.equals(a6d0Var.d) && this.e == a6d0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + gmf0.a(gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "SportyPenaltyTicketOutcome(id=", this.a, ", odds=", ", description=");
        hxa.c(sbA, this.c, ", marketId=", this.d, ", hit=");
        return mq0.a(sbA, this.e, ")");
    }
}
