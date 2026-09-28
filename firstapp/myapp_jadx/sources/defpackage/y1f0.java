package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y1f0 {
    public final float a;
    public final float b;

    public y1f0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1f0)) {
            return false;
        }
        y1f0 y1f0Var = (y1f0) obj;
        return g7f.b(this.a, y1f0Var.a) && g7f.b(this.b, y1f0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        float f = this.a;
        String strC = g7f.c(f);
        float f2 = this.b;
        String strC2 = g7f.c(f + f2);
        return uf80.a(ux5.a("TabPosition(left=", strC, ", right=", strC2, ", width="), g7f.c(f2), ")");
    }
}
