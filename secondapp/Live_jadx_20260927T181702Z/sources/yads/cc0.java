package yads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class cc0 {
    public static HashMap a(String str) {
        int[] iArrA = dc0.a(str);
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        sm2 sm2Var = dc0.f148143n;
        map.put(2, (Long) sm2Var.get(iArrA[0]));
        map.put(3, (Long) dc0.f148144o.get(iArrA[1]));
        map.put(4, (Long) dc0.f148145p.get(iArrA[2]));
        map.put(5, (Long) dc0.f148146q.get(iArrA[3]));
        map.put(10, (Long) dc0.f148147r.get(iArrA[4]));
        map.put(9, (Long) dc0.f148148s.get(iArrA[5]));
        map.put(7, (Long) sm2Var.get(iArrA[0]));
        return map;
    }
}
