package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class gs3 {
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
    public final String k;
    public final String l;
    public final String m;

    public gs3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
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
        this.k = str11;
        this.l = str12;
        this.m = str13;
    }

    public final String a() {
        return tx5.a(this.a, "-", this.g, "-", this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs3)) {
            return false;
        }
        gs3 gs3Var = (gs3) obj;
        return this.a.equals(gs3Var.a) && this.b.equals(gs3Var.b) && this.c.equals(gs3Var.c) && this.d.equals(gs3Var.d) && this.e.equals(gs3Var.e) && this.f.equals(gs3Var.f) && this.g.equals(gs3Var.g) && this.h.equals(gs3Var.h) && this.i.equals(gs3Var.i) && this.j.equals(gs3Var.j) && this.k.equals(gs3Var.k) && this.l.equals(gs3Var.l) && this.m.equals(gs3Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("BetslipRecommendationItem(eventId=", this.a, ", leagueId=", this.b, ", homeTeamName=");
        hxa.c(sbA, this.c, ", homeTeamLogo=", this.d, ", awayTeamName=");
        hxa.c(sbA, this.e, ", awayTeamLogo=", this.f, ", marketId=");
        hxa.c(sbA, this.g, ", marketTitle=", this.h, ", outcomeId=");
        hxa.c(sbA, this.i, ", outcomeDesc=", this.j, ", odds=");
        hxa.c(sbA, this.k, ", probability=", this.l, ", outcomeContext=");
        return uf80.a(sbA, this.m, ")");
    }
}
