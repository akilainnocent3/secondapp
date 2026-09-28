package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class nr {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final boolean e;

    public nr(String str, BigDecimal bigDecimal, String str2, String str3, boolean z) {
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
        if (!(obj instanceof nr)) {
            return false;
        }
        nr nrVar = (nr) obj;
        return this.a.equals(nrVar.a) && this.b.equals(nrVar.b) && this.c.equals(nrVar.c) && this.d.equals(nrVar.d) && this.e == nrVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + gmf0.a(gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "AfricanCupTicketOutcome(id=", this.a, ", odds=", ", description=");
        hxa.c(sbA, this.c, ", marketId=", this.d, ", hit=");
        return mq0.a(sbA, this.e, ")");
    }
}
