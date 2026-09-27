package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d5 {
    public static e5 a() {
        e5 e5Var;
        e5 e5Var2 = e5.f148501d;
        if (e5Var2 != null) {
            return e5Var2;
        }
        synchronized (e5.f148500c) {
            e5Var = e5.f148501d;
            if (e5Var == null) {
                e5Var = new e5();
                e5.f148501d = e5Var;
            }
        }
        return e5Var;
    }
}
