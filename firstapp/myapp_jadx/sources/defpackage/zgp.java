package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zgp {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final String a(ygp<?> ygpVar) {
        ygpVar.getClass();
        ConcurrentHashMap concurrentHashMap = a;
        String str = (String) concurrentHashMap.get(ygpVar);
        if (str != null) {
            return str;
        }
        String name = tgp.b(ygpVar).getName();
        concurrentHashMap.put(ygpVar, name);
        return name;
    }
}
