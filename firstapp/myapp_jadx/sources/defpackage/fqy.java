package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fqy {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;

    public fqy(String str, String str2, String str3, String str4, Long l, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
        this.f = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqy)) {
            return false;
        }
        fqy fqyVar = (fqy) obj;
        return this.a.equals(fqyVar.a) && this.b.equals(fqyVar.b) && this.c.equals(fqyVar.c) && this.d.equals(fqyVar.d) && this.e.equals(fqyVar.e) && this.f.equals(fqyVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("OneCutUiData(oneCutUiTotalOdds=", this.a, ", oneCutUiWhTax=", this.b, ", oneCutUiPotWin=");
        hxa.c(sbA, this.c, ", oneCutUiStillWin=", this.d, ", oneCutPotWin=");
        sbA.append(this.e);
        sbA.append(", oneCutStillWin=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
