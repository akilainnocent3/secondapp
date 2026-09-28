package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class eb00 {
    public final float a;
    public final float b;
    public final float c;

    public eb00(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb00)) {
            return false;
        }
        eb00 eb00Var = (eb00) obj;
        return g7f.b(this.a, eb00Var.a) && g7f.b(this.b, eb00Var.b) && g7f.b(this.c, eb00Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + tvh.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String strC = g7f.c(this.a);
        String strC2 = g7f.c(this.b);
        return uf80.a(ux5.a("PenaltySettlementKickAnimationLayoutState(animationPlayerAndBallTopPadding=", strC, ", animationPlayerAndBallWidth=", strC2, ", animationPlayerAndBallHeight="), g7f.c(this.c), ")");
    }
}
