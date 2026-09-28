package defpackage;

import androidx.compose.runtime.a;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k0s {
    public static final jxs a;

    static {
        hxs.c cVar = new hxs.c(false);
        a = new jxs(hxs.b.b, cVar, cVar);
    }

    public static final h0s a(lyh lyhVar, a aVar) {
        lyhVar.getClass();
        aVar.x(388053246);
        e eVar = e.a;
        aVar.x(1046463091);
        boolean zM = aVar.M(lyhVar);
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (zM || objY == obj) {
            objY = new h0s(lyhVar);
            aVar.r(objY);
        }
        h0s h0sVar = (h0s) objY;
        aVar.L();
        aVar.x(1046463169);
        boolean zA = aVar.A(eVar) | aVar.A(h0sVar);
        Object objY2 = aVar.y();
        if (zA || objY2 == obj) {
            objY2 = new i0s(eVar, h0sVar, null);
            aVar.r(objY2);
        }
        aVar.L();
        xvf.e(aVar, h0sVar, (Function2) objY2);
        aVar.x(1046463438);
        boolean zA2 = aVar.A(eVar) | aVar.A(h0sVar);
        Object objY3 = aVar.y();
        if (zA2 || objY3 == obj) {
            objY3 = new j0s(eVar, h0sVar, null);
            aVar.r(objY3);
        }
        aVar.L();
        xvf.e(aVar, h0sVar, (Function2) objY3);
        aVar.L();
        return h0sVar;
    }
}
