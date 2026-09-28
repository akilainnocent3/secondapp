package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class w2z implements hoa {
    public static final v2z O;
    public static final w2z P;
    public final TreeMap<hoa.a<?>, Map<hoa.b, Object>> N;

    static {
        v2z v2zVar = new v2z();
        O = v2zVar;
        P = new w2z(new TreeMap(v2zVar));
    }

    public w2z(TreeMap<hoa.a<?>, Map<hoa.b, Object>> treeMap) {
        this.N = treeMap;
    }

    public static w2z U(hoa hoaVar) {
        if (w2z.class.equals(hoaVar.getClass())) {
            return (w2z) hoaVar;
        }
        TreeMap treeMap = new TreeMap(O);
        for (hoa.a<?> aVar : hoaVar.c()) {
            Set<hoa.b> setA = hoaVar.a(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (hoa.b bVar : setA) {
                arrayMap.put(bVar, hoaVar.g(aVar, bVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new w2z(treeMap);
    }

    @Override // defpackage.hoa
    public final Set<hoa.b> a(hoa.a<?> aVar) {
        Map<hoa.b, Object> map = this.N.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.hoa
    public final <ValueT> ValueT b(hoa.a<ValueT> aVar, ValueT valuet) {
        Map<hoa.b, Object> map = this.N.get(aVar);
        return map == null ? valuet : (ValueT) map.get((hoa.b) Collections.min(map.keySet()));
    }

    @Override // defpackage.hoa
    public final Set<hoa.a<?>> c() {
        return Collections.unmodifiableSet(this.N.keySet());
    }

    @Override // defpackage.hoa
    public final <ValueT> ValueT d(hoa.a<ValueT> aVar) {
        Map<hoa.b, Object> map = this.N.get(aVar);
        if (map != null) {
            return (ValueT) map.get((hoa.b) Collections.min(map.keySet()));
        }
        z9l.a(aVar, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.hoa
    public final boolean e(hoa.a<?> aVar) {
        return this.N.containsKey(aVar);
    }

    @Override // defpackage.hoa
    public final hoa.b f(hoa.a<?> aVar) {
        Map<hoa.b, Object> map = this.N.get(aVar);
        if (map != null) {
            return (hoa.b) Collections.min(map.keySet());
        }
        z9l.a(aVar, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.hoa
    public final <ValueT> ValueT g(hoa.a<ValueT> aVar, hoa.b bVar) {
        Map<hoa.b, Object> map = this.N.get(aVar);
        if (map == null) {
            z9l.a(aVar, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(bVar)) {
            return (ValueT) map.get(bVar);
        }
        nrh0.a(aVar, "Option does not exist: ", " with priority=", bVar);
        return null;
    }

    @Override // defpackage.hoa
    public final void h(gf6 gf6Var) {
        for (Map.Entry<hoa.a<?>, Map<hoa.b, Object>> entry : this.N.tailMap(hoa.a.a(Void.class, "camera2.captureRequest.option.")).entrySet()) {
            if (!entry.getKey().b().startsWith("camera2.captureRequest.option.")) {
                return;
            }
            hoa.a<?> key = entry.getKey();
            hf6.a aVar = gf6Var.a;
            hoa hoaVar = gf6Var.b;
            aVar.a.X(key, hoaVar.f(key), hoaVar.d(key));
        }
    }
}
