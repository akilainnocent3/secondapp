package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class dz00 {
    public final float a;
    public final float b;

    public dz00(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz00)) {
            return false;
        }
        dz00 dz00Var = (dz00) obj;
        return Float.compare(this.a, dz00Var.a) == 0 && Float.compare(this.b, dz00Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PillMaskInfo(leftPx=" + this.a + ", widthPx=" + this.b + ")";
    }
}
