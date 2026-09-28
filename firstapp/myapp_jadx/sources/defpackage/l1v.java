package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class l1v {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public l1v(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1v)) {
            return false;
        }
        l1v l1vVar = (l1v) obj;
        return this.a.equals(l1vVar.a) && this.b.equals(l1vVar.b) && this.c.equals(l1vVar.c) && this.d.equals(l1vVar.d) && this.e.equals(l1vVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("MatchEventDetailEventSwitcherEventState(eventId=", this.a, ", homeTeamLogoUrl=", this.b, ", awayTeamLogoUrl=");
        hxa.c(sbA, this.c, ", homeTeamName=", this.d, ", awayTeamName=");
        return uf80.a(sbA, this.e, ")");
    }
}
