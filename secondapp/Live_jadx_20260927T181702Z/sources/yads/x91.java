package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class x91 {
    public static v91 a(nt2 nt2Var) {
        String str;
        v91 v91Var;
        if (nt2Var != null && (str = nt2Var.T) != null) {
            v91.f156849c.getClass();
            v91[] v91VarArrValues = v91.values();
            int length = v91VarArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    v91Var = null;
                    break;
                }
                v91Var = v91VarArrValues[i10];
                if (kotlin.jvm.internal.m0.g(v91Var.f156854b, str)) {
                    break;
                }
                i10++;
            }
            if (v91Var != null) {
                return v91Var;
            }
        }
        v91.f156849c.getClass();
        return v91.f156850d;
    }
}
