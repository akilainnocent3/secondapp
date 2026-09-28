package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class qhb0 {
    public final float a;
    public final float b;
    public final float c;

    public qhb0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhb0)) {
            return false;
        }
        qhb0 qhb0Var = (qhb0) obj;
        return g7f.b(this.a, qhb0Var.a) && g7f.b(this.b, qhb0Var.b) && g7f.b(this.c, qhb0Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + tvh.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String strC = g7f.c(this.a);
        String strC2 = g7f.c(this.b);
        return uf80.a(ux5.a("SportyBetBorderWidths(default=", strC, ", subTab=", strC2, ", mainTab="), g7f.c(this.c), ")");
    }
}
