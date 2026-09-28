package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class zry {
    public final wwd0 a;

    public zry() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.a = xwd0.a(o2gVar);
    }

    public final void a(List<? extends Selection> list, avy avyVar) {
        wwd0 wwd0Var;
        Object value;
        Map map;
        LinkedHashMap linkedHashMap;
        if (list.isEmpty()) {
            return;
        }
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            map = (Map) value;
            int iA = jpu.a(l48.r(list, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashMap.put(o980.a((Selection) it.next()), avyVar);
            }
        } while (!wwd0Var.g(value, kpu.h(map, linkedHashMap)));
    }
}
