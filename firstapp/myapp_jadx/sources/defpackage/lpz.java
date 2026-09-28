package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lpz {
    public static final fiv a(oxr oxrVar, int i, long j, hpz hpzVar, long j2, ht.c cVar, asr asrVar, int i2, msw mswVar) {
        List list;
        i3z i3zVar = i3z.a;
        Object objG = hpzVar.g(i);
        List list2 = (List) mswVar.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List<vhv> listE = oxrVar.e(i);
            int size = listE.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(listE.get(i3).d0(j));
            }
            mswVar.h(i, arrayList);
            list = arrayList;
        }
        return new fiv(i, i2, list, j2, objG, cVar, asrVar);
    }
}
