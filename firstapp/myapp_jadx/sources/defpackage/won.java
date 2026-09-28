package defpackage;

import com.sportybet.android.account.Qr.QQWMbKFOuTf;

/* JADX INFO: loaded from: classes2.dex */
public final class won {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public won(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof won)) {
            return false;
        }
        won wonVar = (won) obj;
        return this.a.equals(wonVar.a) && this.b.equals(wonVar.b) && this.c.equals(wonVar.c) && this.d.equals(wonVar.d) && this.e.equals(wonVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantBasketballTicketMarket(id=", this.a, ", title=", this.b, QQWMbKFOuTf.sgEo);
        hxa.c(sbA, this.c, ", bannerTitles=", this.d, ", oddsTitles=");
        return uf80.a(sbA, this.e, ")");
    }
}
