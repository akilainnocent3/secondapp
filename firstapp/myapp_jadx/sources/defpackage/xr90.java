package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class xr90 {
    public final String a;
    public final String b;
    public final BigDecimal c;
    public final boolean d;

    public xr90(String str, String str2, BigDecimal bigDecimal, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = bigDecimal;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr90)) {
            return false;
        }
        xr90 xr90Var = (xr90) obj;
        return this.a.equals(xr90Var.a) && this.b.equals(xr90Var.b) && this.c.equals(xr90Var.c) && this.d == xr90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dd3.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimulationTicketDetailOutcome(id=", this.a, ", description=", this.b, ", odds=");
        sbA.append(this.c);
        sbA.append(", hit=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
