package com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f42959e = "zu";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.d f42960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f42961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f42962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.models.internal.c f42963d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f42964d = "zu$zz";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference f42965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f42966c;

        public a(WebView webView, String str) {
            this.f42965b = new WeakReference(webView);
            this.f42966c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebView webView = (WebView) this.f42965b.get();
            if (webView == null) {
                com.cleveradssolutions.adapters.exchange.b.a(f42964d, "Failed to evaluate script. WebView is null");
            } else {
                webView.loadUrl(this.f42966c);
            }
        }
    }

    public j(WebView webView, Handler handler, com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.d dVar) {
        this.f42961b = webView;
        this.f42960a = dVar;
        this.f42962c = handler;
    }

    public void a() {
        this.f42963d.b("default");
        d("mraid.onReady();");
    }

    public void b(Rect rect) {
        s(String.format(Locale.US, "mraid.setCurrentPosition(%d, %d, %d, %d);", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.width()), Integer.valueOf(rect.height())));
    }

    public void c(Handler handler) {
        t("getResizeProperties", handler);
    }

    public void d(String str) {
        if (this.f42961b == null) {
            com.cleveradssolutions.adapters.exchange.b.h(f42959e, "evaluateMraidScript failure. webView is null");
            return;
        }
        try {
            this.f42962c.post(new a(this.f42961b, "javascript: if (window.mraid  ) { " + str + " }"));
        } catch (Exception e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42959e, "evaluateMraidScript failed: " + Log.getStackTraceString(e10));
        }
    }

    public void e() {
        this.f42963d.b("expanded");
        d("mraid.onReadyExpanded();");
    }

    public void f(Rect rect) {
        s(String.format(Locale.US, "mraid.setDefaultPosition(%d, %d, %d, %d);", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.width()), Integer.valueOf(rect.height())));
    }

    public void g(String str) {
        d(str);
    }

    public com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.d h() {
        return this.f42960a;
    }

    public void i(Rect rect) {
        s(String.format(Locale.US, "mraid.setMaxSize(%d, %d);", Integer.valueOf(rect.width()), Integer.valueOf(rect.height())));
    }

    public void j(String str) {
        if (TextUtils.equals(str, this.f42963d.a())) {
            return;
        }
        this.f42963d.b(str);
        d(String.format("mraid.onStateChange('%1$s');", str));
    }

    public void k() {
        this.f42963d.b("loading");
    }

    public void l(Rect rect) {
        s(String.format(Locale.US, "mraid.setScreenSize(%d, %d);", Integer.valueOf(rect.width()), Integer.valueOf(rect.height())));
    }

    public void m() {
        d("mraid.nativeCallComplete();");
    }

    public void n(Rect rect) {
        s(String.format(Locale.US, "mraid.onSizeChange(%d, %d);", Integer.valueOf(rect.width()), Integer.valueOf(rect.height())));
    }

    public void o(Handler handler) {
        t("getExpandProperties", handler);
    }

    public void p(com.cleveradssolutions.adapters.exchange.rendering.models.internal.c cVar) {
        this.f42963d = cVar;
    }

    public void q(com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.c cVar) {
        String string = cVar != null ? cVar.toString() : null;
        if (TextUtils.equals(string, this.f42963d.l())) {
            return;
        }
        d(String.format("mraid.onExposureChange('%1$s');", string));
        this.f42963d.o(string);
    }

    public void r(Float f10) {
        d("mraid.onAudioVolumeChange(" + f10 + ");");
    }

    public void s(String str) {
        if (this.f42961b == null) {
            com.cleveradssolutions.adapters.exchange.b.h(f42959e, "evaluateJavaScript failure. webView is null");
            return;
        }
        com.cleveradssolutions.adapters.exchange.b.h(f42959e, "evaluateJavaScript: " + str);
        try {
            this.f42962c.post(new a(this.f42961b, "javascript: if (window.mraid && (window.mraid.getState() != 'loading' ) && ( window.mraid.getState() != 'hidden') ) { " + str + " }"));
        } catch (Exception e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42959e, "evaluateJavaScript failed for script " + str + Log.getStackTraceString(e10));
        }
    }

    public void t(String str, Handler handler) {
        WebView webView = this.f42961b;
        if (!(webView instanceof com.cleveradssolutions.adapters.exchange.rendering.views.webview.k) || !((com.cleveradssolutions.adapters.exchange.rendering.views.webview.k) webView).p()) {
            if (handler != null) {
                Message message = new Message();
                Bundle bundle = new Bundle();
                bundle.putString("method", str);
                bundle.putString("value", "");
                message.setData(bundle);
                handler.dispatchMessage(message);
                return;
            }
            return;
        }
        String strC = this.f42960a.c(handler);
        if (strC != null) {
            s("jsBridge.javaScriptCallback('" + strC + "', '" + str + "', (function() { var retVal = mraid." + str + "(); if (typeof retVal === 'object') { retVal = JSON.stringify(retVal); } return retVal; })())");
        }
    }

    public void u(String str, String str2) {
        s(String.format("mraid.onError('%1$s', '%2$s');", str, str2));
    }

    public void v(boolean z10) {
        Boolean boolC = this.f42963d.c();
        if (boolC == null || boolC.booleanValue() != z10) {
            this.f42963d.n(Boolean.valueOf(z10));
            s(String.format("mraid.onViewableChange(%1$b);", Boolean.valueOf(z10)));
        }
    }
}
