package defpackage;

import android.net.Uri;
import android.webkit.CookieManager;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.permission.location.KN.qUnCRF;

/* JADX INFO: loaded from: classes4.dex */
public final class h0j0 {
    public static final CookieManager a() {
        try {
            return CookieManager.getInstance();
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.n("Failed to get CookieManager: " + e, new Object[0]);
            return null;
        }
    }

    public static final String b(String str) {
        str.getClass();
        try {
            Uri uri = Uri.parse(str);
            String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).build().toString();
            string.getClass();
            return string;
        } catch (Throwable th) {
            itf0.a aVar = itf0.a;
            aVar.n(e40.a(aVar, MyLog.TAG_WEB, "Failed to get cookie url for CMS language code: ", th), new Object[0]);
            return "";
        }
    }

    public static final void c(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        CookieManager cookieManagerA = a();
        if (cookieManagerA != null && str.length() != 0 && str2.length() != 0 && str3.length() != 0) {
            itf0.a aVar = itf0.a;
            aVar.a(pr0.a(ce7.a(aVar, MyLog.TAG_WEB, qUnCRF.WdTpMRAZliT, str2, "="), str3, " for ", str), new Object[0]);
            cookieManagerA.setCookie(str, str2 + "=" + str3);
        }
    }
}
