package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ea70 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final int j;

    public ea70(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = j;
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea70)) {
            return false;
        }
        ea70 ea70Var = (ea70) obj;
        return this.a.equals(ea70Var.a) && this.b.equals(ea70Var.b) && this.c.equals(ea70Var.c) && this.d.equals(ea70Var.d) && this.e.equals(ea70Var.e) && this.f.equals(ea70Var.f) && this.g.equals(ea70Var.g) && this.h.equals(ea70Var.h) && this.i == ea70Var.i && this.j == ea70Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + f87.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), this.i, 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballOpenBetEvent(id=", this.a, ", leagueId=", this.b, ", leagueUrl=");
        hxa.c(sbA, this.c, ", leagueName=", this.d, ", homeTeamName=");
        hxa.c(sbA, this.e, ", homeTeamLogo=", this.f, ", awayTeamName=");
        hxa.c(sbA, this.g, ", awayTeamLogo=", this.h, ", kickOffTimestampMillis=");
        to10.a(sbA, this.i, ", matchday=", this.j);
        sbA.append(")");
        return sbA.toString();
    }
}
