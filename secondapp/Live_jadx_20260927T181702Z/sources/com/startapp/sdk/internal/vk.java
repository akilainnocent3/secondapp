package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import java.util.LinkedList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class vk implements rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib f75725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib f75726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ib f75727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i7 f75728e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f75730g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ib f75732i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedList f75729f = new LinkedList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f75731h = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f75733j = new Runnable() { // from class: com.startapp.sdk.internal.in
        @Override // java.lang.Runnable
        public final void run() {
            this.f75009b.e();
        }
    };

    public vk(Context context, ib ibVar, ib ibVar2, ib ibVar3, final i7 i7Var) {
        if (Build.VERSION.SDK_INT < 31 || context.isUiContext()) {
            this.f75724a = context;
        } else {
            this.f75724a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
        }
        this.f75725b = ibVar;
        this.f75726c = ibVar2;
        this.f75727d = ibVar3;
        this.f75728e = i7Var;
        this.f75732i = new ib(new i7() { // from class: com.startapp.sdk.internal.jn
            @Override // com.startapp.sdk.internal.i7
            public final Object a() {
                return vk.a(i7Var);
            }
        });
    }

    public final void a(String str) {
        this.f75730g = str;
    }

    @Override // com.startapp.sdk.internal.rk
    public final void b() {
        d();
    }

    @Override // com.startapp.sdk.internal.rk
    public final WebView c() {
        if (this.f75729f.isEmpty()) {
            WebView webView = new WebView(this.f75724a);
            webView.setWebViewClient(new qk());
            return webView;
        }
        if (this.f75729f.size() == 1) {
            d();
        }
        return (WebView) this.f75729f.removeFirst();
    }

    public final void d() {
        try {
            dc dcVar = (dc) this.f75727d.a();
            Runnable runnable = this.f75733j;
            synchronized (dcVar) {
                if (dcVar.f74687c != null) {
                    return;
                }
                Thread thread = new Thread(new cc(dcVar, runnable), "startapp-lid-" + dc.f74684g.incrementAndGet());
                dcVar.f74687c = thread;
                thread.start();
            }
        } catch (Throwable th2) {
            if (a(256)) {
                d9.a(th2);
            }
        }
    }

    public final void e() {
        WebView webView;
        if (!this.f75729f.isEmpty()) {
            if (this.f75731h && TextUtils.isEmpty(this.f75730g)) {
                this.f75731h = false;
                if (!"default".equals(this.f75732i.a())) {
                    if (eq.c.f81518h.equals(this.f75732i.a())) {
                        a((WebView) this.f75729f.removeFirst());
                        return;
                    }
                    return;
                } else {
                    try {
                        ((Executor) this.f75725b.a()).execute(new sk(this));
                        return;
                    } catch (Throwable th2) {
                        if (a(8)) {
                            d9.a(th2);
                            return;
                        }
                        return;
                    }
                }
            }
            return;
        }
        try {
            webView = new WebView(this.f75724a);
            webView.setWebViewClient(new qk());
        } catch (Throwable th3) {
            if (a(2)) {
                d9.a(th3);
            }
            webView = null;
        }
        if (webView != null) {
            try {
                this.f75729f.addLast(webView);
            } catch (Throwable th4) {
                if (a(4)) {
                    d9.a(th4);
                }
            }
            if (this.f75731h && TextUtils.isEmpty(this.f75730g)) {
                d();
            }
        }
    }

    public final void f() {
        try {
            final String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f75724a);
            k8 k8Var = (k8) this.f75726c.a();
            k8Var.f75082a.post(new Runnable() { // from class: com.startapp.sdk.internal.hn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74963b.a(defaultUserAgent);
                }
            });
        } catch (Throwable th2) {
            if (a(16)) {
                d9.a(th2);
            }
        }
    }

    public static /* synthetic */ String a(i7 i7Var) {
        WvfMetadata wvfMetadata = (WvfMetadata) i7Var.a();
        WeightedChoice weightedChoiceB = wvfMetadata != null ? wvfMetadata.b() : null;
        String strA = weightedChoiceB != null ? weightedChoiceB.a() : null;
        return strA != null ? strA : "default";
    }

    public final boolean a(int i10) {
        WvfMetadata wvfMetadata = (WvfMetadata) this.f75728e.a();
        ComponentInfoEventConfig componentInfoEventConfigA = wvfMetadata != null ? wvfMetadata.a() : null;
        return componentInfoEventConfigA != null && componentInfoEventConfigA.a((long) i10);
    }

    @Override // com.startapp.sdk.internal.rk
    public final String a() {
        String str = this.f75730g;
        WeakHashMap weakHashMap = si.f75514a;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        try {
            String property = System.getProperty("http.agent");
            if (property == null || property.length() <= 0) {
                return null;
            }
            return property;
        } catch (Throwable th2) {
            if (a(1)) {
                d9.a(th2);
            }
            return null;
        }
    }

    public final void a(final WebView webView) {
        try {
            webView.setWebViewClient(new tk(this));
            final String strA = si.a();
            k8 k8Var = (k8) this.f75726c.a();
            k8Var.f75082a.post(new Runnable() { // from class: com.startapp.sdk.internal.kn
                @Override // java.lang.Runnable
                public final void run() {
                    webView.loadUrl(strA);
                }
            });
        } catch (Throwable th2) {
            if (a(32)) {
                d9.a(th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public final void a(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        try {
            if (webResourceRequest != null) {
                try {
                    Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                    if (requestHeaders != null) {
                        str = requestHeaders.get("User-Agent");
                        WeakHashMap weakHashMap = si.f75514a;
                        if (str == null || str.length() <= 0) {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                } catch (Throwable th2) {
                    if (a(128)) {
                        d9.a(th2);
                    }
                }
            } else {
                str = null;
            }
            k8 k8Var = (k8) this.f75726c.a();
            k8Var.f75082a.post(new uk(this, str, webView));
        } catch (Throwable th3) {
            if (a(64)) {
                d9.a(th3);
            }
        }
    }
}
