package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f147740a;

    public cj(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ms.u.u(fr.m1.j(fr.i0.d0(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            dr.z0 z0VarA = dr.v1.a(oiVar.b(), oiVar.c());
            linkedHashMap.put(z0VarA.j(), z0VarA.k());
        }
        this.f147740a = linkedHashMap;
    }
}
