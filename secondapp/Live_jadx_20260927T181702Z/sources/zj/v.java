package zj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class v {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g<?> f161985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set<b> f161986b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<b> f161987c = new HashSet();

        public b(g<?> gVar) {
            this.f161985a = gVar;
        }

        public void a(b bVar) {
            this.f161986b.add(bVar);
        }

        public void b(b bVar) {
            this.f161987c.add(bVar);
        }

        public g<?> c() {
            return this.f161985a;
        }

        public Set<b> d() {
            return this.f161986b;
        }

        public boolean e() {
            return this.f161986b.isEmpty();
        }

        public boolean f() {
            return this.f161987c.isEmpty();
        }

        public void g(b bVar) {
            this.f161987c.remove(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k0<?> f161988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f161989b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f161988a.equals(this.f161988a) && cVar.f161989b == this.f161989b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f161988a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f161989b).hashCode();
        }

        public c(k0<?> k0Var, boolean z10) {
            this.f161988a = k0Var;
            this.f161989b = z10;
        }
    }

    public static void a(List<g<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new x(arrayList);
    }

    public static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set<b> c(List<g<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<g<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (w wVar : bVar.c().j()) {
                            if (wVar.f() && (set = (Set) map.get(new c(wVar.d(), wVar.h()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            g<?> next = it.next();
            b bVar3 = new b(next);
            for (k0<? super Object> k0Var : next.m()) {
                c cVar = new c(k0Var, !next.v());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f161989b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", k0Var));
                }
                set2.add(bVar3);
            }
        }
    }
}
