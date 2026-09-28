package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class u5k0 {
    public final String a;
    public final String b;
    public final String c;

    public u5k0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5k0)) {
            return false;
        }
        u5k0 u5k0Var = (u5k0) obj;
        return this.a.equals(u5k0Var.a) && this.b.equals(u5k0Var.b) && this.c.equals(u5k0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("WorldCupTicketBetDetail(eventId=", this.a, ", marketId=", this.b, ", outcomeId="), this.c, ")");
    }
}
