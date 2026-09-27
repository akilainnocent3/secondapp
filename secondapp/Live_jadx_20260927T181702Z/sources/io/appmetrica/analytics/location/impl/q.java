package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class q implements LastKnownLocationExtractorProvider, LocationReceiverProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98784a = "location-passive-provider";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f98785b;

    @oy.l
    public final r a(@oy.l Context context, @oy.l PermissionExtractor permissionExtractor, @oy.l IHandlerExecutor iHandlerExecutor, @oy.l LocationListener locationListener) {
        return c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @oy.l
    public final r b(@oy.l Context context, @oy.l PermissionExtractor permissionExtractor, @oy.l IHandlerExecutor iHandlerExecutor, @oy.l LocationListener locationListener) {
        return c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    public final synchronized r c(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        r rVar;
        try {
            if (this.f98785b == null) {
                this.f98785b = new r(context, iHandlerExecutor.getLooper(), new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_FINE_LOCATION"), locationListener);
            }
            rVar = this.f98785b;
            if (rVar == null) {
                m0.S("passiveProviderLocationReceiver");
                rVar = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return rVar;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    public final LastKnownLocationExtractor getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @oy.l
    public final String getIdentifier() {
        return this.f98784a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider
    public final LocationReceiver getLocationReceiver(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }
}
