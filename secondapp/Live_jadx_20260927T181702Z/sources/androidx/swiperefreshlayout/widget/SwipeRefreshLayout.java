package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.m;
import f2.a1;
import f2.b1;
import f2.c1;
import f2.d1;
import f2.w0;
import f2.x0;
import f2.y0;
import f2.z0;
import f2.z1;
import k.h1;
import k.k;
import k.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class SwipeRefreshLayout extends ViewGroup implements b1, a1, x0, w0, c1, y0 {
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = -1;

    @h1
    public static final int U = 40;

    @h1
    public static final int V = 56;
    public static final String W = "SwipeRefreshLayout";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f19265a0 = 255;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f19266b0 = 76;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final float f19267c0 = 2.0f;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f19268d0 = -1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final float f19269e0 = 0.5f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final float f19270f0 = 0.8f;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f19271g0 = 150;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f19272h0 = 300;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f19273i0 = 200;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f19274j0 = 200;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f19275k0 = 64;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int[] f19276l0 = {R.attr.enabled};
    public int A;
    public int B;
    public int C;
    public androidx.swiperefreshlayout.widget.b D;
    public Animation E;
    public Animation F;
    public Animation G;
    public Animation H;
    public Animation I;
    public boolean J;
    public int K;
    public boolean L;
    public i M;
    public boolean N;
    public Animation.AnimationListener O;
    public final Animation P;
    public final Animation Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f19277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f19278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d1 f19283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z0 f19284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f19285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f19286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f19287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f19288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19290o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f19291p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f19292q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f19295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19296u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final DecelerateInterpolator f19297v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.swiperefreshlayout.widget.a f19298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f19299x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f19300y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f19301z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends Animation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f19306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f19307c;

        public d(int i10, int i11) {
            this.f19306b = i10;
            this.f19307c = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            androidx.swiperefreshlayout.widget.b bVar = SwipeRefreshLayout.this.D;
            int i10 = this.f19306b;
            bVar.setAlpha((int) (i10 + ((this.f19307c - i10) * f10)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f extends Animation {
        public f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.L ? swipeRefreshLayout.B - Math.abs(swipeRefreshLayout.A) : swipeRefreshLayout.B;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i10 = swipeRefreshLayout2.f19300y;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i10 + ((int) ((iAbs - i10) * f10))) - swipeRefreshLayout2.f19298w.getTop());
            SwipeRefreshLayout.this.D.u(1.0f - f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g extends Animation {
        public g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.l(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h extends Animation {
        public h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f19301z;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.l(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface i {
        boolean a(@NonNull SwipeRefreshLayout swipeRefreshLayout, @Nullable View view);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface j {
        void a();
    }

    public SwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }

    private void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f19294s) {
            this.f19294s = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f19298w.getBackground().setAlpha(i10);
        this.D.setAlpha(i10);
    }

    public final void A(int i10, Animation.AnimationListener animationListener) {
        this.f19300y = i10;
        this.f19301z = this.f19298w.getScaleX();
        h hVar = new h();
        this.I = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f19298w.c(animationListener);
        }
        this.f19298w.clearAnimation();
        this.f19298w.startAnimation(this.I);
    }

    public final void B(Animation.AnimationListener animationListener) {
        this.f19298w.setVisibility(0);
        this.D.setAlpha(255);
        b bVar = new b();
        this.E = bVar;
        bVar.setDuration(this.f19289n);
        if (animationListener != null) {
            this.f19298w.c(animationListener);
        }
        this.f19298w.clearAnimation();
        this.f19298w.startAnimation(this.E);
    }

    public final void a(int i10, Animation.AnimationListener animationListener) {
        this.f19300y = i10;
        this.P.reset();
        this.P.setDuration(200L);
        this.P.setInterpolator(this.f19297v);
        if (animationListener != null) {
            this.f19298w.c(animationListener);
        }
        this.f19298w.clearAnimation();
        this.f19298w.startAnimation(this.P);
    }

    public final void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f19295t) {
            A(i10, animationListener);
            return;
        }
        this.f19300y = i10;
        this.Q.reset();
        this.Q.setDuration(200L);
        this.Q.setInterpolator(this.f19297v);
        if (animationListener != null) {
            this.f19298w.c(animationListener);
        }
        this.f19298w.clearAnimation();
        this.f19298w.startAnimation(this.Q);
    }

    public boolean c() {
        i iVar = this.M;
        if (iVar != null) {
            return iVar.a(this, this.f19277b);
        }
        View view = this.f19277b;
        return view instanceof ListView ? m.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public final void d() {
        this.f19298w = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.D = bVar;
        bVar.E(1);
        this.f19298w.setImageDrawable(this.D);
        this.f19298w.setVisibility(8);
        addView(this.f19298w);
    }

    @Override // android.view.View, f2.y0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f19284i.a(f10, f11, z10);
    }

    @Override // android.view.View, f2.y0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f19284i.b(f10, f11);
    }

    @Override // f2.w0
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return i12 == 0 && dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    @Override // f2.x0
    public void dispatchNestedScroll(int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14, @NonNull int[] iArr2) {
        if (i14 == 0) {
            this.f19284i.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    public final void e() {
        if (this.f19277b == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f19298w)) {
                    this.f19277b = childAt;
                    return;
                }
            }
        }
    }

    public final void f(float f10) {
        if (f10 > this.f19281f) {
            u(true, true);
            return;
        }
        this.f19279d = false;
        this.D.B(0.0f, 0.0f);
        b(this.f19290o, !this.f19295t ? new e() : null);
        this.D.t(false);
    }

    public final boolean g(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f19299x;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        return i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup, f2.c1
    public int getNestedScrollAxes() {
        return this.f19283h.a();
    }

    public int getProgressCircleDiameter() {
        return this.K;
    }

    public int getProgressViewEndOffset() {
        return this.B;
    }

    public int getProgressViewStartOffset() {
        return this.A;
    }

    public boolean h() {
        return this.f19279d;
    }

    @Override // f2.w0
    public boolean hasNestedScrollingParent(int i10) {
        return i10 == 0 && hasNestedScrollingParent();
    }

    public final void i(float f10) {
        this.D.t(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f19281f));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f19281f;
        int i10 = this.C;
        if (i10 <= 0) {
            i10 = this.L ? this.B - this.A : this.B;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.A + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f19298w.getVisibility() != 0) {
            this.f19298w.setVisibility(0);
        }
        if (!this.f19295t) {
            this.f19298w.setScaleX(1.0f);
            this.f19298w.setScaleY(1.0f);
        }
        if (this.f19295t) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f19281f));
        }
        if (f10 < this.f19281f) {
            if (this.D.getAlpha() > 76 && !g(this.G)) {
                y();
            }
        } else if (this.D.getAlpha() < 255 && !g(this.H)) {
            x();
        }
        this.D.B(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.D.u(Math.min(1.0f, fMax));
        this.D.y((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f19290o);
    }

    @Override // android.view.View, f2.y0
    public boolean isNestedScrollingEnabled() {
        return this.f19284i.m();
    }

    @Override // f2.a1
    public void j(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // f2.a1
    public void k(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void l(float f10) {
        int i10 = this.f19300y;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.A - i10) * f10))) - this.f19298w.getTop());
    }

    @Override // f2.a1
    public void m(View view, int i10, int i11, int i12, int i13, int i14) {
        q(view, i10, i11, i12, i13, i14, this.f19287l);
    }

    @Override // f2.a1
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f19296u && actionMasked == 0) {
            this.f19296u = false;
        }
        if (!isEnabled() || this.f19296u || c() || this.f19279d || this.f19288m) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.A - this.f19298w.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f19294s = pointerId;
            this.f19293r = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f19292q = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f19293r = false;
            this.f19294s = -1;
        } else if (actionMasked == 2) {
            int i10 = this.f19294s;
            if (i10 == -1) {
                Log.e(W, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i10);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            w(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f19293r = false;
            this.f19294s = -1;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        return this.f19293r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f19277b == null) {
            e();
        }
        View view = this.f19277b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f19298w.getMeasuredWidth();
        int measuredHeight2 = this.f19298w.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f19290o;
        this.f19298w.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f19277b == null) {
            e();
        }
        View view = this.f19277b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f19298w.measure(View.MeasureSpec.makeMeasureSpec(this.K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.K, 1073741824));
        this.f19299x = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f19298w) {
                this.f19299x = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f19282g;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f19282g = 0.0f;
                } else {
                    this.f19282g = f10 - f11;
                    iArr[1] = i11;
                }
                i(this.f19282g);
            }
        }
        if (this.L && i11 > 0 && this.f19282g == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f19298w.setVisibility(8);
        }
        int[] iArr2 = this.f19285j;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        q(view, i10, i11, i12, i13, 0, this.f19287l);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f19283h.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f19282g = 0.0f;
        this.f19288m = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f19302b);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f19279d);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f19296u || this.f19279d || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public void onStopNestedScroll(View view) {
        this.f19283h.d(view);
        this.f19288m = false;
        float f10 = this.f19282g;
        if (f10 > 0.0f) {
            f(f10);
            this.f19282g = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f19296u && actionMasked == 0) {
            this.f19296u = false;
        }
        if (!isEnabled() || this.f19296u || c() || this.f19279d || this.f19288m) {
            return false;
        }
        if (actionMasked == 0) {
            this.f19294s = motionEvent.getPointerId(0);
            this.f19293r = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f19294s);
                if (iFindPointerIndex < 0) {
                    Log.e(W, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f19293r) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f19291p) * 0.5f;
                    this.f19293r = false;
                    f(y10);
                }
                this.f19294s = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f19294s);
                if (iFindPointerIndex2 < 0) {
                    Log.e(W, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                w(y11);
                if (this.f19293r) {
                    float f10 = (y11 - this.f19291p) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    i(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(W, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f19294s = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    n(motionEvent);
                }
            }
        }
        return true;
    }

    public void p() {
        this.f19298w.clearAnimation();
        this.D.stop();
        this.f19298w.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f19295t) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.A - this.f19290o);
        }
        this.f19290o = this.f19298w.getTop();
    }

    @Override // f2.b1
    public void q(@NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        dispatchNestedScroll(i10, i11, i12, i13, this.f19286k, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.f19286k[1] : i16;
        if (i17 >= 0 || c()) {
            return;
        }
        float fAbs = this.f19282g + Math.abs(i17);
        this.f19282g = fAbs;
        i(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // f2.a1
    public boolean r(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        View view = this.f19277b;
        if (view == null || z1.a1(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        } else {
            if (this.N || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void s(boolean z10, int i10) {
        this.B = i10;
        this.f19295t = z10;
        this.f19298w.invalidate();
    }

    public void setAnimationProgress(float f10) {
        this.f19298w.setScaleX(f10);
        this.f19298w.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(@k.m int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@k int... iArr) {
        e();
        this.D.x(iArr);
    }

    public void setColorSchemeResources(@k.m int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = f1.d.getColor(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f19281f = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        p();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.N = z10;
    }

    @Override // android.view.View, f2.y0
    public void setNestedScrollingEnabled(boolean z10) {
        this.f19284i.p(z10);
    }

    public void setOnChildScrollUpCallback(@Nullable i iVar) {
        this.M = iVar;
    }

    public void setOnRefreshListener(@Nullable j jVar) {
        this.f19278c = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(@k int i10) {
        this.f19298w.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(@k.m int i10) {
        setProgressBackgroundColorSchemeColor(f1.d.getColor(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f19279d == z10) {
            u(z10, false);
            return;
        }
        this.f19279d = z10;
        setTargetOffsetTopAndBottom((!this.L ? this.B + this.A : this.B) - this.f19290o);
        this.J = false;
        B(this.O);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.K = (int) (displayMetrics.density * 56.0f);
            } else {
                this.K = (int) (displayMetrics.density * 40.0f);
            }
            this.f19298w.setImageDrawable(null);
            this.D.E(i10);
            this.f19298w.setImageDrawable(this.D);
        }
    }

    public void setSlingshotDistance(@q0 int i10) {
        this.C = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.f19298w.bringToFront();
        z1.i1(this.f19298w, i10);
        this.f19290o = this.f19298w.getTop();
    }

    @Override // f2.w0
    public boolean startNestedScroll(int i10, int i11) {
        return i11 == 0 && startNestedScroll(i10);
    }

    @Override // f2.w0
    public void stopNestedScroll(int i10) {
        if (i10 == 0) {
            stopNestedScroll();
        }
    }

    public void t(boolean z10, int i10, int i11) {
        this.f19295t = z10;
        this.A = i10;
        this.B = i11;
        this.L = true;
        p();
        this.f19279d = false;
    }

    public final void u(boolean z10, boolean z11) {
        if (this.f19279d != z10) {
            this.J = z11;
            e();
            this.f19279d = z10;
            if (z10) {
                a(this.f19290o, this.O);
            } else {
                z(this.O);
            }
        }
    }

    public final Animation v(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f19298w.c(null);
        this.f19298w.clearAnimation();
        this.f19298w.startAnimation(dVar);
        return dVar;
    }

    public final void w(float f10) {
        float f11 = this.f19292q;
        float f12 = f10 - f11;
        int i10 = this.f19280e;
        if (f12 <= i10 || this.f19293r) {
            return;
        }
        this.f19291p = f11 + i10;
        this.f19293r = true;
        this.D.setAlpha(76);
    }

    public final void x() {
        this.H = v(this.D.getAlpha(), 255);
    }

    public final void y() {
        this.G = v(this.D.getAlpha(), 76);
    }

    public void z(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.F = cVar;
        cVar.setDuration(150L);
        this.f19298w.c(animationListener);
        this.f19298w.clearAnimation();
        this.f19298w.startAnimation(this.F);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19302b;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f19302b = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f19302b ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f19302b = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19279d = false;
        this.f19281f = -1.0f;
        this.f19285j = new int[2];
        this.f19286k = new int[2];
        this.f19287l = new int[2];
        this.f19294s = -1;
        this.f19299x = -1;
        this.O = new a();
        this.P = new f();
        this.Q = new g();
        this.f19280e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f19289n = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f19297v = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.K = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.B = i10;
        this.f19281f = i10;
        this.f19283h = new d1(this);
        this.f19284i = new z0(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.K;
        this.f19290o = i11;
        this.A = i11;
        l(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f19276l0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View, f2.y0
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f19284i.c(i10, i11, iArr, iArr2);
    }

    @Override // f2.w0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return i14 == 0 && this.f19284i.g(i10, i11, i12, i13, iArr, i14);
    }

    @Override // android.view.View, f2.y0
    public boolean hasNestedScrollingParent() {
        return this.f19284i.k();
    }

    @Override // android.view.View, f2.y0
    public boolean startNestedScroll(int i10) {
        return this.f19284i.r(i10);
    }

    @Override // android.view.View, f2.y0
    public void stopNestedScroll() {
        this.f19284i.t();
    }

    @Override // android.view.View, f2.y0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f19284i.f(i10, i11, i12, i13, iArr);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f19279d) {
                swipeRefreshLayout.p();
                return;
            }
            swipeRefreshLayout.D.setAlpha(255);
            SwipeRefreshLayout.this.D.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.J && (jVar = swipeRefreshLayout2.f19278c) != null) {
                jVar.a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f19290o = swipeRefreshLayout3.f19298w.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f19295t) {
                return;
            }
            swipeRefreshLayout.z(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
