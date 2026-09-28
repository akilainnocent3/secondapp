package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class z5d0 implements Serializable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public z5d0(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof z5d0)) {
            return false;
        }
        z5d0 z5d0Var = (z5d0) obj;
        return this.a.equals(z5d0Var.a) && this.b.equals(z5d0Var.b) && this.c.equals(z5d0Var.c) && this.d.equals(z5d0Var.d) && this.e.equals(z5d0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyPenaltyTicketMarket(id=", this.a, ", title=", this.b, ", subtitle=");
        hxa.c(sbA, this.c, ", bannerTitles=", this.d, ", oddsTitles=");
        return uf80.a(sbA, this.e, ")");
    }
}
