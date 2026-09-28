package defpackage;

import android.util.ArrayMap;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ftw extends w2z implements csw {
    public static ftw V() {
        return new ftw(new TreeMap(w2z.O));
    }

    public static ftw W(hoa hoaVar) {
        TreeMap treeMap = new TreeMap(w2z.O);
        for (hoa.a<?> aVar : hoaVar.c()) {
            Set<hoa.b> setA = hoaVar.a(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (hoa.b bVar : setA) {
                arrayMap.put(bVar, hoaVar.g(aVar, bVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new ftw(treeMap);
    }

    public final <ValueT> void Y(hoa.a<ValueT> aVar, ValueT valuet) {
        X(aVar, hoa.b.d, valuet);
    }

    public final <ValueT> void X(hoa.a<ValueT> aVar, hoa.b bVar, ValueT valuet) {
        hoa.b bVar2;
        TreeMap<hoa.a<?>, Map<hoa.b, Object>> treeMap = this.N;
        Map<hoa.b, Object> map = treeMap.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put((hoa.a<?>) aVar, arrayMap);
            arrayMap.put(bVar, valuet);
            return;
        }
        hoa.b bVar3 = (hoa.b) Collections.min(map.keySet());
        if (Objects.equals(map.get(bVar3), valuet) || bVar3 != (bVar2 = hoa.b.c) || bVar != bVar2) {
            map.put(bVar, valuet);
            return;
        }
        StringBuilder sb = new StringBuilder("Option values conflicts: ");
        sb.append(aVar.b());
        sb.append(oLsIjJCWb.mNZmcVlicngssWX);
        sb.append(bVar3);
        Object obj = map.get(bVar3);
        sb.append(")=");
        sb.append(obj);
        sb.append(", conflicting (");
        sb.append(bVar);
        sb.append(")=");
        sb.append(valuet);
        throw new IllegalArgumentException(sb.toString());
    }
}
