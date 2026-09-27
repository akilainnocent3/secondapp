package com.bytedance.sdk.component.rs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.grv;
import com.bytedance.sdk.component.utils.za;
import com.ironsource.C4235d4;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import com.vungle.ads.internal.model.AdPayload;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu extends FrameLayout {

    /* JADX INFO: renamed from: qm, reason: collision with root package name */
    private static vy f34960qm;
    private sd aed;
    private boolean aeg;
    private int blh;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private com.bytedance.sdk.component.rs.hww f34961bs;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private long f34962cj;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private boolean f34963ed;
    private WebViewClient grv;
    private hv gvr;
    private boolean hnv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private JSONObject f34964hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private String f34965hv;
    private grv hwp;
    public int hww;
    private List<String> jpb;
    private volatile WebView khx;
    private boolean kub;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    private boolean f34966kv;
    private com.bytedance.sdk.component.rs.vy mrs;

    /* JADX INFO: renamed from: mw, reason: collision with root package name */
    private float f34967mw;
    private long nod;
    private long npz;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private long f34968ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private float f34969ok;
    private boolean omn;
    private tq oxu;

    /* JADX INFO: renamed from: qt, reason: collision with root package name */
    private AtomicBoolean f34970qt;
    private AtomicBoolean rpd;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private float f34971rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public int f34972sd;
    private Context syb;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public int f34973tq;
    private boolean vgm;
    private long vhb;
    private com.bytedance.sdk.component.rs.tq.hww vy;
    private AtomicBoolean wdz;
    private View weu;
    private com.bytedance.sdk.component.rs.hww.InterfaceC0329hww wgt;

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    private AttributeSet f34974yt;

    /* JADX INFO: renamed from: za, reason: collision with root package name */
    private float f34975za;
    private float zvy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hv {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.rs.hu.hww.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum sd {
        ADS(b.JSON_KEY_ADS),
        ADS_V3("ads_v3"),
        ENDCARD(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD),
        USER_AGENT(Q6.f59861d0),
        PLAYABLE("playable"),
        DSP("dsp"),
        PRIVACY("privacy"),
        VAST_ENDCARD("vast_endcard"),
        EASY_PLAYABLE("easy_playable"),
        LANDING_PAGE("landing_page"),
        LANDING_PAGE_LOADING("lp_loading"),
        LANDING_PAGE_PRE_RENDER("lp_pre_render");


        /* JADX INFO: renamed from: ed, reason: collision with root package name */
        public final String f34984ed;

        sd(String str) {
            this.f34984ed = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface tq {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface vy {
        WebView hww(Context context, AttributeSet attributeSet, int i10, sd sdVar);
    }

    public hu(Context context, sd sdVar) {
        this(hww(context), false, sdVar);
    }

    private void hnv() {
        if (this.hwp == null) {
            this.wdz.set(false);
            this.hwp = new grv(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.rs.hu.1
        };
        this.wdz.set(true);
    }

    private static Context hww(Context context) {
        return context;
    }

    private void mrs() {
        if (this.khx == null) {
            return;
        }
        try {
            this.khx.removeJavascriptInterface("searchBoxJavaBridge_");
            this.khx.removeJavascriptInterface("accessibility");
            this.khx.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    private void omn() {
        try {
            WebSettings settings = this.khx.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private static void sd(Context context) {
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(vy vyVar) {
        f34960qm = vyVar;
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.khx.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.khx.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void bs() {
        try {
            this.khx.clearView();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.khx == null) {
            return;
        }
        try {
            this.khx.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void ed() {
        if (this.khx != null) {
            this.khx.onResume();
        }
    }

    public View getArbitrageLoadingView() {
        return this.weu;
    }

    public int getContentHeight() {
        if (this.khx == null) {
            return 0;
        }
        try {
            return this.khx.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.npz;
    }

    public long getLandingPageClickEnd() {
        return this.f34962cj;
    }

    public com.bytedance.sdk.component.rs.tq.hww getMaterialMeta() {
        return this.vy;
    }

    public String getOriginalUrl() {
        String url;
        if (this.khx == null) {
            return null;
        }
        try {
            String originalUrl = this.khx.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith("data:text/html") || (url = this.khx.getUrl()) == null || !url.startsWith(AdPayload.FILE_SCHEME)) ? originalUrl : url;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.khx == null) {
            return 0;
        }
        try {
            return this.khx.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public sd getScene() {
        return this.aed;
    }

    public String getUrl() {
        if (this.khx == null) {
            return null;
        }
        try {
            return this.khx.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.khx == null) {
            return "";
        }
        try {
            return this.khx.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.khx;
    }

    public WebViewClient getWebViewClient() {
        return this.grv;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void hu() {
        if (this.khx != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.khx.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.khx, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void hv() {
        try {
            if (this.khx == null) {
                this.khx = hww(this.f34974yt, 0);
            }
            hu();
            tq(hww(this.syb));
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void jpb() {
        try {
            this.khx.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    public boolean k_() {
        return this.omn;
    }

    public void khx() {
        try {
            this.khx.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public void nod() {
        try {
            this.khx.goBack();
        } catch (Throwable unused) {
        }
    }

    public void ny() {
        try {
            this.khx.goForward();
        } catch (Throwable unused) {
        }
    }

    public void ok() {
        try {
            this.khx.reload();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.rpd.set(true);
        if (!this.f34970qt.get() || this.wdz.get()) {
            return;
        }
        hnv();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.rpd.set(false);
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentHww;
        try {
            hww(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.f34963ed && (viewParentHww = hww(this)) != null) {
                viewParentHww.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.khx.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public boolean rs() {
        if (this.khx == null) {
            return false;
        }
        try {
            return this.khx.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setAllowFileAccess(boolean z10) {
        try {
            this.khx.getSettings().setAllowFileAccess(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        try {
            super.setAlpha(f10);
            this.khx.setAlpha(f10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        try {
            this.khx.setBackgroundColor(i10);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z10) {
        try {
            this.khx.getSettings().setBuiltInZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i10) {
        try {
            this.khx.getSettings().setCacheMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i10) {
        this.blh = i10;
    }

    public void setDatabaseEnabled(boolean z10) {
        try {
            this.khx.getSettings().setDatabaseEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f10) {
        this.f34967mw = f10;
    }

    public void setDefaultFontSize(int i10) {
        try {
            this.khx.getSettings().setDefaultFontSize(i10);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.khx.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z10) {
        try {
            this.khx.getSettings().setDisplayZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z10) {
        try {
            this.khx.getSettings().setDomStorageEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.khx.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z10) {
        this.f34963ed = z10;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z10) {
        try {
            this.khx.getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z10) {
        try {
            this.khx.getSettings().setJavaScriptEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z10) {
        this.vgm = z10;
    }

    public void setLandingPageClickBegin(long j10) {
        this.npz = j10;
    }

    public void setLandingPageClickEnd(long j10) {
        this.f34962cj = j10;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
        try {
            this.khx.setLayerType(i10, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.khx.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z10) {
        try {
            this.khx.getSettings().setLoadWithOverviewMode(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLpPreRender(boolean z10) {
        this.omn = z10;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.rs.tq.hww hwwVar) {
        this.vy = hwwVar;
    }

    public void setMixedContentMode(int i10) {
        try {
            this.khx.getSettings().setMixedContentMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z10) {
        try {
            this.khx.setNetworkAvailable(z10);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(tq tqVar) {
        this.oxu = tqVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        try {
            this.khx.setOverScrollMode(i10);
            super.setOverScrollMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setPreError(boolean z10) {
        this.aeg = z10;
    }

    public void setPreFinish(boolean z10) {
        this.f34966kv = z10;
    }

    public void setPreProgressHundred(boolean z10) {
        this.kub = z10;
    }

    public void setPreStart(boolean z10) {
        this.hnv = z10;
    }

    public void setRecycler(boolean z10) {
        if (this.khx == null || !(this.khx instanceof com.bytedance.sdk.component.rs.hv)) {
            return;
        }
        ((com.bytedance.sdk.component.rs.hv) this.khx).setRecycler(z10);
    }

    public void setShakeValue(float f10) {
        this.zvy = f10;
    }

    public void setSupportZoom(boolean z10) {
        try {
            this.khx.getSettings().setSupportZoom(z10);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.f34965hv = str;
        com.bytedance.sdk.component.rs.hww hwwVar = this.f34961bs;
        if (hwwVar != null) {
            hwwVar.hww(str);
        }
        com.bytedance.sdk.component.rs.vy vyVar = this.mrs;
        if (vyVar != null) {
            vyVar.hww(str);
        }
    }

    public void setTouchStateListener(hv hvVar) {
        this.gvr = hvVar;
    }

    public void setUseWideViewPort(boolean z10) {
        try {
            this.khx.getSettings().setUseWideViewPort(z10);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.khx.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        try {
            super.setVisibility(i10);
            this.khx.setVisibility(i10);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.khx.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebView(WebView webView) {
        this.khx = webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof hv) {
                setTouchStateListener((hv) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new hww();
            }
            this.grv = webViewClient;
            this.khx.setWebViewClient(new vgm(this.wgt, webViewClient, this.jpb));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f10) {
        this.f34975za = f10;
    }

    public boolean tq() {
        return this.hnv;
    }

    public void vgm() {
        try {
            this.khx.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public boolean vhb() {
        if (this.khx == null) {
            return false;
        }
        try {
            return this.khx.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean vy() {
        return this.kub;
    }

    public void weu() {
        if (this.khx == null) {
            return;
        }
        try {
            this.khx.onPause();
        } catch (Throwable unused) {
        }
    }

    public void wgt() {
        if (this.khx == null) {
            return;
        }
        sd sdVar = this.aed;
        if (sdVar != sd.ADS && sdVar != sd.ADS_V3) {
            za.hww(this);
        } else {
            try {
                this.khx.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    public hu(Context context, boolean z10, sd sdVar) {
        super(hww(context));
        this.f34969ok = 0.0f;
        this.f34971rs = 0.0f;
        this.nod = 0L;
        this.vhb = 0L;
        this.f34968ny = 0L;
        this.f34963ed = false;
        this.zvy = 20.0f;
        this.f34975za = 50.0f;
        this.rpd = new AtomicBoolean();
        this.f34970qt = new AtomicBoolean();
        this.wdz = new AtomicBoolean();
        this.syb = context;
        this.aed = sdVar;
        if (z10) {
            return;
        }
        try {
            this.khx = hww((AttributeSet) null, 0);
            hu();
        } catch (Throwable unused) {
        }
        tq(hww(context));
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.khx.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase(C4235d4.i.f61404b)) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void tq(Context context) {
        sd(context);
        omn();
        mrs();
    }

    @Override // android.view.View
    public String getTag() {
        return this.f34965hv;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void hww(boolean z10, int i10, int i11, List<Integer> list, int i12, List<String> list2) {
        if (z10 && this.khx != null && (this.khx instanceof com.bytedance.sdk.component.rs.hv)) {
            this.f34961bs = new com.bytedance.sdk.component.rs.hww(this.syb, i10, i11, list, i12);
            this.jpb = list2;
            if (!TextUtils.isEmpty(this.f34965hv)) {
                this.f34961bs.hww(this.f34965hv);
            }
            ((com.bytedance.sdk.component.rs.hv) this.khx).setTouchListenerProxy(this.f34961bs);
            this.wgt = this.f34961bs.hww();
        }
    }

    public boolean sd() {
        return this.f34966kv;
    }

    private static boolean sd(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean tq(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void hww(int i10, long j10) {
        if (this.khx == null || !(this.khx instanceof com.bytedance.sdk.component.rs.hv)) {
            return;
        }
        this.mrs = new com.bytedance.sdk.component.rs.vy(this.syb, this.f34961bs, i10, j10, this);
        if (!TextUtils.isEmpty(this.f34965hv)) {
            this.mrs.hww(this.f34965hv);
        }
        ((com.bytedance.sdk.component.rs.hv) this.khx).setTouchListenerProxy(this.mrs);
    }

    public void hww(boolean z10, View view) {
        if (z10) {
            this.weu = view;
            view.setVisibility(8);
            View view2 = this.weu;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.weu, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView hww(AttributeSet attributeSet, int i10) {
        vy vyVar = f34960qm;
        if (vyVar != null) {
            return vyVar.hww(getContext(), attributeSet, i10, this.aed);
        }
        if (attributeSet == null) {
            return new WebView(hww(this.syb));
        }
        return new WebView(hww(this.syb), attributeSet);
    }

    @TargetApi(19)
    public void hww(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.khx.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void hww(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.khx.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public void hww(boolean z10) {
        try {
            this.khx.clearCache(z10);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewParent hww(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (tq(view2) || sd(view2)) ? parent : hww(view2);
    }

    @SuppressLint({"JavascriptInterface"})
    public void hww(Object obj, String str) {
        try {
            this.khx.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private void hww(MotionEvent motionEvent) {
        if (!this.vgm || this.vy == null) {
            return;
        }
        if ((this.f34965hv == null && this.f34964hu == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f34969ok = motionEvent.getRawX();
                this.f34971rs = motionEvent.getRawY();
                this.nod = System.currentTimeMillis();
                this.f34964hu = new JSONObject();
                if (this.khx != null) {
                    this.npz = this.nod;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.f34964hu.put("start_x", String.valueOf(this.f34969ok));
                this.f34964hu.put("start_y", String.valueOf(this.f34971rs));
                this.f34964hu.put("offset_x", String.valueOf(motionEvent.getRawX() - this.f34969ok));
                this.f34964hu.put("offset_y", String.valueOf(motionEvent.getRawY() - this.f34971rs));
                this.f34964hu.put("url", String.valueOf(getUrl()));
                this.f34964hu.put("tag", "");
                this.vhb = System.currentTimeMillis();
                if (this.khx != null) {
                    this.f34962cj = this.vhb;
                }
                this.f34964hu.put("down_time", this.nod);
                this.f34964hu.put("up_time", this.vhb);
                if (com.bytedance.sdk.component.rs.hww.hww.hww().tq() != null) {
                    long j10 = this.f34968ny;
                    long j11 = this.nod;
                    if (j10 != j11) {
                        this.f34968ny = j11;
                        com.bytedance.sdk.component.rs.hww.hww.hww().tq().hww(this.vy, this.f34965hv, "in_web_click", this.f34964hu, this.vhb - this.nod);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
