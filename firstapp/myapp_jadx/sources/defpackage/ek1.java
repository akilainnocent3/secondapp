package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ek1 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    public ek1(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public static ek1 a(int i, int i2, String str) {
        return new ek1(i, i2, s08.a(i << 3), str);
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ek1)) {
            return false;
        }
        ek1 ek1Var = (ek1) obj;
        return this.a == ek1Var.a && this.b == ek1Var.c() && this.c == ek1Var.d() && this.d.equals(ek1Var.b());
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoFieldInfo{fieldNumber=");
        sb.append(this.a);
        sb.append(", tag=");
        sb.append(this.b);
        sb.append(", tagSize=");
        sb.append(this.c);
        sb.append(", jsonName=");
        return uf80.a(sb, this.d, "}");
    }
}
