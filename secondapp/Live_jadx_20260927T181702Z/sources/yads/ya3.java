package yads;

import android.net.Uri;
import android.webkit.URLUtil;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ya3 {
    public static String a(String str) {
        Object objB;
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            objB = dr.i1.b(Uri.parse(b(str)).getHost());
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        if (dr.i1.i(objB)) {
            objB = null;
        }
        return (String) objB;
    }

    public static String b(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return str;
        }
        return "https://" + str;
    }
}
