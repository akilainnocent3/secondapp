package yads;

import java.net.URI;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bb3 {
    public static boolean a(String str) {
        Object objB;
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            new URI(str);
            objB = dr.i1.b(Boolean.valueOf((str == null || str.length() == 0) ? false : true));
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (dr.i1.i(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }
}
