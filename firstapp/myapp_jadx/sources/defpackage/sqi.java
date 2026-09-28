package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class sqi {
    public static List a(List list, List list2, LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            nqi nqiVar = (nqi) it.next();
            List<kl00> list3 = nqiVar.g;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list3) {
                if (!linkedHashSet.contains(((kl00) obj).a)) {
                    arrayList2.add(obj);
                }
            }
            nqi nqiVarA = nqi.a(nqiVar, false, null, arrayList2, 63);
            nqi nqiVar2 = nqiVarA.g.isEmpty() ? null : nqiVarA;
            if (nqiVar2 != null) {
                arrayList.add(nqiVar2);
            }
        }
        return arrayList.isEmpty() ? list : CollectionsKt.i0(arrayList, list);
    }

    public static final void b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            kb5.a(i != i2 ? n36.a("Both size ", i, i2, " and step ", " must be greater than zero.") : pe4.b(i, "size ", " must be greater than zero."));
        }
    }

    public static final Iterator c(Iterator it, int i, int i2) {
        it.getClass();
        return !it.hasNext() ? l2g.a : zc80.a(new f1a0(i, i2, it, null));
    }
}
