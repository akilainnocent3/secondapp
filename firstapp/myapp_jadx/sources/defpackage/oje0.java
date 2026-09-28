package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.plugin.webcontainer.WebViewWrapperServiceImpl;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes4.dex */
public final class oje0 {
    public final WebViewWrapperServiceImpl a;
    public final rie0 b;
    public final k5b c;
    public final wsm d;
    public final eje0 e;
    public final WeakReference<Context> f;
    public WeakReference<WebView> g;
    public final lje0 h;
    public boolean i;
    public h5b j;
    public String k;
    public final j1b l;
    public final t340 m;

    public oje0(Context context, WebViewWrapperServiceImpl webViewWrapperServiceImpl, rie0 rie0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, wsm wsmVar, eje0 eje0Var) {
        rie0Var.getClass();
        wsmVar.getClass();
        eje0Var.getClass();
        this.a = webViewWrapperServiceImpl;
        this.b = rie0Var;
        this.c = k5bVar;
        this.d = wsmVar;
        this.e = eje0Var;
        this.f = new WeakReference<>(context);
        j1b j1bVarA = w5b.a(k5bVar);
        this.l = j1bVarA;
        this.m = eje0Var.b;
        this.i = false;
        this.h = new lje0(this, context);
        ej5.c(j1bVarA, null, null, new gje0(this, null), 3);
    }

    public final void a(Context context, String str) {
        WebView webView;
        if (!vox.d(context)) {
            this.i = false;
            return;
        }
        if (this.i) {
            return;
        }
        try {
            webView = new WebView(context.getApplicationContext());
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            webView.setBackgroundColor(0);
        } catch (Throwable th) {
            itf0.a aVar = itf0.a;
            aVar.d(e40.a(aVar, MyLog.TAG_SURVEY, "initWebView error: ", th), new Object[0]);
            webView = null;
        }
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.g = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        this.a.installJsBridge(context, webView2, this.h, new WebChromeClient());
        webView2.loadUrl(str);
        this.i = true;
        h5b h5bVar = this.j;
        if (h5bVar != null) {
            h5bVar.a();
        }
        h5b h5bVar2 = new h5b(w5b.a(this.c), 10000L, new mje0(2, null), new nje0(this, null));
        this.j = h5bVar2;
        h5bVar2.d();
    }

    public final void b(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        String strA = tyi0.a(context);
        itf0.a aVar = itf0.a;
        StringBuilder sbA = ce7.a(aVar, MyLog.TAG_SURVEY, "\n        HTTP Error:\n        WebView Info:\n        ", strA, "\n        \n        Error Details:\n        URL: ");
        hxa.c(sbA, str, "\n        Method: ", str2, "\n        Headers: ");
        hxa.c(sbA, str3, "\n        Status Code: ", str4, "\n        Reason: ");
        sbA.append(str5);
        sbA.append("\n    ");
        aVar.d(qae0.c(sbA.toString()), new Object[0]);
        List<? extends Pair<String, String>> listK = b.k(new Pair("WebView Info", strA), new Pair("URL", str), new Pair("Method", str2), new Pair("Headers", str3), new Pair("Status Code", str4), new Pair("Reason", str5));
        this.d.g("SurveyWebViewManager", str6, new Exception("SurveyWebViewManager: ".concat(str6)), listK);
    }
}
