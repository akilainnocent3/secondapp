package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class ad70 {
    public final String a;
    public final BigDecimal b;
    public final BigDecimal c;
    public final String d;
    public final String e;
    public final boolean f;

    public ad70(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z) {
        this.a = str;
        this.b = bigDecimal;
        this.c = bigDecimal2;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad70)) {
            return false;
        }
        ad70 ad70Var = (ad70) obj;
        return this.a.equals(ad70Var.a) && this.b.equals(ad70Var.b) && this.c.equals(ad70Var.c) && this.d.equals(ad70Var.d) && this.e.equals(ad70Var.e) && this.f == ad70Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + gmf0.a(gmf0.a(dd3.a(this.c, dd3.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "ScheduledFootballOutcome(id=", this.a, ", odds=", ", probability=");
        sbA.append(this.c);
        sbA.append(", description=");
        sbA.append(this.d);
        sbA.append(", mutexLookupKey=");
        return x9d.a(this.e, ", enable=", ")", sbA, this.f);
    }
}
