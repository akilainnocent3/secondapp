package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class h03 {
    public static f03 a(j7 j7Var) {
        k7 k7Var;
        r03 r03Var = (j7Var == null || (k7Var = j7Var.f150951b) == null) ? null : k7Var.f151418b;
        int i10 = r03Var == null ? -1 : g03.f149336a[r03Var.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return new zl3();
            }
            if (i10 != 2) {
                throw new dr.o0();
            }
        }
        return new se0();
    }
}
