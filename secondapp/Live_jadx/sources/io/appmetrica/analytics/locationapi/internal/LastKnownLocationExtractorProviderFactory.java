package io.appmetrica.analytics.locationapi.internal;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface LastKnownLocationExtractorProviderFactory {
    @l
    LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider();

    @l
    LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider();

    @l
    LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider();

    @l
    LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider();
}
