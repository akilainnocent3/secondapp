package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class y7a0 {
    public final String a;
    public final boolean b;

    public y7a0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7a0)) {
            return false;
        }
        y7a0 y7a0Var = (y7a0) obj;
        return this.a.equals(y7a0Var.a) && this.b == y7a0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tzx.a("SocialCodeCategory(username=", this.a, ", isMine=", ")", this.b);
    }
}
