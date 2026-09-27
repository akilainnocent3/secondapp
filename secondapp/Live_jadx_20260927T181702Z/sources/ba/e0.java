package ba;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.t0(27)
public class e0 {
    public static void a(@NonNull SafeBrowsingResponse safeBrowsingResponse, boolean z10) {
        safeBrowsingResponse.backToSafety(z10);
    }

    @NonNull
    public static Uri b() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    public static void c(@NonNull SafeBrowsingResponse safeBrowsingResponse, boolean z10) {
        safeBrowsingResponse.proceed(z10);
    }

    public static void d(@NonNull List<String> list, @Nullable ValueCallback<Boolean> valueCallback) {
        WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    public static void e(@NonNull SafeBrowsingResponse safeBrowsingResponse, boolean z10) {
        safeBrowsingResponse.showInterstitial(z10);
    }

    public static void f(@NonNull Context context, @Nullable ValueCallback<Boolean> valueCallback) {
        WebView.startSafeBrowsing(context, valueCallback);
    }
}
