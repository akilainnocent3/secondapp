package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c570 extends pf implements kaj<ni70, Long, Map<String, ? extends v470>, String, List<? extends q570>, v1b<? super Map<String, ? extends qcn<? extends r570>>>, Object> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kaj
    public final Object f(ni70 ni70Var, Long l, Map<String, ? extends v470> map, String str, List<? extends q570> list, v1b<? super Map<String, ? extends qcn<? extends r570>>> v1bVar) throws Throwable {
        Object next;
        LinkedHashMap linkedHashMap;
        List<e970> list2;
        Throwable th;
        Object next2;
        v470.c cVar;
        long j;
        o470 o470Var;
        Map<String, ? extends v470> map2;
        r570.a aVar;
        String str2;
        int i;
        int i2;
        List<q470> list3;
        int i3;
        r470 r470Var;
        List<q470> list4;
        int i4;
        r470 r470Var2;
        Object next3;
        v470.c cVar2;
        long jLongValue = l.longValue();
        Map<String, ? extends v470> map3 = map;
        String str3 = str;
        List<? extends q570> list5 = list;
        ((j570) this.a).getClass();
        Iterator<T> it = ni70Var.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((l770) next).a.equals(str3));
        l770 l770Var = (l770) next;
        if (l770Var == null || (list2 = l770Var.d) == null) {
            linkedHashMap = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((e970) obj).b(jLongValue)) {
                    arrayList.add(obj);
                }
            }
            int i5 = 10;
            int iA = jpu.a(l48.r(arrayList, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj2 = arrayList.get(i6);
                i6++;
                e970 e970Var = (e970) obj2;
                String str4 = e970Var.a;
                v470 v470Var = map3.get(str4);
                Iterator<T> it2 = list5.iterator();
                do {
                    if (!it2.hasNext()) {
                        th = null;
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    th = null;
                } while (!((q570) next2).a.equals(str4));
                q570 q570Var = (q570) next2;
                Object obj3 = q570Var != null ? q570Var.b : th;
                List<z370> list6 = e970Var.i;
                ArrayList arrayList2 = new ArrayList(l48.r(list6, i5));
                for (z370 z370Var : list6) {
                    String str5 = z370Var.a;
                    if (v470Var instanceof v470.c) {
                        cVar2 = (v470.c) v470Var;
                    } else {
                        cVar = th;
                    }
                    if (cVar != 0) {
                        cVar = cVar2;
                        Iterator<T> it3 = cVar.a.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                j = jLongValue;
                                next3 = th;
                                break;
                            }
                            next3 = it3.next();
                            j = jLongValue;
                            if (((o470) next3).a.equals(str5)) {
                                break;
                            }
                            jLongValue = j;
                        }
                        o470Var = (o470) next3;
                    } else {
                        j = jLongValue;
                        o470Var = th;
                    }
                    if (o470Var != 0) {
                        cVar = cVar2;
                        map2 = map3;
                        boolean z = j >= o470Var.d;
                        if (str5.equals(obj3) && !z) {
                            aVar = r570.a.SELECTED_RUNNING;
                        } else if (str5.equals(obj3)) {
                            aVar = r570.a.SELECTED_COMPLETED;
                        } else {
                            aVar = !z ? r570.a.RUNNING : r570.a.COMPLETED;
                        }
                    } else {
                        cVar = cVar2;
                        map2 = map3;
                        aVar = r570.a.WAITING;
                    }
                    r570.a aVar2 = aVar;
                    if (o470Var == 0 || (list4 = o470Var.e) == null) {
                        str2 = str5;
                        i = 0;
                    } else {
                        if (list4.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator it4 = list4.iterator();
                            i = 0;
                            while (it4.hasNext()) {
                                q470 q470Var = (q470) it4.next();
                                String str6 = str5;
                                s470 s470Var = q470Var.g;
                                it4 = it4;
                                if (s470Var == null || s470Var != s470.HOME || (r470Var2 = q470Var.f) == null || r470Var2 != r470.GOAL) {
                                    i4 = i;
                                } else {
                                    i4 = i;
                                    if (j >= q470Var.d) {
                                        i = i4 + 1;
                                        if (i < 0) {
                                            b.p();
                                            throw th;
                                        }
                                    }
                                    str5 = str6;
                                }
                                i = i4;
                                str5 = str6;
                            }
                        }
                        str2 = str5;
                    }
                    if (o470Var == 0 || (list3 = o470Var.e) == null || list3.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator it5 = list3.iterator();
                        i2 = 0;
                        while (it5.hasNext()) {
                            q470 q470Var2 = (q470) it5.next();
                            s470 s470Var2 = q470Var2.g;
                            it5 = it5;
                            if (s470Var2 == null || s470Var2 != s470.AWAY || (r470Var = q470Var2.f) == null || r470Var != r470.GOAL) {
                                i3 = i2;
                                i2 = i3;
                            } else {
                                i3 = i2;
                                if (j >= q470Var2.d) {
                                    i2 = i3 + 1;
                                    if (i2 < 0) {
                                        b.p();
                                        throw th;
                                    }
                                } else {
                                    i2 = i3;
                                }
                            }
                        }
                    }
                    arrayList2.add(new r570(str2, z370Var.c, z370Var.d, String.valueOf(i), z370Var.f, z370Var.g, String.valueOf(i2), aVar2));
                    map3 = map2;
                    jLongValue = j;
                }
                linkedHashMap2.put(str4, a4h.b(arrayList2));
                i5 = 10;
            }
            linkedHashMap = linkedHashMap2;
        }
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return o2gVar;
    }
}
