package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.ranges.e;

/* JADX INFO: loaded from: classes6.dex */
public final class per {
    public static mer a(long j, List list) {
        list.getClass();
        if (list.isEmpty()) {
            return mer.c.a;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e eVar = ((jer) it.next()).a;
                long j2 = eVar.a;
                long j3 = eVar.b;
                if (j2 <= j3 && j <= j3 && j2 <= j) {
                    return mer.b.a;
                }
            }
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                e eVar2 = ((jer) it2.next()).a;
                long j4 = eVar2.a;
                if (j4 <= eVar2.b && j4 > j) {
                    return mer.a.a;
                }
            }
        }
        return mer.c.a;
    }
}
