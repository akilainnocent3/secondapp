package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v5i0 {
    public static final v5i0 d = new v5i0(0, 0);
    public final int a;
    public final int b;
    public final float c;

    static {
        jrh0.J(0);
        jrh0.J(1);
        jrh0.J(3);
    }

    public v5i0(float f, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v5i0) {
            v5i0 v5i0Var = (v5i0) obj;
            if (this.a == v5i0Var.a && this.b == v5i0Var.b && this.c == v5i0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public v5i0(int i, int i2) {
        this(1.0f, i, i2);
    }
}
