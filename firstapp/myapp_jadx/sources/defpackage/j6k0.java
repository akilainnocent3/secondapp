package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class j6k0 {
    public final String a;
    public final uyj0 b;
    public final m5k0 c;
    public final String d;
    public final m5k0 e;
    public final String f;
    public final String g;

    public j6k0(String str, uyj0 uyj0Var, m5k0 m5k0Var, String str2, m5k0 m5k0Var2, String str3, String str4) {
        this.a = str;
        this.b = uyj0Var;
        this.c = m5k0Var;
        this.d = str2;
        this.e = m5k0Var2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6k0)) {
            return false;
        }
        j6k0 j6k0Var = (j6k0) obj;
        return this.a.equals(j6k0Var.a) && this.b.equals(j6k0Var.b) && this.c.equals(j6k0Var.c) && this.d.equals(j6k0Var.d) && this.e.equals(j6k0Var.e) && this.f.equals(j6k0Var.f) && this.g.equals(j6k0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gmf0.a((this.e.hashCode() + gmf0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorldCupTicketEvent(id=");
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
