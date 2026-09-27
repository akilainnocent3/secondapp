package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;
import k.e0;
import k.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public interface MediaViewVideoRendererApi extends AdComponentViewApiProvider {
    void destroy();

    void disengageSeek(VideoStartReason videoStartReason);

    void engageSeek();

    @e0(from = 0)
    int getCurrentTimeMs();

    @e0(from = 0)
    int getDuration();

    View getVideoView();

    @w(from = 0.0d, to = 1.0d)
    float getVolume();

    void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer);

    void pause(boolean z10);

    void play(VideoStartReason videoStartReason);

    void seekTo(@e0(from = 0) int i10);

    void setVolume(@w(from = 0.0d, to = 1.0d) float f10);

    boolean shouldAutoplay();
}
