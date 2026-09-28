package defpackage;

import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class bqf0 implements ypf0 {
    @Override // defpackage.ypf0
    public final o4p a(String str, Collection<? extends BetSlipData> collection, tlo tloVar) {
        if (collection == null || collection.isEmpty() || tloVar == null) {
            return null;
        }
        o4p.c cVar = new o4p.c();
        o4p o4pVar = cVar.a;
        o4pVar.a = "system";
        o4pVar.b = tloVar;
        o4pVar.c = str;
        int i = 1;
        if (collection.size() > geo.d) {
            o4p o4pVarA = cVar.a();
            o4pVarA.o = true;
            return o4pVarA;
        }
        Collection<? extends BetSlipData> collection2 = collection;
        ArrayList arrayList = new ArrayList(l48.r(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((BetSlipData) it.next()).eventId);
        }
        int size = CollectionsKt.E0(arrayList).size();
        if (1 <= size) {
            while (true) {
                ArrayList arrayListA = n78.a(new ArrayList(collection), i, new n78.c());
                int size2 = arrayListA.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj = arrayListA.get(i2);
                    i2++;
                    List list = (List) obj;
                    o4p.a aVar = new o4p.a();
                    list.getClass();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        aVar.b.add(new o4p.b((BetSlipData) it2.next()));
                    }
                    o4pVar.d.add(aVar);
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        o4p o4pVarA2 = cVar.a();
        o4pVarA2.o = false;
        return o4pVarA2;
    }
}
