package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class cz2 {
    public final String a;
    public final String b;
    public final String c;
    public final BigDecimal d;
    public final BigDecimal e;

    public cz2(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bigDecimal;
        this.e = bigDecimal2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz2)) {
            return false;
        }
        cz2 cz2Var = (cz2) obj;
        return this.a.equals(cz2Var.a) && this.b.equals(cz2Var.b) && this.c.equals(cz2Var.c) && this.d.equals(cz2Var.d) && this.e.equals(cz2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dd3.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("BetSelection(eventId=", this.a, ", marketId=", this.b, ", outcomeId=");
        sbA.append(this.c);
        sbA.append(", outcomeOdds=");
        sbA.append(this.d);
        sbA.append(", outcomeProbability=");
        return mh2.a(")", sbA, this.e);
    }
}
