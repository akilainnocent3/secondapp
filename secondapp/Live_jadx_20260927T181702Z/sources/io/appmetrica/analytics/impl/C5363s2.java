package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5363s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f98281a;

    public C5363s2(Context context) {
        this((LocationManager) context.getSystemService(FirebaseAnalytics.d.f52112s));
    }

    public C5363s2(LocationManager locationManager) {
        this.f98281a = locationManager;
    }
}
