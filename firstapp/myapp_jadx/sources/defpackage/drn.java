package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class drn {
    public final String a;
    public final String b;

    public drn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drn)) {
            return false;
        }
        drn drnVar = (drn) obj;
        return this.a.equals(drnVar.a) && this.b.equals(drnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("InstantFootballTeamInfo(name=", this.a, ", logoUrl=", this.b, ")");
    }
}
