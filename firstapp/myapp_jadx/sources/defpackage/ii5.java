package defpackage;

import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;

/* JADX INFO: loaded from: classes2.dex */
public final class ii5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ii5(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof ii5)) {
            return false;
        }
        ii5 ii5Var = (ii5) obj;
        return this.a.equals(ii5Var.a) && this.b.equals(ii5Var.b) && this.c.equals(ii5Var.c) && this.d.equals(ii5Var.d) && this.e.equals(ii5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("BuildAndGoTicketMarket(id=", this.a, ", title=", this.b, ", subtitle=");
        hxa.c(sbA, this.c, YAzniTbXHYQ.QAKPbamYrxSU, this.d, ", oddsTitles=");
        return uf80.a(sbA, this.e, ")");
    }
}
