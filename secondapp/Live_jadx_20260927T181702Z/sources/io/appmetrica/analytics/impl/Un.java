package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class Un {
    public static final Rn a(Throwable th2, V v10, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        Hn hnA = th2 != null ? In.a(th2, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(fr.i0.d0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new El((StackTraceElement) it.next()));
            }
        }
        return new Rn(hnA, v10, arrayList, null, null, null, str, bool);
    }
}
