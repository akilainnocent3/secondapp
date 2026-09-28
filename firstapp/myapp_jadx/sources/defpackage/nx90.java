package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class nx90 {
    public final float a;
    public final int b;

    public nx90(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx90)) {
            return false;
        }
        nx90 nx90Var = (nx90) obj;
        return Float.compare(this.a, nx90Var.a) == 0 && this.b == nx90Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SkeletonBar(widthFraction=" + this.a + ", height=" + this.b + ")";
    }
}
