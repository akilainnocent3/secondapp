package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class mfx {
    public static final Object a(ifx ifxVar, dq7 dq7Var) {
        ifxVar.getClass();
        Bundle bundleA = ifxVar.v.a();
        if (bundleA == null) {
            o2g.a.getClass();
            bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        }
        Map<String, ffx> mapF = ifxVar.b.f();
        LinkedHashMap linkedHashMap = new LinkedHashMap(jpu.a(mapF.size()));
        Iterator<T> it = mapF.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((ffx) entry.getValue()).a);
        }
        return new s060(bundleA, linkedHashMap).X(ue80.b(dq7Var));
    }
}
