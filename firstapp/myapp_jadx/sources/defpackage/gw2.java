package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class gw2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public gw2(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw2)) {
            return false;
        }
        gw2 gw2Var = (gw2) obj;
        return g7f.b(this.a, gw2Var.a) && g7f.b(this.b, gw2Var.b) && g7f.b(this.c, gw2Var.c) && g7f.b(this.d, gw2Var.d) && g7f.b(this.e, gw2Var.e) && g7f.b(this.f, gw2Var.f) && g7f.b(this.g, gw2Var.g);
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + tvh.a(this.f, tvh.a(this.e, tvh.a(this.d, tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strC = g7f.c(this.a);
        String strC2 = g7f.c(this.b);
        String strC3 = g7f.c(this.c);
        String strC4 = g7f.c(this.d);
        String strC5 = g7f.c(this.e);
        String strC6 = g7f.c(this.f);
        String strC7 = g7f.c(this.g);
        StringBuilder sbA = ux5.a("BetListRowMetrics(minHeight=", strC, ", horizontalPadding=", strC2, ", verticalPadding=");
        hxa.c(sbA, strC3, ", avatarSize=", strC4, ", avatarEndSpacing=");
        hxa.c(sbA, strC5, ", leadingTextStartPadding=", strC6, ", itemSpacing=");
        return uf80.a(sbA, strC7, ")");
    }
}
