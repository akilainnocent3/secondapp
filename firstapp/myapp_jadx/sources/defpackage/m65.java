package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class m65 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public static final class a {
        public static m65 a(float f, float f2, float f3, float f4, androidx.compose.runtime.a aVar, int i) {
            if ((i & 1) != 0) {
                f = 0.0f;
            }
            float f5 = f;
            if ((i & 2) != 0) {
                f2 = ((cjb0) aVar.O(ejb0.a)).f;
            }
            float f6 = f2;
            if ((i & 4) != 0) {
                f3 = ((cjb0) aVar.O(ejb0.a)).f;
            }
            float f7 = f3;
            if ((i & 16) != 0) {
                f4 = ((cjb0) aVar.O(ejb0.a)).h;
            }
            return new m65(f5, f6, f7, 0.0f, f4);
        }
    }

    public m65(float f, float f2, float f3, float f4, float f5) {
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
        if (!(obj instanceof m65)) {
            return false;
        }
        m65 m65Var = (m65) obj;
        return g7f.b(this.a, m65Var.a) && g7f.b(this.b, m65Var.b) && g7f.b(this.c, m65Var.c) && g7f.b(this.d, m65Var.d) && g7f.b(this.e, m65Var.e);
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
        StringBuilder sbA = ux5.a("BottomSheetSpacing(headerSpacing=", strC, ", headerContentSpacing=", strC2, ", contentButtonSpacing=");
        hxa.c(sbA, strC3, ", buttonBottomSpacing=", strC4, ", bottomSpacing=");
        return uf80.a(sbA, strC5, ")");
    }
}
