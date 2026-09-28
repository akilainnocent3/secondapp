package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class x4o implements Serializable {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public x4o(String str, BigDecimal bigDecimal, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = bigDecimal;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4o)) {
            return false;
        }
        x4o x4oVar = (x4o) obj;
        return this.a.equals(x4oVar.a) && this.b.equals(x4oVar.b) && this.c.equals(x4oVar.c) && this.d.equals(x4oVar.d) && this.e.equals(x4oVar.e) && this.f == x4oVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + gmf0.a(gmf0.a(gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "InstantRacingTicketOutcome(id=", this.a, ", odds=", ", description=");
        hxa.c(sbA, this.c, ", result=", this.d, ", marketId=");
        return x9d.a(this.e, ", hit=", ")", sbA, this.f);
    }
}
