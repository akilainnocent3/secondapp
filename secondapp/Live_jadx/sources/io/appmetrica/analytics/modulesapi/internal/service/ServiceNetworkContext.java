package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface ServiceNetworkContext {
    @l
    IExecutionPolicy getExecutionPolicy();

    @l
    SimpleNetworkApi getNetworkApi();

    @l
    SslSocketFactoryProvider getSslSocketFactoryProvider();

    @l
    String getUserAgent();
}
