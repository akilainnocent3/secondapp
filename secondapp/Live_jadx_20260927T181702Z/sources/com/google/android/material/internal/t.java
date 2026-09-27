package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Collection;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public class t implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f51116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View[] f51117c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(@NonNull ValueAnimator valueAnimator, @NonNull View view);
    }

    @SuppressLint({"LambdaLast"})
    public t(@NonNull a aVar, @NonNull View... viewArr) {
        this.f51116b = aVar;
        this.f51117c = viewArr;
    }

    @NonNull
    public static t e(@NonNull Collection<View> collection) {
        return new t(new s(), collection);
    }

    @NonNull
    public static t f(@NonNull View... viewArr) {
        return new t(new s(), viewArr);
    }

    @NonNull
    public static t g(@NonNull Collection<View> collection) {
        return new t(new q(), collection);
    }

    @NonNull
    public static t h(@NonNull View... viewArr) {
        return new t(new q(), viewArr);
    }

    public static void i(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void j(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        Float f10 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f10.floatValue());
        view.setScaleY(f10.floatValue());
    }

    public static void k(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void l(@NonNull ValueAnimator valueAnimator, @NonNull View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @NonNull
    public static t m(@NonNull Collection<View> collection) {
        return new t(new p(), collection);
    }

    @NonNull
    public static t n(@NonNull View... viewArr) {
        return new t(new p(), viewArr);
    }

    @NonNull
    public static t o(@NonNull Collection<View> collection) {
        return new t(new r(), collection);
    }

    @NonNull
    public static t p(@NonNull View... viewArr) {
        return new t(new r(), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        for (View view : this.f51117c) {
            this.f51116b.a(valueAnimator, view);
        }
    }

    @SuppressLint({"LambdaLast"})
    public t(@NonNull a aVar, @NonNull Collection<View> collection) {
        this.f51116b = aVar;
        this.f51117c = (View[]) collection.toArray(new View[0]);
    }
}
