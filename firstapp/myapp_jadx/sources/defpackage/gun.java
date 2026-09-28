package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class gun {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final boolean e;

    public gun(String str, BigDecimal bigDecimal, String str2, String str3, boolean z) {
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
        if (!(obj instanceof gun)) {
            return false;
        }
        gun gunVar = (gun) obj;
        return this.a.equals(gunVar.a) && this.b.equals(gunVar.b) && this.c.equals(gunVar.c) && this.d.equals(gunVar.d) && this.e == gunVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + gmf0.a(gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "InstantRacingEventMarketOutcome(id=", this.a, ", odds=", ", description=");
        hxa.c(sbA, this.c, ", result=", this.d, ", enable=");
        return mq0.a(sbA, this.e, ")");
    }
}
