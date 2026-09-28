package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class u7o {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public u7o(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7o)) {
            return false;
        }
        u7o u7oVar = (u7o) obj;
        return this.a == u7oVar.a && this.b.equals(u7oVar.b) && this.c.equals(u7oVar.c) && this.d.equals(u7oVar.d) && this.e.equals(u7oVar.e) && this.f.equals(u7oVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("InstantVirtualShowOffTicketSelection(isBetBuilder=", ", marketTitle=", this.b, ", outcomeDesc=", this.a);
        hxa.c(sbA, this.c, ", outcomeOdds=", this.d, ", homeTeamName=");
        return kwi.a(sbA, this.e, ", awayTeamName=", this.f, ")");
    }
}
