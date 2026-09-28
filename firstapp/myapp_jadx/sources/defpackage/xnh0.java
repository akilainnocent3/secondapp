package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class xnh0 {
    public final String a;
    public final String b;

    public xnh0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnh0)) {
            return false;
        }
        xnh0 xnh0Var = (xnh0) obj;
        return this.a.equals(xnh0Var.a) && this.b.equals(xnh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(accessToken=");
        sb.append(this.a);
        sb.append(", uid=");
        return j26.a(sb, this.b, ')');
    }
}
