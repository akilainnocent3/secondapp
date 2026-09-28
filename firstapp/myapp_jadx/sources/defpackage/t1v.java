package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class t1v {
    public final String a;
    public final String b;
    public final boolean c;

    public t1v(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1v)) {
            return false;
        }
        t1v t1vVar = (t1v) obj;
        return this.a.equals(t1vVar.a) && this.b.equals(t1vVar.b) && this.c == t1vVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(ux5.a("MatchEventDetailEventSwitcherLeagueTabState(leagueId=", this.a, ", leagueNameText=", this.b, ", isSelected="), this.c, ")");
    }
}
