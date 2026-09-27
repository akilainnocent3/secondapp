package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d81 {
    public final e81 a() {
        e81 e81Var;
        e81 e81Var2 = e81.f148568d;
        if (e81Var2 != null) {
            return e81Var2;
        }
        synchronized (this) {
            e81Var = e81.f148568d;
            if (e81Var == null) {
                e81Var = new e81();
                e81.f148568d = e81Var;
            }
        }
        return e81Var;
    }
}
