package yu;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public static final boolean a(@l Throwable th2) {
        m0.p(th2, "<this>");
        Class<?> superclass = th2.getClass();
        while (!m0.g(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final RuntimeException b(@l Throwable e10) throws Throwable {
        m0.p(e10, "e");
        throw e10;
    }
}
