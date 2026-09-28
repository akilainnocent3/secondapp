package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class l6k0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public l6k0(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof l6k0)) {
            return false;
        }
        l6k0 l6k0Var = (l6k0) obj;
        return this.a.equals(l6k0Var.a) && this.b.equals(l6k0Var.b) && this.c.equals(l6k0Var.c) && this.d.equals(l6k0Var.d) && this.e.equals(l6k0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("WorldCupTicketMarket(id=", this.a, ", title=", this.b, ", subtitle=");
        hxa.c(sbA, this.c, ", bannerTitles=", this.d, ", oddsTitles=");
        return uf80.a(sbA, this.e, ")");
    }
}
