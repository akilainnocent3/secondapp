package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class mse0 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public /* synthetic */ mse0(int i) {
        this(0.0d, 0.0d, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mse0)) {
            return false;
        }
        mse0 mse0Var = (mse0) obj;
        return Double.compare(this.a, mse0Var.a) == 0 && Double.compare(this.b, mse0Var.b) == 0 && Double.compare(this.c, mse0Var.c) == 0 && Double.compare(this.d, mse0Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + nrg0.a(nrg0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TGBetAmount(minAmount=");
        sb.append(this.a);
        sb.append(", maxAmount=");
        sb.append(this.b);
        sb.append(", defaultAmount=");
        sb.append(this.c);
        sb.append(", stepAmount=");
        return org0.a(sb, this.d, ')');
    }

    public mse0(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public mse0() {
        this(0);
    }
}
