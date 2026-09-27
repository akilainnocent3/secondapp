package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class In {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4157z5 f54860c;

    public In(AdConfig.VideoPlayerViewabilityConfig viewableConfig) {
        kotlin.jvm.internal.m0.p(viewableConfig, "viewableConfig");
        this.f54858a = viewableConfig.getMinPercentageVisible();
        this.f54859b = viewableConfig.getPollingInterval();
        this.f54860c = AbstractC3725hl.a(viewableConfig.getMinDimensions());
    }
}
