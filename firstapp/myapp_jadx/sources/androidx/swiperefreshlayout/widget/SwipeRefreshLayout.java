package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import defpackage.fk30;
import defpackage.g9i0;
import defpackage.mo7;
import defpackage.ole0;
import defpackage.ple0;
import defpackage.plx;
import defpackage.qle0;
import defpackage.qlx;
import defpackage.r6i0;
import defpackage.rle0;
import defpackage.rlx;
import defpackage.slx;
import defpackage.tlx;
import defpackage.xn7;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements slx, rlx, plx {
    public static final int[] g0 = {R.attr.enabled};
    public boolean A;
    public final int B;
    public int C;
    public float D;
    public float E;
    public boolean F;
    public int G;
    public boolean H;
    public final DecelerateInterpolator I;
    public final xn7 J;
    public int K;
    public int L;
    public float M;
    public int N;
    public int O;
    public int P;
    public final mo7 Q;
    public ole0 R;
    public ple0 S;
    public qle0 T;
    public qle0 U;
    public rle0 V;
    public boolean W;
    public View a;
    public int a0;
    public f b;
    public boolean b0;
    public boolean c;
    public boolean c0;
    public final int d;
    public final a d0;
    public float e;
    public final c e0;
    public float f;
    public final d f0;
    public final tlx i;
    public final qlx v;
    public final int[] w;
    public final int[] y;
    public final int[] z;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            f fVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.c) {
                swipeRefreshLayout.f();
                return;
            }
            swipeRefreshLayout.Q.setAlpha(255);
            swipeRefreshLayout.Q.start();
            if (swipeRefreshLayout.W && (fVar = swipeRefreshLayout.b) != null) {
                fVar.i();
            }
            swipeRefreshLayout.C = swipeRefreshLayout.J.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.H) {
                return;
            }
            ple0 ple0Var = new ple0(swipeRefreshLayout);
            swipeRefreshLayout.S = ple0Var;
            ple0Var.setDuration(150L);
            xn7 xn7Var = swipeRefreshLayout.J;
            xn7Var.a = null;
            xn7Var.clearAnimation();
            swipeRefreshLayout.J.startAnimation(swipeRefreshLayout.S);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            boolean z = swipeRefreshLayout.b0;
            int iAbs = swipeRefreshLayout.O;
            if (!z) {
                iAbs -= Math.abs(swipeRefreshLayout.N);
            }
            int i = swipeRefreshLayout.L;
            swipeRefreshLayout.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout.J.getTop());
            mo7 mo7Var = swipeRefreshLayout.Q;
            float f2 = 1.0f - f;
            mo7.a aVar = mo7Var.a;
            if (f2 != aVar.p) {
                aVar.p = f2;
            }
            mo7Var.invalidateSelf();
        }
    }

    public class d extends Animation {
        public d() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.e(f);
        }
    }

    public interface e {
    }

    public interface f {
        void i();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.e = -1.0f;
        this.w = new int[2];
        this.y = new int[2];
        this.z = new int[2];
        this.G = -1;
        this.K = -1;
        this.d0 = new a();
        this.e0 = new c();
        this.f0 = new d();
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.B = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.I = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.a0 = (int) (displayMetrics.density * 40.0f);
        xn7 xn7Var = new xn7(getContext());
        float f2 = xn7Var.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = xn7Var.getContext().obtainStyledAttributes(fk30.a);
        xn7Var.b = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.l(xn7Var, f2 * 4.0f);
        shapeDrawable.getPaint().setColor(xn7Var.b);
        xn7Var.setBackground(shapeDrawable);
        this.J = xn7Var;
        mo7 mo7Var = new mo7(getContext());
        this.Q = mo7Var;
        mo7Var.c(1);
        this.J.setImageDrawable(this.Q);
        this.J.setVisibility(8);
        addView(this.J);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.O = i;
        this.e = i;
        this.i = new tlx();
        this.v = new qlx(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.a0;
        this.C = i2;
        this.N = i2;
        e(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g0);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.J.getBackground().setAlpha(i);
        this.Q.setAlpha(i);
    }

    public final boolean a() {
        View view = this.a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.J)) {
                    this.a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f2) {
        if (f2 > this.e) {
            g(true, true);
            return;
        }
        this.c = false;
        mo7 mo7Var = this.Q;
        mo7.a aVar = mo7Var.a;
        aVar.e = 0.0f;
        aVar.f = 0.0f;
        mo7Var.invalidateSelf();
        boolean z = this.H;
        b bVar = !z ? new b() : null;
        int i = this.C;
        xn7 xn7Var = this.J;
        if (z) {
            this.L = i;
            this.M = xn7Var.getScaleX();
            rle0 rle0Var = new rle0(this);
            this.V = rle0Var;
            rle0Var.setDuration(150L);
            if (bVar != null) {
                xn7Var.a = bVar;
            }
            xn7Var.clearAnimation();
            xn7Var.startAnimation(this.V);
        } else {
            this.L = i;
            d dVar = this.f0;
            dVar.reset();
            dVar.setDuration(200L);
            dVar.setInterpolator(this.I);
            if (bVar != null) {
                xn7Var.a = bVar;
            }
            xn7Var.clearAnimation();
            xn7Var.startAnimation(dVar);
        }
        mo7.a aVar2 = mo7Var.a;
        if (aVar2.n) {
            aVar2.n = false;
        }
        mo7Var.invalidateSelf();
    }

    public final void d(float f2) {
        float f3;
        qle0 qle0Var;
        qle0 qle0Var2;
        mo7 mo7Var = this.Q;
        mo7.a aVar = mo7Var.a;
        if (!aVar.n) {
            aVar.n = true;
        }
        mo7Var.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f2 / this.e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f2) - this.e;
        int i = this.P;
        if (i > 0) {
            f3 = i;
        } else {
            boolean z = this.b0;
            int i2 = this.O;
            if (z) {
                i2 -= this.N;
            }
            f3 = i2;
        }
        double dMax = Math.max(0.0f, Math.min(fAbs, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i3 = this.N + ((int) ((f3 * fMin) + (f3 * fPow * 2.0f)));
        xn7 xn7Var = this.J;
        if (xn7Var.getVisibility() != 0) {
            xn7Var.setVisibility(0);
        }
        if (!this.H) {
            xn7Var.setScaleX(1.0f);
            xn7Var.setScaleY(1.0f);
        }
        if (this.H) {
            setAnimationProgress(Math.min(1.0f, f2 / this.e));
        }
        if (f2 < this.e) {
            if (mo7Var.a.t > 76 && ((qle0Var2 = this.T) == null || !qle0Var2.hasStarted() || qle0Var2.hasEnded())) {
                qle0 qle0Var3 = new qle0(this, mo7Var.a.t, 76);
                qle0Var3.setDuration(300L);
                xn7Var.a = null;
                xn7Var.clearAnimation();
                xn7Var.startAnimation(qle0Var3);
                this.T = qle0Var3;
            }
        } else if (mo7Var.a.t < 255 && ((qle0Var = this.U) == null || !qle0Var.hasStarted() || qle0Var.hasEnded())) {
            qle0 qle0Var4 = new qle0(this, mo7Var.a.t, 255);
            qle0Var4.setDuration(300L);
            xn7Var.a = null;
            xn7Var.clearAnimation();
            xn7Var.startAnimation(qle0Var4);
            this.U = qle0Var4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        mo7.a aVar2 = mo7Var.a;
        aVar2.e = 0.0f;
        aVar2.f = fMin2;
        mo7Var.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        mo7.a aVar3 = mo7Var.a;
        if (fMin3 != aVar3.p) {
            aVar3.p = fMin3;
        }
        mo7Var.invalidateSelf();
        mo7Var.a.g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        mo7Var.invalidateSelf();
        setTargetOffsetTopAndBottom(i3 - this.C);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.v.a(f2, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.v.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.v.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.v.d(i, i2, i3, i4, iArr, 0, null);
    }

    public final void e(float f2) {
        int i = this.L;
        setTargetOffsetTopAndBottom((i + ((int) ((this.N - i) * f2))) - this.J.getTop());
    }

    public final void f() {
        this.J.clearAnimation();
        this.Q.stop();
        this.J.setVisibility(8);
        setColorViewAlpha(255);
        if (this.H) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.N - this.C);
        }
        this.C = this.J.getTop();
    }

    public final void g(boolean z, boolean z2) {
        if (this.c != z) {
            this.W = z2;
            b();
            this.c = z;
            xn7 xn7Var = this.J;
            a aVar = this.d0;
            if (!z) {
                ple0 ple0Var = new ple0(this);
                this.S = ple0Var;
                ple0Var.setDuration(150L);
                xn7Var.a = aVar;
                xn7Var.clearAnimation();
                xn7Var.startAnimation(this.S);
                return;
            }
            this.L = this.C;
            c cVar = this.e0;
            cVar.reset();
            cVar.setDuration(200L);
            cVar.setInterpolator(this.I);
            if (aVar != null) {
                xn7Var.a = aVar;
            }
            xn7Var.clearAnimation();
            xn7Var.startAnimation(cVar);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.K;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.i.a();
    }

    public int getProgressCircleDiameter() {
        return this.a0;
    }

    public int getProgressViewEndOffset() {
        return this.O;
    }

    public int getProgressViewStartOffset() {
        return this.N;
    }

    @Override // defpackage.rlx
    public final void h(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.v.f(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.v.d;
    }

    @Override // defpackage.rlx
    public final void j(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.rlx
    public final void k(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public final void l(float f2) {
        float f3 = this.E;
        float f4 = f2 - f3;
        float f5 = this.d;
        if (f4 <= f5 || this.F) {
            return;
        }
        this.D = f3 + f5;
        this.F = true;
        this.Q.setAlpha(76);
    }

    @Override // defpackage.slx
    public final void o(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.v.d(i, i2, i3, i4, this.y, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? this.y[1] + i4 : i7;
        if (i8 >= 0 || a()) {
            return;
        }
        float fAbs = this.f + Math.abs(i8);
        this.f = fAbs;
        d(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.c && !this.A) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.F = false;
                    this.G = -1;
                } else if (actionMasked == 2) {
                    int i = this.G;
                    if (i == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex >= 0) {
                        l(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.F = false;
                    this.G = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.G) {
                        this.G = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.F;
            }
            setTargetOffsetTopAndBottom(this.N - this.J.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.G = pointerId;
            this.F = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.E = motionEvent.getY(iFindPointerIndex2);
                return this.F;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.a == null) {
            b();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.J.getMeasuredWidth();
        int measuredHeight2 = this.J.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.C;
        this.J.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == null) {
            b();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.J.measure(View.MeasureSpec.makeMeasureSpec(this.a0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.a0, 1073741824));
        this.K = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.J) {
                this.K = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return this.v.a(f2, f3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.v.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        float f2;
        if (i2 > 0) {
            float f3 = this.f;
            if (f3 > 0.0f) {
                float f4 = i2;
                if (f4 > f3) {
                    iArr[1] = (int) f3;
                    this.f = 0.0f;
                    f2 = 0.0f;
                } else {
                    f2 = f3 - f4;
                    this.f = f2;
                    iArr[1] = i2;
                }
                d(f2);
            }
        }
        if (this.b0 && i2 > 0 && this.f == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.J.setVisibility(8);
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.w;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        o(view, i, i2, i3, i4, 0, this.z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.i.a = i;
        startNestedScroll(i & 2);
        this.f = 0.0f;
        this.A = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.i.a = 0;
        this.A = false;
        float f2 = this.f;
        if (f2 > 0.0f) {
            c(f2);
            this.f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.c && !this.A) {
            if (actionMasked == 0) {
                this.G = motionEvent.getPointerId(0);
                this.F = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.G);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.F) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.D) * 0.5f;
                    this.F = false;
                    c(y);
                }
                this.G = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.G);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                l(y2);
                if (this.F) {
                    float f2 = (y2 - this.D) * 0.5f;
                    if (f2 > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        d(f2);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.G) {
                            this.G = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.G = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rlx
    public final void p(View view, int i, int i2, int i3, int i4, int i5) {
        o(view, i, i2, i3, i4, i5, this.z);
    }

    @Override // defpackage.rlx
    public final boolean q(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.a;
        if (view != null) {
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            if (!r6i0.d.i(view)) {
                if (this.c0 || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f2) {
        this.J.setScaleX(f2);
        this.J.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        mo7 mo7Var = this.Q;
        mo7.a aVar = mo7Var.a;
        aVar.i = iArr;
        aVar.a(0);
        aVar.a(0);
        mo7Var.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        f();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.c0 = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.v.g(z);
    }

    public void setOnChildScrollUpCallback(e eVar) {
    }

    public void setOnRefreshListener(f fVar) {
        this.b = fVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.J.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.O = i;
        this.H = z;
        this.J.invalidate();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.H = z;
        this.N = i;
        this.O = i2;
        this.b0 = true;
        f();
        this.c = false;
    }

    public void setRefreshing(boolean z) {
        if (!z || this.c == z) {
            g(z, false);
            return;
        }
        this.c = z;
        boolean z2 = this.b0;
        int i = this.O;
        if (!z2) {
            i += this.N;
        }
        setTargetOffsetTopAndBottom(i - this.C);
        this.W = false;
        xn7 xn7Var = this.J;
        xn7Var.setVisibility(0);
        this.Q.setAlpha(255);
        ole0 ole0Var = new ole0(this);
        this.R = ole0Var;
        ole0Var.setDuration(this.B);
        a aVar = this.d0;
        if (aVar != null) {
            xn7Var.a = aVar;
        }
        xn7Var.clearAnimation();
        xn7Var.startAnimation(this.R);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.a0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.a0 = (int) (displayMetrics.density * 40.0f);
            }
            this.J.setImageDrawable(null);
            this.Q.c(i);
            this.J.setImageDrawable(this.Q);
        }
    }

    public void setSlingshotDistance(int i) {
        this.P = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        xn7 xn7Var = this.J;
        xn7Var.bringToFront();
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        xn7Var.offsetTopAndBottom(i);
        this.C = xn7Var.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.v.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.v.i(0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final boolean a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.a = z;
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }
}
