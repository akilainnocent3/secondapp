package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface LocationServiceApi extends LocationProvider {
    @l
    LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory();

    @l
    LocationReceiverProviderFactory getLocationReceiverProviderFactory();

    @l
    PermissionExtractor getPermissionExtractor();

    void registerControllerObserver(@l LocationControllerObserver locationControllerObserver);

    void registerSource(@l LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void registerSource(@l LocationReceiverProvider locationReceiverProvider);

    void unregisterSource(@l LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void unregisterSource(@l LocationReceiverProvider locationReceiverProvider);

    void updateLocationFilter(@l LocationFilter locationFilter);
}
