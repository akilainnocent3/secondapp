package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class rt90 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;

    public rt90(String str, int i, int i2, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt90)) {
            return false;
        }
        rt90 rt90Var = (rt90) obj;
        return this.a.equals(rt90Var.a) && this.b.equals(rt90Var.b) && this.c == rt90Var.c && this.d.equals(rt90Var.d) && this.e == rt90Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + gmf0.a(gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SingleCashoutRecommendationMarket(id=", this.a, ", specifier=", this.b, ", product=");
        f78.b(this.c, ", desc=", this.d, ", status=", sbA);
        return zk1.a(this.e, ")", sbA);
    }
}
