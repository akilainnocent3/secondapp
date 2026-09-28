package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m1v extends pf implements jaj<Boolean, ieo, List<? extends t1v>, List<? extends ieo>, v1b<? super u1v>, Object> {
    @Override // defpackage.jaj
    public final Object l(Boolean bool, ieo ieoVar, List<? extends t1v> list, List<? extends ieo> list2, v1b<? super u1v> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        ieo ieoVar2 = ieoVar;
        List<? extends t1v> list3 = list;
        List<? extends ieo> list4 = list2;
        ((q1v) this.a).getClass();
        Object obj = null;
        if (!zBooleanValue) {
            return null;
        }
        for (Object obj2 : list3) {
            if (((t1v) obj2).c) {
                obj = obj2;
                break;
            }
        }
        t1v t1vVar = (t1v) obj;
        String str = t1vVar != null ? t1vVar.a : ieoVar2.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list4) {
            if (((ieo) obj3).b.equals(str)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj4 = arrayList.get(i2);
            i2++;
            if (!((ieo) obj4).a.equals(ieoVar2.a)) {
                arrayList2.add(obj4);
            }
        }
        ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj5 = arrayList2.get(i);
            i++;
            ieo ieoVar3 = (ieo) obj5;
            arrayList3.add(new l1v(ieoVar3.a, ieoVar3.d, ieoVar3.g, ieoVar3.c, ieoVar3.f));
        }
        return new u1v(a4h.f(list3), a4h.f(arrayList3));
    }
}
