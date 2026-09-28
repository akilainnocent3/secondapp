package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class zn90 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public zn90(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn90)) {
            return false;
        }
        zn90 zn90Var = (zn90) obj;
        return this.a.equals(zn90Var.a) && this.b.equals(zn90Var.b) && this.c == zn90Var.c && this.d == zn90Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return b7f.a(ux5.a("SimulationSettlementEventScore(ticketId=", this.a, ", eventId=", this.b, ", homeTeamScore="), this.c, ", awayTeamScore=", this.d, ")");
    }
}
