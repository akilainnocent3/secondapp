package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Yb implements LocationReceiverProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96835a = "Location receiver stub";

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @oy.l
    public final String getIdentifier() {
        return this.f96835a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider
    @oy.l
    public final LocationReceiver getLocationReceiver(@oy.l Context context, @oy.l PermissionExtractor permissionExtractor, @oy.l IHandlerExecutor iHandlerExecutor, @oy.l LocationListener locationListener) {
        return new Zb();
    }
}
