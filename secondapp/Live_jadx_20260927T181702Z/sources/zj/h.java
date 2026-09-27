package zj;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h {
    public static Object a(i iVar, Class cls) {
        return iVar.j(k0.b(cls));
    }

    public static Object b(i iVar, k0 k0Var) {
        dl.b bVarF = iVar.f(k0Var);
        if (bVarF == null) {
            return null;
        }
        return bVarF.get();
    }

    public static dl.a c(i iVar, Class cls) {
        return iVar.i(k0.b(cls));
    }

    public static dl.b d(i iVar, Class cls) {
        return iVar.f(k0.b(cls));
    }

    public static Set e(i iVar, Class cls) {
        return iVar.g(k0.b(cls));
    }

    public static Set f(i iVar, k0 k0Var) {
        return (Set) iVar.h(k0Var).get();
    }

    public static dl.b g(i iVar, Class cls) {
        return iVar.h(k0.b(cls));
    }
}
