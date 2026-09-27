package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class HtmlVideoPlayerConfig {
    private boolean autoplay;
    private boolean muted;
    private float skipOffset;
    private boolean skippable;

    @m
    private VideoViewPosition videoViewPosition;
    private boolean fullscreenEnabled = true;

    @l
    private TrackPercentage trackPercentages = new TrackPercentage();
    private long playbackInterval = 1000;

    public final boolean getAutoplay() {
        return this.autoplay;
    }

    public final boolean getFullscreenEnabled() {
        return this.fullscreenEnabled;
    }

    public final boolean getMuted() {
        return this.muted;
    }

    public final long getPlaybackInterval() {
        return this.playbackInterval;
    }

    public final float getSkipOffset() {
        return this.skipOffset;
    }

    public final boolean getSkippable() {
        return this.skippable;
    }

    @l
    public final TrackPercentage getTrackPercentages() {
        return this.trackPercentages;
    }

    @m
    public final VideoViewPosition getVideoViewPosition() {
        return this.videoViewPosition;
    }

    public final void setAutoplay(boolean z10) {
        this.autoplay = z10;
    }

    public final void setFullscreenEnabled(boolean z10) {
        this.fullscreenEnabled = z10;
    }

    public final void setMuted(boolean z10) {
        this.muted = z10;
    }

    public final void setPlaybackInterval(long j10) {
        this.playbackInterval = j10;
    }

    public final void setSkipOffset(float f10) {
        this.skipOffset = f10;
    }

    public final void setSkippable(boolean z10) {
        this.skippable = z10;
    }

    public final void setTrackPercentages(@l TrackPercentage trackPercentage) {
        m0.p(trackPercentage, "<set-?>");
        this.trackPercentages = trackPercentage;
    }

    public final void setVideoViewPosition(@m VideoViewPosition videoViewPosition) {
        this.videoViewPosition = videoViewPosition;
    }
}
