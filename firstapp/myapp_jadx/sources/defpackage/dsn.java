package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class dsn {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final boolean e;

    public dsn(String str, BigDecimal bigDecimal, String str2, String str3, boolean z) {
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
        if (!(obj instanceof dsn)) {
            return false;
        }
        dsn dsnVar = (dsn) obj;
        return this.a.equals(dsnVar.a) && this.b.equals(dsnVar.b) && this.c.equals(dsnVar.c) && this.d.equals(dsnVar.d) && this.e == dsnVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + gmf0.a(gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "InstantFootballTicketOutcome(id=", this.a, ", odds=", ", description=");
        hxa.c(sbA, this.c, ", marketId=", this.d, ", hit=");
        return mq0.a(sbA, this.e, ")");
    }
}
