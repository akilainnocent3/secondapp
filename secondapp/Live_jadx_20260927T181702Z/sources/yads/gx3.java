package yads;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gx3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f149816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f149817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3 f149818d;

    public gx3(ix3 ix3Var, WebView webView, String str) {
        this.f149818d = ix3Var;
        this.f149816b = webView;
        this.f149817c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ix3 ix3Var = this.f149818d;
        WebView webView = this.f149816b;
        String str = this.f149817c;
        ix3Var.getClass();
        ix3.a(webView, str);
    }
}
