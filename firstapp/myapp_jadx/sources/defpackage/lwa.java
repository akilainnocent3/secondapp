package defpackage;

import androidx.compose.ui.layout.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lwa {
    public static final void a(qwd0 qwd0Var, List<? extends vhv> list) {
        ArrayList<String> arrayList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vhv vhvVar = list.get(i);
            Object objA = i.a(vhvVar);
            if (objA == null) {
                Object objG = vhvVar.g();
                pwa pwaVar = objG instanceof pwa ? (pwa) objG : null;
                objA = pwaVar != null ? pwaVar.a() : null;
                if (objA == null) {
                    objA = new jwa();
                }
            }
            rwa rwaVarB = qwd0Var.b(objA.toString());
            if (rwaVarB != null) {
                rwaVarB.g0 = vhvVar;
                ixa ixaVar = rwaVarB.h0;
                if (ixaVar != null) {
                    ixaVar.i0 = vhvVar;
                }
            }
            Object objG2 = vhvVar.g();
            pwa pwaVar2 = objG2 instanceof pwa ? (pwa) objG2 : null;
            String strB = pwaVar2 != null ? pwaVar2.b() : null;
            if (strB != null && (objA instanceof String)) {
                String str = (String) objA;
                HashMap<String, ArrayList<String>> map = qwd0Var.e;
                if (qwd0Var.b(str) != null) {
                    if (map.containsKey(strB)) {
                        arrayList = map.get(strB);
                    } else {
                        arrayList = new ArrayList<>();
                        map.put(strB, arrayList);
                    }
                    arrayList.add(str);
                }
            }
        }
    }
}
