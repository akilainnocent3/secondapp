package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.c7;
import defpackage.cdv;
import defpackage.dbv;
import defpackage.dj0;
import defpackage.e6;
import defpackage.eai0;
import defpackage.ecv;
import defpackage.fcv;
import defpackage.g9i0;
import defpackage.gbv;
import defpackage.h8j0;
import defpackage.hb5;
import defpackage.hbv;
import defpackage.hce0;
import defpackage.i7i0;
import defpackage.pk30;
import defpackage.r6i0;
import defpackage.rx80;
import defpackage.sr1;
import defpackage.t45;
import defpackage.u45;
import defpackage.uf80;
import defpackage.v45;
import defpackage.w9h;
import defpackage.zmn;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements dbv {
    public final int A;
    public int B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public int K;
    public int L;
    public final boolean M;
    public final rx80 N;
    public boolean O;
    public final BottomSheetBehavior<V>.e P;
    public final ValueAnimator Q;
    public final int R;
    public int S;
    public int T;
    public final float U;
    public int V;
    public final float W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final int a;
    public final boolean a0;
    public boolean b;
    public boolean b0;
    public final float c;
    public int c0;
    public final int d;
    public i7i0 d0;
    public int e;
    public boolean e0;
    public boolean f;
    public int f0;
    public boolean g0;
    public final float h0;
    public int i;
    public int i0;
    public int j0;
    public int k0;
    public WeakReference<V> l0;
    public WeakReference<View> m0;
    public WeakReference<View> n0;
    public WeakReference<View> o0;
    public final ArrayList<d> p0;
    public VelocityTracker q0;
    public hbv r0;
    public int s0;
    public int t0;
    public boolean u0;
    public final int v;
    public HashMap v0;
    public final fcv w;
    public final SparseIntArray w0;
    public final c x0;
    public final ColorStateList y;
    public final int z;

    public class a implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ int b;

        public a(View view, int i) {
            this.a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.O(this.a, this.b, false);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            bottomSheetBehavior.M(5);
            WeakReference<V> weakReference = bottomSheetBehavior.l0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            bottomSheetBehavior.l0.get().requestLayout();
        }
    }

    public class c extends i7i0.c {
        public c() {
        }

        @Override // i7i0.c
        public final int a(int i, View view) {
            return view.getLeft();
        }

        @Override // i7i0.c
        public final int b(int i, View view) {
            return cdv.b(i, BottomSheetBehavior.this.E(), d());
        }

        @Override // i7i0.c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.X ? bottomSheetBehavior.k0 : bottomSheetBehavior.V;
        }

        @Override // i7i0.c
        public final void h(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.Z) {
                    bottomSheetBehavior.M(1);
                }
            }
        }

        @Override // i7i0.c
        public final void i(View view, int i, int i2) {
            BottomSheetBehavior.this.A(i2);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0049  */
        /* JADX WARN: Code duplicated, block: B:34:0x0082  */
        /* JADX WARN: Code duplicated, block: B:6:0x000d  */
        @Override // i7i0.c
        public final void j(View view, float f, float f2) {
            int i = 6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f2 < 0.0f) {
                if (bottomSheetBehavior.b) {
                    i = 3;
                } else {
                    int top = view.getTop();
                    SystemClock.uptimeMillis();
                    if (top <= bottomSheetBehavior.T) {
                        i = 3;
                    }
                }
            } else if (bottomSheetBehavior.X && bottomSheetBehavior.N(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                    if (view.getTop() > (bottomSheetBehavior.E() + bottomSheetBehavior.k0) / 2) {
                        i = 5;
                    } else if (bottomSheetBehavior.b || Math.abs(view.getTop() - bottomSheetBehavior.E()) < Math.abs(view.getTop() - bottomSheetBehavior.T)) {
                        i = 3;
                    }
                } else {
                    i = 5;
                }
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top2 = view.getTop();
                if (!bottomSheetBehavior.b) {
                    int i2 = bottomSheetBehavior.T;
                    if (top2 < i2) {
                        if (top2 < Math.abs(top2 - bottomSheetBehavior.V)) {
                            i = 3;
                        }
                    } else if (Math.abs(top2 - i2) >= Math.abs(top2 - bottomSheetBehavior.V)) {
                        i = 4;
                    }
                } else if (Math.abs(top2 - bottomSheetBehavior.S) < Math.abs(top2 - bottomSheetBehavior.V)) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else if (bottomSheetBehavior.b) {
                i = 4;
            } else {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.T) >= Math.abs(top3 - bottomSheetBehavior.V)) {
                    i = 4;
                }
            }
            bottomSheetBehavior.O(view, i, true);
        }

        @Override // i7i0.c
        public final boolean k(int i, View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.c0;
            if (i2 == 1 || bottomSheetBehavior.u0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.s0 == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.o0;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            SystemClock.uptimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.l0;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class d {
        public void a(View view) {
        }

        public abstract void b(View view);

        public abstract void c(int i, View view);
    }

    public class e {
        public int a;
        public boolean b;
        public final a c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                i7i0 i7i0Var = bottomSheetBehavior.d0;
                if (i7i0Var != null && i7i0Var.h()) {
                    eVar.a(eVar.a);
                } else if (bottomSheetBehavior.c0 == 2) {
                    bottomSheetBehavior.M(eVar.a);
                }
            }
        }

        public e() {
        }

        public final void a(int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.l0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            bottomSheetBehavior.l0.get().postOnAnimation(this.c);
            this.b = true;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.a = 0;
        this.b = true;
        this.z = -1;
        this.A = -1;
        this.P = new e();
        this.U = 0.5f;
        this.W = -1.0f;
        this.Z = true;
        this.a0 = true;
        this.c0 = 4;
        this.h0 = 0.1f;
        this.p0 = new ArrayList<>();
        this.t0 = -1;
        this.w0 = new SparseIntArray();
        this.x0 = new c();
        this.v = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pk30.g);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.y = ecv.a(3, context, typedArrayObtainStyledAttributes);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.N = rx80.d(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        rx80 rx80Var = this.N;
        if (rx80Var != null) {
            fcv fcvVar = new fcv(rx80Var);
            this.w = fcvVar;
            fcvVar.o(context);
            ColorStateList colorStateList = this.y;
            if (colorStateList != null) {
                this.w.s(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.w.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.Q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.Q.addUpdateListener(new t45(this));
        this.W = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            K(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        } else {
            K(i);
        }
        J(typedArrayObtainStyledAttributes.getBoolean(9, false));
        this.C = typedArrayObtainStyledAttributes.getBoolean(14, false);
        I(typedArrayObtainStyledAttributes.getBoolean(7, true));
        this.Y = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.Z = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.a0 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.a = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            hb5.a("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.U = f;
        if (this.l0 != null) {
            this.T = (int) ((1.0f - f) * this.k0);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            if (dimensionPixelOffset < 0) {
                hb5.a("offset must be greater than or equal to 0");
                throw null;
            }
            this.R = dimensionPixelOffset;
            R(this.c0, true);
        } else {
            int i2 = typedValuePeekValue2.data;
            if (i2 < 0) {
                hb5.a("offset must be greater than or equal to 0");
                throw null;
            }
            this.R = i2;
            R(this.c0, true);
        }
        this.d = typedArrayObtainStyledAttributes.getInt(12, 500);
        this.D = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.E = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.F = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.G = typedArrayObtainStyledAttributes.getBoolean(21, true);
        this.H = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.I = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.J = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.M = typedArrayObtainStyledAttributes.getBoolean(24, true);
        typedArrayObtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewB = B(viewGroup.getChildAt(i));
            if (viewB != null) {
                return viewB;
            }
        }
        return null;
    }

    public static <V extends View> BottomSheetBehavior<V> C(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.e)) {
            hb5.a("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.e) layoutParams).a;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        hb5.a("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public static int D(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        V v = this.l0.get();
        if (v != null) {
            ArrayList<d> arrayList = this.p0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.V;
            if (i <= i2 && i2 != E()) {
                E();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList.get(i3).b(v);
            }
        }
    }

    public final int E() {
        if (this.b) {
            return this.S;
        }
        return Math.max(this.R, this.G ? 0 : this.L);
    }

    public final int F(int i) {
        if (i == 3) {
            return E();
        }
        if (i == 4) {
            return this.V;
        }
        if (i == 5) {
            return this.k0;
        }
        if (i == 6) {
            return this.T;
        }
        hb5.a(hce0.a(i, "Invalid state to get top offset: "));
        return 0;
    }

    public final boolean G() {
        WeakReference<V> weakReference = this.l0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.l0.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void H(BottomSheetDragHandleView bottomSheetDragHandleView) {
        WeakReference<View> weakReference;
        if (bottomSheetDragHandleView != null || (weakReference = this.m0) == null) {
            this.m0 = new WeakReference<>(bottomSheetDragHandleView);
            Q(1, bottomSheetDragHandleView);
        } else {
            z(1, weakReference.get());
            this.m0 = null;
        }
    }

    public final void I(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.l0 != null) {
            w();
        }
        M((this.b && this.c0 == 6) ? 3 : this.c0);
        R(this.c0, true);
        P();
    }

    public final void J(boolean z) {
        if (this.X != z) {
            this.X = z;
            if (!z && this.c0 == 5) {
                L(4);
            }
            P();
        }
    }

    public final void K(int i) {
        boolean z = this.f;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!z && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        T();
    }

    public final void L(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(uf80.a(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.X && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.b && F(i) <= this.S) ? 3 : i;
        WeakReference<V> weakReference = this.l0;
        if (weakReference == null || weakReference.get() == null) {
            M(i);
            return;
        }
        V v = this.l0.get();
        a aVar = new a(v, i2);
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
            v.post(aVar);
        } else {
            aVar.run();
        }
    }

    public final void M(int i) {
        V v;
        if (this.c0 == i) {
            return;
        }
        this.c0 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.X;
        }
        WeakReference<V> weakReference = this.l0;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            S(true);
        } else if (i == 6 || i == 5 || i == 4) {
            S(false);
        }
        R(i, true);
        while (true) {
            ArrayList<d> arrayList = this.p0;
            if (i2 >= arrayList.size()) {
                P();
                return;
            } else {
                arrayList.get(i2).c(i, v);
                i2++;
            }
        }
    }

    public final boolean N(View view, float f) {
        if (this.Y) {
            return true;
        }
        if (view.getTop() < this.V) {
            return false;
        }
        return Math.abs(((f * this.h0) + ((float) view.getTop())) - ((float) this.V)) / ((float) y()) > 0.5f;
    }

    public final void O(View view, int i, boolean z) {
        int iF = F(i);
        i7i0 i7i0Var = this.d0;
        if (i7i0Var == null || (!z ? i7i0Var.u(view, view.getLeft(), iF) : i7i0Var.s(view.getLeft(), iF))) {
            M(i);
            return;
        }
        M(2);
        R(i, true);
        this.P.a(i);
    }

    public final void P() {
        WeakReference<V> weakReference = this.l0;
        if (weakReference != null) {
            Q(0, weakReference.get());
        }
        WeakReference<View> weakReference2 = this.m0;
        if (weakReference2 != null) {
            Q(1, weakReference2.get());
        }
    }

    public final void Q(int i, View view) {
        int iA;
        int i2;
        if (view == null) {
            return;
        }
        z(i, view);
        if (!this.b && this.c0 != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            v45 v45Var = new v45(this, 6);
            ArrayList arrayListG = r6i0.g(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListG.size()) {
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        int[] iArr = r6i0.d;
                        if (i4 >= 32 || i5 != -1) {
                            break;
                        }
                        int i6 = iArr[i4];
                        boolean z = true;
                        for (int i7 = 0; i7 < arrayListG.size(); i7++) {
                            z &= ((c7.a) arrayListG.get(i7)).a() != i6;
                        }
                        if (z) {
                            i5 = i6;
                        }
                        i4++;
                    }
                    iA = i5;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((c7.a) arrayListG.get(i3)).a).getLabel())) {
                    iA = ((c7.a) arrayListG.get(i3)).a();
                    break;
                }
                i3++;
            }
            if (iA != -1) {
                i2 = iA;
                c7.a aVar = new c7.a(null, i2, string, v45Var, null);
                View.AccessibilityDelegate accessibilityDelegateE = r6i0.e(view);
                e6 e6Var = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof e6.a ? ((e6.a) accessibilityDelegateE).a : new e6(accessibilityDelegateE);
                if (e6Var == null) {
                    e6Var = new e6();
                }
                r6i0.p(view, e6Var);
                r6i0.m(aVar.a(), view);
                r6i0.g(view).add(aVar);
                r6i0.j(0, view);
            } else {
                i2 = iA;
            }
            this.w0.put(i, i2);
        }
        if (this.X && this.c0 != 5) {
            r6i0.n(view, c7.a.n, null, new v45(this, 5));
        }
        int i8 = this.c0;
        if (i8 == 3) {
            r6i0.n(view, c7.a.m, null, new v45(this, this.b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            r6i0.n(view, c7.a.l, null, new v45(this, this.b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            r6i0.n(view, c7.a.m, null, new v45(this, 4));
            r6i0.n(view, c7.a.l, null, new v45(this, 3));
        }
    }

    public final void R(int i, boolean z) {
        fcv fcvVar;
        if (i == 2) {
            return;
        }
        boolean z2 = this.c0 == 3 && (this.M || G());
        if (this.O == z2 || (fcvVar = this.w) == null) {
            return;
        }
        this.O = z2;
        ValueAnimator valueAnimator = this.Q;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            fcvVar.t(this.O ? x() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(fcvVar.b.j, z2 ? x() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void S(boolean z) {
        WeakReference<V> weakReference = this.l0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.v0 != null) {
                    return;
                } else {
                    this.v0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.l0.get() && z) {
                    this.v0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.v0 = null;
        }
    }

    public final void T() {
        V v;
        if (this.l0 != null) {
            w();
            if (this.c0 != 4 || (v = this.l0.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    @Override // defpackage.dbv
    public final void a(sr1 sr1Var) {
        hbv hbvVar = this.r0;
        if (hbvVar == null) {
            return;
        }
        hbvVar.f = sr1Var;
    }

    @Override // defpackage.dbv
    public final void b() {
        hbv hbvVar = this.r0;
        if (hbvVar == null || hbvVar.a() == null) {
            return;
        }
        AnimatorSet animatorSetB = hbvVar.b();
        animatorSetB.setDuration(hbvVar.e);
        animatorSetB.start();
    }

    @Override // defpackage.dbv
    public final void c() {
        hbv hbvVar = this.r0;
        if (hbvVar == null) {
            return;
        }
        int i = hbvVar.d;
        int i2 = hbvVar.c;
        sr1 sr1Var = hbvVar.f;
        hbvVar.f = null;
        if (sr1Var != null) {
            float f = sr1Var.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.X) {
                    AnimatorSet animatorSetB = hbvVar.b();
                    animatorSetB.setDuration(dj0.c(f, i2, i));
                    animatorSetB.start();
                    L(4);
                    return;
                }
                b bVar = new b();
                V v = hbvVar.b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v, (Property<V, Float>) View.TRANSLATION_Y, v.getScaleY() * v.getHeight());
                objectAnimatorOfFloat.setInterpolator(new w9h());
                objectAnimatorOfFloat.setDuration(dj0.c(f, i2, i));
                objectAnimatorOfFloat.addListener(new gbv(hbvVar));
                objectAnimatorOfFloat.addListener(bVar);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        L(this.X ? 5 : 4);
    }

    @Override // defpackage.dbv
    public final void d(sr1 sr1Var) {
        hbv hbvVar = this.r0;
        if (hbvVar == null) {
            return;
        }
        if (hbvVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        sr1 sr1Var2 = hbvVar.f;
        hbvVar.f = sr1Var;
        if (sr1Var2 == null) {
            return;
        }
        hbvVar.c(sr1Var.c);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void g(CoordinatorLayout.e eVar) {
        this.l0 = null;
        this.d0 = null;
        this.r0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void j() {
        this.l0 = null;
        this.d0 = null;
        this.r0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i;
        i7i0 i7i0Var;
        if (!v.isShown() || !this.Z) {
            this.e0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.s0 = -1;
            this.t0 = -1;
            VelocityTracker velocityTracker = this.q0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.q0 = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.q0;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.q0 = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.t0 = y;
            if (this.c0 != 2) {
                WeakReference<View> weakReference = this.o0;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.s(view, x, y)) {
                    this.s0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    int i2 = this.t0;
                    WeakReference<View> weakReference2 = this.n0;
                    View view2 = weakReference2 != null ? weakReference2.get() : null;
                    if (view2 == null || !coordinatorLayout.s(view2, x, i2)) {
                        this.u0 = true;
                    }
                }
            }
            this.e0 = this.s0 == -1 && !coordinatorLayout.s(v, x, this.t0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.u0 = false;
            this.s0 = -1;
            if (this.e0) {
                this.e0 = false;
                return false;
            }
        }
        if (this.e0 || (i7i0Var = this.d0) == null || !i7i0Var.t(motionEvent)) {
            WeakReference<View> weakReference3 = this.o0;
            View view3 = weakReference3 != null ? weakReference3.get() : null;
            if (actionMasked != 2 || view3 == null || this.e0 || this.c0 == 1 || coordinatorLayout.s(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.d0 == null || (i = this.t0) == -1 || Math.abs(i - motionEvent.getY()) <= this.d0.b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.l0 == null) {
            this.i = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.C || this.f) ? false : true;
            if (this.D || this.E || this.F || this.H || this.I || this.J || z) {
                eai0.b(v, new u45(this, z));
            }
            zmn zmnVar = new zmn(v);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            h8j0.a(v, zmnVar);
            this.l0 = new WeakReference<>(v);
            this.r0 = new hbv(v);
            fcv fcvVar = this.w;
            if (fcvVar != null) {
                v.setBackground(fcvVar);
                float elevation = this.W;
                if (elevation == -1.0f) {
                    elevation = v.getElevation();
                }
                fcvVar.r(elevation);
            } else {
                ColorStateList colorStateList = this.y;
                if (colorStateList != null) {
                    r6i0.d.j(v, colorStateList);
                }
            }
            P();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.d0 == null) {
            this.d0 = new i7i0(coordinatorLayout.getContext(), coordinatorLayout, this.x0);
        }
        int top = v.getTop();
        coordinatorLayout.u(i, v);
        this.j0 = coordinatorLayout.getWidth();
        this.k0 = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.i0 = height;
        int i3 = this.k0;
        int i4 = i3 - height;
        int i5 = this.L;
        if (i4 < i5) {
            boolean z2 = this.G;
            int i6 = this.A;
            if (z2) {
                height = i6 == -1 ? i3 : Math.min(i3, i6);
                this.i0 = height;
            } else {
                int i7 = i3 - i5;
                height = i6 == -1 ? i7 : Math.min(i7, i6);
                this.i0 = height;
            }
        }
        this.S = Math.max(0, this.k0 - height);
        this.T = (int) ((1.0f - this.U) * this.k0);
        w();
        int i8 = this.c0;
        if (i8 == 3) {
            int iE = E();
            WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
            v.offsetTopAndBottom(iE);
        } else if (i8 == 6) {
            int i9 = this.T;
            WeakHashMap<View, g9i0> weakHashMap3 = r6i0.a;
            v.offsetTopAndBottom(i9);
        } else if (this.X && i8 == 5) {
            int i10 = this.k0;
            WeakHashMap<View, g9i0> weakHashMap4 = r6i0.a;
            v.offsetTopAndBottom(i10);
        } else if (i8 == 4) {
            int i11 = this.V;
            WeakHashMap<View, g9i0> weakHashMap5 = r6i0.a;
            v.offsetTopAndBottom(i11);
        } else if (i8 == 1 || i8 == 2) {
            int top2 = top - v.getTop();
            WeakHashMap<View, g9i0> weakHashMap6 = r6i0.a;
            v.offsetTopAndBottom(top2);
        }
        R(this.c0, false);
        this.o0 = new WeakReference<>(B(v));
        while (true) {
            ArrayList<d> arrayList = this.p0;
            if (i2 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i2).a(v);
            i2++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(D(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.z, marginLayoutParams.width), D(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.A, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean n(View view) {
        WeakReference<View> weakReference = this.o0;
        return (weakReference == null || view != weakReference.get() || this.c0 == 3 || this.b0) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void o(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.o0;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view != view2) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        boolean z = this.a0;
        if (i2 > 0) {
            if (!this.g0 && !z && view == view2 && view.canScrollVertically(1)) {
                this.b0 = true;
                return;
            }
            if (i4 < E()) {
                int iE = top - E();
                iArr[1] = iE;
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                v.offsetTopAndBottom(-iE);
                M(3);
            } else {
                if (!this.Z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                v.offsetTopAndBottom(-i2);
                M(1);
            }
        } else if (i2 < 0) {
            boolean zCanScrollVertically = view.canScrollVertically(-1);
            if (!this.g0 && !z && view == view2 && zCanScrollVertically) {
                this.b0 = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i5 = this.V;
                if (i4 > i5 && !this.X) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    WeakHashMap<View, g9i0> weakHashMap3 = r6i0.a;
                    v.offsetTopAndBottom(-i6);
                    M(4);
                } else {
                    if (!this.Z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap<View, g9i0> weakHashMap4 = r6i0.a;
                    v.offsetTopAndBottom(-i2);
                    M(1);
                }
            }
        }
        A(v.getTop());
        this.f0 = i2;
        this.g0 = true;
        this.b0 = false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void r(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = savedState.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.X = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.Y = savedState.i;
            }
        }
        int i2 = savedState.c;
        if (i2 == 1 || i2 == 2) {
            this.c0 = 4;
        } else {
            this.c0 = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean t(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f0 = 0;
        this.g0 = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void u(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == E()) {
            M(3);
            return;
        }
        WeakReference<View> weakReference = this.o0;
        if (weakReference != null && view == weakReference.get() && this.g0) {
            if (this.f0 > 0) {
                if (!this.b && v.getTop() > this.T) {
                    i3 = 6;
                }
            } else if (this.X) {
                VelocityTracker velocityTracker = this.q0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.q0.getYVelocity(this.s0);
                }
                if (N(v, yVelocity)) {
                    i3 = 5;
                } else if (this.f0 == 0) {
                    top2 = v.getTop();
                    if (this.b) {
                        i2 = this.T;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.V)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.V)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.S) >= Math.abs(top2 - this.V)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.b) {
                        top = v.getTop();
                        if (Math.abs(top - this.T) < Math.abs(top - this.V)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.f0 == 0) {
                top2 = v.getTop();
                if (this.b) {
                    i2 = this.T;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.V)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.V)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.S) >= Math.abs(top2 - this.V)) {
                    i3 = 4;
                }
            } else {
                if (!this.b) {
                    top = v.getTop();
                    if (Math.abs(top - this.T) < Math.abs(top - this.V)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            O(v, i3, false);
            this.g0 = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean v(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.c0;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        i7i0 i7i0Var = this.d0;
        if (i7i0Var != null && (this.Z || i == 1)) {
            i7i0Var.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.s0 = -1;
            this.t0 = -1;
            VelocityTracker velocityTracker = this.q0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.q0 = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.q0;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.q0 = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (this.d0 != null && ((this.Z || this.c0 == 1) && actionMasked == 2 && !this.e0)) {
            float fAbs = Math.abs(this.t0 - motionEvent.getY());
            i7i0 i7i0Var2 = this.d0;
            if (fAbs > i7i0Var2.b) {
                i7i0Var2.c(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.e0;
    }

    public final void w() {
        int iY = y();
        boolean z = this.b;
        int i = this.k0;
        if (z) {
            this.V = Math.max(i - iY, this.S);
        } else {
            this.V = i - iY;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    public final float x() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        fcv fcvVar = this.w;
        if (fcvVar != null && (weakReference = this.l0) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v = this.l0.get();
            if (G() && (rootWindowInsets = v.getRootWindowInsets()) != null) {
                float fL = fcvVar.l();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fL <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fL;
                    }
                } else {
                    f = 0.0f;
                }
                float fM = fcvVar.m();
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fM > 0.0f) {
                        f2 = radius2 / fM;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int y() {
        int iMin;
        int i;
        int i2;
        if (this.f) {
            iMin = Math.min(Math.max(this.i, this.k0 - ((this.j0 * 9) / 16)), this.i0);
            i = this.K;
        } else {
            if (!this.C && !this.D && (i2 = this.B) > 0) {
                return Math.max(this.e, i2 + this.v);
            }
            iMin = this.e;
            i = this.K;
        }
        return iMin + i;
    }

    public final void z(int i, View view) {
        if (view == null) {
            return;
        }
        r6i0.m(524288, view);
        r6i0.j(0, view);
        r6i0.m(262144, view);
        r6i0.j(0, view);
        r6i0.m(1048576, view);
        r6i0.j(0, view);
        SparseIntArray sparseIntArray = this.w0;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 != -1) {
            r6i0.m(i2, view);
            r6i0.j(0, view);
            sparseIntArray.delete(i);
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean i;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
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

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = bottomSheetBehavior.c0;
            this.d = bottomSheetBehavior.e;
            this.e = bottomSheetBehavior.b;
            this.f = bottomSheetBehavior.X;
            this.i = bottomSheetBehavior.Y;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.z = -1;
        this.A = -1;
        this.P = new e();
        this.U = 0.5f;
        this.W = -1.0f;
        this.Z = true;
        this.a0 = true;
        this.c0 = 4;
        this.h0 = 0.1f;
        this.p0 = new ArrayList<>();
        this.t0 = -1;
        this.w0 = new SparseIntArray();
        this.x0 = new c();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
