package com.ironsource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4456p8 implements K8 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f63291g = "loadWithUrl | webView is not null";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f63292h = "p8";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f63293i = "file://";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f63296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4420n8 f63297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4329i8 f63298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f63299f;

    /* JADX INFO: renamed from: com.ironsource.p8$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f63301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f63302c;

        public a(String str, JSONObject jSONObject, String str2) {
            this.f63300a = str;
            this.f63301b = jSONObject;
            this.f63302c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4456p8.this.f63296c != null) {
                A8.a(C4281fe.f61807q, new C4557v8().a(G5.A, C4456p8.f63291g).a());
            }
            try {
                C4456p8.this.b(this.f63300a);
                C4456p8.this.f63296c.loadUrl(C4456p8.this.a(this.f63301b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C4456p8.this.f63294a);
                C4456p8.this.f63297d.a(this.f63302c, jSONObject);
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                C4456p8.this.b(this.f63300a, e10.getMessage());
                A8.a(C4281fe.f61807q, new C4557v8().a(G5.A, e10.getMessage()).a());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f63305b;

        public b(String str, String str2) {
            this.f63304a = str;
            this.f63305b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = C4456p8.this.f63296c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C4456p8.this.f63294a);
                C4420n8 c4420n8 = C4456p8.this.f63297d;
                if (c4420n8 != null) {
                    c4420n8.a(this.f63304a, jSONObject);
                    C4456p8.this.f63297d.b();
                }
                C4456p8 c4456p8 = C4456p8.this;
                c4456p8.f63297d = null;
                c4456p8.f63299f = null;
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                Log.e(C4456p8.f63292h, "performCleanup | could not destroy ISNAdView webView ID: " + C4456p8.this.f63294a);
                A8.a(C4281fe.f61808r, new C4557v8().a(G5.A, e10.getMessage()).a());
                C4456p8.this.b(this.f63305b, e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$c */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements K8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63307a;

        public c(String str) {
            this.f63307a = str;
        }

        @Override // com.ironsource.K8.a
        public void a(String str) {
            Logger.i(C4456p8.f63292h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C4456p8.this.b(this.f63307a, str);
        }

        @Override // com.ironsource.K8.a
        public void b(String str) {
            Logger.i(C4456p8.f63292h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C4456p8.this.f63296c.getParent()).removeView(C4456p8.this.f63296c);
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            C4456p8.this.d();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$d */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C4456p8.this.new d());
            webView2.setWebViewClient(new e());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        private d() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p8$e */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends WebViewClient {
        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C4456p8.f63292h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent intentA = new OpenUrlActivity.e(new com.ironsource.sdk.controller.k.c()).a(str).b(false).a(context);
            intentA.addFlags(268435456);
            context.startActivity(intentA);
            return true;
        }

        private e() {
        }
    }

    public C4456p8(InterfaceC4382l8 interfaceC4382l8, Context context, String str, C4329i8 c4329i8) {
        this.f63299f = context;
        C4420n8 c4420n8 = new C4420n8();
        this.f63297d = c4420n8;
        c4420n8.g(str);
        this.f63294a = str;
        this.f63297d.a(interfaceC4382l8);
        this.f63298e = c4329i8;
    }

    @Override // com.ironsource.K8
    public WebView getPresentingView() {
        return this.f63296c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.f63297d.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public String a() {
        return this.f63294a;
    }

    public C4420n8 b() {
        return this.f63297d;
    }

    public C4329i8 c() {
        return this.f63298e;
    }

    public void e(String str) {
        this.f63295b = str;
    }

    private String d(String str) {
        String strSubstring = str.substring(str.indexOf(to.c.userBaseDel) + 1);
        return strSubstring.substring(strSubstring.indexOf(to.c.userBaseDel));
    }

    @Override // com.ironsource.K8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f63297d.e(str);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            Logger.i(f63292h, "sendHandleGetViewVisibility fail with reason: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.K8
    public void b(JSONObject jSONObject, String str, String str2) {
        V7.f60236a.d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.K8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.f63297d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            Logger.i(f63292h, "sendMessageToAd fail message: " + e10.getMessage());
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AddJavascriptInterface"})
    public void b(String str) {
        Logger.i(f63292h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f63299f);
        this.f63296c = webView;
        webView.addJavascriptInterface(new C4400m8(this), C4346j8.f62115e);
        this.f63296c.setWebViewClient(new C4438o8(new c(str)));
        this.f63296c.setWebChromeClient(new d());
        Og.a(this.f63296c);
        this.f63297d.a(this.f63296c);
    }

    @Override // com.ironsource.K8
    public synchronized void a(String str, String str2) {
        if (this.f63299f == null) {
            return;
        }
        Logger.i(f63292h, "performCleanup");
        V7.f60236a.d(new b(str, str2));
    }

    private boolean c(String str) {
        return str.startsWith(androidx.media3.session.fe.F);
    }

    @Override // com.ironsource.K8
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, C4235d4.c.D);
            return;
        }
        Logger.i(f63292h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(C4235d4.i.f61441t0)) {
                this.f63296c.onPause();
                this.f63297d.f(str2);
            } else if (str.equals(C4235d4.i.f61443u0)) {
                this.f63296c.onResume();
                this.f63297d.f(str2);
            } else {
                b(str3, C4235d4.c.C);
            }
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            b(str3, C4235d4.c.E);
        }
    }

    public void b(String str, String str2) {
        C4420n8 c4420n8 = this.f63297d;
        if (c4420n8 != null) {
            c4420n8.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return "file://" + this.f63295b + d(str);
    }
}
