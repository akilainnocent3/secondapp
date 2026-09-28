package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b8l0 {
    public static ipk0 a(Object obj) {
        if (obj == null) {
            return ipk0.p;
        }
        if (obj instanceof String) {
            return new ypk0((String) obj);
        }
        if (obj instanceof Double) {
            return new eok0((Double) obj);
        }
        if (obj instanceof Long) {
            return new eok0(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new eok0(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new unk0((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                hb5.a("Invalid value type");
                return null;
            }
            pnk0 pnk0Var = new pnk0();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                pnk0Var.l(pnk0Var.j(), a(it.next()));
            }
            return pnk0Var;
        }
        vok0 vok0Var = new vok0();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            ipk0 ipk0VarA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                vok0Var.e((String) string, ipk0VarA);
            }
        }
        return vok0Var;
    }

    public static ipk0 b(wal0 wal0Var) {
        if (wal0Var == null) {
            return ipk0.o;
        }
        int iY = wal0Var.y() - 1;
        if (iY == 1) {
            return wal0Var.s() ? new ypk0(wal0Var.t()) : ipk0.x;
        }
        if (iY == 2) {
            return wal0Var.w() ? new eok0(Double.valueOf(wal0Var.x())) : new eok0(null);
        }
        if (iY == 3) {
            return wal0Var.u() ? new unk0(Boolean.valueOf(wal0Var.v())) : new unk0(null);
        }
        if (iY != 4) {
            hb5.a("Unknown type found. Cannot convert entity");
            return null;
        }
        List listQ = wal0Var.q();
        ArrayList arrayList = new ArrayList();
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(b((wal0) it.next()));
        }
        return new lpk0(wal0Var.r(), arrayList);
    }
}
