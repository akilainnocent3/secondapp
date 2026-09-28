package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class irn {
    public final String a;
    public final String b;
    public final String c;
    public final jrn d;

    public irn(String str, String str2, String str3, jrn jrnVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jrnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irn)) {
            return false;
        }
        irn irnVar = (irn) obj;
        return this.a.equals(irnVar.a) && this.b.equals(irnVar.b) && this.c.equals(irnVar.c) && this.d == irnVar.d;
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        jrn jrnVar = this.d;
        return iA + (jrnVar == null ? 0 : jrnVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantFootballTicketBetDetail(eventId=", this.a, ", marketId=", this.b, ", outcomeId=");
        sbA.append(this.c);
        sbA.append(", settleType=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
