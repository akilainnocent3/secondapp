package com.sports.live.football.tv.utils.playerutils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SeekBarClass extends m0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBarClass(@l Context context) {
        super(context);
        kotlin.jvm.internal.m0.p(context, "context");
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(@m MotionEvent motionEvent) {
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBarClass(@l Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(attributeSet, "attributeSet");
    }
}
