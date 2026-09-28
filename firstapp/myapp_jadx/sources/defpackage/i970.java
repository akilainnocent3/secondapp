package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class i970 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public i970(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i970)) {
            return false;
        }
        i970 i970Var = (i970) obj;
        return this.a.equals(i970Var.a) && this.b.equals(i970Var.b) && this.c.equals(i970Var.c) && this.d.equals(i970Var.d) && this.e.equals(i970Var.e) && this.f.equals(i970Var.f) && this.g.equals(i970Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballMatchdayResultEvent(eventId=", this.a, ", homeTeamName=", this.b, ", homeTeamLogoUrl=");
        hxa.c(sbA, this.c, ", awayTeamName=", this.d, ", awayTeamLogoUrl=");
        hxa.c(sbA, this.e, ", halfTimeScore=", this.f, ", fullTimeScore=");
        return uf80.a(sbA, this.g, ")");
    }
}
