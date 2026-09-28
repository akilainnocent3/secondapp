package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class izn {
    public static hzn.a a(h2o h2oVar, List list, jzn jznVar, List list2) {
        Object next;
        List<gun> list3;
        Object next2;
        qgy.a aVar;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((fun) next).c != jznVar);
        fun funVar = (fun) next;
        if (funVar != null && (list3 = funVar.h) != null) {
            Iterator<T> it2 = list3.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((gun) next2).d.equals(String.valueOf(h2oVar.b)));
            gun gunVar = (gun) next2;
            if (gunVar != null) {
                if (!gunVar.e) {
                    aVar = qgy.a.v;
                } else if (list2.isEmpty()) {
                    aVar = qgy.a.f;
                } else {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((h3o) it3.next()).c.equals(gunVar)) {
                            aVar = qgy.a.i;
                        }
                    }
                    aVar = qgy.a.f;
                }
                String string = gunVar.b.toString();
                string.getClass();
                return new hzn.a(jznVar, gunVar.a, new qgy(null, gky.a.a(string, false), aVar));
            }
        }
        return null;
    }
}
