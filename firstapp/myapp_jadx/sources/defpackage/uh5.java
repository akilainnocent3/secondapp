package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uh5 {
    public final String a;
    public final String b;
    public final String c;

    public uh5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh5)) {
            return false;
        }
        uh5 uh5Var = (uh5) obj;
        return this.a.equals(uh5Var.a) && this.b.equals(uh5Var.b) && this.c.equals(uh5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("BuildAndGoTicketBetDetail(eventId=", this.a, ", marketId=", this.b, ", outcomeId="), this.c, ")");
    }
}
