package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class st90 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public st90(String str, String str2, String str3, int i, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st90)) {
            return false;
        }
        st90 st90Var = (st90) obj;
        return this.a.equals(st90Var.a) && this.b.equals(st90Var.b) && this.c.equals(st90Var.c) && this.d == st90Var.d && this.e.equals(st90Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gpp.a(this.d, gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SingleCashoutRecommendationOutcome(id=", this.a, ", odds=", this.b, ", probability=");
        wxa.b(this.d, this.c, ", isActive=", ", desc=", sbA);
        return uf80.a(sbA, this.e, ")");
    }
}
