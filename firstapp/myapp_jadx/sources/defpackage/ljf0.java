package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ljf0 {
    public static final ljf0 c = new ljf0(1.0f, 0.0f);
    public final float a;
    public final float b;

    public ljf0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljf0)) {
            return false;
        }
        ljf0 ljf0Var = (ljf0) obj;
        return this.a == ljf0Var.a && this.b == ljf0Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return h70.a(sb, this.b, ')');
    }

    public ljf0() {
        this(1.0f, 0.0f);
    }
}
