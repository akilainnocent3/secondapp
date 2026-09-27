package com.iab.omid.library.prebidorg.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import gi.j;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zw {
    private static zw zz = new zw();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class zz implements Runnable {

        /* JADX INFO: renamed from: zr, reason: collision with root package name */
        final /* synthetic */ String f53750zr;
        final /* synthetic */ WebView zz;

        public zz(zw zwVar, WebView webView, String str) {
            this.zz = webView;
            this.f53750zr = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.zz.loadUrl(this.f53750zr);
        }
    }

    private zw() {
    }

    public static final zw zz() {
        return zz;
    }

    public void zr(WebView webView) {
        zz(webView, "publishImpressionEvent", new Object[0]);
    }

    public void zs(WebView webView) {
        zz(webView, "publishLoadedEvent", new Object[0]);
    }

    public void zr(WebView webView, String str) {
        zz(webView, "setState", str);
    }

    public void zs(WebView webView, JSONObject jSONObject) {
        zz(webView, "setLastActivity", jSONObject);
    }

    public void zz(WebView webView) {
        zz(webView, "finishSession", new Object[0]);
    }

    public void zr(WebView webView, JSONObject jSONObject) {
        zz(webView, "publishLoadedEvent", jSONObject);
    }

    public boolean zs(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    public void zz(WebView webView, float f10) {
        zz(webView, "setDeviceVolume", Float.valueOf(f10));
    }

    public void zz(WebView webView, String str) {
        zz(webView, "setNativeViewHierarchy", str);
    }

    public void zz(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        zs(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    public void zz(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            zz(webView, "publishMediaEvent", str, jSONObject);
        } else {
            zz(webView, "publishMediaEvent", str);
        }
    }

    public void zz(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zz(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public void zz(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            com.iab.omid.library.prebidorg.utils.zt.zz("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append(j.f86770c);
        zz(sb2, objArr);
        sb2.append(")}");
        zz(webView, sb2);
    }

    public void zz(WebView webView, StringBuilder sb2) {
        String string = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(string);
        } else {
            handler.post(new zz(this, webView, string));
        }
    }

    public void zz(WebView webView, JSONObject jSONObject) {
        zz(webView, "init", jSONObject);
    }

    public void zz(StringBuilder sb2, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                sb2.append('\"');
            } else {
                if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb2.append(string);
                    } else {
                        sb2.append('\"');
                        sb2.append(string);
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(",");
            }
            sb2.append('\"');
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
    }
}
