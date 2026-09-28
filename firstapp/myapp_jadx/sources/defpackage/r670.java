package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class r670 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public r670(String str, String str2, String str3, int i, String str4, String str5, String str6, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r670)) {
            return false;
        }
        r670 r670Var = (r670) obj;
        return this.a.equals(r670Var.a) && this.b.equals(r670Var.b) && this.c.equals(r670Var.c) && this.d == r670Var.d && this.e.equals(r670Var.e) && this.f.equals(r670Var.f) && this.g.equals(r670Var.g) && this.h == r670Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + gmf0.a(gmf0.a(gmf0.a(gpp.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballHeadToHeadStatsMatchRecord(homeTeamId=", this.a, ", homeTeamName=", this.b, ", homeTeamLogoUrl=");
        wxa.b(this.d, this.c, ", homeTeamScore=", ", awayTeamId=", sbA);
        hxa.c(sbA, this.e, ", awayTeamName=", this.f, ", awayTeamLogoUrl=");
        return ijg0.a(this.h, this.g, ", awayTeamScore=", ")", sbA);
    }
}
