package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class dk1 {
    public final int a;
    public final String b;

    public dk1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dk1)) {
            return false;
        }
        dk1 dk1Var = (dk1) obj;
        return this.a == dk1Var.a() && this.b.equals(dk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoEnumInfo{enumNumber=");
        sb.append(this.a);
        sb.append(", jsonName=");
        return uf80.a(sb, this.b, "}");
    }
}
