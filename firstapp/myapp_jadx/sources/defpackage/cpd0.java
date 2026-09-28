package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class cpd0 {
    public final int a;
    public final boolean b;
    public final float c;
    public final double d;

    public cpd0(int i, boolean z, float f, double d) {
        this.a = i;
        this.b = z;
        this.c = f;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpd0)) {
            return false;
        }
        cpd0 cpd0Var = (cpd0) obj;
        return this.a == cpd0Var.a && this.b == cpd0Var.b && Float.compare(this.c, cpd0Var.c) == 0 && Double.compare(this.d, cpd0Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + tvh.a(this.c, mtg0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StackerRowInitialConfiguration(stackerSize=");
        sb.append(this.a);
        sb.append(", startsFromTheLeft=");
        sb.append(this.b);
        sb.append(", stackerSpeed=");
        sb.append(this.c);
        sb.append(", rewardAmount=");
        return org0.a(sb, this.d, ')');
    }
}
