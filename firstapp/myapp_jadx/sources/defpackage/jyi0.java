package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class jyi0<K, V> implements cr5<K, V> {
    public final hyi0.c a = new hyi0.c();

    @Override // defpackage.cr5
    public final Object a(final Class cls, final Function function) {
        h5.a();
        hyi0.c cVar = this.a;
        ConcurrentHashMap concurrentHashMap = cVar.a;
        hyi0.b bVarB = cVar.b(cls);
        try {
            Object obj = concurrentHashMap.get(bVarB);
            cVar.c(bVarB);
            return obj == null ? concurrentHashMap.computeIfAbsent(new h5.c(cls, cVar.b), new Function() { // from class: f5
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return function.apply(cls);
                }
            }) : obj;
        } catch (Throwable th) {
            cVar.c(bVarB);
            throw th;
        }
    }
}
