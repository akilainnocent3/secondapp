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
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class h1 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f20956a = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20957b = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily";

    @Override // ba.j2
    @NonNull
    public String[] a() {
        return f20956a;
    }

    @Override // ba.j2
    @NonNull
    public WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView) {
        throw new UnsupportedOperationException(f20957b);
    }

    @Override // ba.j2
    @NonNull
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        throw new UnsupportedOperationException(f20957b);
    }

    @Override // ba.j2
    @NonNull
    public ProfileStoreBoundaryInterface getProfileStore() {
        throw new UnsupportedOperationException(f20957b);
    }

    @Override // ba.j2
    @NonNull
    public ProxyControllerBoundaryInterface getProxyController() {
        throw new UnsupportedOperationException(f20957b);
    }

    @Override // ba.j2
    @NonNull
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        throw new UnsupportedOperationException(f20957b);
    }

    @Override // ba.j2
    @NonNull
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException(f20957b);
    }

    @Override // ba.j2
    @NonNull
    public TracingControllerBoundaryInterface getTracingController() {
        throw new UnsupportedOperationException(f20957b);
    }

    @Override // ba.j2
    @NonNull
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException(f20957b);
    }
}
