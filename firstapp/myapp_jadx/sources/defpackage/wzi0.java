package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.sportygames.commons.views.MainActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class wzi0 {
    public final String a;
    public final WebViewClient b;
    public final WebChromeClient c;

    public wzi0(String str, WebViewClient webViewClient, MainActivity.e eVar) {
        this.a = str;
        this.b = webViewClient;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzi0)) {
            return false;
        }
        wzi0 wzi0Var = (wzi0) obj;
        return Intrinsics.g(this.a, wzi0Var.a) && Intrinsics.g(this.b, wzi0Var.b) && Intrinsics.g(this.c, wzi0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        WebViewClient webViewClient = this.b;
        int iHashCode2 = (iHashCode + (webViewClient == null ? 0 : webViewClient.hashCode())) * 31;
        WebChromeClient webChromeClient = this.c;
        return iHashCode2 + (webChromeClient != null ? webChromeClient.hashCode() : 0);
    }

    public final String toString() {
        return "WebViewPrepareRequest(initialTierUrl=" + this.a + ", delegateWebViewClient=" + this.b + ", delegateWebChromeClient=" + this.c + ")";
    }
}
