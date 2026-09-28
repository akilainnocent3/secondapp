package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class jlc {

    public static class a {
        public final kn8<?> a;
        public final HashSet b = new HashSet();
        public final HashSet c = new HashSet();

        public a(kn8<?> kn8Var) {
            this.a = kn8Var;
        }
    }

    public static class b {
        public final bb30<?> a;
        public final boolean b;

        public b(bb30<?> bb30Var, boolean z) {
            this.a = bb30Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.a.equals(this.a) && bVar.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            kn8 kn8Var = (kn8) obj;
            a aVar = new a(kn8Var);
            Iterator it = kn8Var.b.iterator();
            while (it.hasNext()) {
                bb30 bb30Var = (bb30) it.next();
                boolean z = kn8Var.e == 0;
                b bVar = new b(bb30Var, !z);
                if (!map.containsKey(bVar)) {
                    map.put(bVar, new HashSet());
                }
                Set set = (Set) map.get(bVar);
                if (!set.isEmpty() && z) {
                    zqh0.a(bb30Var, "Multiple components provide ", ".");
                    return;
                }
                set.add(aVar);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            for (a aVar2 : (Set) it2.next()) {
                for (rmd rmdVar : aVar2.a.c) {
                    if (rmdVar.c == 0) {
                        Set<a> set2 = (Set) map.get(new b(rmdVar.a, rmdVar.b == 2));
                        if (set2 != null) {
                            for (a aVar3 : set2) {
                                aVar2.b.add(aVar3);
                                aVar3.c.add(aVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<a> hashSet = new HashSet();
        Iterator it3 = map.values().iterator();
        while (it3.hasNext()) {
            hashSet.addAll((Set) it3.next());
        }
        HashSet hashSet2 = new HashSet();
        for (a aVar4 : hashSet) {
            if (aVar4.c.isEmpty()) {
                hashSet2.add(aVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            a aVar5 = (a) hashSet2.iterator().next();
            hashSet2.remove(aVar5);
            i++;
            for (a aVar6 : aVar5.b) {
                aVar6.c.remove(aVar5);
                if (aVar6.c.isEmpty()) {
                    hashSet2.add(aVar6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (a aVar7 : hashSet) {
            if (!aVar7.c.isEmpty() && !aVar7.b.isEmpty()) {
                arrayList2.add(aVar7.a);
            }
        }
        throw new tmd("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
