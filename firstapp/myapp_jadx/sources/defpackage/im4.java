package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class im4 {
    public final int a;
    public final int b;

    public im4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im4)) {
            return false;
        }
        im4 im4Var = (im4) obj;
        return this.a == im4Var.a && this.b == im4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupHazardState(yellowCards=");
        sb.append(this.a);
        sb.append(", redCards=");
        return rr1.b(sb, this.b, ')');
    }
}
