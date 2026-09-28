package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class noc0 {
    public final String a;
    public final String b;
    public final String c;

    public noc0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noc0)) {
            return false;
        }
        noc0 noc0Var = (noc0) obj;
        return this.a.equals(noc0Var.a) && this.b.equals(noc0Var.b) && this.c.equals(noc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("SportyLegendsTicketBetDetail(eventId=", this.a, ", marketId=", this.b, ", outcomeId="), this.c, ")");
    }
}
