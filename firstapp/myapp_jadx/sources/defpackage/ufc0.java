package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ufc0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public ufc0(String str, String str2, String str3, String str4, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufc0)) {
            return false;
        }
        ufc0 ufc0Var = (ufc0) obj;
        return this.a.equals(ufc0Var.a) && this.b.equals(ufc0Var.b) && this.c.equals(ufc0Var.c) && this.d.equals(ufc0Var.d) && this.e == ufc0Var.e && this.f == ufc0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + gpp.a(this.e, gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyLegendsMatchStats(homeTeamId=", this.a, ", homeTeamName=", this.b, ", awayTeamId=");
        hxa.c(sbA, this.c, ", awayTeamName=", this.d, ", homeScore=");
        return b7f.a(sbA, this.e, ", awayScore=", this.f, ")");
    }
}
