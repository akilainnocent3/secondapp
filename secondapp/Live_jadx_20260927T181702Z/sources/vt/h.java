package vt;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class h {
    @l
    public static final List<ut.a.e.c> a(@l List<ut.a.e.c> list) {
        m0.p(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (ut.a.e.c cVar : list) {
            int iC = cVar.C();
            for (int i10 = 0; i10 < iC; i10++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
