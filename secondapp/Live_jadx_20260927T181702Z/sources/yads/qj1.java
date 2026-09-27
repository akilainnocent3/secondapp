package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f154485a;

    public qj1(y00 y00Var) {
        this.f154485a = y00Var;
    }

    public final Float a() {
        int i10;
        int i11;
        y00 y00Var = this.f154485a;
        h10 h10Var = y00Var.f158071a;
        a10 a10Var = y00Var.f158074d;
        if (h10Var != null) {
            return Float.valueOf(h10Var.f149864a);
        }
        if (a10Var == null || (i10 = a10Var.f146610c) <= 0 || (i11 = a10Var.f146611d) <= 0) {
            return null;
        }
        return Float.valueOf(i10 / i11);
    }
}
