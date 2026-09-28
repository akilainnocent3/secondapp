package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bf70 extends pf implements kaj<ni70, Long, Map<String, ? extends v470>, String, List<? extends q570>, v1b<? super List<? extends f870>>, Object> {
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    @Override // defpackage.kaj
    public final Object f(ni70 ni70Var, Long l, Map<String, ? extends v470> map, String str, List<? extends q570> list, v1b<? super List<? extends f870>> v1bVar) {
        Object next;
        Object next2;
        f870 f870Var;
        Object next3;
        f870.a c0548a;
        List<q470> list2;
        long jLongValue = l.longValue();
        Map<String, ? extends v470> map2 = map;
        String str2 = str;
        List<? extends q570> list3 = list;
        ((we70) this.a).getClass();
        Iterator<T> it = ni70Var.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((l770) next).a.equals(str2));
        l770 l770Var = (l770) next;
        if (l770Var == null) {
            return m2g.a;
        }
        List<e970> list4 = l770Var.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list4) {
            e970 e970Var = (e970) obj;
            boolean zB = e970Var.b(jLongValue);
            long jI = c.i(e970Var.h - jLongValue, rgf.MILLISECONDS);
            b.a aVar = b.b;
            boolean z = b.j(jI, rgf.SECONDS) <= 0;
            if (zB && !z) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            int i2 = i + 1;
            String str3 = ((e970) obj2).a;
            Iterator<T> it2 = list3.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((q570) next2).a.equals(str3));
            q570 q570Var = (q570) next2;
            if (q570Var != null) {
                String str4 = q570Var.b;
                v470 v470Var = map2.get(str3);
                if (v470Var instanceof v470.c) {
                    Iterator<T> it3 = ((v470.c) v470Var).a.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (!((o470) next3).a.equals(str4));
                    o470 o470Var = (o470) next3;
                    List listR0 = (o470Var == null || (list2 = o470Var.e) == null) ? null : CollectionsKt.r0(list2, new xe70());
                    if (listR0 == null) {
                        listR0 = m2g.a;
                    }
                    if (listR0.isEmpty()) {
                        f870Var = null;
                    } else {
                        Iterator it4 = listR0.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i3 = -1;
                                break;
                            }
                            q470 q470Var = (q470) it4.next();
                            long j = q470Var.b;
                            long j2 = q470Var.c;
                            if (j <= jLongValue && jLongValue < j2) {
                                break;
                            }
                            i3++;
                        }
                        if (i3 == -1) {
                            f870Var = null;
                        } else {
                            q470 q470Var2 = (q470) listR0.get(i3);
                            long j3 = q470Var2.d;
                            if (jLongValue >= j3) {
                                long j4 = jLongValue - j3;
                                r470 r470Var = q470Var2.f;
                                int i4 = r470Var != null ? we70.a.a[r470Var.ordinal()] : -1;
                                if (i4 == 1) {
                                    c0548a = new f870.a.C0548a(j4);
                                } else if (i4 == 2) {
                                    c0548a = new f870.a.b(j4);
                                }
                                f870Var = new f870(str4, q470Var2.a, q470Var2.h, jLongValue - q470Var2.b, c0548a);
                            }
                            c0548a = null;
                            f870Var = new f870(str4, q470Var2.a, q470Var2.h, jLongValue - q470Var2.b, c0548a);
                        }
                    }
                } else {
                    f870Var = null;
                }
            } else {
                f870Var = null;
            }
            if (f870Var != null) {
                arrayList2.add(f870Var);
            }
            i = i2;
        }
        return arrayList2;
    }
}
