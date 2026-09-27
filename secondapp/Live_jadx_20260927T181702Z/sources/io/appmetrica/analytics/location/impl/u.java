package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.u;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class u implements LastKnownLocationExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f98793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f98794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationListener f98795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f98796d;

    public u(@oy.l Context context, @oy.l PermissionResolutionStrategy permissionResolutionStrategy, @oy.l LocationListener locationListener, @oy.l String str) {
        this.f98793a = context;
        this.f98794b = permissionResolutionStrategy;
        this.f98795c = locationListener;
        this.f98796d = str;
    }

    @oy.l
    public final Context a() {
        return this.f98793a;
    }

    @oy.l
    public final LocationListener b() {
        return this.f98795c;
    }

    @oy.l
    public final PermissionResolutionStrategy c() {
        return this.f98794b;
    }

    @oy.l
    public final String d() {
        return this.f98796d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f98794b.hasNecessaryPermissions(this.f98793a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f98793a, FirebaseAnalytics.d.f52112s, "getting last known location for provider " + this.f98796d, "location manager", new FunctionWithThrowable() { // from class: xq.c
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return u.a(this.f145495a, (LocationManager) obj);
                }
            });
            if (location != null) {
                this.f98795c.onLocationChanged(location);
            }
        }
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f98796d);
    }
}
