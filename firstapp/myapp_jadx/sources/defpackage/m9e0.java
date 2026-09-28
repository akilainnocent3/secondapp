package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class m9e0 {
    public final String a;
    public final String b;

    public m9e0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9e0)) {
            return false;
        }
        m9e0 m9e0Var = (m9e0) obj;
        return this.a.equals(m9e0Var.a) && this.b.equals(m9e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StringData(key=");
        sb.append(this.a);
        sb.append(", value=");
        return j26.a(sb, this.b, ')');
    }
}
