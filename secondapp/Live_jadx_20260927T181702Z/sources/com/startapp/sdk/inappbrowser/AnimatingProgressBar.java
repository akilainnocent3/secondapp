package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class AnimatingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AccelerateDecelerateInterpolator f74491c = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ValueAnimator f74492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f74493b;

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f74493b = true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f74492a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i10) {
        if (!this.f74493b) {
            super.setProgress(i10);
            return;
        }
        ValueAnimator valueAnimator = this.f74492a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (getProgress() >= i10) {
                return;
            }
        } else {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i10);
            this.f74492a = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(f74491c);
            this.f74492a.addUpdateListener(new a(this));
        }
        this.f74492a.setIntValues(getProgress(), i10);
        this.f74492a.start();
    }

    public final void a() {
        super.setProgress(0);
        ValueAnimator valueAnimator = this.f74492a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
