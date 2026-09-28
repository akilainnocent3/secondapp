package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class lf5 {
    public final String a;
    public final String b;

    public lf5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf5)) {
            return false;
        }
        lf5 lf5Var = (lf5) obj;
        return this.a.equals(lf5Var.a) && this.b.equals(lf5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("BuildAndGoLeagueInfo(id=", this.a, ", name=", this.b, ")");
    }
}
