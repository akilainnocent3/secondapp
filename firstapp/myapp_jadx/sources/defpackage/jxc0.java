package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class jxc0 {
    public final String a;
    public final String b;

    public jxc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxc0)) {
            return false;
        }
        jxc0 jxc0Var = (jxc0) obj;
        return this.a.equals(jxc0Var.a) && this.b.equals(jxc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SportyPenaltyMarketCategoryTabState(id=", this.a, ", name=", this.b, ")");
    }
}
