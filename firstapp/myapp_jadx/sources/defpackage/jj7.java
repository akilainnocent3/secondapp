package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class jj7 {
    public final boolean a;
    public final String b;
    public final String c;

    public jj7(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj7)) {
            return false;
        }
        jj7 jj7Var = (jj7) obj;
        return this.a == jj7Var.a && this.b.equals(jj7Var.b) && this.c.equals(jj7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(t160.a("CheckUseGiftStakeEqualPayResult(isEqual=", ", pay=", this.b, ", stake=", this.a), this.c, ")");
    }
}
