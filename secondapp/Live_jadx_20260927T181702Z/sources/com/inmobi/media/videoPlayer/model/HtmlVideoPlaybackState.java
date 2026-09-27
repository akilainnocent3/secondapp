package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import com.inmobi.media.EnumC3761j8;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class HtmlVideoPlaybackState {
    private float duration;
    private boolean isMuted;

    @m
    private Long latency;

    @l
    private String state;
    private float time;

    @m
    private String videoUrl;

    public HtmlVideoPlaybackState() {
        EnumC3761j8[] enumC3761j8Arr = EnumC3761j8.f56721a;
        this.state = "loading";
    }

    public final float getDuration() {
        return this.duration;
    }

    @m
    public final Long getLatency() {
        return this.latency;
    }

    @l
    public final String getState() {
        return this.state;
    }

    public final float getTime() {
        return this.time;
    }

    @m
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final void setDuration(float f10) {
        this.duration = f10;
    }

    public final void setLatency(@m Long l10) {
        this.latency = l10;
    }

    public final void setMuted(boolean z10) {
        this.isMuted = z10;
    }

    public final void setState(@l String str) {
        m0.p(str, "<set-?>");
        this.state = str;
    }

    public final void setTime(float f10) {
        this.time = f10;
    }

    public final void setVideoUrl(@m String str) {
        this.videoUrl = str;
    }
}
