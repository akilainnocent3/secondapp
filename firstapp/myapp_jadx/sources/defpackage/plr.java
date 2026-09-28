package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class plr extends Transition {
    @Override // androidx.transition.Transition
    public final void d(bug0 bug0Var) {
        bug0Var.a.put("NavigationRailLabelVisibility", Integer.valueOf(bug0Var.b.getVisibility()));
    }

    @Override // androidx.transition.Transition
    public final void g(bug0 bug0Var) {
        bug0Var.a.put("NavigationRailLabelVisibility", Integer.valueOf(bug0Var.b.getVisibility()));
    }

    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, bug0 bug0Var, bug0 bug0Var2) {
        if (bug0Var == null) {
            return null;
        }
        HashMap map = bug0Var.a;
        if (bug0Var2 == null) {
            return null;
        }
        HashMap map2 = bug0Var2.a;
        if (map.get("NavigationRailLabelVisibility") == null || map2.get("NavigationRailLabelVisibility") == null || ((Integer) map.get("NavigationRailLabelVisibility")).intValue() != 8 || ((Integer) map2.get("NavigationRailLabelVisibility")).intValue() != 0) {
            return null;
        }
        final View view = bug0Var2.b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: olr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * (-30.0f));
            }
        });
        return valueAnimatorOfFloat;
    }
}
