package com.mbridge.msdk.config.dynamic.baseview.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.a;
import com.mbridge.msdk.config.dynamic.baseview.webview.client.b;
import com.mbridge.msdk.config.dynamic.utils.d;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ComponentWebView extends WebView implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f65959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f65960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.webview.client.a f65961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f65962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private XMLView f65963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f65964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f65965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f65966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f65967i;

    public ComponentWebView(@NonNull Context context) {
        super(context);
        this.f65959a = "ComponentWebView";
        this.f65966h = -1L;
        a();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + " WindVane/3.0.2");
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(false);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f65962d) {
            return;
        }
        try {
            this.f65962d = true;
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            destroy();
        } catch (Throwable th2) {
            q0.b("ComponentWebView", th2.getMessage());
        }
    }

    public long getClickTimeStamp() {
        return this.f65966h;
    }

    public float getxInScreen() {
        return this.f65964f;
    }

    public float getyInScreen() {
        return this.f65965g;
    }

    public boolean hasXmlUrl() {
        return !TextUtils.isEmpty(this.f65967i);
    }

    public boolean isDestroyed() {
        return this.f65962d;
    }

    public void loadXMLUrl() {
        if (TextUtils.isEmpty(this.f65967i)) {
            return;
        }
        loadUrl(this.f65967i);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f65963e = d.a((View) this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        destroy();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 0) {
                this.f65964f = motionEvent.getRawX();
                this.f65965g = motionEvent.getRawY();
                this.f65966h = System.currentTimeMillis();
            }
        } catch (Exception e10) {
            q0.b("ComponentWebView", "处理触摸事件异常: " + e10.getMessage());
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: ln.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104735b.a(view);
            }
        });
    }

    public void setWebViewEventListener(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        b bVar = this.f65960b;
        if (bVar != null) {
            bVar.a(aVar);
        }
        com.mbridge.msdk.config.dynamic.baseview.webview.client.a aVar2 = this.f65961c;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("data");
            if (obj instanceof String) {
                setXmlUrl(String.valueOf(obj));
            }
        } catch (Exception e10) {
            q0.b("ComponentWebView", "setXmlData异常: " + e10.getMessage());
        }
    }

    public void setXmlUrl(String str) {
        this.f65967i = str;
    }

    private void a() {
        b();
        b bVar = new b();
        this.f65960b = bVar;
        setWebViewClient(bVar);
        com.mbridge.msdk.config.dynamic.baseview.webview.client.a aVar = new com.mbridge.msdk.config.dynamic.baseview.webview.client.a();
        this.f65961c = aVar;
        setWebChromeClient(aVar);
    }

    public ComponentWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context);
        this.f65959a = "ComponentWebView";
        this.f65966h = -1L;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.f65963e;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.f65963e, view.getTag(), null);
    }

    public ComponentWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f65959a = "ComponentWebView";
        this.f65966h = -1L;
        a();
    }

    @t0(api = 21)
    public ComponentWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f65959a = "ComponentWebView";
        this.f65966h = -1L;
        a();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
    }
}
