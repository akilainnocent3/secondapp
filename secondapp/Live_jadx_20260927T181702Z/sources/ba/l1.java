package ba;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class l1 implements aa.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProfileBoundaryInterface f20966b;

    public l1(ProfileBoundaryInterface profileBoundaryInterface) {
        this.f20966b = profileBoundaryInterface;
    }

    @Override // aa.d
    @NonNull
    public GeolocationPermissions a() throws IllegalStateException {
        if (g2.f20925c0.d()) {
            return this.f20966b.getGeoLocationPermissions();
        }
        throw g2.a();
    }

    @Override // aa.d
    @NonNull
    public CookieManager getCookieManager() throws IllegalStateException {
        if (g2.f20925c0.d()) {
            return this.f20966b.getCookieManager();
        }
        throw g2.a();
    }

    @Override // aa.d
    @NonNull
    public String getName() {
        if (g2.f20925c0.d()) {
            return this.f20966b.getName();
        }
        throw g2.a();
    }

    @Override // aa.d
    @NonNull
    public ServiceWorkerController getServiceWorkerController() throws IllegalStateException {
        if (g2.f20925c0.d()) {
            return this.f20966b.getServiceWorkerController();
        }
        throw g2.a();
    }

    @Override // aa.d
    @NonNull
    public WebStorage getWebStorage() throws IllegalStateException {
        if (g2.f20925c0.d()) {
            return this.f20966b.getWebStorage();
        }
        throw g2.a();
    }

    public l1() {
        this.f20966b = null;
    }
}
