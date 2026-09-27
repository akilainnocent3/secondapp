package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f68137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f68138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ToolBar f68139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ToolBar f68140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ProgressBar f68141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f68142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnClickListener f68143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b f68144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a f68145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected BaseWebView f68146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View.OnClickListener f68147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnClickListener f68148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View.OnClickListener f68149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f68150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f68151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f68152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WebViewClient f68153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f68154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i f68155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f68156t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f68157u;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f68152p + "ms");
            if (CommonWebView.this.f68155s != null) {
                CommonWebView.this.f68156t = false;
                CommonWebView.this.f68155s.a(CommonWebView.this.f68154r);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.c("CommonWebView", "newProgress! 开始! = " + str);
            CommonWebView.this.f68141e.setVisible(true);
            CommonWebView.this.f68141e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th2) {
                    q0.b("CommonWebView", th2.getMessage());
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends WebChromeClient {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebView.this.f68141e.setVisible(false);
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            q0.c("CommonWebView", "newProgress! = " + i10);
            if (i10 == 100) {
                CommonWebView.this.f68141e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.f68146j;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                    CommonWebView.this.f68140d.getItem(ToolBar.FORWARD).setEnabled(true);
                    if (CommonWebView.this.f68146j.canGoBack()) {
                        CommonWebView.this.f68146j.goBack();
                    }
                    CommonWebView.this.f68140d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f68146j.canGoBack());
                    if (CommonWebView.this.f68147k != null) {
                        CommonWebView.this.f68147k.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.FORWARD)) {
                    CommonWebView.this.f68140d.getItem(ToolBar.BACKWARD).setEnabled(true);
                    if (CommonWebView.this.f68146j.canGoForward()) {
                        CommonWebView.this.f68146j.goForward();
                    }
                    CommonWebView.this.f68140d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f68146j.canGoForward());
                    if (CommonWebView.this.f68148l != null) {
                        CommonWebView.this.f68148l.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.REFRESH)) {
                    CommonWebView.this.f68140d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f68146j.canGoBack());
                    CommonWebView.this.f68140d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f68146j.canGoForward());
                    CommonWebView.this.f68146j.reload();
                    if (CommonWebView.this.f68149m != null) {
                        CommonWebView.this.f68149m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.EXITS)) {
                    if (CommonWebView.this.f68143g != null) {
                        CommonWebView.this.f68143g.onClick(view);
                    }
                } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                    if (CommonWebView.this.f68150n != null) {
                        CommonWebView.this.f68150n.onClick(view);
                    }
                    com.mbridge.msdk.click.c.c(CommonWebView.this.getContext(), CommonWebView.this.f68146j.getUrl());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends WebViewClient {
        public e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f68140d.getItem(ToolBar.BACKWARD).setEnabled(true);
            CommonWebView.this.f68140d.getItem(ToolBar.FORWARD).setEnabled(false);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f extends WebViewClient {
        public f() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (u0.a.b(str)) {
                u0.a.a(CommonWebView.this.getContext(), str, null);
            }
            return CommonWebView.this.a(webView, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g extends WebViewClient {
        public g() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            CommonWebView.this.f68156t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CommonWebView.this.f68154r = str;
            if (CommonWebView.this.f68156t) {
                return;
            }
            CommonWebView.this.f68156t = true;
            CommonWebView.this.c();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            CommonWebView.this.f68156t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f68154r = str;
            if (CommonWebView.this.f68156t) {
                CommonWebView.this.a();
            }
            CommonWebView.this.f68156t = true;
            CommonWebView.this.c();
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface h {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface i {
        void a(String str);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68157u = new a();
        init();
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f68145i.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f68144h.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f68139c;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.f68140d) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f68146j;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f68146j;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f68139c;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f68140d;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f68139c.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f68142f = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f68142f, layoutParams);
        this.f68137a = v0.a(getContext(), 40.0f);
        this.f68138b = v0.a(getContext(), 40.0f);
        this.f68144h = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.f68145i = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f68146j == null) {
                this.f68146j = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f68146j.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f68146j;
            com.mbridge.msdk.mbsignalcommon.base.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f68144h);
            this.f68146j.setWebChromeClient(this.f68145i);
            addWebViewClient(bVar);
        } catch (Throwable th2) {
            q0.b("CommonWebView", "webview is error", th2);
        }
        this.f68142f.addView(this.f68146j);
    }

    public void loadUrl(String str) {
        this.f68146j.loadUrl(str);
        if (this.f68153q != null) {
            c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f68147k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f68148l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f68150n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f68149m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f68145i.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f68144h.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f68139c.getParent()).removeView(this.f68139c);
        this.f68142f.addView(this.f68139c);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f68139c.getParent()).removeView(this.f68139c);
        addView(this.f68139c, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f68143g = onClickListener;
    }

    public void setPageLoadTimtout(int i10) {
        this.f68152p = i10;
        if (this.f68151o == null) {
            this.f68151o = new Handler(Looper.getMainLooper());
        }
        if (this.f68153q == null) {
            g gVar = new g();
            this.f68153q = gVar;
            addWebViewClient(gVar);
        }
    }

    public void setPageLoadTimtoutListener(i iVar) {
        this.f68155s = iVar;
    }

    public void setToolBarTitle(String str, int i10) {
        this.f68139c.setTitle(str, i10);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f68139c;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f68140d;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f68139c.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z10) {
        a(arrayList, z10);
    }

    public void useDeeplink() {
        addWebViewClient(new f());
    }

    public void useDefaultToolBar() {
        b();
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f68141e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new b());
        addWebChromeClient(new c());
        addView(this.f68141e);
        this.f68141e.initResource(true);
    }

    private void b() {
        if (this.f68140d != null) {
            return;
        }
        this.f68140d = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f68138b);
        layoutParams.bottomMargin = 0;
        this.f68140d.setLayoutParams(layoutParams);
        this.f68140d.setBackgroundColor(-1);
        this.f68140d.setOnItemClickListener(new d());
        addWebViewClient(new e());
        addView(this.f68140d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f68151o.postDelayed(this.f68157u, this.f68152p);
    }

    public void setToolBarTitle(String str) {
        this.f68139c.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68157u = new a();
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z10) {
        if (this.f68139c != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.a(40);
        aVar.b(80);
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f68139c = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z10) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f68137a);
            layoutParams.addRule(10);
            this.f68139c.setLayoutParams(layoutParams);
            this.f68142f.addView(this.f68139c);
            return;
        }
        this.f68139c.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f68137a));
        addView(this.f68139c, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f68157u = new a();
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals("intent")) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            uri2.setComponent(null);
                            uri2.setSelector(null);
                            uri2.setFlags(268435456);
                            getContext().startActivity(uri2);
                            return true;
                        }
                        try {
                            String stringExtra = uri2.getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                Uri uri3 = Uri.parse(str);
                                if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals("https")) {
                                    str = stringExtra;
                                }
                                webView.loadUrl(stringExtra);
                                return false;
                            }
                        } catch (Throwable th2) {
                            q0.b("CommonWebView", th2.getMessage());
                        }
                    } catch (Throwable th3) {
                        q0.b("CommonWebView", th3.getMessage());
                    }
                    q0.b("CommonWebView", th.getMessage());
                    return false;
                }
                if (com.mbridge.msdk.click.c.d(getContext(), str)) {
                    q0.b("CommonWebView", "openDeepLink");
                    return true;
                }
                if (!TextUtils.isEmpty(str)) {
                    return !(str.startsWith("http") || str.startsWith("https"));
                }
            }
            return false;
        } catch (Throwable th4) {
            q0.b("CommonWebView", th4.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f68151o.removeCallbacks(this.f68157u);
    }
}
