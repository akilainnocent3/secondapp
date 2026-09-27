package com.yandex.div.core.tooltip;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class Scale extends Visibility {
    private final float scaleFactor;

    public Scale(float f10) {
        this.scaleFactor = f10;
    }

    @Override // android.transition.Visibility
    @l
    public Animator onAppear(@m ViewGroup viewGroup, @l View view, @l TransitionValues transitionValues, @l TransitionValues transitionValues2) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, this.scaleFactor, view.getScaleX()), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, this.scaleFactor, view.getScaleY()));
    }

    @Override // android.transition.Visibility
    @l
    public Animator onDisappear(@m ViewGroup viewGroup, @l View view, @l TransitionValues transitionValues, @l TransitionValues transitionValues2) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, view.getScaleX(), this.scaleFactor), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, view.getScaleY(), this.scaleFactor));
    }
}
