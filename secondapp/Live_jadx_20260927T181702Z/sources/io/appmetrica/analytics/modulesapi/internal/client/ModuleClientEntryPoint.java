package io.appmetrica.analytics.modulesapi.internal.client;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ModuleClientEntryPoint<T> {
    @m
    public AdRevenueCollector getAdRevenueCollector() {
        return null;
    }

    @l
    public abstract String getIdentifier();

    @m
    public ServiceConfigExtensionConfiguration<T> getServiceConfigExtensionConfiguration() {
        return null;
    }

    public void onActivated() {
    }

    public void initClientSide(@l ClientContext clientContext) {
    }
}
