package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class oxc0 {
    public final String a;
    public final String b;

    public oxc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxc0)) {
            return false;
        }
        oxc0 oxc0Var = (oxc0) obj;
        return this.a.equals(oxc0Var.a) && this.b.equals(oxc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("SportyPenaltyMarketExpansion(marketCategoryId=", this.a, ", marketType=", this.b, ")");
    }
}
