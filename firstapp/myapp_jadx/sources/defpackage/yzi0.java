package defpackage;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.sportygames.commons.SportyGamesManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class yzi0 implements xzi0 {
    public final ConcurrentHashMap<Integer, a> a = new ConcurrentHashMap<>();

    public static final class a {
        public f0j0 a;
        public final String b;
        public final WebChromeClient c;
        public final tqf0 d;

        public a(f0j0 f0j0Var, String str, WebChromeClient webChromeClient, tqf0 tqf0Var) {
            this.a = f0j0Var;
            this.b = str;
            this.c = webChromeClient;
            this.d = tqf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && this.d == aVar.d;
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            WebChromeClient webChromeClient = this.c;
            return this.d.hashCode() + ((iHashCode2 + (webChromeClient != null ? webChromeClient.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "WebViewProvisioningSession(config=" + this.a + ", allowedDomain=" + this.b + ", chromeClient=" + this.c + ", webViewClient=" + this.d + ")";
        }
    }

    @Override // defpackage.xzi0
    public final void a(WebView webView) {
        webView.getClass();
        this.a.remove(Integer.valueOf(System.identityHashCode(webView)));
        jzi0.a.remove(Integer.valueOf(System.identityHashCode(webView)));
    }

    @Override // defpackage.xzi0
    public final f0j0 b(WebView webView, String str, Map<String, String> map) {
        str.getClass();
        map.getClass();
        if (!h(webView)) {
            return new f0j0(e0j0.b, null, false, t3g.a, false, false, null);
        }
        f0j0 f0j0VarG = g(webView, str);
        if (map.isEmpty()) {
            webView.loadUrl(str);
            return f0j0VarG;
        }
        webView.loadUrl(str, map);
        return f0j0VarG;
    }

    @Override // defpackage.xzi0
    public final f0j0 c(WebView webView) {
        return jzi0.a.get(Integer.valueOf(System.identityHashCode(webView)));
    }

    @Override // defpackage.xzi0
    public final f0j0 d(Context context, gey geyVar, vzi0 vzi0Var) {
        String str = vzi0Var.a;
        f0j0 f0j0VarE = e(context, geyVar, new wzi0(str, vzi0Var.c, null));
        Map<String, String> map = vzi0Var.b;
        if (map.isEmpty()) {
            geyVar.loadUrl(str);
            return f0j0VarE;
        }
        geyVar.loadUrl(str, map);
        return f0j0VarE;
    }

    @Override // defpackage.xzi0
    public final f0j0 e(Context context, WebView webView, wzi0 wzi0Var) {
        String domain;
        context.getClass();
        webView.getClass();
        a(webView);
        try {
            domain = SportyGamesManager.getInstance().getDomain(context);
        } catch (Exception unused) {
            domain = null;
        }
        String str = wzi0Var.a;
        WebChromeClient webChromeClient = wzi0Var.c;
        f0j0 f0j0Var = (str == null || StringsKt.U(str)) ? new f0j0(e0j0.b, null, false, t3g.a, false, false, null) : g0j0.a(str, domain);
        boolean z = f0j0Var.c;
        jzi0.a.put(Integer.valueOf(System.identityHashCode(webView)), f0j0Var);
        d0j0.a(webView);
        WebSettings settings = webView.getSettings();
        boolean z2 = false;
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        webView.clearCache(false);
        WebSettings settings2 = webView.getSettings();
        settings2.getClass();
        settings2.setJavaScriptEnabled(z);
        settings2.setDomStorageEnabled(z);
        settings2.setJavaScriptCanOpenWindowsAutomatically(false);
        settings2.setSupportMultipleWindows(false);
        if (z && f0j0Var.a == e0j0.a) {
            z2 = true;
        }
        settings2.setGeolocationEnabled(z2);
        if (!z) {
            settings2.setMediaPlaybackRequiresUserGesture(true);
        }
        tqf0 tqf0Var = new tqf0(this, wzi0Var.b);
        webView.setWebViewClient(tqf0Var);
        if (webChromeClient != null) {
            webView.setWebChromeClient(webChromeClient);
        }
        this.a.put(Integer.valueOf(System.identityHashCode(webView)), new a(f0j0Var, domain, webChromeClient, tqf0Var));
        return f0j0Var;
    }

    @Override // defpackage.xzi0
    public final tqf0 f(WebView webView) {
        a aVar = this.a.get(Integer.valueOf(System.identityHashCode(webView)));
        if (aVar != null) {
            return aVar.d;
        }
        return null;
    }

    @Override // defpackage.xzi0
    public final f0j0 g(WebView webView, String str) {
        String domain;
        webView.getClass();
        str.getClass();
        a aVar = this.a.get(Integer.valueOf(System.identityHashCode(webView)));
        Context applicationContext = SportyGamesManager.getApplicationContext();
        if (aVar == null || (domain = aVar.b) == null) {
            domain = applicationContext != null ? SportyGamesManager.getInstance().getDomain(applicationContext) : null;
        }
        f0j0 f0j0VarA = g0j0.a(str, domain);
        boolean z = f0j0VarA.c;
        jzi0.a.put(Integer.valueOf(System.identityHashCode(webView)), f0j0VarA);
        WebSettings settings = webView.getSettings();
        settings.getClass();
        settings.setJavaScriptEnabled(z);
        settings.setDomStorageEnabled(z);
        boolean z2 = false;
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSupportMultipleWindows(false);
        if (z && f0j0VarA.a == e0j0.a) {
            z2 = true;
        }
        settings.setGeolocationEnabled(z2);
        if (!z) {
            settings.setMediaPlaybackRequiresUserGesture(true);
        }
        if (aVar != null) {
            aVar.a = f0j0VarA;
        }
        return f0j0VarA;
    }

    @Override // defpackage.xzi0
    public final boolean h(WebView webView) {
        return this.a.containsKey(Integer.valueOf(System.identityHashCode(webView)));
    }
}
