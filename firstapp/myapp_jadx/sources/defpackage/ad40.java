package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class ad40 {
    public static final ad40 d = new ad40(false, 0, false);
    public final boolean a;
    public final int b;
    public final boolean c;

    public ad40(boolean z, int i, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad40)) {
            return false;
        }
        ad40 ad40Var = (ad40) obj;
        return this.a == ad40Var.a && this.b == ad40Var.b && this.c == ad40Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gpp.a(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return mq0.a(zug0.a("RecapConfig(recapEnabled=", ", latestRecapYear=", ", showNewBadge=", this.b, this.a), this.c, ")");
    }
}
