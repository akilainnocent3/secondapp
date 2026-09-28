package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class c980 {
    public final wwd0 a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("EARLY_PAYOUT", 0);
            a = aVar;
            a aVar2 = new a("NEVER_DOWN", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public c980() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.a = xwd0.a(o2gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, o2g] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    public final void a(a aVar) {
        wwd0 wwd0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            Map map = (Map) value;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(jpu.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Map map2 = (Map) entry.getValue();
                map2.getClass();
                ?? linkedHashMap3 = new LinkedHashMap(map2);
                linkedHashMap3.remove(aVar);
                int size = linkedHashMap3.size();
                if (size == 0) {
                    linkedHashMap3 = o2g.a;
                    linkedHashMap3.getClass();
                } else if (size == 1) {
                    Map.Entry entry2 = (Map.Entry) linkedHashMap3.entrySet().iterator().next();
                    linkedHashMap3 = Collections.singletonMap(entry2.getKey(), entry2.getValue());
                    linkedHashMap3.getClass();
                }
                linkedHashMap2.put(key, linkedHashMap3);
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                if (!((Map) entry3.getValue()).isEmpty()) {
                    linkedHashMap.put(entry3.getKey(), entry3.getValue());
                }
            }
        } while (!wwd0Var.g(value, linkedHashMap));
    }

    public final void b(List<? extends Selection> list, a aVar) {
        wwd0 wwd0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(o980.a((Selection) it.next()));
        }
        Set setE0 = CollectionsKt.E0(arrayList);
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            Map map = (Map) value;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(jpu.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                String str = (String) entry.getKey();
                Map mapSingletonMap = (Map) entry.getValue();
                if (setE0.contains(str)) {
                    mapSingletonMap.getClass();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapSingletonMap);
                    linkedHashMap3.remove(aVar);
                    int size = linkedHashMap3.size();
                    if (size == 0) {
                        mapSingletonMap = o2g.a;
                        mapSingletonMap.getClass();
                    } else if (size != 1) {
                        mapSingletonMap = linkedHashMap3;
                    } else {
                        Map.Entry entry2 = (Map.Entry) linkedHashMap3.entrySet().iterator().next();
                        mapSingletonMap = Collections.singletonMap(entry2.getKey(), entry2.getValue());
                        mapSingletonMap.getClass();
                    }
                }
                linkedHashMap2.put(key, mapSingletonMap);
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                if (!((Map) entry3.getValue()).isEmpty()) {
                    linkedHashMap.put(entry3.getKey(), entry3.getValue());
                }
            }
        } while (!wwd0Var.g(value, linkedHashMap));
    }

    public final Boolean c(Selection selection, a aVar) {
        selection.getClass();
        Map map = (Map) ((Map) this.a.getValue()).get(o980.a(selection));
        if (map != null) {
            return (Boolean) map.get(aVar);
        }
        return null;
    }

    public final void d(List<? extends Selection> list, a aVar, boolean z) {
        wwd0 wwd0Var;
        Object value;
        LinkedHashMap linkedHashMapM;
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            Map map = (Map) value;
            linkedHashMapM = kpu.m(map);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String strA = o980.a((Selection) it.next());
                Map map2 = (Map) map.get(strA);
                if (map2 == null) {
                    map2 = o2g.a;
                    map2.getClass();
                }
                linkedHashMapM.put(strA, kpu.i(map2, new Pair(aVar, Boolean.valueOf(z))));
            }
        } while (!wwd0Var.g(value, linkedHashMapM));
    }
}
