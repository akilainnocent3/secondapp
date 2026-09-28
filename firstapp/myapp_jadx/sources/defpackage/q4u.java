package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public class q4u<K, V> {
    public final LinkedHashMap a = new LinkedHashMap(0, 0.75f, true);
    public long b;
    public long c;

    public q4u(long j) {
        this.b = j;
        if (j > 0) {
            return;
        }
        hb5.a("maxSize <= 0");
        throw null;
    }

    public void a(K k, V v, V v2) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        Iterator<T> it = this.a.entrySet().iterator();
        long jC = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jC += c(entry.getKey(), entry.getValue());
        }
        this.c = jC;
        return jC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c(K k, V v) throws Exception {
        try {
            long j = ((ka40.a) v).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + k + ", " + v + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.c = -1L;
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(long j) {
        while (b() > j) {
            LinkedHashMap linkedHashMap = this.a;
            if (linkedHashMap.isEmpty()) {
                if (b() == 0) {
                    return;
                }
                ib5.a("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) CollectionsKt.S(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.c = b() - c(key, value);
                a(key, value, null);
            }
        }
    }
}
