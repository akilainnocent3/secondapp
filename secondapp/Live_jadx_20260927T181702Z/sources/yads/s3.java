package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.div.core.dagger.Names;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class s3 extends WebViewClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f155246d = {wb.a(s3.class, Names.CONTEXT, "getContext()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f155247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3 f155248b = cs2.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final db3 f155249c = new db3();

    public s3(Context context) {
        this.f155247a = mm2.a(context);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        lm2 lm2Var = this.f155247a;
        ns.o oVar = f155246d[0];
        Object obj = (Context) lm2Var.f152056a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            ((t1) t3Var).a(8);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        lm2 lm2Var = this.f155247a;
        ns.o oVar = f155246d[0];
        Object obj = (Context) lm2Var.f152056a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            ((t1) t3Var).a(0);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.f155248b.a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (android.webkit.URLUtil.isNetworkUrl(r10) == false) goto L17;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            if (r10 == 0) goto L5b
            int r1 = r10.length()
            if (r1 <= 0) goto L5b
            int r1 = r10.length()
            if (r1 != 0) goto L10
            goto L4a
        L10:
            cv.v r1 = new cv.v
            java.lang.String r2 = "http(s?)://"
            r1.<init>(r2)
            java.lang.String r2 = ""
            java.lang.String r1 = r1.r(r10, r2)
            yads.za3 r2 = yads.ab3.f146735c
            r2.getClass()
            r2 = 4
            yads.ab3[] r3 = new yads.ab3[r2]
            yads.ab3 r4 = yads.ab3.f146736d
            r3[r0] = r4
            yads.ab3 r4 = yads.ab3.f146737e
            r5 = 1
            r3[r5] = r4
            yads.ab3 r4 = yads.ab3.f146738f
            r5 = 2
            r3[r5] = r4
            yads.ab3 r4 = yads.ab3.f146739g
            r6 = 3
            r3[r6] = r4
            r4 = r0
        L39:
            if (r4 >= r2) goto L4a
            r6 = r3[r4]
            java.lang.String r6 = r6.f146741b
            r7 = 0
            boolean r6 = cv.k0.J2(r1, r6, r0, r5, r7)
            if (r6 == 0) goto L47
            goto L50
        L47:
            int r4 = r4 + 1
            goto L39
        L4a:
            boolean r1 = android.webkit.URLUtil.isNetworkUrl(r10)
            if (r1 != 0) goto L5b
        L50:
            yads.db3 r0 = r8.f155249c
            android.content.Context r9 = r9.getContext()
            boolean r9 = r0.a(r9, r10)
            return r9
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.s3.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
