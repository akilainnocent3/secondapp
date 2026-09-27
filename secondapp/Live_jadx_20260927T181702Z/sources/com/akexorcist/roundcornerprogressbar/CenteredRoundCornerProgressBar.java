package com.akexorcist.roundcornerprogressbar;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import k.t0;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public class CenteredRoundCornerProgressBar extends RoundCornerProgressBar {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenteredRoundCornerProgressBar(@l Context context) {
        super(context);
        m0.p(context, "context");
    }

    @Override // com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar, com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void drawProgress(@l LinearLayout layoutProgress, @l GradientDrawable progressDrawable, float f10, float f11, float f12, int i10, int i11, boolean z10) {
        m0.p(layoutProgress, "layoutProgress");
        m0.p(progressDrawable, "progressDrawable");
        super.drawProgress(layoutProgress, progressDrawable, f10, f11, f12, i10, i11, z10);
        ViewGroup.LayoutParams layoutParams = layoutProgress.getLayoutParams();
        m0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i12 = (int) ((f12 - ((f12 - (i11 * 2)) / (f10 / f11))) / 2);
        marginLayoutParams.setMargins(i12, marginLayoutParams.topMargin, i12, marginLayoutParams.bottomMargin);
        layoutProgress.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenteredRoundCornerProgressBar(@l Context context, @l AttributeSet attrs) {
        super(context, attrs);
        m0.p(context, "context");
        m0.p(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenteredRoundCornerProgressBar(@l Context context, @l AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        m0.p(context, "context");
        m0.p(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @t0(21)
    public CenteredRoundCornerProgressBar(@l Context context, @l AttributeSet attrs, int i10, int i11) {
        super(context, attrs, i10, i11);
        m0.p(context, "context");
        m0.p(attrs, "attrs");
    }
}
