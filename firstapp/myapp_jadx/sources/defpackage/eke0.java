package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class eke0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public eke0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eke0)) {
            return false;
        }
        eke0 eke0Var = (eke0) obj;
        return Float.compare(this.a, eke0Var.a) == 0 && Float.compare(this.b, eke0Var.b) == 0 && Float.compare(this.c, eke0Var.c) == 0 && Float.compare(this.d, eke0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewBox(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return h70.a(sb, this.d, ')');
    }
}
