package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class jp {
    public final String a;
    public final String b;

    public jp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp)) {
            return false;
        }
        jp jpVar = (jp) obj;
        return this.a.equals(jpVar.a) && this.b.equals(jpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("AfricanCupLeagueInfo(id=", this.a, ", name=", this.b, ")");
    }
}
