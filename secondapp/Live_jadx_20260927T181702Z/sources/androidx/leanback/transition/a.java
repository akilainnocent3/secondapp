package androidx.leanback.transition;

import android.animation.Animator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a extends ChangeBounds {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<View, Integer> f11983c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f11984d = new SparseIntArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, Integer> f11985e = new HashMap<>();

    public final int a(View view) {
        Integer num = this.f11983c.get(view);
        if (num != null) {
            return num.intValue();
        }
        int i10 = this.f11984d.get(view.getId(), -1);
        if (i10 != -1) {
            return i10;
        }
        Integer num2 = this.f11985e.get(view.getClass().getName());
        return num2 != null ? num2.intValue() : this.f11982b;
    }

    public void b(int i10) {
        this.f11982b = i10;
    }

    public void c(int i10, int i11) {
        this.f11984d.put(i10, i11);
    }

    @Override // android.transition.ChangeBounds, android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        View view;
        Animator animatorCreateAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
        if (animatorCreateAnimator != null && transitionValues2 != null && (view = transitionValues2.view) != null) {
            animatorCreateAnimator.setStartDelay(a(view));
        }
        return animatorCreateAnimator;
    }

    public void d(View view, int i10) {
        this.f11983c.put(view, Integer.valueOf(i10));
    }

    public void e(String str, int i10) {
        this.f11985e.put(str, Integer.valueOf(i10));
    }
}
