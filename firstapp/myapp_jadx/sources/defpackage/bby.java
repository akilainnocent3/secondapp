package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class bby {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public bby(String str, String str2, String str3, String str4, String str5, String str6) {
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
        if (!(obj instanceof bby)) {
            return false;
        }
        bby bbyVar = (bby) obj;
        return this.a.equals(bbyVar.a) && this.b.equals(bbyVar.b) && this.c.equals(bbyVar.c) && this.d.equals(bbyVar.d) && this.e.equals(bbyVar.e) && this.f.equals(bbyVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("OUEarlyPayoutMarketData(sourceMarketId=", this.a, ", sourceSpecifier=", this.b, ", mappedMarketId=");
        hxa.c(sbA, this.c, ", mappedSpecifier=", this.d, ", marketName=");
        return kwi.a(sbA, this.e, ", marketDescription=", this.f, ")");
    }
}
