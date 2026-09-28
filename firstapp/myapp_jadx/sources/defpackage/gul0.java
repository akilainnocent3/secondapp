package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class gul0 {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public final void a(g3l0 g3l0Var, wmk0 wmk0Var) {
        tel0 tel0Var = new tel0(wmk0Var);
        TreeMap treeMap = this.a;
        for (Integer num : treeMap.keySet()) {
            qmk0 qmk0VarClone = wmk0Var.b.clone();
            ipk0 ipk0VarG = ((fpk0) treeMap.get(num)).g(g3l0Var, Collections.singletonList(tel0Var));
            int iG = ipk0VarG instanceof eok0 ? r5l0.g(((eok0) ipk0VarG).a.doubleValue()) : -1;
            if (iG == 2 || iG == -1) {
                wmk0Var.b = qmk0VarClone;
            }
        }
        TreeMap treeMap2 = this.b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            ipk0 ipk0VarG2 = ((fpk0) treeMap2.get((Integer) it.next())).g(g3l0Var, Collections.singletonList(tel0Var));
            if (ipk0VarG2 instanceof eok0) {
                r5l0.g(((eok0) ipk0VarG2).a.doubleValue());
            }
        }
    }
}
