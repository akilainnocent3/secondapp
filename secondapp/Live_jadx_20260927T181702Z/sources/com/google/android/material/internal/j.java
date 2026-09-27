package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public class j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final View f51081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final View f51082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f51083d = new float[2];

    public j(@Nullable View view, @Nullable View view2) {
        this.f51081b = view;
        this.f51082c = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        k.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f51083d);
        View view = this.f51081b;
        if (view != null) {
            view.setAlpha(this.f51083d[0]);
        }
        View view2 = this.f51082c;
        if (view2 != null) {
            view2.setAlpha(this.f51083d[1]);
        }
    }
}
