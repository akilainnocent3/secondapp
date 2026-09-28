package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class dlc extends WebViewClient {
    public final int a;
    public final Function0<Unit> b;
    public int c;

    public dlc(int i, Function0<Unit> function0) {
        function0.getClass();
        this.a = i;
        this.b = function0;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (Intrinsics.g(str, webView != null ? webView.getUrl() : null)) {
            itf0.a aVar = itf0.a;
            aVar.q("MonnifyOTPWebViewDialog");
            int i = this.c + 1;
            this.c = i;
            aVar.a(hce0.a(i, "Reload count: "), new Object[0]);
            int i2 = this.a;
            if (i2 <= 0 || this.c != i2) {
                return;
            }
            aVar.q("MonnifyOTPWebViewDialog");
            aVar.a("Reload count hits " + i2 + ", invoke callback", new Object[0]);
            this.b.invoke();
        }
    }
}
