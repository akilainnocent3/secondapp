package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ild0 {
    public final int a;
    public final int b;

    public ild0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ild0)) {
            return false;
        }
        ild0 ild0Var = (ild0) obj;
        return this.a == ild0Var.a && this.b == ild0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StackedRowConfiguration(leftOffset=");
        sb.append(this.a);
        sb.append(", stackerBlocksWidth=");
        return rr1.b(sb, this.b, ')');
    }
}
