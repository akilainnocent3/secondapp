package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class don {
    public final String a;
    public final String b;

    public don(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof don)) {
            return false;
        }
        don donVar = (don) obj;
        return this.a.equals(donVar.a) && this.b.equals(donVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("InstantBasketballTeamInfo(name=", this.a, ", logoUrl=", this.b, ")");
    }
}
