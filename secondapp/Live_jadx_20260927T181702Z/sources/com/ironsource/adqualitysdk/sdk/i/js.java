package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class js implements jk {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<WebView, js> f2880 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2881;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Set<jk> f2882 = new HashSet();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jt f2883;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.js$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class AnonymousClass4 extends WebChromeClient {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2888 = false;

        public AnonymousClass4() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            js.this.mo228(webView, str2);
            return false;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            if (i10 != 100 || this.f2888) {
                return;
            }
            this.f2888 = true;
            js.this.mo227(webView);
        }
    }

    private js(WebView webView, String str) {
        this.f2881 = str;
        jt jtVar = new jt(webView);
        this.f2883 = jtVar;
        jtVar.m2690(new AnonymousClass2());
        this.f2883.m2688(new AnonymousClass4());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static js m2672(WebView webView, String str) {
        js jsVar = f2880.get(webView);
        if (jsVar != null) {
            return jsVar;
        }
        js jsVar2 = new js(webView, str);
        f2880.put(webView, jsVar2);
        return jsVar2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2675(jk jkVar) {
        this.f2882.add(jkVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final bb.e m2677() {
        return this.f2883.m2686();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2680(jk jkVar) {
        this.f2882.remove(jkVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m2676() {
        return this.f2883.m2689();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ｋ */
    public final void mo230(WebView webView, String str, boolean z10) {
        for (jk jkVar : new HashSet(this.f2882)) {
            if (jkVar != null) {
                jkVar.mo230(webView, str, z10);
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2678() {
        this.f2883.m2690(new AnonymousClass2());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final WebView m2679() {
        return this.f2883.m2687();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻛ */
    public final void mo229(WebView webView, String str, String str2) {
        for (jk jkVar : new HashSet(this.f2882)) {
            if (jkVar != null) {
                jkVar.mo229(webView, str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2674() {
        this.f2883.m2688(new AnonymousClass4());
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.js$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class AnonymousClass2 extends WebViewClient {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean f2887 = false;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2885 = false;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f2886 = null;

        public AnonymousClass2() {
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean m2681(WebView webView) {
            if (this.f2887 && this.f2885) {
                return true;
            }
            return (webView.getOriginalUrl() == null || this.f2886 == null || webView.getOriginalUrl().equals(this.f2886)) ? false : true;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean m2682(WebView webView, String str) {
            if (!str.startsWith(js.this.f2881)) {
                return false;
            }
            this.f2886 = webView.getOriginalUrl();
            String strSubstring = str.substring(js.this.f2881.length());
            js jsVar = js.this;
            jsVar.mo229(webView, jsVar.f2881, strSubstring);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            js.this.mo227(webView);
            this.f2887 = false;
            this.f2885 = true;
            if (this.f2886 == null) {
                this.f2886 = webView.getOriginalUrl();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            js.this.mo227(webView);
            this.f2887 = true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (m2682(webView, str)) {
                return true;
            }
            if (this.f2886 == null) {
                this.f2886 = webView.getOriginalUrl();
            }
            js.this.mo230(webView, str, m2681(webView));
            this.f2885 = true;
            this.f2887 = false;
            return false;
        }

        @Override // android.webkit.WebViewClient
        @t0(api = 24)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻛ */
    public final void mo228(WebView webView, String str) {
        for (jk jkVar : new HashSet(this.f2882)) {
            if (jkVar != null) {
                jkVar.mo228(webView, str);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jk
    /* JADX INFO: renamed from: ﻐ */
    public final void mo227(WebView webView) {
        for (jk jkVar : new HashSet(this.f2882)) {
            if (jkVar != null) {
                jkVar.mo227(webView);
            }
        }
    }
}
