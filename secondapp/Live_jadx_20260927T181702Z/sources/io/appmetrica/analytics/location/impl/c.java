package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements LastKnownLocationExtractorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98750a;

    public c(@oy.l String str) {
        this.f98750a = str;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    @oy.l
    public final LastKnownLocationExtractor getExtractor(@oy.l Context context, @oy.l PermissionExtractor permissionExtractor, @oy.l IHandlerExecutor iHandlerExecutor, @oy.l LocationListener locationListener) {
        return new b(context, new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_COARSE_LOCATION"), locationListener, iHandlerExecutor);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @oy.l
    public final String getIdentifier() {
        return this.f98750a;
    }
}
