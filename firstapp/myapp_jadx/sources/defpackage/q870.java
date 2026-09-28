package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballMarketHandlerImpl$init$2", f = "ScheduledFootballMarketHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q870 extends tje0 implements Function2<ni70, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ i870 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q870(i870 i870Var, v1b<? super q870> v1bVar) {
        super(2, v1bVar);
        this.b = i870Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        q870 q870Var = new q870(this.b, v1bVar);
        q870Var.a = obj;
        return q870Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ni70 ni70Var, v1b<? super Unit> v1bVar) {
        return ((q870) create(ni70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021d  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        Object value3;
        ArrayList arrayList3;
        Object next;
        String str;
        v870 v870Var;
        w870 w870Var;
        List<g870> list;
        g870 g870Var;
        List<z370> list2;
        z370 z370Var;
        ni70 ni70Var = (ni70) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List<l770> list3 = ni70Var.c;
        ArrayList arrayList4 = new ArrayList();
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            p48.w(((l770) it.next()).d, arrayList4);
        }
        e970 e970Var = (e970) CollectionsKt.firstOrNull(arrayList4);
        List<g870> list4 = (e970Var == null || (list2 = e970Var.i) == null || (z370Var = (z370) CollectionsKt.firstOrNull(list2)) == null) ? null : z370Var.i;
        if (list4 == null) {
            list4 = m2g.a;
        }
        i870 i870Var = this.b;
        wwd0 wwd0Var = i870Var.a;
        do {
            value = wwd0Var.getValue();
            HashSet hashSet = new HashSet();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : list4) {
                if (hashSet.add(((g870) obj2).e)) {
                    arrayList5.add(obj2);
                }
            }
            arrayList = new ArrayList(l48.r(arrayList5, 10));
            int size = arrayList5.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList5.get(i);
                i++;
                g870 g870Var2 = (g870) obj3;
                arrayList.add(new d970(g870Var2.e, g870Var2.c));
            }
        } while (!wwd0Var.g(value, a4h.b(arrayList)));
        wwd0 wwd0Var2 = i870Var.b;
        do {
            value2 = wwd0Var2.getValue();
            List list5 = (List) value2;
            int iA = jpu.a(l48.r(list5, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj4 : list5) {
                linkedHashMap.put(((c970) obj4).a, obj4);
            }
            arrayList2 = new ArrayList(l48.r(arrayList4, 10));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj5 = arrayList4.get(i2);
                i2++;
                e970 e970Var2 = (e970) obj5;
                c970 c970Var = (c970) linkedHashMap.get(e970Var2.a);
                if (c970Var == null) {
                    String str2 = e970Var2.a;
                    z370 z370Var2 = (z370) CollectionsKt.firstOrNull(e970Var2.i);
                    String str3 = (z370Var2 == null || (list = z370Var2.i) == null || (g870Var = (g870) CollectionsKt.firstOrNull(list)) == null) ? null : g870Var.e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c970Var = new c970(str2, str3);
                }
                arrayList2.add(c970Var);
            }
        } while (!wwd0Var2.g(value2, arrayList2));
        Map<String, String> map = ni70Var.a.g;
        wwd0 wwd0Var3 = i870Var.d;
        do {
            value3 = wwd0Var3.getValue();
            List list6 = (List) value3;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj6 : list4) {
                h870 h870Var = ((g870) obj6).g;
                if (h870Var != null && (v870Var = h870Var.d) != null && (w870Var = v870Var.a) != null && w870Var == w870.COMBO) {
                    arrayList6.add(obj6);
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int size3 = arrayList6.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj7 = arrayList6.get(i3);
                i3++;
                String str4 = ((g870) obj7).e;
                Object objA = linkedHashMap2.get(str4);
                if (objA == null) {
                    objA = r9i.a(str4, linkedHashMap2);
                }
                ((List) objA).add(obj7);
            }
            arrayList3 = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                String str5 = (String) entry.getKey();
                List list7 = (List) entry.getValue();
                Iterator it2 = list6.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.g(((bl70) next).a, str5));
                bl70 bl70Var = (bl70) next;
                if (bl70Var == null) {
                    String str6 = "near";
                    if (map == null || (str = map.get(str5)) == null) {
                        sfh0.a aVar = sfh0.b;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it3 = list7.iterator();
                        while (it3.hasNext()) {
                            String str7 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(((g870) it3.next()).d, new String[]{";"}, false, 0, 6, null));
                            if (str7 != null) {
                                arrayList7.add(str7);
                            }
                        }
                        if (arrayList7.contains(str)) {
                            str6 = str;
                        } else {
                            sfh0.b.getClass();
                            if (sfh0.a.a(str) != null) {
                                str6 = str;
                            }
                        }
                    }
                    bl70Var = new bl70(str5, str6);
                }
                arrayList3.add(bl70Var);
            }
        } while (!wwd0Var3.g(value3, arrayList3));
        return Unit.a;
    }
}
