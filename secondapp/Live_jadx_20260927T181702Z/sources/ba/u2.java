package ba;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebkitToCompatConverterBoundaryInterface f21000a;

    public u2(@NonNull WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f21000a = webkitToCompatConverterBoundaryInterface;
    }

    @NonNull
    public f1 a(@NonNull CookieManager cookieManager) {
        return new f1((WebViewCookieManagerBoundaryInterface) my.a.a(WebViewCookieManagerBoundaryInterface.class, this.f21000a.convertCookieManager(cookieManager)));
    }

    @NonNull
    @k.t0(27)
    public SafeBrowsingResponse b(@NonNull InvocationHandler invocationHandler) {
        return s2.a(this.f21000a.convertSafeBrowsingResponse(invocationHandler));
    }

    @NonNull
    public InvocationHandler c(@NonNull SafeBrowsingResponse safeBrowsingResponse) {
        return this.f21000a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    @NonNull
    @k.t0(24)
    public ServiceWorkerWebSettings d(@NonNull InvocationHandler invocationHandler) {
        return t2.a(this.f21000a.convertServiceWorkerSettings(invocationHandler));
    }

    @NonNull
    public InvocationHandler e(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f21000a.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    @NonNull
    public f2 f(@NonNull WebSettings webSettings) {
        return new f2((WebSettingsBoundaryInterface) my.a.a(WebSettingsBoundaryInterface.class, this.f21000a.convertSettings(webSettings)));
    }

    @NonNull
    @k.t0(23)
    public WebMessagePort g(@NonNull InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f21000a.convertWebMessagePort(invocationHandler);
    }

    @NonNull
    public InvocationHandler h(@NonNull WebMessagePort webMessagePort) {
        return this.f21000a.convertWebMessagePort(webMessagePort);
    }

    @NonNull
    @k.t0(23)
    public WebResourceError i(@NonNull InvocationHandler invocationHandler) {
        return (WebResourceError) this.f21000a.convertWebResourceError(invocationHandler);
    }

    @NonNull
    public InvocationHandler j(@NonNull WebResourceError webResourceError) {
        return this.f21000a.convertWebResourceError(webResourceError);
    }

    @NonNull
    public e2 k(@NonNull WebResourceRequest webResourceRequest) {
        return new e2((WebResourceRequestBoundaryInterface) my.a.a(WebResourceRequestBoundaryInterface.class, this.f21000a.convertWebResourceRequest(webResourceRequest)));
    }
}
