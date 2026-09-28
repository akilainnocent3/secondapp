package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class m5k0 {
    public final String a;
    public final String b;

    public m5k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5k0)) {
            return false;
        }
        m5k0 m5k0Var = (m5k0) obj;
        return this.a.equals(m5k0Var.a) && this.b.equals(m5k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("WorldCupTeamInfo(name=", this.a, ", logoUrl=", this.b, ")");
    }
}
