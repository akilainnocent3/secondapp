package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vw90 {
    public static final vw90 c = new vw90(-1, -1);
    public final int a;
    public final int b;

    static {
        new vw90(0, 0);
    }

    public vw90(int i, int i2) {
        ly0.b((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof vw90) {
            vw90 vw90Var = (vw90) obj;
            if (this.a == vw90Var.a && this.b == vw90Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
