package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class hqn {
    public final String a;
    public final String b;

    public hqn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqn)) {
            return false;
        }
        hqn hqnVar = (hqn) obj;
        return this.a.equals(hqnVar.a) && this.b.equals(hqnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("InstantFootballLeagueInfo(id=", this.a, ", name=", this.b, ")");
    }
}
