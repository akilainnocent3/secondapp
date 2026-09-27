package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ko, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5185ko implements InterfaceC5209lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f97774a;

    public C5185ko(@oy.l UtilityServiceProvider utilityServiceProvider) {
        this.f97774a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5209lm
    public final void a(@oy.l C5080gm c5080gm) {
        this.f97774a.updateConfiguration(new UtilityServiceConfiguration(c5080gm.f97461v, c5080gm.f97460u));
    }
}
