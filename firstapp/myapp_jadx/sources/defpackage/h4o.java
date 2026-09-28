package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class h4o implements Serializable {
    public final String a;
    public final String b;
    public final String c;

    public h4o(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4o)) {
            return false;
        }
        h4o h4oVar = (h4o) obj;
        return this.a.equals(h4oVar.a) && this.b.equals(h4oVar.b) && this.c.equals(h4oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("InstantRacingTicketBetDetail(eventId=", this.a, ", marketId=", this.b, ", outcomeId="), this.c, ")");
    }
}
