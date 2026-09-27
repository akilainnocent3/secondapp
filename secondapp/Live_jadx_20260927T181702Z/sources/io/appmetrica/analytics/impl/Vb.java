package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Vb implements PermissionStrategy, LocationControllerObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final Ub f96610b = new Ub();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f96611c = fr.h0.Q("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f96612a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@oy.l String str) {
        if (f96611c.contains(str)) {
            return !this.f96612a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f96612a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f96612a = false;
    }

    @oy.l
    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f96612a + ", locationPermissions=" + f96611c + ')';
    }
}
