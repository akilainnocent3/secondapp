package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class tq90 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final oq90 e;

    public tq90(String str, String str2, String str3, boolean z, oq90 oq90Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = oq90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq90)) {
            return false;
        }
        tq90 tq90Var = (tq90) obj;
        return this.a.equals(tq90Var.a) && this.b.equals(tq90Var.b) && this.c.equals(tq90Var.c) && this.d == tq90Var.d && this.e == tq90Var.e;
    }

    public final int hashCode() {
        int iA = mtg0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        oq90 oq90Var = this.e;
        return iA + (oq90Var == null ? 0 : oq90Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SimulationTicketBetDetail(eventId=", this.a, ", marketId=", this.b, ", outcomeId=");
        uts.b(this.c, ", hit=", ", settleType=", sbA, this.d);
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
