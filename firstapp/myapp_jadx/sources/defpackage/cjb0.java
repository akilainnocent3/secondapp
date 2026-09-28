package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class cjb0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;

    public cjb0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
        this.j = f10;
        this.k = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjb0)) {
            return false;
        }
        cjb0 cjb0Var = (cjb0) obj;
        return g7f.b(this.a, cjb0Var.a) && g7f.b(this.b, cjb0Var.b) && g7f.b(this.c, cjb0Var.c) && g7f.b(this.d, cjb0Var.d) && g7f.b(this.e, cjb0Var.e) && g7f.b(this.f, cjb0Var.f) && g7f.b(this.g, cjb0Var.g) && g7f.b(this.h, cjb0Var.h) && g7f.b(this.i, cjb0Var.i) && g7f.b(this.j, cjb0Var.j) && g7f.b(this.k, cjb0Var.k);
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + tvh.a(this.j, tvh.a(this.i, tvh.a(this.h, tvh.a(this.g, tvh.a(this.f, tvh.a(this.e, tvh.a(this.d, tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strC = g7f.c(this.a);
        String strC2 = g7f.c(this.b);
        String strC3 = g7f.c(this.c);
        String strC4 = g7f.c(this.d);
        String strC5 = g7f.c(this.e);
        String strC6 = g7f.c(this.f);
        String strC7 = g7f.c(this.g);
        String strC8 = g7f.c(this.h);
        String strC9 = g7f.c(this.i);
        String strC10 = g7f.c(this.j);
        String strC11 = g7f.c(this.k);
        StringBuilder sbA = ux5.a("SportyBetSpacing(space0=", strC, ", space3xSmall=", strC2, ", spaceXxSmall=");
        hxa.c(sbA, strC3, ", spaceXSmall=", strC4, ", spaceSmall=");
        hxa.c(sbA, strC5, ", spaceMedium=", strC6, ", spaceLarge=");
        hxa.c(sbA, strC7, ", spaceXLarge=", strC8, ", spaceXxLarge=");
        hxa.c(sbA, strC9, ", space3xLarge=", strC10, ", space4xLarge=");
        return uf80.a(sbA, strC11, ")");
    }
}
