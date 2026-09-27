package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c extends Transition {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f11986b = "android:leanback:scale";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f11987b;

        public a(View view) {
            this.f11987b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f11987b.setScaleX(fFloatValue);
            this.f11987b.setScaleY(fFloatValue);
        }
    }

    public final void a(TransitionValues transitionValues) {
        transitionValues.values.put(f11986b, Float.valueOf(transitionValues.view.getScaleX()));
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        float fFloatValue = ((Float) transitionValues.values.get(f11986b)).floatValue();
        float fFloatValue2 = ((Float) transitionValues2.values.get(f11986b)).floatValue();
        View view = transitionValues.view;
        view.setScaleX(fFloatValue);
        view.setScaleY(fFloatValue);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(view));
        return valueAnimatorOfFloat;
    }
}
