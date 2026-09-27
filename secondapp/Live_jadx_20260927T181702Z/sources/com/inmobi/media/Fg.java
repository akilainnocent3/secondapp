package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f54632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f54633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f54634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f54636f;

    public Fg(VideoExperience videoExperience, boolean z10, AdConfig.VideoPlayerProgressConfig progressConfig) {
        kotlin.jvm.internal.m0.p(videoExperience, "videoExperience");
        kotlin.jvm.internal.m0.p(progressConfig, "progressConfig");
        Boolean showProgress = videoExperience.getProgress().getShowProgress();
        this.f54631a = showProgress != null ? showProgress.booleanValue() : progressConfig.getShowProgress();
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.f54632b = !(loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : z10);
        int[] color = videoExperience.getProgress().getColor();
        this.f54633c = color == null ? fr.r0.Z5(progressConfig.getForegroundColor()) : color;
        this.f54634d = fr.r0.Z5(progressConfig.getBackgroundColor());
        Integer height = videoExperience.getProgress().getHeight();
        this.f54635e = height != null ? height.intValue() : progressConfig.getHeight();
        this.f54636f = progressConfig.getProgressPolling();
    }
}
