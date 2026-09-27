package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kj {
    public static Set a(List list) {
        ArrayList arrayList = new ArrayList(fr.i0.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((oi) it.next()).f153503c);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            List listL = obj instanceof u41 ? fr.g0.l(obj) : obj instanceof on1 ? ((on1) obj).f153570c : null;
            if (listL != null) {
                arrayList2.add(listL);
            }
        }
        return fr.r0.f6(fr.i0.f0(arrayList2));
    }
}
