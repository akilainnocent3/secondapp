package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class c5d0 {
    public final int a;
    public final int b;
    public final String c;

    public c5d0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5d0)) {
            return false;
        }
        c5d0 c5d0Var = (c5d0) obj;
        return this.a == c5d0Var.a && this.b == c5d0Var.b && this.c.equals(c5d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return uf80.a(dy5.a("SportyPenaltyStatsMatchRecord(teamScore=", this.a, this.b, ", opponentScore=", ", opponentLogoUrl="), this.c, ")");
    }
}
