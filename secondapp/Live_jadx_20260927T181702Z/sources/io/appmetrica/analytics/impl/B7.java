package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class B7 implements AskForPermissionStrategyModuleProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xd f95595a = new Xd();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    @oy.l
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f95595a;
    }
}
