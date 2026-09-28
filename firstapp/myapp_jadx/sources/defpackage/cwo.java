package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class cwo extends c48<List<? extends Integer>> {
    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
            return null;
        }
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return ay0.Q(intArray);
        }
        s5b.a(str);
        throw null;
    }

    @Override // defpackage.djx
    public final String b() {
        return "List<Int>";
    }

    @Override // defpackage.djx
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        fwo fwoVar = djx.b;
        return list != null ? CollectionsKt.i0(a.c(fwoVar.h(str)), list) : a.c(fwoVar.h(str));
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        str.getClass();
        return a.c(djx.b.h(str));
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        if (list != null) {
            bundle.putIntArray(str, CollectionsKt.z0(list));
        }
    }

    @Override // defpackage.djx
    public final boolean g(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return wx0.b(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
    }

    @Override // defpackage.c48
    public final List<? extends Integer> h() {
        return m2g.a;
    }

    @Override // defpackage.c48
    public final List i(List<? extends Integer> list) {
        List<? extends Integer> list2 = list;
        if (list2 == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }
}
