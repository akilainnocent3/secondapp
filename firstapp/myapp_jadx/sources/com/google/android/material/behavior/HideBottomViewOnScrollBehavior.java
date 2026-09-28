package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.sportybet.android.gp.tz.R;
import defpackage.bbv;
import defpackage.dj0;
import defpackage.f6w;
import defpackage.kjl;
import defpackage.ljl;
import defpackage.mjl;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public ViewPropertyAnimator A;
    public final LinkedHashSet<a> a;
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public int f;
    public AccessibilityManager i;
    public kjl v;
    public final boolean w;
    public int y;
    public int z;

    public interface a {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.a = new LinkedHashSet<>();
        this.f = 0;
        this.w = true;
        this.y = 2;
        this.z = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener, kjl] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean l(CoordinatorLayout coordinatorLayout, final V v, int i) {
        AccessibilityManager accessibilityManager;
        this.f = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.b = bbv.c(v.getContext(), R.attr.motionDurationLong2, 225);
        this.c = bbv.c(v.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = f6w.c(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, dj0.d);
        this.e = f6w.c(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, dj0.c);
        AccessibilityManager accessibilityManager2 = this.i;
        AccessibilityManager accessibilityManager3 = accessibilityManager2;
        if (accessibilityManager2 == null) {
            accessibilityManager = (AccessibilityManager) v.getContext().getSystemService(AccessibilityManager.class);
            this.i = accessibilityManager;
        }
        if (accessibilityManager3 == 0 || this.v != null) {
            accessibilityManager3 = accessibilityManager;
            return false;
        }
        accessibilityManager3 = accessibilityManager;
        ?? r4 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: kjl
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                if (z) {
                    HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.a;
                    if (hideBottomViewOnScrollBehavior.y == 1) {
                        hideBottomViewOnScrollBehavior.w(v);
                    }
                }
            }
        };
        this.v = r4;
        accessibilityManager3.addTouchExplorationStateChangeListener(r4);
        v.addOnAttachStateChangeListener(new ljl(this));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                w(view);
                return;
            }
            return;
        }
        if (this.y == 1) {
            return;
        }
        if (this.w && (accessibilityManager = this.i) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.y = 1;
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.A = view.animate().translationY(this.f + this.z).setInterpolator(this.e).setDuration(this.c).setListener(new mjl(this));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean t(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void w(V v) {
        if (this.y == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.y = 2;
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.A = v.animate().translationY(0.0f).setInterpolator(this.d).setDuration(this.b).setListener(new mjl(this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new LinkedHashSet<>();
        this.f = 0;
        this.w = true;
        this.y = 2;
        this.z = 0;
    }
}
