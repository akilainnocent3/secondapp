package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class R9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gi f55424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gi f55425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gi f55426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gi f55427d;

    public R9(CrashConfig config) {
        kotlin.jvm.internal.m0.p(config, "config");
        this.f55424a = new Gi(config.getCrashConfig().getSamplingPercent());
        this.f55425b = new Gi(config.getCatchConfig().getSamplingPercent());
        this.f55426c = new Gi(config.getANRConfig().getWatchdog().getSamplingPercent());
        this.f55427d = new Gi(config.getANRConfig().getAppExitReason().getSamplingPercent());
    }
}
