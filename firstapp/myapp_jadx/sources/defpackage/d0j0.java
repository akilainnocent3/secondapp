package defpackage;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.sportygames.commons.SportyGamesManager;
import java.net.URI;
import java.util.Locale;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class d0j0 {
    public static void a(WebView webView) {
        webView.getClass();
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(1);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(true);
        }
        e0j0 e0j0Var = e0j0.a;
        t3g.a.getClass();
        WebSettings settings2 = webView.getSettings();
        settings2.getClass();
        settings2.setJavaScriptEnabled(false);
        settings2.setDomStorageEnabled(false);
        settings2.setJavaScriptCanOpenWindowsAutomatically(false);
        settings2.setSupportMultipleWindows(false);
        settings2.setGeolocationEnabled(false);
        settings2.setMediaPlaybackRequiresUserGesture(true);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    public static boolean b(String str, String str2) {
        String lowerCase;
        String strA0;
        if (str == null || StringsKt.U(str) || str2 == null || StringsKt.U(str2)) {
            return false;
        }
        String strA1 = null;
        if (StringsKt.U(str)) {
            lowerCase = null;
        } else {
            try {
                String scheme = new URI(str).getScheme();
                if (scheme != null) {
                    lowerCase = scheme.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                } else {
                    lowerCase = null;
                }
            } catch (Exception unused) {
            }
        }
        if (lowerCase == null) {
            return false;
        }
        if (!lowerCase.equals("https")) {
            if (!lowerCase.equals("http")) {
                return false;
            }
            try {
                if (SportyGamesManager.getInstance().getEnvironment() != zag.b) {
                    return false;
                }
            } catch (Exception unused2) {
                return false;
            }
        }
        if (!StringsKt.U(str)) {
            try {
                String host = new URI(str).getHost();
                if (host != null) {
                    String lowerCase2 = host.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    strA1 = StringsKt.a0(lowerCase2, "www.");
                }
            } catch (Exception unused3) {
            }
        }
        if (strA1 == null) {
            return false;
        }
        String string = StringsKt.t0(str2).toString();
        try {
            String host2 = new URI(StringsKt.M(string, "://", false) ? string : "https://".concat(string)).getHost();
            if (host2 == null) {
                host2 = string;
            }
            String lowerCase3 = host2.toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            strA0 = StringsKt.a0(lowerCase3, "www.");
        } catch (Exception unused4) {
            String lowerCase4 = string.toLowerCase(Locale.ROOT);
            lowerCase4.getClass();
            strA0 = StringsKt.a0(lowerCase4, "www.");
        }
        if (StringsKt.U(strA0)) {
            return false;
        }
        return strA1.equals(strA0) || c.k(strA1, ".".concat(strA0), false);
    }
}
