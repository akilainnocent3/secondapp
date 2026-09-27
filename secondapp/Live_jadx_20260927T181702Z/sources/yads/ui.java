package yads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f156449a;

    public ui(List list, x3 x3Var, l12 l12Var, kn2 kn2Var, x51 x51Var, if1 if1Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ms.u.u(fr.m1.j(fr.i0.d0(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            String strB = oiVar.b();
            if1 if1VarA = oiVar.a();
            if1 if1Var2 = if1VarA == null ? if1Var : if1VarA;
            x3 x3Var2 = x3Var;
            l12 l12Var2 = l12Var;
            kn2 kn2Var2 = kn2Var;
            x51 x51Var2 = x51Var;
            dr.z0 z0VarA = dr.v1.a(strB, iv.a(x51Var2, kn2Var2, x3Var2, l12Var2, oiVar, if1Var2));
            linkedHashMap.put(z0VarA.j(), z0VarA.k());
            x51Var = x51Var2;
            kn2Var = kn2Var2;
            x3Var = x3Var2;
            l12Var = l12Var2;
        }
        this.f156449a = linkedHashMap;
    }
}
