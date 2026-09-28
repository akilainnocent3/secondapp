package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ncl0 extends jok0 {
    public final wmk0 c;

    public ncl0(wmk0 wmk0Var) {
        super("internal.eventLogger");
        this.c = wmk0Var;
    }

    @Override // defpackage.jok0
    public final ipk0 g(g3l0 g3l0Var, List list) {
        r5l0.a(3, this.a, list);
        String strZzc = g3l0Var.b.b(g3l0Var, (ipk0) list.get(0)).zzc();
        ipk0 ipk0Var = (ipk0) list.get(1);
        pqk0 pqk0Var = g3l0Var.b;
        long jH = (long) r5l0.h(pqk0Var.b(g3l0Var, ipk0Var).zzd().doubleValue());
        ipk0 ipk0VarB = pqk0Var.b(g3l0Var, (ipk0) list.get(2));
        HashMap mapJ = ipk0VarB instanceof vok0 ? r5l0.j((vok0) ipk0VarB) : new HashMap();
        wmk0 wmk0Var = this.c;
        wmk0Var.getClass();
        HashMap map = new HashMap();
        for (String str : mapJ.keySet()) {
            HashMap map2 = wmk0Var.a.c;
            map.put(str, qmk0.b(map2.containsKey(str) ? map2.get(str) : null, str, mapJ.get(str)));
        }
        wmk0Var.c.add(new qmk0(strZzc, jH, map));
        return ipk0.o;
    }
}
