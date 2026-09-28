package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.sportybet.android.gp.tz.R;
import defpackage.c590;
import defpackage.c7;
import defpackage.cdv;
import defpackage.dbv;
import defpackage.ecv;
import defpackage.fcv;
import defpackage.g9i0;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.i7i0;
import defpackage.iyi;
import defpackage.jcv;
import defpackage.kt50;
import defpackage.l7;
import defpackage.pe4;
import defpackage.pk30;
import defpackage.r4s;
import defpackage.r6i0;
import defpackage.rx80;
import defpackage.sr1;
import defpackage.t490;
import defpackage.uf80;
import defpackage.vh90;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements dbv {
    public int A;
    public int B;
    public int C;
    public int D;
    public WeakReference<V> E;
    public WeakReference<View> F;
    public final int G;
    public VelocityTracker H;
    public jcv I;
    public int J;
    public final LinkedHashSet K;
    public final a L;
    public c590 a;
    public final fcv b;
    public final ColorStateList c;
    public final rx80 d;
    public final SideSheetBehavior<V>.c e;
    public final float f;
    public final boolean i;
    public int v;
    public i7i0 w;
    public boolean y;
    public final float z;

    public class a extends i7i0.c {
        public a() {
        }

        @Override // i7i0.c
        public final int a(int i, View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return cdv.b(i, sideSheetBehavior.a.g(), sideSheetBehavior.a.f());
        }

        @Override // i7i0.c
        public final int b(int i, View view) {
            return view.getTop();
        }

        @Override // i7i0.c
        public final int c(View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return sideSheetBehavior.A + sideSheetBehavior.D;
        }

        @Override // i7i0.c
        public final void h(int i) {
            if (i == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.i) {
                    sideSheetBehavior.x(1);
                }
            }
        }

        @Override // i7i0.c
        public final void i(View view, int i, int i2) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.F;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                sideSheetBehavior.a.p(marginLayoutParams, view.getLeft(), view.getRight());
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.K;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            sideSheetBehavior.a.b(i);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((t490) it.next()).b();
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        @Override // i7i0.c
        public final void j(View view, float f, float f2) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            int i = 3;
            if (!sideSheetBehavior.a.k(f)) {
                if (sideSheetBehavior.a.n(view, f)) {
                    if (sideSheetBehavior.a.m(f, f2) || sideSheetBehavior.a.l(view)) {
                        i = 5;
                    }
                } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                    int left = view.getLeft();
                    if (Math.abs(left - sideSheetBehavior.a.d()) >= Math.abs(left - sideSheetBehavior.a.e())) {
                        i = 5;
                    }
                } else {
                    i = 5;
                }
            }
            sideSheetBehavior.z(view, i, true);
        }

        @Override // i7i0.c
        public final boolean k(int i, View view) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.v == 1 || (weakReference = sideSheetBehavior.E) == null || weakReference.get() != view) ? false : true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.x(5);
            WeakReference<V> weakReference = sideSheetBehavior.E;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            sideSheetBehavior.E.get().requestLayout();
        }
    }

    public class c {
        public int a;
        public boolean b;
        public final vh90 c = new Runnable() { // from class: vh90
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c cVar = this.a;
                cVar.b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                i7i0 i7i0Var = sideSheetBehavior.w;
                if (i7i0Var != null && i7i0Var.h()) {
                    cVar.a(cVar.a);
                } else if (sideSheetBehavior.v == 2) {
                    sideSheetBehavior.x(cVar.a);
                }
            }
        };

        /* JADX WARN: Type inference failed for: r1v1, types: [vh90] */
        public c() {
        }

        public final void a(int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.E;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            sideSheetBehavior.E.get().postOnAnimation(this.c);
            this.b = true;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new c();
        this.i = true;
        this.v = 5;
        this.z = 0.1f;
        this.G = -1;
        this.K = new LinkedHashSet();
        this.L = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pk30.c0);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = ecv.a(3, context, typedArrayObtainStyledAttributes);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = rx80.d(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.G = resourceId;
            WeakReference<View> weakReference = this.F;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.F = null;
            WeakReference<V> weakReference2 = this.E;
            if (weakReference2 != null) {
                V v = weakReference2.get();
                if (resourceId != -1 && v.isLaidOut()) {
                    v.requestLayout();
                }
            }
        }
        rx80 rx80Var = this.d;
        if (rx80Var != null) {
            fcv fcvVar = new fcv(rx80Var);
            this.b = fcvVar;
            fcvVar.o(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.s(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.i = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void A() {
        V v;
        WeakReference<V> weakReference = this.E;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        r6i0.m(262144, v);
        r6i0.j(0, v);
        r6i0.m(1048576, v);
        r6i0.j(0, v);
        final int i = 5;
        if (this.v != 5) {
            r6i0.n(v, c7.a.n, null, new l7() { // from class: th90
                @Override // defpackage.l7
                public final boolean a(View view) {
                    this.a.w(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.v != 3) {
            r6i0.n(v, c7.a.l, null, new l7() { // from class: th90
                @Override // defpackage.l7
                public final boolean a(View view) {
                    this.a.w(i2);
                    return true;
                }
            });
        }
    }

    @Override // defpackage.dbv
    public final void a(sr1 sr1Var) {
        jcv jcvVar = this.I;
        if (jcvVar == null) {
            return;
        }
        jcvVar.f = sr1Var;
    }

    @Override // defpackage.dbv
    public final void b() {
        jcv jcvVar = this.I;
        if (jcvVar == null) {
            return;
        }
        jcvVar.b();
    }

    @Override // defpackage.dbv
    public final void c() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        jcv jcvVar = this.I;
        if (jcvVar == null) {
            return;
        }
        sr1 sr1Var = jcvVar.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        jcvVar.f = null;
        int i = 5;
        if (sr1Var == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        c590 c590Var = this.a;
        if (c590Var != null && c590Var.j() != 0) {
            i = 3;
        }
        b bVar = new b();
        WeakReference<View> weakReference = this.F;
        final View view = weakReference != null ? weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iC = this.a.c(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: uh90
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.a.o(marginLayoutParams, dj0.c(valueAnimator.getAnimatedFraction(), iC, 0));
                    view.requestLayout();
                }
            };
        }
        jcvVar.c(sr1Var, i, bVar, animatorUpdateListener);
    }

    @Override // defpackage.dbv
    public final void d(sr1 sr1Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        jcv jcvVar = this.I;
        if (jcvVar == null) {
            return;
        }
        c590 c590Var = this.a;
        int i = (c590Var == null || c590Var.j() == 0) ? 5 : 3;
        if (jcvVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        sr1 sr1Var2 = jcvVar.f;
        jcvVar.f = sr1Var;
        if (sr1Var2 != null) {
            jcvVar.d(i, sr1Var.c, sr1Var.d == 0);
        }
        WeakReference<V> weakReference = this.E;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v = this.E.get();
        WeakReference<View> weakReference2 = this.F;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (view == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        this.a.o(marginLayoutParams, (int) ((v.getScaleX() * this.A) + this.D));
        view.requestLayout();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void g(CoordinatorLayout.e eVar) {
        this.E = null;
        this.w = null;
        this.I = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void j() {
        this.E = null;
        this.w = null;
        this.I = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        i7i0 i7i0Var;
        VelocityTracker velocityTracker;
        if ((!v.isShown() && r6i0.f(v) == null) || !this.i) {
            this.y = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.H) != null) {
            velocityTracker.recycle();
            this.H = null;
        }
        VelocityTracker velocityTrackerObtain = this.H;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.H = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.J = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.y) {
            this.y = false;
            return false;
        }
        return (this.y || (i7i0Var = this.w) == null || !i7i0Var.t(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        V v2;
        V v3;
        int i2;
        View viewFindViewById;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        WeakReference<V> weakReference = this.E;
        fcv fcvVar = this.b;
        int iH = 0;
        if (weakReference == null) {
            this.E = new WeakReference<>(v);
            this.I = new jcv(v);
            if (fcvVar != null) {
                v.setBackground(fcvVar);
                float elevation = this.f;
                if (elevation == -1.0f) {
                    elevation = v.getElevation();
                }
                fcvVar.r(elevation);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                    r6i0.d.j(v, colorStateList);
                }
            }
            int i3 = this.v == 5 ? 4 : 0;
            if (v.getVisibility() != i3) {
                v.setVisibility(i3);
            }
            A();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
            if (r6i0.f(v) == null) {
                r6i0.q(v, v.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i4 = Gravity.getAbsoluteGravity(((CoordinatorLayout.e) v.getLayoutParams()).c, i) == 3 ? 1 : 0;
        c590 c590Var = this.a;
        if (c590Var == null || c590Var.j() != i4) {
            CoordinatorLayout.e eVar = null;
            rx80 rx80Var = this.d;
            if (i4 == 0) {
                this.a = new kt50(this);
                if (rx80Var != null) {
                    WeakReference<V> weakReference2 = this.E;
                    if (weakReference2 != null && (v3 = weakReference2.get()) != null && (v3.getLayoutParams() instanceof CoordinatorLayout.e)) {
                        eVar = (CoordinatorLayout.e) v3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        rx80.a aVarH = rx80Var.h();
                        aVarH.g(0.0f);
                        aVarH.e(0.0f);
                        rx80 rx80VarA = aVarH.a();
                        if (fcvVar != null) {
                            fcvVar.setShapeAppearanceModel(rx80VarA);
                        }
                    }
                }
            } else {
                if (i4 != 1) {
                    hb5.a(pe4.b(i4, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.a = new r4s(this);
                if (rx80Var != null) {
                    WeakReference<V> weakReference3 = this.E;
                    if (weakReference3 != null && (v2 = weakReference3.get()) != null && (v2.getLayoutParams() instanceof CoordinatorLayout.e)) {
                        eVar = (CoordinatorLayout.e) v2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        rx80.a aVarH2 = rx80Var.h();
                        aVarH2.f(0.0f);
                        aVarH2.d(0.0f);
                        rx80 rx80VarA2 = aVarH2.a();
                        if (fcvVar != null) {
                            fcvVar.setShapeAppearanceModel(rx80VarA2);
                        }
                    }
                }
            }
        }
        if (this.w == null) {
            this.w = new i7i0(coordinatorLayout.getContext(), coordinatorLayout, this.L);
        }
        int iH2 = this.a.h(v);
        coordinatorLayout.u(i, v);
        this.B = coordinatorLayout.getWidth();
        this.C = this.a.i(coordinatorLayout);
        this.A = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        this.D = marginLayoutParams != null ? this.a.a(marginLayoutParams) : 0;
        int i5 = this.v;
        if (i5 == 1 || i5 == 2) {
            iH = iH2 - this.a.h(v);
        } else if (i5 != 3) {
            if (i5 != 5) {
                iyi.a(this.v, "Unexpected value: ");
                return false;
            }
            iH = this.a.e();
        }
        WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
        v.offsetLeftAndRight(iH);
        if (this.F == null && (i2 = this.G) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.F = new WeakReference<>(viewFindViewById);
        }
        for (t490 t490Var : this.K) {
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void r(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.v = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.v == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.w.m(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.H) != null) {
            velocityTracker.recycle();
            this.H = null;
        }
        VelocityTracker velocityTrackerObtain = this.H;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.H = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.y && y()) {
            float fAbs = Math.abs(this.J - motionEvent.getX());
            i7i0 i7i0Var = this.w;
            if (fAbs > i7i0Var.b) {
                i7i0Var.c(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.y;
    }

    public final void w(final int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(uf80.a(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference<V> weakReference = this.E;
        if (weakReference == null || weakReference.get() == null) {
            x(i);
            return;
        }
        V v = this.E.get();
        Runnable runnable = new Runnable() { // from class: sh90
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior sideSheetBehavior = this.a;
                View view = (View) sideSheetBehavior.E.get();
                if (view != null) {
                    sideSheetBehavior.z(view, i, false);
                }
            }
        };
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final void x(int i) {
        V v;
        if (this.v == i) {
            return;
        }
        this.v = i;
        WeakReference<V> weakReference = this.E;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = this.v == 5 ? 4 : 0;
        if (v.getVisibility() != i2) {
            v.setVisibility(i2);
        }
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            ((t490) it.next()).a();
        }
        A();
    }

    public final boolean y() {
        if (this.w != null) {
            return this.i || this.v == 1;
        }
        return false;
    }

    public final void z(View view, int i, boolean z) {
        int iD;
        if (i == 3) {
            iD = this.a.d();
        } else {
            if (i != 5) {
                hb5.a(hce0.a(i, "Invalid state to get outer edge offset: "));
                return;
            }
            iD = this.a.e();
        }
        i7i0 i7i0Var = this.w;
        if (i7i0Var == null || (!z ? i7i0Var.u(view, iD, view.getTop()) : i7i0Var.s(iD, view.getTop()))) {
            x(i);
        } else {
            x(2);
            this.e.a(i);
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = sideSheetBehavior.v;
        }
    }

    public SideSheetBehavior() {
        this.e = new c();
        this.i = true;
        this.v = 5;
        this.z = 0.1f;
        this.G = -1;
        this.K = new LinkedHashSet();
        this.L = new a();
    }
}
