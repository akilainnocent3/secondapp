package im.delight.android.webview;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;

/* JADX INFO: loaded from: classes2.dex */
public class AdvancedWebView extends WebView {
    public final HashMap A;
    public WeakReference<Activity> a;
    public WeakReference<Fragment> b;
    public final LinkedList c;
    public ValueCallback<Uri> d;
    public ValueCallback<Uri[]> e;
    public String f;
    public int i;
    public WebViewClient v;
    public WebChromeClient w;
    public boolean y;
    public String z;

    /* JADX INFO: loaded from: classes7.dex */
    public class c implements DownloadListener {
        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            URLUtil.guessFileName(str, str3, str4);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public interface d {
    }

    public AdvancedWebView(Context context) {
        super(context);
        this.c = new LinkedList();
        this.i = 51426;
        this.z = "*/*";
        this.A = new HashMap();
        b(context);
    }

    public static String a(String str) {
        return new String(Base64.decode(str, 0), "UTF-8");
    }

    public static String getLanguageIso3() {
        try {
            return Locale.getDefault().getISO3Language().toLowerCase(Locale.US);
        } catch (MissingResourceException unused) {
            return "eng";
        }
    }

    public final void b(Context context) {
        if (isInEditMode()) {
            return;
        }
        if (context instanceof Activity) {
            this.a = new WeakReference<>((Activity) context);
        }
        this.f = getLanguageIso3();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setSaveEnabled(true);
        String path = context.getFilesDir().getPath();
        path.substring(0, path.lastIndexOf("/"));
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setMixedContentMode(2);
        setThirdPartyCookiesEnabled(true);
        super.setWebViewClient(new a());
        super.setWebChromeClient(new b());
        setDownloadListener(new c());
    }

    public final void c(ValueCallback<Uri> valueCallback, ValueCallback<Uri[]> valueCallback2, boolean z) {
        ValueCallback<Uri> valueCallback3 = this.d;
        if (valueCallback3 != null) {
            valueCallback3.onReceiveValue(null);
        }
        this.d = valueCallback;
        ValueCallback<Uri[]> valueCallback4 = this.e;
        if (valueCallback4 != null) {
            valueCallback4.onReceiveValue(null);
        }
        this.e = valueCallback2;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (z) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        intent.setType(this.z);
        WeakReference<Fragment> weakReference = this.b;
        if (weakReference != null && weakReference.get() != null) {
            this.b.get().startActivityForResult(Intent.createChooser(intent, getFileUploadPromptLabel()), this.i);
            return;
        }
        WeakReference<Activity> weakReference2 = this.a;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        this.a.get().startActivityForResult(Intent.createChooser(intent, getFileUploadPromptLabel()), this.i);
    }

    public List<String> getPermittedHostnames() {
        return this.c;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map<String, String> map) {
        HashMap map2 = this.A;
        if (map == null) {
            map = map2;
        } else if (map2.size() > 0) {
            map.putAll(map2);
        }
        super.loadUrl(str, map);
    }

    @Override // android.webkit.WebView
    public final void onPause() {
        pauseTimers();
        super.onPause();
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        super.onResume();
        resumeTimers();
    }

    public void setCookiesEnabled(boolean z) {
        CookieManager.getInstance().setAcceptCookie(z);
    }

    public void setDesktopMode(boolean z) {
        WebSettings settings = getSettings();
        settings.setUserAgentString(z ? settings.getUserAgentString().replace("Mobile", "eliboM").replace("Android", "diordnA") : settings.getUserAgentString().replace("eliboM", "Mobile").replace("diordnA", "Android"));
        settings.setUseWideViewPort(z);
        settings.setLoadWithOverviewMode(z);
        settings.setSupportZoom(z);
        settings.setBuiltInZoomControls(z);
    }

    public void setGeolocationEnabled(boolean z) {
        Activity activity;
        if (z) {
            getSettings().setJavaScriptEnabled(true);
            getSettings().setGeolocationEnabled(true);
            WeakReference<Fragment> weakReference = this.b;
            if (weakReference == null || weakReference.get() == null || this.b.get().getActivity() == null) {
                WeakReference<Activity> weakReference2 = this.a;
                if (weakReference2 != null && weakReference2.get() != null) {
                    activity = this.a.get();
                }
            } else {
                activity = this.b.get().getActivity();
            }
            getSettings().setGeolocationDatabasePath(activity.getFilesDir().getPath());
        }
        this.y = z;
    }

    public void setListener(Activity activity, d dVar, int i) {
        if (activity != null) {
            this.a = new WeakReference<>(activity);
        } else {
            this.a = null;
        }
        this.i = i;
    }

    public void setMixedContentAllowed(boolean z) {
        getSettings().setMixedContentMode(!z ? 1 : 0);
    }

    public void setThirdPartyCookiesEnabled(boolean z) {
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, z);
    }

    public void setUploadableFileTypes(String str) {
        this.z = str;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.w = webChromeClient;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        this.v = webViewClient;
    }

    public String getFileUploadPromptLabel() {
        try {
            if (this.f.equals("zho")) {
                return a("6YCJ5oup5LiA5Liq5paH5Lu2");
            }
            if (this.f.equals("spa")) {
                return a("RWxpamEgdW4gYXJjaGl2bw==");
            }
            if (this.f.equals("hin")) {
                return a("4KSP4KSVIOCkq+CkvOCkvuCkh+CksiDgpJrgpYHgpKjgpYfgpII=");
            }
            if (this.f.equals("ben")) {
                return a("4KaP4KaV4Kaf4Ka/IOCmq+CmvuCmh+CmsiDgpqjgpr/gprDgp43gpqzgpr7gpprgpqg=");
            }
            if (this.f.equals("ara")) {
                return a("2KfYrtiq2YrYp9ixINmF2YTZgSDZiNin2K3Yrw==");
            }
            if (this.f.equals("por")) {
                return a("RXNjb2xoYSB1bSBhcnF1aXZv");
            }
            if (this.f.equals("rus")) {
                return a("0JLRi9Cx0LXRgNC40YLQtSDQvtC00LjQvSDRhNCw0LnQuw==");
            }
            if (this.f.equals("jpn")) {
                return a("MeODleOCoeOCpOODq+OCkumBuOaKnuOBl+OBpuOBj+OBoOOBleOBhA==");
            }
            if (this.f.equals(jbkEboCkTqmGf.IQJiEoqh)) {
                return a("4KiH4Kmx4KiVIOCoq+CovuCoh+CosiDgqJrgqYHgqKPgqYs=");
            }
            if (this.f.equals("deu")) {
                return a("V8OkaGxlIGVpbmUgRGF0ZWk=");
            }
            if (this.f.equals("jav")) {
                return a("UGlsaWggc2lqaSBiZXJrYXM=");
            }
            if (this.f.equals("msa")) {
                return a("UGlsaWggc2F0dSBmYWls");
            }
            if (this.f.equals("tel")) {
                return a("4LCS4LCVIOCwq+CxhuCxluCwsuCxjeCwqOCxgSDgsI7gsILgsJrgsYHgsJXgsYvgsILgsKHgsL8=");
            }
            if (this.f.equals("vie")) {
                return a("Q2jhu41uIG3hu5l0IHThuq1wIHRpbg==");
            }
            if (this.f.equals("kor")) {
                return a("7ZWY64KY7J2YIO2MjOydvOydhCDshKDtg50=");
            }
            if (this.f.equals(YAzniTbXHYQ.VyPvytXIF)) {
                return a("Q2hvaXNpc3NleiB1biBmaWNoaWVy");
            }
            if (this.f.equals("mar")) {
                return a("4KSr4KS+4KSH4KSyIOCkqOCkv+CkteCkoeCkvg==");
            }
            if (this.f.equals("tam")) {
                return a("4K6S4K6w4K+BIOCuleCvh+CuvuCuquCvjeCuquCviCDgrqTgr4fgrrDgr43grrXgr4E=");
            }
            if (this.f.equals("urd")) {
                return a("2KfbjNqpINmB2KfYptmEINmF24zauiDYs9uSINin2YbYqtiu2KfYqCDaqdix24zaug==");
            }
            if (this.f.equals("fas")) {
                return a("2LHYpyDYp9mG2KrYrtin2Kgg2qnZhtuM2K8g24zaqSDZgdin24zZhA==");
            }
            if (this.f.equals("tur")) {
                return a("QmlyIGRvc3lhIHNlw6dpbg==");
            }
            if (this.f.equals("ita")) {
                return a("U2NlZ2xpIHVuIGZpbGU=");
            }
            if (this.f.equals("tha")) {
                return a("4LmA4Lil4Li34Lit4LiB4LmE4Lif4Lil4LmM4Lir4LiZ4Li24LmI4LiH");
            }
            return this.f.equals("guj") ? a("4KqP4KqVIOCqq+CqvuCqh+CqsuCqqOCrhyDgqqrgqrjgqoLgqqY=") : "Choose a file";
        } catch (Exception unused) {
            return "Choose a file";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public final Bitmap getDefaultVideoPoster() {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            return webChromeClient != null ? webChromeClient.getDefaultVideoPoster() : super.getDefaultVideoPoster();
        }

        @Override // android.webkit.WebChromeClient
        public final View getVideoLoadingProgressView() {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            return webChromeClient != null ? webChromeClient.getVideoLoadingProgressView() : super.getVideoLoadingProgressView();
        }

        @Override // android.webkit.WebChromeClient
        public final void getVisitedHistory(ValueCallback<String[]> valueCallback) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.getVisitedHistory(valueCallback);
            } else {
                super.getVisitedHistory(valueCallback);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onCloseWindow(WebView webView) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onCloseWindow(webView);
            } else {
                super.onCloseWindow(webView);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            return webChromeClient != null ? webChromeClient.onConsoleMessage(consoleMessage) : super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            return webChromeClient != null ? webChromeClient.onCreateWindow(webView, z, z2, message) : super.onCreateWindow(webView, z, z2, message);
        }

        @Override // android.webkit.WebChromeClient
        public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
            } else {
                super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onGeolocationPermissionsHidePrompt() {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onGeolocationPermissionsHidePrompt();
            } else {
                super.onGeolocationPermissionsHidePrompt();
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            AdvancedWebView advancedWebView = AdvancedWebView.this;
            if (advancedWebView.y) {
                callback.invoke(str, true, false);
                return;
            }
            WebChromeClient webChromeClient = advancedWebView.w;
            if (webChromeClient != null) {
                webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
            } else {
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onHideCustomView() {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onHideCustomView();
            } else {
                super.onHideCustomView();
            }
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            return webChromeClient != null ? webChromeClient.onJsAlert(webView, str, str2, jsResult) : super.onJsAlert(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            return webChromeClient != null ? webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult) : super.onJsBeforeUnload(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            return webChromeClient != null ? webChromeClient.onJsConfirm(webView, str, str2, jsResult) : super.onJsConfirm(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            return webChromeClient != null ? webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult) : super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsTimeout() {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            return webChromeClient != null ? webChromeClient.onJsTimeout() : super.onJsTimeout();
        }

        @Override // android.webkit.WebChromeClient
        public final void onPermissionRequest(PermissionRequest permissionRequest) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onPermissionRequest(permissionRequest);
            } else {
                super.onPermissionRequest(permissionRequest);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onPermissionRequestCanceled(permissionRequest);
            } else {
                super.onPermissionRequestCanceled(permissionRequest);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onProgressChanged(webView, i);
            } else {
                super.onProgressChanged(webView, i);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onReceivedIcon(webView, bitmap);
            } else {
                super.onReceivedIcon(webView, bitmap);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onReceivedTitle(webView, str);
            } else {
                super.onReceivedTitle(webView, str);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onReceivedTouchIconUrl(webView, str, z);
            } else {
                super.onReceivedTouchIconUrl(webView, str, z);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onRequestFocus(WebView webView) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onRequestFocus(webView);
            } else {
                super.onRequestFocus(webView);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onShowCustomView(view, customViewCallback);
            } else {
                super.onShowCustomView(view, customViewCallback);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            AdvancedWebView.this.c(null, valueCallback, fileChooserParams.getMode() == 1);
            return true;
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            AdvancedWebView.this.c(valueCallback, null, false);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
            openFileChooser(valueCallback, str, null);
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback) {
            openFileChooser(valueCallback, null);
        }

        @Override // android.webkit.WebChromeClient
        public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onShowCustomView(view, i, customViewCallback);
            } else {
                super.onShowCustomView(view, i, customViewCallback);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onConsoleMessage(String str, int i, String str2) {
            WebChromeClient webChromeClient = AdvancedWebView.this.w;
            if (webChromeClient != null) {
                webChromeClient.onConsoleMessage(str, i, str2);
            } else {
                super.onConsoleMessage(str, i, str2);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z);
            } else {
                super.doUpdateVisitedHistory(webView, str, z);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onFormResubmission(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            System.currentTimeMillis();
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            System.currentTimeMillis();
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                webViewClient.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            System.currentTimeMillis();
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onScaleChanged(WebView webView, float f, float f2) {
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f, f2);
            } else {
                super.onScaleChanged(webView, f, f2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient = AdvancedWebView.this.v;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, str) : super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = AdvancedWebView.this.v;
            return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0068  */
        /* JADX WARN: Code duplicated, block: B:30:0x0072  */
        /* JADX WARN: Code duplicated, block: B:32:0x007a  */
        /* JADX WARN: Code duplicated, block: B:33:0x0082  */
        /* JADX WARN: Code duplicated, block: B:35:0x008c A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:36:0x0092  */
        /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:47:0x00bf A[Catch: ActivityNotFoundException -> 0x00dc, TryCatch #0 {ActivityNotFoundException -> 0x00dc, blocks: (B:45:0x00bb, B:47:0x00bf, B:49:0x00c5, B:51:0x00d1), top: B:56:0x00bb }] */
        /* JADX WARN: Code duplicated, block: B:53:0x00d9 A[EDGE_INSN: B:53:0x00d9->B:54:0x00dc BREAK  A[LOOP:0: B:17:0x0036->B:60:?]] */
        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient;
            Uri uri;
            String scheme;
            Intent intent;
            WeakReference<Activity> weakReference;
            String userInfo;
            AdvancedWebView advancedWebView = AdvancedWebView.this;
            LinkedList<String> linkedList = advancedWebView.c;
            if (linkedList.size() == 0) {
                webViewClient = advancedWebView.v;
                if (webViewClient != null) {
                    uri = Uri.parse(str);
                    scheme = uri.getScheme();
                    if (scheme != null) {
                        if (scheme.equals("tel")) {
                            intent = new Intent("android.intent.action.DIAL", uri);
                        } else if (!scheme.equals("sms")) {
                            intent = new Intent("android.intent.action.SENDTO", uri);
                        } else if (scheme.equals("whatsapp")) {
                            intent = new Intent("android.intent.action.SENDTO", uri);
                            intent.setPackage("com.whatsapp");
                        } else {
                            intent = null;
                        }
                        if (intent == null) {
                            webView.loadUrl(str);
                            break;
                        }
                        intent.addFlags(268435456);
                        weakReference = advancedWebView.a;
                        if (weakReference != null) {
                        }
                        advancedWebView.getContext().startActivity(intent);
                        return true;
                    }
                    webView.loadUrl(str);
                    break;
                }
                uri = Uri.parse(str);
                scheme = uri.getScheme();
                if (scheme != null) {
                    if (scheme.equals("tel")) {
                        intent = new Intent("android.intent.action.DIAL", uri);
                    } else if (!scheme.equals("sms")) {
                        intent = new Intent("android.intent.action.SENDTO", uri);
                    } else if (scheme.equals("whatsapp")) {
                        intent = new Intent("android.intent.action.SENDTO", uri);
                        intent.setPackage("com.whatsapp");
                    } else {
                        intent = null;
                    }
                    if (intent == null) {
                        webView.loadUrl(str);
                        break;
                    }
                    intent.addFlags(268435456);
                    weakReference = advancedWebView.a;
                    if (weakReference != null) {
                    }
                    advancedWebView.getContext().startActivity(intent);
                    return true;
                }
                webView.loadUrl(str);
                break;
            }
            Uri uri2 = Uri.parse(str);
            String host = uri2.getHost();
            if (host != null && host.matches("^[a-zA-Z0-9._!~*')(;:&=+$,%\\[\\]-]*$") && ((userInfo = uri2.getUserInfo()) == null || userInfo.matches("^[a-zA-Z0-9._!~*')(;:&=+$,%-]*$"))) {
                for (String str2 : linkedList) {
                    if (!host.equals(str2)) {
                        if (host.endsWith("." + str2)) {
                        }
                    }
                    webViewClient = advancedWebView.v;
                    if (webViewClient != null && webViewClient.shouldOverrideUrlLoading(webView, str)) {
                        break;
                    }
                    uri = Uri.parse(str);
                    scheme = uri.getScheme();
                    if (scheme != null) {
                        if (scheme.equals("tel")) {
                            intent = new Intent("android.intent.action.DIAL", uri);
                        } else if (!scheme.equals("sms") || scheme.equals("mailto")) {
                            intent = new Intent("android.intent.action.SENDTO", uri);
                        } else if (scheme.equals("whatsapp")) {
                            intent = new Intent("android.intent.action.SENDTO", uri);
                            intent.setPackage("com.whatsapp");
                        } else {
                            intent = null;
                        }
                        if (intent == null) {
                            webView.loadUrl(str);
                            break;
                        }
                        intent.addFlags(268435456);
                        try {
                            weakReference = advancedWebView.a;
                            if (weakReference != null || weakReference.get() == null) {
                                advancedWebView.getContext().startActivity(intent);
                                return true;
                            }
                            advancedWebView.a.get().startActivity(intent);
                            return true;
                        } catch (ActivityNotFoundException unused) {
                            break;
                        }
                    }
                    webView.loadUrl(str);
                    break;
                }
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = AdvancedWebView.this.v;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public void setListener(Activity activity, d dVar) {
        setListener(activity, dVar, 51426);
    }

    public void setListener(Fragment fragment, d dVar) {
        setListener(fragment, dVar, 51426);
    }

    public void setListener(Fragment fragment, d dVar, int i) {
        if (fragment != null) {
            this.b = new WeakReference<>(fragment);
        } else {
            this.b = null;
        }
        this.i = i;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        HashMap map = this.A;
        if (map.size() > 0) {
            super.loadUrl(str, map);
        } else {
            super.loadUrl(str);
        }
    }

    public AdvancedWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new LinkedList();
        this.i = 51426;
        this.z = "*/*";
        this.A = new HashMap();
        b(context);
    }

    public AdvancedWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new LinkedList();
        this.i = 51426;
        this.z = "*/*";
        this.A = new HashMap();
        b(context);
    }
}
