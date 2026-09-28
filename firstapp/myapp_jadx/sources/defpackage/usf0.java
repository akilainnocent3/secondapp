package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class usf0 {
    public final float a;
    public final float b;

    public usf0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usf0)) {
            return false;
        }
        usf0 usf0Var = (usf0) obj;
        return Float.compare(this.a, usf0Var.a) == 0 && Float.compare(this.b, usf0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TierRatio(x=" + this.a + ", y=" + this.b + ")";
    }
}
