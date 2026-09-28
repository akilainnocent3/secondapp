package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class j5c0 {
    public final String a;
    public final String b;
    public final String c;

    public j5c0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5c0)) {
            return false;
        }
        j5c0 j5c0Var = (j5c0) obj;
        return this.a.equals(j5c0Var.a) && this.b.equals(j5c0Var.b) && this.c.equals(j5c0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("SportyHeroSideBetGameLimits(classicMaxPayout=", this.a, ", ouMaxPayout=", this.b, ", rangeMaxPayout="), this.c, ")");
    }
}
