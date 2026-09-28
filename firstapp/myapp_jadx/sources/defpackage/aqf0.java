package defpackage;

import android.util.SparseIntArray;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aqf0 implements ypf0 {
    @Override // defpackage.ypf0
    public final o4p a(String str, Collection<? extends BetSlipData> collection, tlo tloVar) {
        ArrayList arrayList;
        if (collection == null || collection.isEmpty() || tloVar == null) {
            return null;
        }
        o4p o4pVar = new o4p();
        o4pVar.a = SimulateBetConsts.BetslipType.SINGLE;
        o4pVar.b = tloVar;
        o4pVar.c = str;
        ArrayList arrayListA = n78.a(new ArrayList(collection), 1, new n78.b());
        int size = arrayListA.size();
        int i = 0;
        while (true) {
            arrayList = o4pVar.d;
            if (i >= size) {
                break;
            }
            Object obj = arrayListA.get(i);
            i++;
            List list = (List) obj;
            o4p.a aVar = new o4p.a();
            list.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aVar.b.add(new o4p.b((BetSlipData) it.next()));
            }
            arrayList.add(aVar);
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            int size3 = ((o4p.a) obj2).b.size();
            SparseIntArray sparseIntArray = o4pVar.e;
            sparseIntArray.put(size3, sparseIntArray.get(size3) + 1);
            int i3 = o4pVar.f;
            if (size3 <= i3) {
                i3 = size3;
            }
            o4pVar.f = i3;
            int i4 = o4pVar.g;
            if (size3 < i4) {
                size3 = i4;
            }
            o4pVar.g = size3;
        }
        o4pVar.o = arrayListA.size() > tloVar.m();
        return o4pVar;
    }
}
