package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class dbd implements yr5 {
    @Override // defpackage.yr5
    public final yr5.b a(iox ioxVar, iox ioxVar2) {
        if (ioxVar2.a != 304 || ioxVar == null) {
            return new yr5.b(ioxVar2);
        }
        anx anxVar = ioxVar.d;
        anx anxVar2 = ioxVar2.d;
        anxVar.getClass();
        Map<String, List<String>> map = anxVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), CollectionsKt.C0((Collection) entry.getValue()));
        }
        for (Map.Entry<String, List<String>> entry2 : anxVar2.a.entrySet()) {
            String key = entry2.getKey();
            List<String> value = entry2.getValue();
            String lowerCase = key.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            linkedHashMap.put(lowerCase, CollectionsKt.C0(value));
        }
        return new yr5.b(new iox(ioxVar2.a, ioxVar2.b, ioxVar2.c, new anx(kpu.l(linkedHashMap)), null, ioxVar2.f));
    }

    @Override // defpackage.yr5
    public final yr5.a b(iox ioxVar) {
        return new yr5.a(ioxVar);
    }
}
