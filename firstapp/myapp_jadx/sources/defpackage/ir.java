package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ir {
    public final String a;
    public final jp b;
    public final mq c;
    public final String d;
    public final mq e;
    public final String f;
    public final String g;

    public ir(String str, jp jpVar, mq mqVar, String str2, mq mqVar2, String str3, String str4) {
        this.a = str;
        this.b = jpVar;
        this.c = mqVar;
        this.d = str2;
        this.e = mqVar2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir)) {
            return false;
        }
        ir irVar = (ir) obj;
        return this.a.equals(irVar.a) && this.b.equals(irVar.b) && this.c.equals(irVar.c) && this.d.equals(irVar.d) && this.e.equals(irVar.e) && this.f.equals(irVar.f) && this.g.equals(irVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + gmf0.a((this.e.hashCode() + gmf0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AfricanCupTicketEvent(id=");
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
