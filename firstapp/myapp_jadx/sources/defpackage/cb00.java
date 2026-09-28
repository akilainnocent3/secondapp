package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class cb00 {
    public final float a;
    public final float b;
    public final float c;

    public cb00(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb00)) {
            return false;
        }
        cb00 cb00Var = (cb00) obj;
        return g7f.b(this.a, cb00Var.a) && g7f.b(this.b, cb00Var.b) && g7f.b(this.c, cb00Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + tvh.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String strC = g7f.c(this.a);
        String strC2 = g7f.c(this.b);
        return uf80.a(ux5.a("PenaltySettlementAnimationBackgroundLayoutState(fieldHeight=", strC, ", gateBottomPadding=", strC2, ", gateWidth="), g7f.c(this.c), ")");
    }
}
