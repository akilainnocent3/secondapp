package com.yandex.mobile.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.yandex.mobile.ads.R;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class PlaybackControlsContainer extends CorePlaybackControlsContainer {
    public PlaybackControlsContainer(@l Context context) {
        super(context);
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, yads.gl1
    @m
    public TextView getCountDownProgress() {
        View viewFindViewById = findViewById(R.id.video_count_down_control);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, yads.gl1
    @m
    public CheckBox getMuteControl() {
        View viewFindViewById = findViewById(R.id.video_mute_control);
        if (viewFindViewById instanceof CheckBox) {
            return (CheckBox) viewFindViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, yads.gl1
    @m
    public ProgressBar getVideoProgress() {
        View viewFindViewById = findViewById(R.id.video_progress_control);
        if (viewFindViewById instanceof ProgressBar) {
            return (ProgressBar) viewFindViewById;
        }
        return null;
    }

    public PlaybackControlsContainer(@l Context context, @m AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlaybackControlsContainer(@l Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public PlaybackControlsContainer(@l Context context, @m AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
