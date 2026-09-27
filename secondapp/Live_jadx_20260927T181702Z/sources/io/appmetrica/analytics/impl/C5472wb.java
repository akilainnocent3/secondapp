package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5472wb implements LastKnownLocationExtractorProvider {
    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    @oy.l
    public final LastKnownLocationExtractor getExtractor(@oy.l Context context, @oy.l PermissionExtractor permissionExtractor, @oy.l IHandlerExecutor iHandlerExecutor, @oy.l LocationListener locationListener) {
        return new C5497xb();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @oy.l
    public final String getIdentifier() {
        return "Last known extractor stub";
    }
}
