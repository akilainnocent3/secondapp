package defpackage;

import android.view.View;
import android.webkit.WebView;
import com.sportybet.plugin.event.view.LiveEventMatchWebView;

/* JADX INFO: loaded from: classes4.dex */
public final class bls implements g6i0 {
    public final LiveEventMatchWebView a;
    public final View b;
    public final WebView c;

    public bls(LiveEventMatchWebView liveEventMatchWebView, View view, WebView webView) {
        this.a = liveEventMatchWebView;
        this.b = view;
        this.c = webView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
