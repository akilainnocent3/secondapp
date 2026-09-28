package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class tg6 {
    public final float a;
    public final float b;
    public final long c;

    public tg6(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg6)) {
            return false;
        }
        tg6 tg6Var = (tg6) obj;
        if (!g7f.b(1.0f, 1.0f) || !g7f.b(this.a, tg6Var.a) || !g7f.b(this.b, tg6Var.b)) {
            return false;
        }
        long j = tg6Var.c;
        int i = j58.n;
        return nbh0.a(this.c, j);
    }

    public final int hashCode() {
        int iA = tvh.a(this.b, tvh.a(this.a, Float.hashCode(1.0f) * 31, 31), 31);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.c) + iA;
    }

    public final String toString() {
        String strC = g7f.c(1.0f);
        String strC2 = g7f.c(this.a);
        return kwi.a(ux5.a("CardShadowLayer(dx=", strC, ", dy=", strC2, ", blur="), g7f.c(this.b), ", color=", j58.i(this.c), ")");
    }
}
