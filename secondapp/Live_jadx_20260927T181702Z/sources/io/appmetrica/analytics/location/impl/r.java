package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.google.firebase.analytics.FirebaseAnalytics;
import dr.w2;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.r;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class r extends u implements LocationReceiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f98786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f98787f;

    public r(@oy.l Context context, @oy.l Looper looper, @oy.l PermissionResolutionStrategy permissionResolutionStrategy, @oy.l LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f98786e = looper;
        this.f98787f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final w2 a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f98796d, rVar.f98787f, 0.0f, rVar.f98795c, rVar.f98786e);
        return w2.f79517a;
    }

    public static final w2 b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f98795c);
        return w2.f79517a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f98794b.hasNecessaryPermissions(this.f98793a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f98793a, FirebaseAnalytics.d.f52112s, "request location updates for " + this.f98796d + " provider", "location manager", new FunctionWithThrowable() { // from class: xq.b
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return r.a(this.f145494a, (LocationManager) obj);
                }
            });
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f98793a, FirebaseAnalytics.d.f52112s, "stop location updates for passive provider", "location manager", new FunctionWithThrowable() { // from class: xq.a
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return r.b(this.f145493a, (LocationManager) obj);
            }
        });
    }
}
