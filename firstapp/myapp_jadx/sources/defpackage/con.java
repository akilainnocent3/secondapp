package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class con {
    public final String a;
    public final String b;

    public con(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof con)) {
            return false;
        }
        con conVar = (con) obj;
        return this.a.equals(conVar.a) && this.b.equals(conVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("InstantBasketballLeagueInfo(id=", this.a, ", name=", this.b, ")");
    }
}
