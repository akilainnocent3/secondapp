package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gon {
    public final String a;
    public final String b;
    public final String c;

    public gon(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gon)) {
            return false;
        }
        gon gonVar = (gon) obj;
        return this.a.equals(gonVar.a) && this.b.equals(gonVar.b) && this.c.equals(gonVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("InstantBasketballTicketBetDetail(eventId=", this.a, ", marketId=", this.b, ", outcomeId="), this.c, ")");
    }
}
