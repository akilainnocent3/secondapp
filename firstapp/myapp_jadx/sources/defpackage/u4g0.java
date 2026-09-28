package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class u4g0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public u4g0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float a(int i, float f) {
        g7f g7fVar = new g7f(Math.min(b(i, f) - this.c, this.b));
        g7f g7fVar2 = new g7f(14.0f);
        if (g7fVar.compareTo(g7fVar2) < 0) {
            g7fVar = g7fVar2;
        }
        return g7fVar.a;
    }

    public final float b(int i, float f) {
        return (this.b + this.c) * ((float) Math.pow(2.0d, i - f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4g0)) {
            return false;
        }
        u4g0 u4g0Var = (u4g0) obj;
        return g7f.b(this.a, u4g0Var.a) && g7f.b(this.b, u4g0Var.b) && g7f.b(this.c, u4g0Var.c) && g7f.b(this.d, u4g0Var.d) && g7f.b(16.0f, 16.0f) && g7f.b(14.0f, 14.0f);
    }

    public final int hashCode() {
        return Float.hashCode(14.0f) + tvh.a(16.0f, tvh.a(this.d, tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strC = g7f.c(this.a);
        String strC2 = g7f.c(this.b);
        String strC3 = g7f.c(this.c);
        String strC4 = g7f.c(this.d);
        String strC5 = g7f.c(16.0f);
        String strC6 = g7f.c(14.0f);
        StringBuilder sbA = ux5.a("TournamentBracketDimensions(matchWidth=", strC, ", baseMatchHeight=", strC2, ", cardSpacing=");
        hxa.c(sbA, strC3, ", roundGap=", strC4, ", bottomPadding=");
        return kwi.a(sbA, strC5, ", minCardHeight=", strC6, ")");
    }
}
