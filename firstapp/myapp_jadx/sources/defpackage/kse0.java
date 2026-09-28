package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class kse0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public kse0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kse0)) {
            return false;
        }
        kse0 kse0Var = (kse0) obj;
        return this.a == kse0Var.a && this.b == kse0Var.b && this.c == kse0Var.c && this.d == kse0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TGAutoSpin(maxSpin=");
        sb.append(this.a);
        sb.append(", minSpin=");
        sb.append(this.b);
        sb.append(", stepSpin=");
        sb.append(this.c);
        sb.append(", defaultSpin=");
        return rr1.b(sb, this.d, ')');
    }
}
