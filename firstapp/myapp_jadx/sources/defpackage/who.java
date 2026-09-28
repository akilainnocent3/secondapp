package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class who {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final boolean e;
    public final BigDecimal f;

    public who(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z) {
        this.a = str;
        this.b = bigDecimal;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = bigDecimal2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof who)) {
            return false;
        }
        who whoVar = (who) obj;
        return this.a.equals(whoVar.a) && this.b.equals(whoVar.b) && this.c.equals(whoVar.c) && this.d.equals(whoVar.d) && this.e == whoVar.e && this.f.equals(whoVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + mtg0.a(gmf0.a(gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "InstantWinOutcome(outcomeId=", this.a, ", odds=", ", description=");
        hxa.c(sbA, this.c, ", mutexLookupKey=", this.d, ", enabled=");
        sbA.append(this.e);
        sbA.append(", probability=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
