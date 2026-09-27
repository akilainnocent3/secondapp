package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
class GplOnSuccessListener implements OnSuccessListener<Location> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationListener f95416a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.f95416a = locationListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Location location) {
        this.f95416a.onLocationChanged(location);
    }
}
