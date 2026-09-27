package yads;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jw1 extends l11 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f151288c;

    public jw1(vv1 vv1Var) {
        super(vv1Var);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String str = this.f151288c;
        if (str == null || str.length() <= 0 || (url = webResourceRequest.getUrl()) == null || !kotlin.jvm.internal.m0.g("mraid.js", url.getLastPathSegment())) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        byte[] bytes = str.getBytes(cv.g.f77202b);
        kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }
}
