package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class xon {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final boolean e;

    public xon(String str, BigDecimal bigDecimal, String str2, String str3, boolean z) {
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
        if (!(obj instanceof xon)) {
            return false;
        }
        xon xonVar = (xon) obj;
        return this.a.equals(xonVar.a) && this.b.equals(xonVar.b) && this.c.equals(xonVar.c) && this.d.equals(xonVar.d) && this.e == xonVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + gmf0.a(gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "InstantBasketballTicketOutcome(id=", this.a, ", odds=", ", description=");
        hxa.c(sbA, this.c, ", marketId=", this.d, ", hit=");
        return mq0.a(sbA, this.e, ")");
    }
}
