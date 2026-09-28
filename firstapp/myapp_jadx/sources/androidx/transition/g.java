package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import defpackage.bug0;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static ObjectAnimator a(View view, bug0 bug0Var, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Visibility visibility) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) bug0Var.b.getTag(R.id.transition_position);
        if (iArr != null) {
            f = (iArr[0] - i) + translationX;
            f2 = (iArr[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        a aVar = new a(view, bug0Var.b, translationX, translationY);
        visibility.a(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static class a extends AnimatorListenerAdapter implements Transition.f {
        public final View a;
        public final View b;
        public int[] c;
        public float d;
        public float e;
        public final float f;
        public final float i;
        public boolean v;

        public a(View view, View view2, float f, float f2) {
            this.b = view;
            this.a = view2;
            this.f = f;
            this.i = f2;
            int[] iArr = (int[]) view2.getTag(R.id.transition_position);
            this.c = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transition_position, null);
            }
        }

        @Override // androidx.transition.Transition.f
        public final void a() {
            int[] iArr = this.c;
            if (iArr == null) {
                iArr = new int[2];
                this.c = iArr;
            }
            View view = this.b;
            view.getLocationOnScreen(iArr);
            this.a.setTag(R.id.transition_position, this.c);
            this.d = view.getTranslationX();
            this.e = view.getTranslationY();
            view.setTranslationX(this.f);
            view.setTranslationY(this.i);
        }

        @Override // androidx.transition.Transition.f
        public final void e(Transition transition) {
            if (this.v) {
                return;
            }
            this.a.setTag(R.id.transition_position, null);
        }

        @Override // androidx.transition.Transition.f
        public final void f() {
            float f = this.d;
            View view = this.b;
            view.setTranslationX(f);
            view.setTranslationY(this.e);
        }

        @Override // androidx.transition.Transition.f
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public final void j(Transition transition) {
            e(transition);
        }

        @Override // androidx.transition.Transition.f
        public final void k(Transition transition) {
            this.v = true;
            float f = this.f;
            View view = this.b;
            view.setTranslationX(f);
            view.setTranslationY(this.i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.v = true;
            float f = this.f;
            View view = this.b;
            view.setTranslationX(f);
            view.setTranslationY(this.i);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            float f = this.f;
            View view = this.b;
            view.setTranslationX(f);
            view.setTranslationY(this.i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
