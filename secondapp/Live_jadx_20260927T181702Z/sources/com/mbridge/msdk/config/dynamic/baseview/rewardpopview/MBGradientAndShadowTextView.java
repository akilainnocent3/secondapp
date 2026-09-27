package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewConst;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f65896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f65897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f65899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f65900e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f65901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f65902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f65903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f65904d = 40;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f65905e = 3.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f65906f = 1.5f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f65907g = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f65896a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f65897b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f65898c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f65899d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f65899d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f65900e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f65896a, this.f65897b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f65898c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f65900e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f65896a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f65897b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f65898c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f65899d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f65896a = aVar.f65901a;
            this.f65897b = aVar.f65902b;
            this.f65898c = aVar.f65903c;
            this.f65899d = aVar.f65904d;
            this.mShadowRadius = aVar.f65905e;
            this.mShadowDx = aVar.f65906f;
            this.mShadowDy = aVar.f65907g;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65896a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f65897b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f65898c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f65899d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f65896a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f65897b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f65898c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f65899d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    @t0(api = 21)
    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f65896a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f65897b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f65898c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f65899d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
