package ba;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k2 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f20965a;

    public k2(@NonNull WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f20965a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // ba.j2
    @NonNull
    public String[] a() {
        return this.f20965a.getSupportedFeatures();
    }

    @Override // ba.j2
    @NonNull
    public WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView) {
        return (WebViewProviderBoundaryInterface) my.a.a(WebViewProviderBoundaryInterface.class, this.f20965a.createWebView(webView));
    }

    @Override // ba.j2
    @NonNull
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) my.a.a(DropDataContentProviderBoundaryInterface.class, this.f20965a.getDropDataProvider());
    }

    @Override // ba.j2
    @NonNull
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) my.a.a(ProfileStoreBoundaryInterface.class, this.f20965a.getProfileStore());
    }

    @Override // ba.j2
    @NonNull
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) my.a.a(ProxyControllerBoundaryInterface.class, this.f20965a.getProxyController());
    }

    @Override // ba.j2
    @NonNull
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) my.a.a(ServiceWorkerControllerBoundaryInterface.class, this.f20965a.getServiceWorkerController());
    }

    @Override // ba.j2
    @NonNull
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) my.a.a(StaticsBoundaryInterface.class, this.f20965a.getStatics());
    }

    @Override // ba.j2
    @NonNull
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) my.a.a(TracingControllerBoundaryInterface.class, this.f20965a.getTracingController());
    }

    @Override // ba.j2
    @NonNull
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) my.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f20965a.getWebkitToCompatConverter());
    }
}
