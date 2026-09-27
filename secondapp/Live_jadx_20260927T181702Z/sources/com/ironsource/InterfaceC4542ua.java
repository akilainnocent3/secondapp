package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.ironsource.ua, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4542ua {

    /* JADX INFO: renamed from: com.ironsource.ua$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements InterfaceC4542ua {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        private WebView f64260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f64261b;

        public a() {
            this(0, 1, null);
        }

        @SuppressLint({"NewApi"})
        private final void b(String str) {
            WebView webView = this.f64260a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.f64260a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC4542ua
        public boolean a() {
            return this.f64260a != null;
        }

        public a(int i10) {
            this.f64261b = i10 >= 19;
        }

        @Override // com.ironsource.InterfaceC4542ua
        public void a(@oy.l String script) {
            kotlin.jvm.internal.m0.p(script, "script");
            try {
                if (this.f64261b) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable th2) {
                C4485r4.d().a(th2);
                this.f64261b = false;
                c(script);
            }
        }

        public /* synthetic */ a(int i10, int i11, kotlin.jvm.internal.x xVar) {
            this((i11 & 1) != 0 ? Build.VERSION.SDK_INT : i10);
        }

        @Override // com.ironsource.InterfaceC4542ua
        public void a(@oy.l WebView webView) {
            kotlin.jvm.internal.m0.p(webView, "webView");
            this.f64260a = webView;
        }
    }

    void a(@oy.l WebView webView);

    void a(@oy.l String str);

    boolean a();
}
