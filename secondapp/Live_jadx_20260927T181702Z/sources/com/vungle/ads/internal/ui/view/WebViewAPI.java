package com.vungle.ads.internal.ui.view;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import ew.j0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface WebViewAPI {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface MraidDelegate {
        boolean processCommand(@l String str, @l j0 j0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface WebClientErrorHandler {
        void onReceivedError(@l String str, boolean z10);

        void onRenderProcessUnresponsive(@m WebView webView, @m WebViewRenderProcess webViewRenderProcess);

        boolean onWebRenderingProcessGone(@m WebView webView, @m Boolean bool);
    }

    void notifyPropertiesChange(boolean z10);

    void setAdVisibility(boolean z10);

    void setConsentStatus(boolean z10, @m String str, @m String str2, @m String str3, @m String str4);

    void setErrorHandler(@l WebClientErrorHandler webClientErrorHandler);

    void setMraidDelegate(@m MraidDelegate mraidDelegate);

    void setWebViewObserver(@m WebViewObserver webViewObserver);
}
