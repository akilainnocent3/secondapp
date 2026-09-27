package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class IAsmoothProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AccelerateDecelerateInterpolator f47808c = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f47809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f47810b;

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f47809a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f47810b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        try {
            ValueAnimator valueAnimator = this.f47809a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f47809a;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i10);
                this.f47809a = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(f47808c);
                this.f47809a.addUpdateListener(new h(this));
            } else {
                valueAnimator2.setIntValues(getProgress(), i10);
            }
            this.f47809a.start();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i10) {
        try {
            ValueAnimator valueAnimator = this.f47810b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f47810b;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i10);
                this.f47810b = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(f47808c);
                this.f47810b.addUpdateListener(new i(this));
            } else {
                valueAnimator2.setIntValues(getProgress(), i10);
            }
            this.f47810b.start();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
