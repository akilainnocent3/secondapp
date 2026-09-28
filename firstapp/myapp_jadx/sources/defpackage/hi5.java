package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class hi5 {
    public final String a;
    public final lf5 b;
    public final ph5 c;
    public final String d;
    public final ph5 e;
    public final String f;
    public final String g;

    public hi5(String str, lf5 lf5Var, ph5 ph5Var, String str2, ph5 ph5Var2, String str3, String str4) {
        this.a = str;
        this.b = lf5Var;
        this.c = ph5Var;
        this.d = str2;
        this.e = ph5Var2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi5)) {
            return false;
        }
        hi5 hi5Var = (hi5) obj;
        return this.a.equals(hi5Var.a) && this.b.equals(hi5Var.b) && this.c.equals(hi5Var.c) && this.d.equals(hi5Var.d) && this.e.equals(hi5Var.e) && this.f.equals(hi5Var.f) && this.g.equals(hi5Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gmf0.a((this.e.hashCode() + gmf0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildAndGoTicketEvent(id=");
        sb.append(this.a);
        sb.append(", leagueInfo=");
        sb.append(this.b);
        sb.append(", homeTeamInfo=");
        sb.append(this.c);
        sb.append(", homeTeamScore=");
        sb.append(this.d);
        sb.append(", awayTeamInfo=");
        sb.append(this.e);
        sb.append(", awayTeamScore=");
        sb.append(this.f);
        sb.append(", resultSequence=");
        return uf80.a(sb, this.g, ")");
    }
}
