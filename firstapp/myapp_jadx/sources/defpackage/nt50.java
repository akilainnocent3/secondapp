package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nt50 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public nt50(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt50)) {
            return false;
        }
        nt50 nt50Var = (nt50) obj;
        return this.a == nt50Var.a && this.b == nt50Var.b && this.c == nt50Var.c && this.d == nt50Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return h70.a(sb, this.d, ')');
    }
}
