package defpackage;

import com.twilio.voice.EventKeys;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class dtl0 extends jok0 {
    public final gul0 c;

    public dtl0(gul0 gul0Var) {
        super("internal.registerCallback");
        this.c = gul0Var;
    }

    @Override // defpackage.jok0
    public final ipk0 g(g3l0 g3l0Var, List list) {
        TreeMap treeMap;
        r5l0.a(3, this.a, list);
        g3l0Var.b.b(g3l0Var, (ipk0) list.get(0)).zzc();
        ipk0 ipk0Var = (ipk0) list.get(1);
        pqk0 pqk0Var = g3l0Var.b;
        ipk0 ipk0VarB = pqk0Var.b(g3l0Var, ipk0Var);
        if (!(ipk0VarB instanceof fpk0)) {
            hb5.a("Invalid callback type");
            return null;
        }
        ipk0 ipk0VarB2 = pqk0Var.b(g3l0Var, (ipk0) list.get(2));
        if (!(ipk0VarB2 instanceof vok0)) {
            hb5.a("Invalid callback params");
            return null;
        }
        vok0 vok0Var = (vok0) ipk0VarB2;
        HashMap map = vok0Var.a;
        if (!map.containsKey("type")) {
            hb5.a("Undefined rule type");
            return null;
        }
        String strZzc = vok0Var.b("type").zzc();
        int iG = map.containsKey(EventKeys.PRIORITY) ? r5l0.g(vok0Var.b(EventKeys.PRIORITY).zzd().doubleValue()) : 1000;
        fpk0 fpk0Var = (fpk0) ipk0VarB;
        gul0 gul0Var = this.c;
        gul0Var.getClass();
        if ("create".equals(strZzc)) {
            treeMap = gul0Var.b;
        } else {
            if (!"edit".equals(strZzc)) {
                ib5.a("Unknown callback type: ".concat(String.valueOf(strZzc)));
                return null;
            }
            treeMap = gul0Var.a;
        }
        if (treeMap.containsKey(Integer.valueOf(iG))) {
            iG = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(iG), fpk0Var);
        return ipk0.o;
    }
}
