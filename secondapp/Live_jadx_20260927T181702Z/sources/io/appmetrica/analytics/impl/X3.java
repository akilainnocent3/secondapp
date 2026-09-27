package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class X3 implements ModuleServiceConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f96721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f96722b;

    public X3(@oy.l SdkIdentifiers sdkIdentifiers, Object obj) {
        this.f96721a = sdkIdentifiers;
        this.f96722b = obj;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final Object getFeaturesConfig() {
        return this.f96722b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    @oy.l
    public final SdkIdentifiers getIdentifiers() {
        return this.f96721a;
    }
}
