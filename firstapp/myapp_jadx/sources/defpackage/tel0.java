package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class tel0 extends vok0 {
    public final wmk0 b;

    public tel0(wmk0 wmk0Var) {
        this.b = wmk0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.vok0, defpackage.ipk0
    public final ipk0 c(String str, g3l0 g3l0Var, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        wmk0 wmk0Var = this.b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    r5l0.a(0, "getEventName", arrayList);
                    return new ypk0(wmk0Var.b.a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    r5l0.a(0, "getTimestamp", arrayList);
                    return new eok0(Double.valueOf(wmk0Var.b.b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    r5l0.a(1, "getParamValue", arrayList);
                    String strZzc = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzc();
                    HashMap map = wmk0Var.b.c;
                    return b8l0.a(map.containsKey(strZzc) ? map.get(strZzc) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    r5l0.a(0, "getParams", arrayList);
                    HashMap map2 = wmk0Var.b.c;
                    vok0 vok0Var = new vok0();
                    for (String str2 : map2.keySet()) {
                        vok0Var.e(str2, b8l0.a(map2.get(str2)));
                    }
                    return vok0Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    r5l0.a(2, "setParamValue", arrayList);
                    String strZzc2 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0)).zzc();
                    ipk0 ipk0VarB = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(1));
                    qmk0 qmk0Var = wmk0Var.b;
                    Object objI = r5l0.i(ipk0VarB);
                    HashMap map3 = qmk0Var.c;
                    if (objI == null) {
                        map3.remove(strZzc2);
                        return ipk0VarB;
                    }
                    map3.put(strZzc2, qmk0.b(map3.get(strZzc2), strZzc2, objI));
                    return ipk0VarB;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    r5l0.a(1, "setEventName", arrayList);
                    ipk0 ipk0VarB2 = g3l0Var.b.b(g3l0Var, (ipk0) arrayList.get(0));
                    if (ipk0.o.equals(ipk0VarB2) || ipk0.p.equals(ipk0VarB2)) {
                        hb5.a("Illegal event name");
                        return null;
                    }
                    wmk0Var.b.a = ipk0VarB2.zzc();
                    return new ypk0(ipk0VarB2.zzc());
                }
                break;
        }
        return super.c(str, g3l0Var, arrayList);
    }
}
