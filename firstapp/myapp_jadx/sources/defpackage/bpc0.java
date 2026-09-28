package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class bpc0 {
    public final String a;
    public final ddc0 b;
    public final knc0 c;
    public final String d;
    public final knc0 e;
    public final String f;
    public final String g;

    public bpc0(String str, ddc0 ddc0Var, knc0 knc0Var, String str2, knc0 knc0Var2, String str3, String str4) {
        this.a = str;
        this.b = ddc0Var;
        this.c = knc0Var;
        this.d = str2;
        this.e = knc0Var2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpc0)) {
            return false;
        }
        bpc0 bpc0Var = (bpc0) obj;
        return this.a.equals(bpc0Var.a) && this.b.equals(bpc0Var.b) && this.c.equals(bpc0Var.c) && this.d.equals(bpc0Var.d) && this.e.equals(bpc0Var.e) && this.f.equals(bpc0Var.f) && this.g.equals(bpc0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gmf0.a((this.e.hashCode() + gmf0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyLegendsTicketEvent(id=");
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
