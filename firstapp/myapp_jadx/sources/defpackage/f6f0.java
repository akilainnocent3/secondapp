package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class f6f0 {
    public final String a;
    public final String b;

    public f6f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6f0)) {
            return false;
        }
        f6f0 f6f0Var = (f6f0) obj;
        return this.a.equals(f6f0Var.a) && this.b.equals(f6f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("TeamDetail(name=", this.a, ", logoUrl=", this.b, ")");
    }
}
