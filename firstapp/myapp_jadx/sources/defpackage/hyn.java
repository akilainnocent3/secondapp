package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class hyn {
    public final k5b a;
    public final wwd0 b = xwd0.a(n1a0.c);
    public final wwd0 c;
    public final wwd0 d;

    public hyn(k5b k5bVar) {
        this.a = k5bVar;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.c = xwd0.a(o2gVar);
        this.d = xwd0.a(o2gVar);
    }

    public final void a() {
        wwd0 wwd0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
            Map map = (Map) value;
            linkedHashMap = new LinkedHashMap(jpu.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), ntn.a((ntn) entry.getValue(), t3g.a));
            }
        } while (!wwd0Var.g(value, linkedHashMap));
    }

    public final void b() {
        wwd0 wwd0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            wwd0Var = this.c;
            value = wwd0Var.getValue();
            Map map = (Map) value;
            linkedHashMap = new LinkedHashMap(jpu.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ozn oznVar = (ozn) entry.getValue();
                int i = oznVar.a;
                ArrayList arrayList = new ArrayList(i);
                for (int iA = 0; iA < i; iA = ndv.a(-1, iA, 1, arrayList)) {
                }
                linkedHashMap.put(key, new ozn(oznVar.a, arrayList));
            }
        } while (!wwd0Var.g(value, linkedHashMap));
    }

    public final void c(jzn jznVar) {
        wwd0 wwd0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
            Map map = (Map) value;
            linkedHashMap = new LinkedHashMap(jpu.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                jzn jznVar2 = (jzn) entry.getKey();
                ntn ntnVarA = (ntn) entry.getValue();
                if (jznVar2 == jznVar) {
                    ntnVarA = ntn.a(ntnVarA, t3g.a);
                }
                linkedHashMap.put(key, ntnVarA);
            }
        } while (!wwd0Var.g(value, linkedHashMap));
    }

    public final void d(jzn jznVar) {
        wwd0 wwd0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            wwd0Var = this.c;
            value = wwd0Var.getValue();
            Map map = (Map) value;
            linkedHashMap = new LinkedHashMap(jpu.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                jzn jznVar2 = (jzn) entry.getKey();
                ozn oznVar = (ozn) entry.getValue();
                if (jznVar2 == jznVar) {
                    int i = oznVar.a;
                    ArrayList arrayList = new ArrayList(i);
                    for (int iA = 0; iA < i; iA = ndv.a(-1, iA, 1, arrayList)) {
                    }
                    oznVar = new ozn(oznVar.a, arrayList);
                }
                linkedHashMap.put(key, oznVar);
            }
        } while (!wwd0Var.g(value, linkedHashMap));
    }
}
