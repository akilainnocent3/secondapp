package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ri10 {
    public final w430.h a;
    public final int b;
    public final String c;

    public ri10(w430.h hVar, int i, String str) {
        this.a = hVar;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri10)) {
            return false;
        }
        ri10 ri10Var = (ri10) obj;
        return this.a == ri10Var.a && this.b == ri10Var.b && this.c.equals(ri10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlatformAnalyticsConfig(promoType=");
        sb.append(this.a);
        sb.append(", analyticsType=");
        sb.append(this.b);
        sb.append(", loyaltyData=");
        return uf80.a(sb, this.c, ")");
    }
}
