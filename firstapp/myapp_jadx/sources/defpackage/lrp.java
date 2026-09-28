package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class lrp {
    public final krp a = new krp();
    public final boolean b = true;

    public final void a(List<t3w> list) {
        Object next;
        lrp lrpVar = this;
        krp krpVar = lrpVar.a;
        krpVar.getClass();
        LinkedHashSet<t3w> linkedHashSet = new LinkedHashSet();
        gx0 gx0Var = new gx0(new ep50(list));
        while (!gx0Var.isEmpty()) {
            t3w t3wVar = (t3w) gx0Var.removeLast();
            if (linkedHashSet.add(t3wVar)) {
                ArrayList arrayList = t3wVar.e;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    t3w t3wVar2 = (t3w) obj;
                    if (!linkedHashSet.contains(t3wVar2)) {
                        gx0Var.addLast(t3wVar2);
                    }
                }
            }
        }
        aon aonVar = krpVar.d;
        ConcurrentHashMap concurrentHashMap = aonVar.c;
        for (t3w t3wVar3 : linkedHashSet) {
            for (Map.Entry<String, ynn<?>> entry : t3wVar3.c.entrySet()) {
                String key = entry.getKey();
                ynn<?> value = entry.getValue();
                krp krpVar2 = aonVar.a;
                key.getClass();
                value.getClass();
                yd2<?> yd2Var = value.a;
                ConcurrentHashMap concurrentHashMap2 = aonVar.b;
                if (((ynn) concurrentHashMap2.get(key)) != null) {
                    if (!lrpVar.b) {
                        throw new vjd("Already existing definition for " + yd2Var + " at " + key);
                    }
                    b21 b21Var = krpVar2.a;
                    b21Var.getClass();
                    b21Var.f(v6s.c, "(+) override index '" + key + "' -> '" + yd2Var + '\'');
                    Iterator it = concurrentHashMap.values().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((pu90) next).a.equals(yd2Var));
                    if (((pu90) next) != null) {
                        concurrentHashMap.remove(Integer.valueOf(yd2Var.hashCode()));
                    }
                }
                b21 b21Var2 = krpVar2.a;
                b21Var2.getClass();
                b21Var2.f(v6s.a, "(+) index '" + key + "' -> '" + yd2Var + '\'');
                concurrentHashMap2.put(key, value);
                lrpVar = this;
            }
            Iterator<T> it2 = t3wVar3.b.iterator();
            while (it2.hasNext()) {
                pu90 pu90Var = (pu90) it2.next();
                concurrentHashMap.put(Integer.valueOf(pu90Var.a.hashCode()), pu90Var);
            }
            lrpVar = this;
        }
        zn70 zn70Var = krpVar.c;
        zn70Var.getClass();
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            zn70Var.b.addAll(((t3w) it3.next()).d);
        }
    }
}
