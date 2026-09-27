package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class VideoExperience {

    @m
    private final Boolean loopVideoOnComplete;

    @l
    private final VideoProgressConfig progress = new VideoProgressConfig();

    @l
    private final VideoAudioExperience audio = new VideoAudioExperience();

    @l
    public final VideoAudioExperience getAudio() {
        return this.audio;
    }

    @m
    public final Boolean getLoopVideoOnComplete() {
        return this.loopVideoOnComplete;
    }

    @l
    public final VideoProgressConfig getProgress() {
        return this.progress;
    }
}
