package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class y4o implements Serializable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public y4o(int i, int i2, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4o)) {
            return false;
        }
        y4o y4oVar = (y4o) obj;
        return this.a == y4oVar.a && this.b == y4oVar.b && this.c.equals(y4oVar.c) && this.d.equals(y4oVar.d) && this.e.equals(y4oVar.e) && this.f.equals(y4oVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("InstantRacingTicketRacer(id=", this.a, this.b, ", number=", ", name=");
        hxa.c(sbA, this.c, ", url=", this.d, ", numberCapeUrl=");
        return kwi.a(sbA, this.e, ", numberUrl=", this.f, ")");
    }
}
