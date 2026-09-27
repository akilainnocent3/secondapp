package aa;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4511a = "Default";

    @NonNull
    @k.d
    GeolocationPermissions a();

    @NonNull
    @k.d
    CookieManager getCookieManager();

    @NonNull
    @k.d
    String getName();

    @NonNull
    @k.d
    ServiceWorkerController getServiceWorkerController();

    @NonNull
    @k.d
    WebStorage getWebStorage();
}
