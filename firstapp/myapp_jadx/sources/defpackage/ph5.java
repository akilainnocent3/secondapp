package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ph5 {
    public final String a;
    public final String b;

    public ph5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph5)) {
            return false;
        }
        ph5 ph5Var = (ph5) obj;
        return this.a.equals(ph5Var.a) && this.b.equals(ph5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("BuildAndGoTeamInfo(name=", this.a, ", logoUrl=", this.b, ")");
    }
}
