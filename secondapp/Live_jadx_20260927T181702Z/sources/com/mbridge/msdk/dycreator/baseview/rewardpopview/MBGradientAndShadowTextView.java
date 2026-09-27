package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f66374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f66375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f66376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f66378e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f66374a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f66375b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f66376c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f66377d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f66377d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f66378e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f66374a, this.f66375b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f66376c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f66378e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f66374a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f66375b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f66376c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f66377d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f66374a = gradientAndShadowParameters.gradientStartColor;
            this.f66375b = gradientAndShadowParameters.gradientEndColor;
            this.f66376c = gradientAndShadowParameters.shadowColor;
            this.f66377d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66374a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f66375b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f66376c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f66377d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f66374a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f66375b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f66376c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f66377d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    @t0(api = 21)
    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f66374a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f66375b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f66376c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f66377d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
