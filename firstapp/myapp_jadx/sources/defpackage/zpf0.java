package defpackage;

import android.util.SparseIntArray;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class zpf0 implements ypf0 {
    /* JADX WARN: Code duplicated, block: B:41:0x00f5 A[LOOP:8: B:40:0x00f3->B:41:0x00f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0106  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113 A[LOOP:10: B:45:0x0111->B:46:0x0113, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // defpackage.ypf0
    public final o4p a(String str, Collection<? extends BetSlipData> collection, tlo tloVar) {
        int i;
        ?? arrayList;
        int size;
        int i2;
        int size2;
        int i3;
        ArrayList arrayList2;
        int size3;
        int i4;
        int size4;
        ArrayList arrayList3;
        if (collection == null || collection.isEmpty() || tloVar == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : collection) {
            String str2 = ((BetSlipData) obj).eventId;
            Object objA = linkedHashMap.get(str2);
            if (objA == null) {
                objA = r9i.a(str2, linkedHashMap);
            }
            ((List) objA).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(jpu.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), new HashSet((Collection) entry.getValue()));
        }
        if (linkedHashMap2.size() < 2) {
            return null;
        }
        o4p o4pVar = new o4p();
        o4pVar.a = SimulateBetConsts.BetslipType.MULTIPLE;
        o4pVar.b = tloVar;
        o4pVar.c = str;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = linkedHashMap2.values().iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            HashSet hashSet = (HashSet) it.next();
            if (hashSet.size() > 1) {
                arrayList4.add(CollectionsKt.A0(hashSet));
            } else {
                Object objS = CollectionsKt.S(hashSet);
                objS.getClass();
                arrayList5.add(objS);
            }
        }
        if (arrayList4.isEmpty()) {
            arrayList = new ArrayList();
            size = arrayList4.size();
            i2 = 0;
            size2 = 1;
            while (i2 < size) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                size2 *= ((List) obj2).size();
            }
            for (i3 = 0; i3 < size2; i3++) {
                arrayList2 = new ArrayList();
                size3 = arrayList4.size();
                i4 = 0;
                size4 = i;
                while (i4 < size3) {
                    Object obj3 = arrayList4.get(i4);
                    i4++;
                    List list = (List) obj3;
                    arrayList2.add(list.get((i3 / size4) % list.size()));
                    size4 *= list.size();
                    i = i;
                }
                arrayList.add(arrayList2);
            }
        } else {
            int size5 = arrayList4.size();
            int i5 = 0;
            while (true) {
                if (i5 < size5) {
                    Object obj4 = arrayList4.get(i5);
                    i5++;
                    if (((List) obj4).isEmpty()) {
                        arrayList = m2g.a;
                    }
                } else {
                    arrayList = new ArrayList();
                    size = arrayList4.size();
                    i2 = 0;
                    size2 = 1;
                    while (i2 < size) {
                        Object obj5 = arrayList4.get(i2);
                        i2++;
                        size2 *= ((List) obj5).size();
                    }
                    while (i3 < size2) {
                        arrayList2 = new ArrayList();
                        size3 = arrayList4.size();
                        i4 = 0;
                        size4 = i;
                        while (i4 < size3) {
                            Object obj6 = arrayList4.get(i4);
                            i4++;
                            List list2 = (List) obj6;
                            arrayList2.add(list2.get((i3 / size4) % list2.size()));
                            size4 *= list2.size();
                            i = i;
                        }
                        arrayList.add(arrayList2);
                    }
                }
            }
        }
        int i6 = i;
        int size6 = 0;
        for (List list3 : arrayList) {
            list3.addAll(arrayList5);
            if (size6 == 0) {
                size6 = list3.size();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            arrayList3 = o4pVar.d;
            if (!zHasNext) {
                break;
            }
            List list4 = (List) it2.next();
            o4p.a aVar = new o4p.a();
            list4.getClass();
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                aVar.b.add(new o4p.b((BetSlipData) it3.next()));
            }
            arrayList3.add(aVar);
        }
        int size7 = arrayList3.size();
        int i7 = 0;
        while (i7 < size7) {
            Object obj7 = arrayList3.get(i7);
            i7++;
            int size8 = ((o4p.a) obj7).b.size();
            SparseIntArray sparseIntArray = o4pVar.e;
            sparseIntArray.put(size8, sparseIntArray.get(size8) + 1);
            int i8 = o4pVar.f;
            if (size8 <= i8) {
                i8 = size8;
            }
            o4pVar.f = i8;
            int i9 = o4pVar.g;
            if (size8 < i9) {
                size8 = i9;
            }
            o4pVar.g = size8;
        }
        o4pVar.o = size6 > tloVar.m() ? i6 : 0;
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_INSTANT_WIN);
        aVar2.a(avg.a(System.currentTimeMillis() - jCurrentTimeMillis, "TicketDataCreatorMultiple - execute time = "), new Object[0]);
        return o4pVar;
    }
}
