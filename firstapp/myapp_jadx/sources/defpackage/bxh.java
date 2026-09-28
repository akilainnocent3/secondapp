package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class bxh extends c48<List<? extends Float>> {
    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
            return null;
        }
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return ay0.P(floatArray);
        }
        s5b.a(str);
        throw null;
    }

    @Override // defpackage.djx
    public final String b() {
        return "List<Float>";
    }

    @Override // defpackage.djx
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        return list != null ? CollectionsKt.i0(a.c(Float.valueOf(Float.parseFloat(str))), list) : a.c(Float.valueOf(Float.parseFloat(str)));
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        str.getClass();
        return a.c(Float.valueOf(Float.parseFloat(str)));
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        if (list != null) {
            bundle.putFloatArray(str, CollectionsKt.x0(list));
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.djx
    public final boolean g(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return wx0.b(list != null ? (Float[]) list.toArray(new Float[0]) : null, list2 != null ? (Float[]) list2.toArray(new Float[0]) : null);
    }

    @Override // defpackage.c48
    public final List<? extends Float> h() {
        return m2g.a;
    }

    @Override // defpackage.c48
    public final List i(List<? extends Float> list) {
        List<? extends Float> list2 = list;
        if (list2 == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }
}
