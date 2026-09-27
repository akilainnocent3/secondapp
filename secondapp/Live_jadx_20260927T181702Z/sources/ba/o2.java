package ba;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.t0(29)
public class o2 extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aa.b0 f20981a;

    public o2(@NonNull aa.b0 b0Var) {
        this.f20981a = b0Var;
    }

    @Nullable
    public aa.b0 a() {
        return this.f20981a;
    }

    public void onRenderProcessResponsive(@NonNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
        this.f20981a.a(webView, r2.c(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(@NonNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
        this.f20981a.b(webView, r2.c(webViewRenderProcess));
    }
}
