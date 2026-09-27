package com.monetization.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import oy.l;
import oy.m;
import yads.gl1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class CorePlaybackControlsContainer extends FrameLayout implements gl1 {
    public CorePlaybackControlsContainer(@l Context context) {
        super(context);
    }

    @Override // yads.gl1
    public TextView getCountDownProgress() {
        return (TextView) findViewById(R.id.video_count_down_control);
    }

    @Override // yads.gl1
    public CheckBox getMuteControl() {
        return (CheckBox) findViewById(R.id.video_mute_control);
    }

    @Override // yads.gl1
    public ProgressBar getVideoProgress() {
        return (ProgressBar) findViewById(R.id.video_progress_control);
    }

    public CorePlaybackControlsContainer(@l Context context, @m AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CorePlaybackControlsContainer(@l Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public CorePlaybackControlsContainer(@l Context context, @m AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
