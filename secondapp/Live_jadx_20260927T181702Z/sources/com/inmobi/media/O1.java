package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Yb f55247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f55248e;

    public O1(VideoExperience videoExperience, AdConfig.VideoPlayerAudioConfig audioConfig) {
        Yb yb2;
        Yb yb3;
        kotlin.jvm.internal.m0.p(videoExperience, "videoExperience");
        kotlin.jvm.internal.m0.p(audioConfig, "audioConfig");
        Boolean startMuted = videoExperience.getAudio().getStartMuted();
        this.f55244a = startMuted != null ? startMuted.booleanValue() : audioConfig.getStartMuted();
        Integer muteIconWidth = videoExperience.getAudio().getMuteIconWidth();
        this.f55245b = muteIconWidth != null ? muteIconWidth.intValue() : audioConfig.getMuteIconWidth();
        Integer muteIconHeight = videoExperience.getAudio().getMuteIconHeight();
        this.f55246c = muteIconHeight != null ? muteIconHeight.intValue() : audioConfig.getMuteIconHeight();
        int[] muteIconMargin = videoExperience.getAudio().getMuteIconMargin();
        if (muteIconMargin != null) {
            kotlin.jvm.internal.m0.p(muteIconMargin, "<this>");
            if (muteIconMargin.length != 4) {
                yb3 = new Yb(0, 0, 0, 0);
            } else {
                yb2 = new Yb(muteIconMargin[0], muteIconMargin[1], muteIconMargin[2], muteIconMargin[3]);
                yb3 = yb2;
            }
        } else {
            List<Integer> muteIconMargin2 = audioConfig.getMuteIconMargin();
            kotlin.jvm.internal.m0.p(muteIconMargin2, "<this>");
            if (muteIconMargin2.size() != 4) {
                yb3 = new Yb(0, 0, 0, 0);
            } else {
                yb2 = new Yb(muteIconMargin2.get(0).intValue(), muteIconMargin2.get(1).intValue(), muteIconMargin2.get(2).intValue(), muteIconMargin2.get(3).intValue());
                yb3 = yb2;
            }
        }
        this.f55247d = yb3;
        Integer muteIconPosition = videoExperience.getAudio().getMuteIconPosition();
        this.f55248e = muteIconPosition != null ? muteIconPosition.intValue() : audioConfig.getMuteIconPosition();
    }
}
