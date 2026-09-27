package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class L5 implements K5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5140j5 f96098a;

    public L5(@oy.l C5140j5 c5140j5) {
        this.f96098a = c5140j5;
    }

    @Override // io.appmetrica.analytics.impl.K5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    @oy.l
    public final C5140j5 getAdRevenueProcessorsHolder() {
        return this.f96098a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f96098a;
    }
}
