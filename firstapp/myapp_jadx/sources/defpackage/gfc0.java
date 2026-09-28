package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class gfc0 {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public gfc0(String str, BigDecimal bigDecimal, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = bigDecimal;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfc0)) {
            return false;
        }
        gfc0 gfc0Var = (gfc0) obj;
        return this.a.equals(gfc0Var.a) && this.b.equals(gfc0Var.b) && this.c.equals(gfc0Var.c) && this.d.equals(gfc0Var.d) && this.e == gfc0Var.e && this.f == gfc0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + mtg0.a(gmf0.a(gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "SportyLegendsMarketOutcome(id=", this.a, ", odds=", ", description=");
        hxa.c(sbA, this.c, ", lookupKey=", this.d, ", enable=");
        return lng.a(", focused=", ")", sbA, this.e, this.f);
    }
}
