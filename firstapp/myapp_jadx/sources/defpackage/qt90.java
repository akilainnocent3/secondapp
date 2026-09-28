package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class qt90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final long j;

    public qt90(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt90)) {
            return false;
        }
        qt90 qt90Var = (qt90) obj;
        return this.a.equals(qt90Var.a) && this.b.equals(qt90Var.b) && this.c.equals(qt90Var.c) && this.d.equals(qt90Var.d) && this.e.equals(qt90Var.e) && this.f.equals(qt90Var.f) && this.g.equals(qt90Var.g) && this.h.equals(qt90Var.h) && this.i == qt90Var.i && this.j == qt90Var.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + gpp.a(this.i, gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SingleCashoutRecommendationEvent(eventId=", this.a, ", sportId=", this.b, ", categoryId=");
        hxa.c(sbA, this.c, ", tournamentId=", this.d, ", tournamentName=");
        hxa.c(sbA, this.e, ", homeTeamName=", this.f, ", awayTeamName=");
        hxa.c(sbA, this.g, ", matchStatus=", this.h, ", status=");
        sbA.append(this.i);
        sbA.append(", estimateStartTime=");
        sbA.append(this.j);
        sbA.append(")");
        return sbA.toString();
    }
}
