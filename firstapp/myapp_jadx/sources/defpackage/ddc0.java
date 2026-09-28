package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ddc0 {
    public final String a;
    public final String b;

    public ddc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddc0)) {
            return false;
        }
        ddc0 ddc0Var = (ddc0) obj;
        return this.a.equals(ddc0Var.a) && this.b.equals(ddc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SportyLegendsLeagueInfo(id=", this.a, ", name=", this.b, ")");
    }
}
