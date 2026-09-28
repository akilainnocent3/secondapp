package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h9e0 extends c48<String[]> {
    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        if (!hv60.a(str, bundle) || hv60.f(str, bundle)) {
            return null;
        }
        return hv60.e(str, bundle);
    }

    @Override // defpackage.djx
    public final String b() {
        return "string[]";
    }

    @Override // defpackage.djx
    public final Object c(Object obj, String str) {
        String[] strArr = (String[]) obj;
        return strArr != null ? (String[]) xx0.p(strArr, new String[]{str}) : new String[]{str};
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        str.getClass();
        return new String[]{str};
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, Object obj) {
        String[] strArr = (String[]) obj;
        str.getClass();
        if (strArr != null) {
            bundle.putStringArray(str, strArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.djx
    public final boolean g(Object obj, Object obj2) {
        return wx0.b((String[]) obj, (String[]) obj2);
    }

    @Override // defpackage.c48
    public final String[] h() {
        return new String[0];
    }

    @Override // defpackage.c48
    public final List i(String[] strArr) {
        String[] strArr2 = strArr;
        if (strArr2 == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList(strArr2.length);
        for (String str : strArr2) {
            str.getClass();
            String strEncode = Uri.encode(str, null);
            strEncode.getClass();
            arrayList.add(strEncode);
        }
        return arrayList;
    }
}
