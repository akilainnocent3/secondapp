package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class uon {
    public final String a;
    public final con b;
    public final don c;
    public final String d;
    public final don e;
    public final String f;
    public final String g;

    public uon(String str, con conVar, don donVar, String str2, don donVar2, String str3, String str4) {
        this.a = str;
        this.b = conVar;
        this.c = donVar;
        this.d = str2;
        this.e = donVar2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uon)) {
            return false;
        }
        uon uonVar = (uon) obj;
        return this.a.equals(uonVar.a) && this.b.equals(uonVar.b) && this.c.equals(uonVar.c) && this.d.equals(uonVar.d) && this.e.equals(uonVar.e) && this.f.equals(uonVar.f) && this.g.equals(uonVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gmf0.a((this.e.hashCode() + gmf0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantBasketballTicketEvent(id=");
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
