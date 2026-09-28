package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class fl10 {
    public final float a;
    public final float b;

    public fl10(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl10)) {
            return false;
        }
        fl10 fl10Var = (fl10) obj;
        return Float.compare(this.a, fl10Var.a) == 0 && Float.compare(this.b, fl10Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlayPausePoint(x=" + this.a + ", y=" + this.b + ")";
    }
}
