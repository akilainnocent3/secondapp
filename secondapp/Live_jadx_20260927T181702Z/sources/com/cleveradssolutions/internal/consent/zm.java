package com.cleveradssolutions.internal.consent;

import android.R;
import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f2.z1;
import g2.n0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class zm extends CoordinatorLayout.c {
    public androidx.customview.widget.d A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public WeakReference H;
    public WeakReference I;
    public final ArrayList J;
    public VelocityTracker K;
    public int L;
    public int M;
    public boolean N;
    public HashMap O;
    public int P;
    public final e Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f43325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f43329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PaintDrawable f43330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f43331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f43332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f43333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f43334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f43335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f43336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f43337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f43338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f43339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f43340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f43341t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f43342u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f43343v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f43344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f43345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f43346y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f43347z;

    public zm(Context context) {
        super(context, null);
        this.f43323b = 0;
        this.f43324c = true;
        this.f43331j = -1;
        this.f43332k = -1;
        this.f43338q = new j(this, 0);
        this.f43342u = 0.5f;
        this.f43346y = true;
        this.f43347z = 4;
        this.J = new ArrayList();
        this.P = -1;
        this.Q = new e(this);
        this.f43329h = (int) TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics());
        v(context);
        q();
        x(false);
        o();
        n();
        d();
        j();
        c();
        p();
        m();
        this.f43335n = true;
        this.f43325d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View t(View view) {
        if (z1.a1(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewT = t(viewGroup.getChildAt(i10));
            if (viewT != null) {
                return viewT;
            }
        }
        return null;
    }

    public final void c() {
        this.f43323b = 0;
    }

    public final void d() {
        this.f43345x = false;
    }

    public final void e() {
        View view;
        WeakReference weakReference = this.H;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        z1.w1(view, 524288);
        z1.w1(view, 262144);
        z1.w1(view, 1048576);
        int i10 = this.P;
        if (i10 != -1) {
            z1.w1(view, i10);
        }
        if (!this.f43324c && this.f43347z != 6) {
            this.P = z1.c(view, "Expand halfway", new f(this, 6));
        }
        if (this.f43344w && this.f43347z != 5) {
            z1.z1(view, n0.a.f85919z, null, new f(this, 5));
        }
        int i11 = this.f43347z;
        if (i11 == 3) {
            z1.z1(view, n0.a.f85918y, null, new f(this, this.f43324c ? 4 : 6));
            return;
        }
        if (i11 == 4) {
            z1.z1(view, n0.a.f85917x, null, new f(this, this.f43324c ? 3 : 6));
        } else {
            if (i11 != 6) {
                return;
            }
            z1.z1(view, n0.a.f85918y, null, new f(this, 4));
            z1.z1(view, n0.a.f85917x, null, new f(this, 3));
        }
    }

    public final int f() {
        if (this.f43324c) {
            return this.f43340s;
        }
        return Math.max(this.f43339r, this.f43335n ? 0 : this.f43336o);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    public final void h(int i10) {
        int i11;
        int iF;
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.f43344w && i10 == 5) {
            Log.w(BottomSheetBehavior.f50292j0, "Cannot set state: " + i10);
            return;
        }
        if (i10 == 6 && this.f43324c) {
            if (i10 == 3) {
                iF = f();
            } else if (i10 == 4) {
                iF = this.f43343v;
            } else if (i10 == 5) {
                iF = this.G;
            } else {
                if (i10 != 6) {
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
                }
                iF = this.f43341t;
            }
            i11 = iF > this.f43340s ? i10 : 3;
        }
        WeakReference weakReference = this.H;
        if (weakReference == null || weakReference.get() == null) {
            k(i10);
            return;
        }
        View view = (View) this.H.get();
        b bVar = new b(this, view, i11);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && z1.R0(view)) {
            view.post(bVar);
        } else {
            bVar.run();
        }
    }

    public final void i(boolean z10) {
        WeakReference weakReference = this.H;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.O != null) {
                    return;
                } else {
                    this.O = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.H.get() && z10) {
                    this.O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z10) {
                return;
            }
            this.O = null;
        }
    }

    public final void j() {
        this.f43346y = true;
    }

    public final void k(int i10) {
        if (this.f43347z == i10) {
            return;
        }
        this.f43347z = i10;
        WeakReference weakReference = this.H;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            i(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            i(false);
        }
        if (i10 != 2) {
            boolean z10 = i10 == 3;
            if (this.f43337p != z10) {
                this.f43337p = z10;
            }
        }
        for (int i11 = 0; i11 < this.J.size(); i11++) {
            y yVar = (y) ((g) this.J.get(i11));
            if (i10 == 5) {
                yVar.f43313a.cancel();
            } else {
                yVar.getClass();
            }
        }
        e();
    }

    public final void m() {
        this.f43339r = 0;
    }

    public final void n() {
        if (this.f43324c) {
            return;
        }
        this.f43324c = true;
        if (this.H != null) {
            int iS = s();
            if (this.f43324c) {
                this.f43343v = Math.max(this.G - iS, this.f43340s);
            } else {
                this.f43343v = this.G - iS;
            }
        }
        k((this.f43324c && this.f43347z == 6) ? 3 : this.f43347z);
        e();
    }

    public final void o() {
        this.f43334m = false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onAttachedToLayoutParams(CoordinatorLayout.g gVar) {
        super.onAttachedToLayoutParams(gVar);
        this.H = null;
        this.A = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.H = null;
        this.A = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        androidx.customview.widget.d dVar;
        if (!view.isShown() || !this.f43346y) {
            this.B = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.L = -1;
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.K = null;
            }
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.M = (int) motionEvent.getY();
            if (this.f43347z != 2) {
                WeakReference weakReference = this.I;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.G(view2, x10, this.M)) {
                    this.L = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.N = true;
                }
            }
            this.B = this.L == -1 && !coordinatorLayout.G(view, x10, this.M);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.N = false;
            this.L = -1;
            if (this.B) {
                this.B = false;
                return false;
            }
        }
        if (!this.B && (dVar = this.A) != null && dVar.W(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.I;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.B || this.f43347z == 1 || coordinatorLayout.G(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.A == null || Math.abs(((float) this.M) - motionEvent.getY()) <= ((float) this.A.E())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (z1.W(coordinatorLayout) && !z1.W(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.H == null) {
            this.f43328g = (int) TypedValue.applyDimension(1, 64.0f, coordinatorLayout.getResources().getDisplayMetrics());
            boolean z10 = (Build.VERSION.SDK_INT < 29 || this.f43334m || this.f43327f) ? false : true;
            if (z10) {
                int iN0 = z1.n0(view);
                view.getPaddingTop();
                z1.j2(view, new c(this, new n(iN0, z1.m0(view), view.getPaddingBottom()), z10));
                if (z1.R0(view)) {
                    z1.A1(view);
                } else {
                    view.addOnAttachStateChangeListener(new d());
                }
            }
            this.H = new WeakReference(view);
            PaintDrawable paintDrawable = this.f43330i;
            if (paintDrawable != null) {
                z1.O1(view, paintDrawable);
                this.f43337p = this.f43347z == 3;
            }
            e();
            if (z1.X(view) == 0) {
                z1.Y1(view, 1);
            }
        }
        if (this.A == null) {
            this.A = androidx.customview.widget.d.q(coordinatorLayout, this.Q);
        }
        int top = view.getTop();
        coordinatorLayout.N(view, i10);
        this.F = coordinatorLayout.getWidth();
        this.G = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.E = height;
        int i11 = this.G;
        int i12 = i11 - height;
        int i13 = this.f43336o;
        if (i12 < i13) {
            if (this.f43335n) {
                this.E = i11;
            } else {
                this.E = i11 - i13;
            }
        }
        this.f43340s = Math.max(0, i11 - this.E);
        this.f43341t = (int) ((1.0f - this.f43342u) * this.G);
        int iS = s();
        if (this.f43324c) {
            this.f43343v = Math.max(this.G - iS, this.f43340s);
        } else {
            this.f43343v = this.G - iS;
        }
        int i14 = this.f43347z;
        if (i14 == 3) {
            z1.i1(view, f());
        } else if (i14 == 6) {
            z1.i1(view, this.f43341t);
        } else if (this.f43344w && i14 == 5) {
            z1.i1(view, this.G);
        } else if (i14 == 4) {
            z1.i1(view, this.f43343v);
        } else if (i14 == 1 || i14 == 2) {
            z1.i1(view, top - view.getTop());
        }
        this.I = new WeakReference(t(view));
        for (int i15 = 0; i15 < this.J.size(); i15++) {
            ((g) this.J.get(i15)).getClass();
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingRight = coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11;
        int iMin = this.f43331j;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingRight, marginLayoutParams.width);
        if (iMin != -1) {
            int mode = View.MeasureSpec.getMode(childMeasureSpec);
            int size = View.MeasureSpec.getSize(childMeasureSpec);
            if (mode != 1073741824) {
                if (size != 0) {
                    iMin = Math.min(size, iMin);
                }
                childMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
            } else {
                childMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, iMin), 1073741824);
            }
        }
        int paddingBottom = coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13;
        int iMin2 = this.f43332k;
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, paddingBottom, marginLayoutParams.height);
        if (iMin2 != -1) {
            int mode2 = View.MeasureSpec.getMode(childMeasureSpec2);
            int size2 = View.MeasureSpec.getSize(childMeasureSpec2);
            if (mode2 != 1073741824) {
                if (size2 != 0) {
                    iMin2 = Math.min(size2, iMin2);
                }
                childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, Integer.MIN_VALUE);
            } else {
                childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, iMin2), 1073741824);
            }
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference = this.I;
        return weakReference != null && view2 == weakReference.get() && (this.f43347z != 3 || super.onNestedPreFling(coordinatorLayout, view, view2, f10, f11));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.I;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < f()) {
                int iF = top - f();
                iArr[1] = iF;
                z1.i1(view, -iF);
                k(3);
            } else {
                if (!this.f43346y) {
                    return;
                }
                iArr[1] = i11;
                z1.i1(view, -i11);
                k(1);
            }
        } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
            int i14 = this.f43343v;
            if (i13 > i14 && !this.f43344w) {
                int i15 = top - i14;
                iArr[1] = i15;
                z1.i1(view, -i15);
                k(4);
            } else {
                if (!this.f43346y) {
                    return;
                }
                iArr[1] = i11;
                z1.i1(view, -i11);
                k(1);
            }
        }
        u(view.getTop());
        this.C = i11;
        this.D = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        zj zjVar = (zj) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, view, zjVar.c());
        int i10 = this.f43323b;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f43326e = zjVar.f43319e;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f43324c = zjVar.f43320f;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f43344w = zjVar.f43321g;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f43345x = zjVar.f43322h;
            }
        }
        int i11 = zjVar.f43318d;
        if (i11 == 1 || i11 == 2) {
            this.f43347z = 4;
        } else {
            this.f43347z = i11;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return new zj(super.onSaveInstanceState(coordinatorLayout, view), this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.C = 0;
        this.D = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
        int top;
        int top2;
        int i11;
        float yVelocity;
        int i12 = 3;
        if (view.getTop() == f()) {
            k(3);
            return;
        }
        WeakReference weakReference = this.I;
        if (weakReference != null && view2 == weakReference.get() && this.D) {
            if (this.C > 0) {
                if (!this.f43324c && view.getTop() > this.f43341t) {
                    i12 = 6;
                }
            } else if (this.f43344w) {
                VelocityTracker velocityTracker = this.K;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f43325d);
                    yVelocity = this.K.getYVelocity(this.L);
                }
                if (y(view, yVelocity)) {
                    i12 = 5;
                } else if (this.C == 0) {
                    top2 = view.getTop();
                    if (this.f43324c) {
                        i11 = this.f43341t;
                        if (top2 < i11) {
                            if (top2 >= Math.abs(top2 - this.f43343v)) {
                            }
                        } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.f43343v)) {
                            i12 = 4;
                        }
                        i12 = 6;
                    } else if (Math.abs(top2 - this.f43340s) >= Math.abs(top2 - this.f43343v)) {
                        i12 = 4;
                    }
                } else {
                    if (!this.f43324c) {
                        top = view.getTop();
                        if (Math.abs(top - this.f43341t) < Math.abs(top - this.f43343v)) {
                            i12 = 6;
                        }
                    }
                    i12 = 4;
                }
            } else if (this.C == 0) {
                top2 = view.getTop();
                if (this.f43324c) {
                    i11 = this.f43341t;
                    if (top2 < i11) {
                        if (top2 >= Math.abs(top2 - this.f43343v)) {
                        }
                    } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.f43343v)) {
                        i12 = 4;
                    }
                    i12 = 6;
                } else if (Math.abs(top2 - this.f43340s) >= Math.abs(top2 - this.f43343v)) {
                    i12 = 4;
                }
            } else {
                if (!this.f43324c) {
                    top = view.getTop();
                    if (Math.abs(top - this.f43341t) < Math.abs(top - this.f43343v)) {
                        i12 = 6;
                    }
                }
                i12 = 4;
            }
            w(view, i12, false);
            this.D = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f43347z;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        androidx.customview.widget.d dVar = this.A;
        if (dVar != null && (this.f43346y || i10 == 1)) {
            dVar.M(motionEvent);
        }
        if (actionMasked == 0) {
            this.L = -1;
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.K = null;
            }
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        if (this.A != null && ((this.f43346y || this.f43347z == 1) && actionMasked == 2 && !this.B && Math.abs(this.M - motionEvent.getY()) > this.A.E())) {
            this.A.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.B;
    }

    public final void p() {
        this.f43342u = 0.5f;
        if (this.H != null) {
            this.f43341t = (int) (0.5f * this.G);
        }
    }

    public final void q() {
        r();
    }

    public final void r() {
        View view;
        if (this.f43327f) {
            return;
        }
        this.f43327f = true;
        if (this.H != null) {
            int iS = s();
            if (this.f43324c) {
                this.f43343v = Math.max(this.G - iS, this.f43340s);
            } else {
                this.f43343v = this.G - iS;
            }
            if (this.f43347z != 4 || (view = (View) this.H.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public final int s() {
        int i10;
        if (this.f43327f) {
            return Math.min(Math.max(this.f43328g, this.G - ((this.F * 9) / 16)), this.E);
        }
        return (this.f43334m || (i10 = this.f43333l) <= 0) ? this.f43326e : Math.max(this.f43326e, i10 + this.f43329h);
    }

    public final void u(int i10) {
        if (((View) this.H.get()) == null || this.J.isEmpty()) {
            return;
        }
        int i11 = this.f43343v;
        if (i10 <= i11 && i11 != f()) {
            f();
        }
        for (int i12 = 0; i12 < this.J.size(); i12++) {
            ((g) this.J.get(i12)).getClass();
        }
    }

    public final void v(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        PaintDrawable paintDrawable = new PaintDrawable(typedValue.data);
        this.f43330i = paintDrawable;
        paintDrawable.setCornerRadius(25.0f);
    }

    public final void w(View view, int i10, boolean z10) {
        int iF;
        if (i10 == 3) {
            iF = f();
        } else if (i10 == 4) {
            iF = this.f43343v;
        } else if (i10 == 5) {
            iF = this.G;
        } else {
            if (i10 != 6) {
                throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
            }
            iF = this.f43341t;
        }
        androidx.customview.widget.d dVar = this.A;
        if (dVar == null || (!z10 ? dVar.X(view, view.getLeft(), iF) : dVar.V(view.getLeft(), iF))) {
            k(i10);
            return;
        }
        k(2);
        if (i10 != 2) {
            boolean z11 = i10 == 3;
            if (this.f43337p != z11) {
                this.f43337p = z11;
            }
        }
        j jVar = this.f43338q;
        WeakReference weakReference = jVar.f43275d.H;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        jVar.f43272a = i10;
        if (jVar.f43273b) {
            return;
        }
        z1.u1((View) jVar.f43275d.H.get(), jVar.f43274c);
        jVar.f43273b = true;
    }

    public final void x(boolean z10) {
        if (this.f43344w != z10) {
            this.f43344w = z10;
            if (!z10 && this.f43347z == 5) {
                h(4);
            }
            e();
        }
    }

    public final boolean y(View view, float f10) {
        if (this.f43345x) {
            return true;
        }
        if (view.getTop() < this.f43343v) {
            return false;
        }
        return Math.abs(((f10 * 0.1f) + ((float) view.getTop())) - ((float) this.f43343v)) / ((float) s()) > 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }
}
