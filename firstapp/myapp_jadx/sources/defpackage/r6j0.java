package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r6j0 {
    public final float a;
    public final float b;

    public r6j0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6j0)) {
            return false;
        }
        r6j0 r6j0Var = (r6j0) obj;
        return Float.compare(this.a, r6j0Var.a) == 0 && Float.compare(this.b, r6j0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.a);
        sb.append(", y=");
        return h70.a(sb, this.b, ')');
    }
}
