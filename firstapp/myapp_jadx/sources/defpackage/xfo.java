package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class xfo {
    public final String a;
    public final String b;
    public final String c;

    public xfo(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfo)) {
            return false;
        }
        xfo xfoVar = (xfo) obj;
        return this.a.equals(xfoVar.a) && this.b.equals(xfoVar.b) && this.c.equals(xfoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("InstantWinLeague(leagueId=", this.a, ", name=", this.b, ", iconUrl="), this.c, ")");
    }
}
