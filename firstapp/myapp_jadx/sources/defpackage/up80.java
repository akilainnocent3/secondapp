package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class up80 {
    public final float a;
    public final long b;
    public final float c;

    public up80(float f, float f2, long j) {
        this.a = f;
        this.b = j;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up80)) {
            return false;
        }
        up80 up80Var = (up80) obj;
        if (!g7f.b(0.0f, 0.0f) || !g7f.b(this.a, up80Var.a)) {
            return false;
        }
        long j = up80Var.b;
        int i = j58.n;
        return nbh0.a(this.b, j) && g7f.b(this.c, up80Var.c);
    }

    public final int hashCode() {
        int iA = tvh.a(this.a, Float.hashCode(0.0f) * 31, 31);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Float.hashCode(this.c) + f87.a(iA, this.b, 31);
    }

    public final String toString() {
        String strC = g7f.c(0.0f);
        String strC2 = g7f.c(this.a);
        return kwi.a(ux5.a("SgShadow(shadowXOffset=", strC, ", shadowYOffset=", strC2, ", shadowColor="), j58.i(this.b), ", shadowRadius=", g7f.c(this.c), ")");
    }
}
