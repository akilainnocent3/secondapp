package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sportybet.android.router.Sender;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 extends WebViewClient {
    public final /* synthetic */ v0 a;

    public u0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        String string = url.toString();
        v0 v0Var = this.a;
        if (TextUtils.equals(string, v0Var.A0)) {
            return true;
        }
        String path = url.getPath();
        if (path == null) {
            return false;
        }
        xxi0[] xxi0VarArr = xxi0.a;
        if (path.endsWith("/m/features")) {
            return false;
        }
        v0Var.q0.a(url, null, Sender.DIRECT_URL);
        return true;
    }
}
