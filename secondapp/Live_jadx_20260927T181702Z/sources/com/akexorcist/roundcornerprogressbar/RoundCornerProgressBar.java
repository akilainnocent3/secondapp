package com.akexorcist.roundcornerprogressbar;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import com.akexorcist.roundcornerprogressbar.common.AnimatedRoundCornerProgressBar;
import k.t0;
import kotlin.jvm.internal.m0;
import ms.u;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public class RoundCornerProgressBar extends AnimatedRoundCornerProgressBar {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerProgressBar(@l Context context) {
        super(context);
        m0.p(context, "context");
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void drawProgress(@l LinearLayout layoutProgress, @l GradientDrawable progressDrawable, float f10, float f11, float f12, int i10, int i11, boolean z10) {
        m0.p(layoutProgress, "layoutProgress");
        m0.p(progressDrawable, "progressDrawable");
        float f13 = i10 - (i11 / 2.0f);
        progressDrawable.setCornerRadii(new float[]{f13, f13, f13, f13, f13, f13, f13, f13});
        layoutProgress.setBackground(progressDrawable);
        int i12 = (int) ((f12 - (i11 * 2)) / (f10 / f11));
        ViewGroup.LayoutParams layoutParams = layoutProgress.getLayoutParams();
        m0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = i12;
        int i13 = i12 / 2;
        if (i11 + i13 < i10) {
            int iU = u.u(i10 - i11, 0) - i13;
            marginLayoutParams.topMargin = iU;
            marginLayoutParams.bottomMargin = iU;
        } else {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
        layoutProgress.setLayoutParams(marginLayoutParams);
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public int initLayout() {
        return c.g.f25400c;
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initStyleable(@l Context context, @m AttributeSet attributeSet) {
        m0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerProgressBar(@l Context context, @l AttributeSet attrs) {
        super(context, attrs);
        m0.p(context, "context");
        m0.p(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundCornerProgressBar(@l Context context, @l AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        m0.p(context, "context");
        m0.p(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @t0(21)
    public RoundCornerProgressBar(@l Context context, @l AttributeSet attrs, int i10, int i11) {
        super(context, attrs, i10, i11);
        m0.p(context, "context");
        m0.p(attrs, "attrs");
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void initView() {
    }

    @Override // com.akexorcist.roundcornerprogressbar.common.BaseRoundCornerProgressBar
    public void onViewDraw() {
    }
}
