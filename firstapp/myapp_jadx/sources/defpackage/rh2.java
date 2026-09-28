package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class rh2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public rh2(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh2)) {
            return false;
        }
        rh2 rh2Var = (rh2) obj;
        return this.a.equals(rh2Var.a) && this.b.equals(rh2Var.b) && this.c.equals(rh2Var.c) && this.d.equals(rh2Var.d) && this.e.equals(rh2Var.e) && this.f.equals(rh2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("BetBuilderSelectionItem(marketId=", this.a, ", outcomeId=", this.b, ", lookupKey=");
        hxa.c(sbA, this.c, ", marketTitle=", this.d, ", outcomeDesc=");
        return kwi.a(sbA, this.e, ", odds=", this.f, ")");
    }
}
