package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class y9e0 extends c48<List<? extends String>> {
    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        if (!hv60.a(str, bundle) || hv60.f(str, bundle)) {
            return null;
        }
        return ay0.S(hv60.e(str, bundle));
    }

    @Override // defpackage.djx
    public final String b() {
        return "List<String>";
    }

    @Override // defpackage.djx
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        return list != null ? CollectionsKt.i0(a.c(str), list) : a.c(str);
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        str.getClass();
        return a.c(str);
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        if (list == null) {
            bundle.putString(str, null);
            return;
        }
        String[] strArr = (String[]) list.toArray(new String[0]);
        strArr.getClass();
        bundle.putStringArray(str, strArr);
    }

    @Override // defpackage.djx
    public final boolean g(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return wx0.b(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
    }

    @Override // defpackage.c48
    public final List<? extends String> h() {
        return m2g.a;
    }

    @Override // defpackage.c48
    public final List i(List<? extends String> list) {
        List<? extends String> list2 = list;
        if (list2 == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(list2, 10));
        for (String str : list2) {
            str.getClass();
            String strEncode = Uri.encode(str, null);
            strEncode.getClass();
            arrayList.add(strEncode);
        }
        return arrayList;
    }
}
