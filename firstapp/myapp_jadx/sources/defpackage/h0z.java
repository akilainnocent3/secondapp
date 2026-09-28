package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class h0z {
    public static final ArrayList a(List list, jj40 jj40Var, boolean z) {
        list.getClass();
        jj40Var.getClass();
        ArrayList arrayListI0 = CollectionsKt.i0(a.c(new g0z.d(jj40Var)), a.c(z ? g0z.c.a : g0z.b.a));
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new g0z.a((gz4) it.next()));
        }
        return CollectionsKt.i0(arrayList, arrayListI0);
    }
}
