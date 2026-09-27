package ba;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.t0(26)
public class x {
    @NonNull
    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }

    public static boolean b(@NonNull WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    @Nullable
    public static WebChromeClient c(@NonNull WebView webView) {
        return webView.getWebChromeClient();
    }

    @Nullable
    public static WebViewClient d(@NonNull WebView webView) {
        return webView.getWebViewClient();
    }

    public static void e(@NonNull WebSettings webSettings, boolean z10) {
        webSettings.setSafeBrowsingEnabled(z10);
    }
}
