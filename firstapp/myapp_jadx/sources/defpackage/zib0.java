package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zib0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public zib0(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zib0)) {
            return false;
        }
        zib0 zib0Var = (zib0) obj;
        return g7f.b(this.a, zib0Var.a) && g7f.b(this.b, zib0Var.b) && g7f.b(this.c, zib0Var.c) && g7f.b(this.d, zib0Var.d) && g7f.b(this.e, zib0Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + tvh.a(this.d, tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strC = g7f.c(this.a);
        String strC2 = g7f.c(this.b);
        String strC3 = g7f.c(this.c);
        String strC4 = g7f.c(this.d);
        String strC5 = g7f.c(this.e);
        StringBuilder sbA = ux5.a("SportyBetRadius(radius0=", strC, ", small=", strC2, ", medium=");
        hxa.c(sbA, strC3, ", large=", strC4, ", round=");
        return uf80.a(sbA, strC5, ")");
    }
}
