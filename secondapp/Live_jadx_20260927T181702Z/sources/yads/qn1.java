package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qn1 {
    public static Set a(fy1 fy1Var) {
        List list = fy1Var.f149298b;
        ArrayList arrayList = new ArrayList(fr.i0.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((oi) it.next()).f153503c);
        }
        return fr.r0.f6(fr.o0.h1(arrayList, on1.class));
    }
}
