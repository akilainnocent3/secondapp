package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class y1 {
    public static z1 a() {
        z1 z1Var;
        z1 z1Var2 = z1.f158559c;
        if (z1Var2 != null) {
            return z1Var2;
        }
        synchronized (z1.f158558b) {
            z1Var = z1.f158559c;
            if (z1Var == null) {
                z1Var = new z1();
                z1.f158559c = z1Var;
            }
        }
        return z1Var;
    }
}
