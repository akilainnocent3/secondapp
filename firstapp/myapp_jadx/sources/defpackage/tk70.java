package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class tk70 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;

    public tk70(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = i;
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk70)) {
            return false;
        }
        tk70 tk70Var = (tk70) obj;
        return this.a.equals(tk70Var.a) && this.b.equals(tk70Var.b) && this.c.equals(tk70Var.c) && this.d.equals(tk70Var.d) && this.e.equals(tk70Var.e) && this.f.equals(tk70Var.f) && this.g.equals(tk70Var.g) && this.h.equals(tk70Var.h) && this.i.equals(tk70Var.i) && this.j.equals(tk70Var.j) && this.k == tk70Var.k && this.l == tk70Var.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + gpp.a(this.k, gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballTicketEvent(id=", this.a, ", leagueId=", this.b, ", leagueName=");
        hxa.c(sbA, this.c, ", homeTeamName=", this.d, ", homeTeamLogo=");
        hxa.c(sbA, this.e, ", homeTeamScore=", this.f, ", awayTeamName=");
        hxa.c(sbA, this.g, ", awayTeamLogo=", this.h, ", awayTeamScore=");
        hxa.c(sbA, this.i, ", resultSequence=", this.j, ", season=");
        return b7f.a(sbA, this.k, ", matchday=", this.l, ")");
    }
}
