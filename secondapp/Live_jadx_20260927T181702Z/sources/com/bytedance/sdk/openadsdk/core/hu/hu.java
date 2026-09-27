package com.bytedance.sdk.openadsdk.core.hu;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu extends FrameLayout {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private boolean f36157hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private Drawable f36158hv;
    private int hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private boolean f36159ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private Drawable f36160sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f36161tq;
    private ValueAnimator vgm;
    private Drawable vy;

    public hu(Context context) {
        super(context);
        this.hww = 100;
    }

    private void hww() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.vgm = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.vgm.setRepeatCount(-1);
        this.vgm.setInterpolator(new LinearInterpolator());
        this.vgm.setRepeatMode(1);
        this.vgm.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.hu.hu.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                hu.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.vgm.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36157hu = true;
        if (this.f36158hv != null) {
            hww();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36157hu = false;
        ValueAnimator valueAnimator = this.vgm;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.vgm.removeAllUpdateListeners();
            this.vgm = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            ValueAnimator valueAnimator = this.vgm;
            if (valueAnimator == null || this.f36159ok) {
                return;
            }
            this.f36159ok = true;
            valueAnimator.pause();
            return;
        }
        if (this.f36159ok) {
            this.f36159ok = false;
            ValueAnimator valueAnimator2 = this.vgm;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                hww();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.f36158hv = drawable;
        setProgressDrawable(drawable);
        if (this.f36157hu && this.vgm == null) {
            hww();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(rs.hww(this, layoutParams));
    }

    public void setMax(int i10) {
        this.hww = i10;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setProgress(int i10) {
        this.f36161tq = i10;
        Drawable drawable = this.f36160sd;
        if (drawable != null) {
            drawable.setLevel((int) ((i10 * 10000.0f) / this.hww));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.vy = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.vy;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable3 = ((LayerDrawable) this.vy).getDrawable(i10);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.f36160sd = drawable3;
                }
            }
        }
        Drawable drawable4 = this.vy;
        if (drawable4 instanceof RotateDrawable) {
            this.f36160sd = drawable4;
        }
    }

    public hu(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.hww = 100;
    }
}
