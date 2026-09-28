package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class asn {
    public final String a;
    public final hqn b;
    public final drn c;
    public final String d;
    public final drn e;
    public final String f;
    public final String g;

    public asn(String str, hqn hqnVar, drn drnVar, String str2, drn drnVar2, String str3, String str4) {
        this.a = str;
        this.b = hqnVar;
        this.c = drnVar;
        this.d = str2;
        this.e = drnVar2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asn)) {
            return false;
        }
        asn asnVar = (asn) obj;
        return this.a.equals(asnVar.a) && this.b.equals(asnVar.b) && this.c.equals(asnVar.c) && this.d.equals(asnVar.d) && this.e.equals(asnVar.e) && this.f.equals(asnVar.f) && this.g.equals(asnVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gmf0.a((this.e.hashCode() + gmf0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantFootballTicketEvent(id=");
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
