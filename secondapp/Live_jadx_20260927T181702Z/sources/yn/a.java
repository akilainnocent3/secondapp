package yn;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    @l
    public final String a(@m String str) {
        to.c cVar = to.c.INSTANCE;
        ro.c cVarG = ro.c.g(cVar.getMyUserLock1(), cVar.getMyUserCheck1(), new byte[16]);
        m0.o(cVarG, "getDefault(...)");
        String strC = cVarG.c(str);
        m0.o(strC, "decryptOrNull(...)");
        return strC;
    }
}
