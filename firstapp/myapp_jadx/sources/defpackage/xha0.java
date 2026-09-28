package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class xha0 {
    public static final xha0 a = new xha0();

    public static Intent a(Activity activity, aga0 aga0Var, String str, String str2, Uri uri, Uri uri2, Uri uri3, String str3) {
        Object bVar;
        activity.getClass();
        aga0Var.getClass();
        str.getClass();
        str2.getClass();
        String strA = str2.length() == 0 ? str : tug.a(str2, "\n", str);
        int iOrdinal = aga0Var.ordinal();
        if (iOrdinal == 0) {
            return f6h.a(activity, strA, ay0.v(new Uri[]{uri, uri3, uri2}), g6h.a.b);
        }
        if (iOrdinal == 1) {
            return n0g.a(activity, strA, ay0.v(new Uri[]{uri, uri2}));
        }
        if (iOrdinal == 2) {
            return lep.a(activity, strA, ay0.v(new Uri[]{uri, uri2, uri3}));
        }
        if (iOrdinal != 3) {
            uhc.a();
            return null;
        }
        ArrayList arrayListV = ay0.v(new Uri[]{uri, uri2});
        hzg0 hzg0Var = new hzg0(activity);
        if (str3 != null) {
            str2 = str3;
        }
        if (str2.length() > 0) {
            hzg0Var.f(str2);
        }
        try {
            zi50.a aVar = zi50.b;
            hzg0Var.g(new URL(str));
            bVar = hzg0Var;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.f(thA, "Failed to set tweet URL: %s", thA.getMessage());
        }
        hzg0Var.e(arrayListV);
        return hzg0Var.a();
    }
}
