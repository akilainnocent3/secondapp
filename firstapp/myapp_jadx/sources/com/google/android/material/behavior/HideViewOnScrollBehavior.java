package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.sportybet.android.gp.tz.R;
import defpackage.bbv;
import defpackage.dj0;
import defpackage.f6w;
import defpackage.hb5;
import defpackage.njl;
import defpackage.ojl;
import defpackage.pe4;
import defpackage.pjl;
import defpackage.qjl;
import defpackage.rjl;
import defpackage.sjl;
import defpackage.tjl;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public ViewPropertyAnimator A;
    public tjl a;
    public AccessibilityManager b;
    public qjl c;
    public final boolean d;
    public final LinkedHashSet<a> e;
    public int f;
    public int i;
    public TimeInterpolator v;
    public TimeInterpolator w;
    public int y;
    public int z;

    public interface a {
        void a();
    }

    public HideViewOnScrollBehavior() {
        this.d = true;
        this.e = new LinkedHashSet<>();
        this.y = 0;
        this.z = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener, qjl] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, final V v, int i) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2 = this.b;
        AccessibilityManager accessibilityManager3 = accessibilityManager2;
        if (accessibilityManager2 == null) {
            accessibilityManager = (AccessibilityManager) v.getContext().getSystemService(AccessibilityManager.class);
            this.b = accessibilityManager;
        }
        if (accessibilityManager3 != 0 && this.c == null) {
            accessibilityManager3 = accessibilityManager;
            ?? r0 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: qjl
                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public final void onTouchExplorationStateChanged(boolean z) {
                    HideViewOnScrollBehavior hideViewOnScrollBehavior = this.a;
                    if (hideViewOnScrollBehavior.d && z && hideViewOnScrollBehavior.z == 1) {
                        hideViewOnScrollBehavior.x(v);
                    }
                }
            };
            this.c = r0;
            accessibilityManager3.addTouchExplorationStateChangeListener(r0);
            v.addOnAttachStateChangeListener(new rjl(this));
        }
        accessibilityManager3 = accessibilityManager;
        accessibilityManager3 = accessibilityManager;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int i2 = ((CoordinatorLayout.e) v.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.y = this.a.a(v, marginLayoutParams);
        this.f = bbv.c(v.getContext(), R.attr.motionDurationLong2, 225);
        this.i = bbv.c(v.getContext(), R.attr.motionDurationMedium4, 175);
        this.v = f6w.c(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, dj0.d);
        this.w = f6w.c(v.getContext(), R.attr.motionEasingEmphasizedInterpolator, dj0.c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                x(view);
                return;
            }
            return;
        }
        if (this.z == 1) {
            return;
        }
        if (this.d && (accessibilityManager = this.b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.z = 1;
        Iterator<a> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.A = this.a.c(this.y, view).setInterpolator(this.w).setDuration(this.i).setListener(new sjl(this));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean t(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public final void w(int i) {
        tjl tjlVar = this.a;
        if (tjlVar == null || tjlVar.b() != i) {
            if (i == 0) {
                this.a = new pjl();
                return;
            }
            if (i == 1) {
                this.a = new njl();
            } else if (i == 2) {
                this.a = new ojl();
            } else {
                hb5.a(pe4.b(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
            }
        }
    }

    public final void x(V v) {
        if (this.z == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.z = 2;
        Iterator<a> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.a.getClass();
        this.A = this.a.c(0, v).setInterpolator(this.v).setDuration(this.f).setListener(new sjl(this));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.e = new LinkedHashSet<>();
        this.y = 0;
        this.z = 2;
    }
}
