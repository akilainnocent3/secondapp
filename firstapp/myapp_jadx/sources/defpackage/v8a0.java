package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class v8a0 {
    public final String a;
    public final boolean b;

    public v8a0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8a0)) {
            return false;
        }
        v8a0 v8a0Var = (v8a0) obj;
        return this.a.equals(v8a0Var.a) && this.b == v8a0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tzx.a("SocialFollowCategory(username=", this.a, ", isMine=", ")", this.b);
    }
}
