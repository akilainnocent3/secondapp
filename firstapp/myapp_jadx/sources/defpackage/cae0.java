package defpackage;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cae0 extends djx<String> {
    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        if (!hv60.a(str, bundle) || hv60.f(str, bundle)) {
            return null;
        }
        return hv60.d(str, bundle);
    }

    @Override // defpackage.djx
    public final String b() {
        return "string";
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final String h(String str) {
        str.getClass();
        if (Intrinsics.g(str, "null")) {
            return null;
        }
        return str;
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, String str2) {
        String str3 = str2;
        str.getClass();
        if (str3 != null) {
            bundle.putString(str, str3);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.djx
    public final String f(String str) {
        String str2 = str;
        if (str2 == null) {
            return "null";
        }
        String strEncode = Uri.encode(str2, null);
        strEncode.getClass();
        return strEncode;
    }
}
