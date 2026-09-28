package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class n2v {
    public static final n2v f = new n2v("", "", "", "", false);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public n2v(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2v)) {
            return false;
        }
        n2v n2vVar = (n2v) obj;
        return this.a.equals(n2vVar.a) && this.b.equals(n2vVar.b) && this.c.equals(n2vVar.c) && this.d.equals(n2vVar.d) && this.e == n2vVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("MatchEventDetailTeamInfoHeaderState(homeTeamName=", this.a, ", homeTeamLogoUrl=", this.b, ", awayTeamName=");
        hxa.c(sbA, this.c, ", awayTeamLogoUrl=", this.d, ", shouldShowTooltip=");
        return mq0.a(sbA, this.e, ")");
    }
}
