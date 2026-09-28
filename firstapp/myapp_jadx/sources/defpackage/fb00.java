package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class fb00 {
    public final float a;
    public final float b;
    public final cb00 c;
    public final eb00 d;
    public final db00 e;

    public fb00(float f, float f2, cb00 cb00Var, eb00 eb00Var, db00 db00Var) {
        this.a = f;
        this.b = f2;
        this.c = cb00Var;
        this.d = eb00Var;
        this.e = db00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb00)) {
            return false;
        }
        fb00 fb00Var = (fb00) obj;
        return g7f.b(this.a, fb00Var.a) && g7f.b(this.b, fb00Var.b) && this.c.equals(fb00Var.c) && this.d.equals(fb00Var.d) && this.e.equals(fb00Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e.a) + ((this.d.hashCode() + ((this.c.hashCode() + tvh.a(this.b, Float.hashCode(this.a) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("PenaltySettlementLayoutState(animationAreaWidth=", g7f.c(this.a), ", animationAreaHeight=", g7f.c(this.b), ", animationBackgroundLayoutState=");
        sbA.append(this.c);
        sbA.append(", kickAnimationLayoutState=");
        sbA.append(this.d);
        sbA.append(", endAnimationLayoutState=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
