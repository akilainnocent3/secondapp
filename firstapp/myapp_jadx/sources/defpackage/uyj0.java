package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class uyj0 {
    public final String a;
    public final String b;

    public uyj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyj0)) {
            return false;
        }
        uyj0 uyj0Var = (uyj0) obj;
        return this.a.equals(uyj0Var.a) && this.b.equals(uyj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("WorldCupLeagueInfo(id=", this.a, ", name=", this.b, ")");
    }
}
