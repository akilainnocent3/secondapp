package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class xs90 {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final boolean d;

    public xs90(String str, String str2, BigDecimal bigDecimal, boolean z) {
        this.a = str;
        this.b = bigDecimal;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs90)) {
            return false;
        }
        xs90 xs90Var = (xs90) obj;
        return this.a.equals(xs90Var.a) && this.b.equals(xs90Var.b) && this.c.equals(xs90Var.c) && this.d == xs90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return x9d.a(this.c, ", hit=", ")", yz80.a(this.b, "SimulationTicketOutcome(id=", this.a, ", odds=", ", description="), this.d);
    }
}
