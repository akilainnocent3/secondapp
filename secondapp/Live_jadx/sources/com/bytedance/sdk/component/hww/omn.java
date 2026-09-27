package com.bytedance.sdk.component.hww;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import gi.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class omn extends hww {
    static final /* synthetic */ boolean nod = true;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    protected String f34893ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    protected WebView f34894rs;

    @Override // com.bytedance.sdk.component.hww.hww
    public Context hww(rs rsVar) {
        Context context = rsVar.f34898hv;
        if (context != null) {
            return context;
        }
        WebView webView = rsVar.hww;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.hww.hww
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void sd() {
        if (!nod && this.f34894rs == null) {
            throw new AssertionError();
        }
        this.f34894rs.addJavascriptInterface(this, this.f34893ok);
    }

    @Override // com.bytedance.sdk.component.hww.hww
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public void tq(rs rsVar) {
        this.f34894rs = rsVar.hww;
        this.f34893ok = rsVar.f34902sd;
        if (rsVar.f34896ed) {
            return;
        }
        sd();
    }

    public void vy() {
        this.f34894rs.removeJavascriptInterface(this.f34893ok);
    }

    @Override // com.bytedance.sdk.component.hww.hww
    public String hww() {
        return this.f34894rs.getUrl();
    }

    @Override // com.bytedance.sdk.component.hww.hww
    public void tq() {
        super.tq();
        vy();
    }

    @Override // com.bytedance.sdk.component.hww.hww
    public void hww(String str, khx khxVar) {
        if (khxVar != null && !TextUtils.isEmpty(khxVar.f34886ok)) {
            String str2 = khxVar.f34886ok;
            hww(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.hww(str, khxVar);
    }

    @Override // com.bytedance.sdk.component.hww.hww
    public void hww(String str) {
        hww(str, "javascript:" + this.f34893ok + "._handleMessageFromToutiao(" + str + j.f86771d);
    }

    private void hww(String str, final String str2) {
        if (this.f34878hu || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.hww.omn.1
            @Override // java.lang.Runnable
            public void run() {
                if (omn.this.f34878hu) {
                    return;
                }
                try {
                    omn.this.f34894rs.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.vy.post(runnable);
        } else {
            runnable.run();
        }
    }
}
