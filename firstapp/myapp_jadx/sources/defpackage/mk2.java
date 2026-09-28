package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class mk2 {
    public final int a;
    public final double b;

    public mk2(int i, double d) {
        this.a = i;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk2)) {
            return false;
        }
        mk2 mk2Var = (mk2) obj;
        return this.a == mk2Var.a && Double.compare(this.b, mk2Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BetChips(imageId=" + this.a + ", amount=" + this.b + ")";
    }
}
