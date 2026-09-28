package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class t770 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;

    public t770(int i, String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t770)) {
            return false;
        }
        t770 t770Var = (t770) obj;
        return this.a == t770Var.a && this.b.equals(t770Var.b) && this.c.equals(t770Var.c) && this.d.equals(t770Var.d) && this.e == t770Var.e && this.f == t770Var.f && this.g == t770Var.g && this.h == t770Var.h && this.i == t770Var.i && this.j.equals(t770Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + gpp.a(this.i, gpp.a(this.h, gpp.a(this.g, gpp.a(this.f, gpp.a(this.e, gmf0.a(gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "ScheduledFootballLeagueStatsTeamInfo(position=", ", teamId=", this.b, ", teamName=");
        hxa.c(sbA, this.c, ", teamLogo=", this.d, ", played=");
        d5d.a(sbA, this.e, ", won=", this.f, ", drawn=");
        d5d.a(sbA, this.g, ", lost=", this.h, ", pts=");
        sbA.append(this.i);
        sbA.append(", trend=");
        sbA.append(this.j);
        sbA.append(")");
        return sbA.toString();
    }
}
