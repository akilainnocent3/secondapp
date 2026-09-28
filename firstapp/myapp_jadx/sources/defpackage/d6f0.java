package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class d6f0 {
    public final String a;
    public final String b;

    public d6f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6f0)) {
            return false;
        }
        d6f0 d6f0Var = (d6f0) obj;
        return this.a.equals(d6f0Var.a) && this.b.equals(d6f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("TeamBasicInfo(name=", this.a, ", logoUrl=", this.b, ")");
    }
}
