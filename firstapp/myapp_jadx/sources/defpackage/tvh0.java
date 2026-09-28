package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class tvh0 {
    public float a;
    public float b;

    public tvh0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvh0)) {
            return false;
        }
        tvh0 tvh0Var = (tvh0) obj;
        return Float.compare(this.a, tvh0Var.a) == 0 && Float.compare(this.b, tvh0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Vector(x=" + this.a + ", y=" + this.b + ")";
    }
}
