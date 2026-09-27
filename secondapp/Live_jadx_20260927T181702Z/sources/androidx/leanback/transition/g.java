package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(21)
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class g {
    public static Animator a(View view, TransitionValues transitionValues, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator, Transition transition) {
        float f14 = f11;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(s3.a.h.f128766s2);
        if (iArr != null) {
            f10 = (iArr[0] - i10) + translationX;
            f14 = (iArr[1] - i11) + translationY;
        }
        int iRound = i10 + Math.round(f10 - translationX);
        int iRound2 = i11 + Math.round(f14 - translationY);
        view.setTranslationX(f10);
        view.setTranslationY(f14);
        if (f10 == f12 && f14 == f13) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f10, f14);
        path.lineTo(f12, f13);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, (Property<View, Float>) View.TRANSLATION_Y, path);
        a aVar = new a(view, transitionValues.view, iRound, iRound2, translationX, translationY);
        transition.addListener(aVar);
        objectAnimatorOfFloat.addListener(aVar);
        objectAnimatorOfFloat.addPauseListener(aVar);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f11994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f11995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f11997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f11998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f11999g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f12000h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f12001i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f12002j;

        public a(View view, View view2, int i10, int i11, float f10, float f11) {
            this.f11995c = view;
            this.f11994b = view2;
            this.f11996d = i10 - Math.round(view.getTranslationX());
            this.f11997e = i11 - Math.round(view.getTranslationY());
            this.f12001i = f10;
            this.f12002j = f11;
            int[] iArr = (int[]) view2.getTag(s3.a.h.f128766s2);
            this.f11998f = iArr;
            if (iArr != null) {
                view2.setTag(s3.a.h.f128766s2, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f11998f == null) {
                this.f11998f = new int[2];
            }
            this.f11998f[0] = Math.round(this.f11996d + this.f11995c.getTranslationX());
            this.f11998f[1] = Math.round(this.f11997e + this.f11995c.getTranslationY());
            this.f11994b.setTag(s3.a.h.f128766s2, this.f11998f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f11999g = this.f11995c.getTranslationX();
            this.f12000h = this.f11995c.getTranslationY();
            this.f11995c.setTranslationX(this.f12001i);
            this.f11995c.setTranslationY(this.f12002j);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f11995c.setTranslationX(this.f11999g);
            this.f11995c.setTranslationY(this.f12000h);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f11995c.setTranslationX(this.f12001i);
            this.f11995c.setTranslationY(this.f12002j);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }
}
