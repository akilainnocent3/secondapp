package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class w4o implements Serializable {
    public final String a;
    public final jzn b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public w4o(String str, jzn jznVar, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = jznVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4o)) {
            return false;
        }
        w4o w4oVar = (w4o) obj;
        return this.a.equals(w4oVar.a) && this.b == w4oVar.b && this.c.equals(w4oVar.c) && this.d.equals(w4oVar.d) && this.e.equals(w4oVar.e) && this.f.equals(w4oVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantRacingTicketMarket(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", title=");
        hxa.c(sb, this.c, ", subtitle=", this.d, ", bannerTitles=");
        return kwi.a(sb, this.e, ", oddsTitles=", this.f, ")");
    }
}
