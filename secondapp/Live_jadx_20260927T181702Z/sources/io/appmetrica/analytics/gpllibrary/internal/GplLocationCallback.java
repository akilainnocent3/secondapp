package io.appmetrica.analytics.gpllibrary.internal;

import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
class GplLocationCallback extends LocationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationListener f95415a;

    public GplLocationCallback(LocationListener locationListener) {
        this.f95415a = locationListener;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        this.f95415a.onLocationChanged(locationResult.getLastLocation());
    }
}
