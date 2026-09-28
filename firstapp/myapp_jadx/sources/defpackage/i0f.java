package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class i0f {
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

    public i0f(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
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
        if (!(obj instanceof i0f)) {
            return false;
        }
        i0f i0fVar = (i0f) obj;
        return g7f.b(this.a, i0fVar.a) && g7f.b(this.b, i0fVar.b) && g7f.b(this.c, i0fVar.c) && g7f.b(this.d, i0fVar.d) && g7f.b(this.e, i0fVar.e) && g7f.b(this.f, i0fVar.f) && g7f.b(this.g, i0fVar.g) && g7f.b(this.h, i0fVar.h) && g7f.b(this.i, i0fVar.i) && g7f.b(this.j, i0fVar.j) && g7f.b(this.k, i0fVar.k);
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
        StringBuilder sbA = ux5.a("DoubleOrNothingAnimationLayoutState(animationAreaWidth=", strC, ", animationAreaHeight=", strC2, ", fieldHeight=");
        hxa.c(sbA, strC3, ", gateBottomPadding=", strC4, ", gateWidth=");
        hxa.c(sbA, strC5, ", playerAndBallTopPadding=", strC6, ", playerAndBallWidth=");
        hxa.c(sbA, strC7, ", playerAndBallHeight=", strC8, ", kickPointSize=");
        hxa.c(sbA, strC9, ", selectedKickPointSize=", strC10, ", timeBarBannerHeight=");
        return uf80.a(sbA, strC11, ")");
    }
}
