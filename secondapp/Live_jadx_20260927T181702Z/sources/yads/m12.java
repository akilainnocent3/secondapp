package yads;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class m12 {
    public static n12 a() {
        n12 n12Var;
        n12 n12Var2 = n12.f152825c;
        if (n12Var2 != null) {
            return n12Var2;
        }
        synchronized (n12.f152824b) {
            n12Var = n12.f152825c;
            if (n12Var == null) {
                n12Var = new n12(new WeakHashMap());
                n12.f152825c = n12Var;
            }
        }
        return n12Var;
    }
}
