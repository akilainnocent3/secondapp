package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class fci {
    public final String a;
    public final int b;
    public final int c;

    public fci(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fci)) {
            return false;
        }
        fci fciVar = (fci) obj;
        return this.a.equals(fciVar.a) && this.b == fciVar.b && this.c == fciVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return zk1.a(this.c, ")", ml5.a(this.b, "FootballFamilySettlementEventScore(eventId=", this.a, ", homeTeamScore=", ", awayTeamScore="));
    }
}
