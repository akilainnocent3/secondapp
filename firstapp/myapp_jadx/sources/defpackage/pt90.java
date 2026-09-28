package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class pt90 {
    public final qt90 a;
    public final rt90 b;
    public final st90 c;

    public pt90(qt90 qt90Var, rt90 rt90Var, st90 st90Var) {
        this.a = qt90Var;
        this.b = rt90Var;
        this.c = st90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt90)) {
            return false;
        }
        pt90 pt90Var = (pt90) obj;
        return this.a.equals(pt90Var.a) && this.b.equals(pt90Var.b) && this.c.equals(pt90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SingleCashoutRecommendation(event=" + this.a + ", market=" + this.b + ", outcome=" + this.c + ")";
    }
}
