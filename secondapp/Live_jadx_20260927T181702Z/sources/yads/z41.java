package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w41 f158609a = new w41();

    public final void a(List list, Map map) {
        List list2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            Object obj = oiVar.f153503c;
            if (kotlin.jvm.internal.m0.g(oiVar.f153502b, "media") && (obj instanceof on1) && (list2 = ((on1) obj).f153570c) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    this.f158609a.getClass();
                    if (w41.a((u41) obj2, map)) {
                        arrayList.add(obj2);
                    }
                }
                list2.retainAll(arrayList);
            }
        }
    }
}
