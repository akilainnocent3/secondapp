package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class xk70 {
    public final String a;
    public final sj70 b;
    public final String c;
    public final String d;
    public final String e;

    public xk70(String str, sj70 sj70Var, String str2, String str3, String str4) {
        this.a = str;
        this.b = sj70Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk70)) {
            return false;
        }
        xk70 xk70Var = (xk70) obj;
        return this.a.equals(xk70Var.a) && this.b == xk70Var.b && this.c.equals(xk70Var.c) && this.d.equals(xk70Var.d) && this.e.equals(xk70Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledFootballTicketSelection(id=");
        sb.append(this.a);
        sb.append(", settlementStatus=");
        sb.append(this.b);
        sb.append(", eventId=");
        hxa.c(sb, this.c, ", marketId=", this.d, ", outcomeId=");
        return uf80.a(sb, this.e, ")");
    }
}
