package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class csn {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public csn(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof csn)) {
            return false;
        }
        csn csnVar = (csn) obj;
        return this.a.equals(csnVar.a) && this.b.equals(csnVar.b) && this.c.equals(csnVar.c) && this.d.equals(csnVar.d) && this.e.equals(csnVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantFootballTicketMarket(id=", this.a, ", title=", this.b, ", subtitle=");
        hxa.c(sbA, this.c, ", bannerTitles=", this.d, ", oddsTitles=");
        return uf80.a(sbA, this.e, ")");
    }
}
