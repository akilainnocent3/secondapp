package defpackage;

import android.content.Context;
import android.webkit.WebView;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface xzi0 {
    void a(WebView webView);

    f0j0 b(WebView webView, String str, Map<String, String> map);

    f0j0 c(WebView webView);

    f0j0 d(Context context, gey geyVar, vzi0 vzi0Var);

    f0j0 e(Context context, WebView webView, wzi0 wzi0Var);

    tqf0 f(WebView webView);

    f0j0 g(WebView webView, String str);

    default boolean h(WebView webView) {
        return f(webView) != null;
    }
}
