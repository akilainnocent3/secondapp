package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class p5p {
    public static bcp a(Map map, bcp bcpVar) {
        bcp bcpVar2 = new bcp();
        for (int i = 0; i < bcpVar.a.size(); i++) {
            tcp tcpVar = bcpVar.a.get(i);
            if (tcpVar instanceof xdp) {
                bcpVar2.h(b((xdp) tcpVar, map));
            } else {
                bcpVar2.h(tcpVar);
            }
        }
        return bcpVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xdp b(xdp xdpVar, Map<String, String> map) {
        Iterator it = ((hgs.c) xdpVar.a.keySet()).iterator();
        xdp xdpVar2 = new xdp();
        while (((hgs.d) it).hasNext()) {
            String str = (String) ((hgs.c.a) it).a().f;
            String str2 = map.get(str);
            tcp tcpVarJ = xdpVar.j(str);
            if (TextUtils.isEmpty(str2)) {
                itf0.a aVar = itf0.a;
                aVar.q("renameJSONObjectKey");
                aVar.d("No match key: \"%s\" from object: %s", str, xdpVar);
            } else if (tcpVarJ instanceof xdp) {
                xdpVar2.h(str2, b((xdp) tcpVarJ, map));
            } else if (tcpVarJ instanceof bcp) {
                xdpVar2.h(str2, a(map, (bcp) tcpVarJ));
            } else {
                xdpVar2.h(str2, tcpVarJ);
            }
        }
        return xdpVar2;
    }
}
