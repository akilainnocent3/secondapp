package io.appmetrica.analytics.locationapi.internal;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface LastKnownLocationExtractorProvider extends Identifiable {
    @l
    LastKnownLocationExtractor getExtractor(@l Context context, @l PermissionExtractor permissionExtractor, @l IHandlerExecutor iHandlerExecutor, @l LocationListener locationListener);
}
