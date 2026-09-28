package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class dpc0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public dpc0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpc0)) {
            return false;
        }
        dpc0 dpc0Var = (dpc0) obj;
        return this.a.equals(dpc0Var.a) && this.b.equals(dpc0Var.b) && this.c.equals(dpc0Var.c) && this.d.equals(dpc0Var.d) && this.e.equals(dpc0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyLegendsTicketMarket(id=", this.a, ", title=", this.b, ", subtitle=");
        hxa.c(sbA, this.c, ", bannerTitles=", this.d, ", oddsTitles=");
        return uf80.a(sbA, this.e, ")");
    }
}
