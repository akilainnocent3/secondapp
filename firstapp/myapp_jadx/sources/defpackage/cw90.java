package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cw90 {
    public final boolean a;
    public final s780 b;
    public final j780 c;

    public cw90(boolean z, s780 s780Var, j780 j780Var) {
        this.a = z;
        this.b = s780Var;
        this.c = j780Var;
    }

    public final e3c a() {
        j780 j780Var = this.c;
        int i = j780Var.a;
        int i2 = j780Var.b;
        if (i < i2) {
            return e3c.b;
        }
        return i > i2 ? e3c.a : e3c.c;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + a() + ", info=\n\t" + this.c + ')';
    }
}
