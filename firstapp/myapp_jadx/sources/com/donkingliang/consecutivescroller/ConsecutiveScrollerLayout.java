package com.donkingliang.consecutivescroller;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.protobuf.Reader;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import defpackage.alf;
import defpackage.frh0;
import defpackage.g9i0;
import defpackage.jk30;
import defpackage.lcz;
import defpackage.mva;
import defpackage.osm;
import defpackage.plx;
import defpackage.qlx;
import defpackage.r6i0;
import defpackage.rlx;
import defpackage.tlx;
import defpackage.uts;
import defpackage.yr70;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConsecutiveScrollerLayout extends ViewGroup implements yr70, rlx, plx {
    public static final a v0 = new a();
    public int A;
    public final OverScroller B;
    public VelocityTracker C;
    public VelocityTracker D;
    public int E;
    public final int F;
    public final int G;
    public final int H;
    public int I;
    public int J;
    public int K;
    public final HashMap<Integer, Float> L;
    public final int[] M;
    public boolean N;
    public int O;
    public e P;
    public int Q;
    public final tlx R;
    public final qlx S;
    public final int[] T;
    public final int[] U;
    public View V;
    public int W;
    public int a;
    public int a0;
    public float b;
    public int b0;
    public boolean c;
    public int c0;
    public int d;
    public EdgeEffect d0;
    public int e;
    public EdgeEffect e0;
    public final int f;
    public int f0;
    public boolean g0;
    public boolean h0;
    public final lcz i;
    public boolean i0;
    public int j0;
    public int k0;
    public View l0;
    public final ArrayList m0;
    public final ArrayList n0;
    public int o0;
    public final ArrayList p0;
    public int q0;
    public int r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public ValueAnimator v;
    public c w;
    public final Handler y;
    public int z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public boolean a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int f;
        public a g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a a;
            public static final a b;
            public static final a c;
            public static final /* synthetic */ a[] d;

            static {
                a aVar = new a("LEFT", 0);
                a = aVar;
                a aVar2 = new a("RIGHT", 1);
                b = aVar2;
                a aVar3 = new a("CENTER", 2);
                c = aVar3;
                d = new a[]{aVar, aVar2, aVar3};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) d.clone();
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = true;
            this.b = true;
            this.c = false;
            this.d = false;
            this.e = false;
            this.f = -1;
            a aVar = a.a;
            this.g = aVar;
            TypedArray typedArrayObtainStyledAttributes = null;
            try {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jk30.b);
                    this.a = typedArrayObtainStyledAttributes.getBoolean(1, true);
                    this.b = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    this.c = typedArrayObtainStyledAttributes.getBoolean(4, false);
                    this.d = typedArrayObtainStyledAttributes.getBoolean(5, false);
                    this.e = typedArrayObtainStyledAttributes.getBoolean(3, false);
                    int i = typedArrayObtainStyledAttributes.getInt(0, 1);
                    if (i != 1) {
                        if (i == 2) {
                            aVar = a.b;
                        } else if (i == 3) {
                            aVar = a.c;
                        }
                    }
                    this.g = aVar;
                    this.f = typedArrayObtainStyledAttributes.getResourceId(6, -1);
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Exception e) {
                    e.printStackTrace();
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                }
            } catch (Throwable th) {
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
                throw th;
            }
        }
    }

    public static class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ RecyclerView a;

        public b(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Method method = com.donkingliang.consecutivescroller.a.a;
            RecyclerView recyclerView = this.a;
            if ("InterceptRequestLayout".equals(recyclerView.getTag())) {
                try {
                    Method declaredMethod = RecyclerView.class.getDeclaredMethod("v0", Boolean.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(recyclerView, Boolean.FALSE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public class c implements Runnable {
        public final int b;
        public float e;
        public int a = 0;
        public float d = 0.0f;
        public long c = AnimationUtils.currentAnimationTimeMillis();

        public c(float f, int i) {
            this.e = f;
            this.b = i;
            ConsecutiveScrollerLayout.this.y.postDelayed(this, 10L);
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConsecutiveScrollerLayout consecutiveScrollerLayout = ConsecutiveScrollerLayout.this;
            if (consecutiveScrollerLayout.w == this) {
                double d = this.e;
                int i = this.a + 1;
                this.a = i;
                this.e = (float) (Math.pow(0.8500000238418579d, i * 2) * d);
                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f = this.e * (((jCurrentAnimationTimeMillis - this.c) * 1.0f) / 1000.0f);
                if (Math.abs(f) < 1.0f) {
                    consecutiveScrollerLayout.w = null;
                    int scrollY = consecutiveScrollerLayout.getScrollY();
                    int i2 = this.b;
                    consecutiveScrollerLayout.a(scrollY, i2, consecutiveScrollerLayout.i, Math.min(Math.max((int) (Math.abs(scrollY - i2) / frh0.a), 30), 100) * 10);
                    return;
                }
                this.c = jCurrentAnimationTimeMillis;
                this.d += f;
                int scrollY2 = consecutiveScrollerLayout.getScrollY();
                consecutiveScrollerLayout.u(this.d);
                int i3 = consecutiveScrollerLayout.z;
                if (scrollY2 != i3) {
                    consecutiveScrollerLayout.x(i3, scrollY2);
                }
                consecutiveScrollerLayout.y.postDelayed(this, 10L);
            }
        }
    }

    public interface d {
    }

    public interface e {
        void a(int i);
    }

    public interface f {
    }

    public ConsecutiveScrollerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0.5f;
        this.f = 300;
        this.y = new Handler(Looper.getMainLooper());
        this.L = new HashMap<>();
        this.M = new int[2];
        this.N = false;
        this.O = 0;
        this.Q = -1;
        this.T = new int[2];
        this.U = new int[2];
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.m0 = new ArrayList();
        this.n0 = new ArrayList();
        this.o0 = 0;
        this.p0 = new ArrayList();
        this.q0 = 0;
        this.r0 = 0;
        this.s0 = false;
        this.t0 = false;
        this.u0 = false;
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jk30.a);
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                boolean z = typedArrayObtainStyledAttributes.getBoolean(6, false);
                this.c = z;
                if (z) {
                    int i2 = (int) ((180.0f * frh0.a) + 0.5f);
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, i2);
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, i2);
                }
            }
            this.g0 = typedArrayObtainStyledAttributes.getBoolean(3, false);
            this.h0 = typedArrayObtainStyledAttributes.getBoolean(2, false);
            this.k0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, 0);
            this.i0 = typedArrayObtainStyledAttributes.getBoolean(1, false);
            this.j0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            this.B = new OverScroller(getContext(), v0);
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.F = viewConfiguration.getScaledMaximumFlingVelocity();
            this.G = viewConfiguration.getScaledMinimumFlingVelocity();
            this.H = ViewConfiguration.getTouchSlop();
            setWillNotDraw(false);
            setVerticalScrollBarEnabled(true);
            this.R = new tlx();
            this.S = new qlx(this);
            setNestedScrollingEnabled(true);
            setChildrenDrawingOrderEnabled(true);
            setMotionEventSplittingEnabled(false);
            this.i = new lcz();
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }

    public static void A(View view) {
        int iC;
        do {
            iC = 0;
            int iMin = (com.donkingliang.consecutivescroller.a.k(view) && com.donkingliang.consecutivescroller.a.b(-1, view)) ? Math.min(-com.donkingliang.consecutivescroller.a.c(view), -1) : 0;
            if (iMin < 0) {
                int iC2 = com.donkingliang.consecutivescroller.a.c(view);
                y(iMin, view);
                iC = iC2 - com.donkingliang.consecutivescroller.a.c(view);
            }
        } while (iC != 0);
    }

    private int getAdjustHeight() {
        List<View> stickyChildren = getStickyChildren();
        int measuredHeight = this.j0;
        int size = stickyChildren.size();
        if (this.g0) {
            for (int i = 0; i < size; i++) {
                View view = stickyChildren.get(i);
                if (!r(view)) {
                    measuredHeight = view.getMeasuredHeight() + measuredHeight;
                }
            }
            return measuredHeight;
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            View view2 = stickyChildren.get(i2);
            if (!r(view2)) {
                return view2.getMeasuredHeight() + measuredHeight;
            }
        }
        return measuredHeight;
    }

    private View getBottomView() {
        List<View> effectiveChildren = getEffectiveChildren();
        if (effectiveChildren.isEmpty()) {
            return null;
        }
        return (View) uts.a(1, effectiveChildren);
    }

    private List<View> getEffectiveChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && childAt.getHeight() > 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private List<View> getNonGoneChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, computeVerticalScrollRange() - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    private List<View> getStickyChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && s(childAt)) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private int getStickyY() {
        return getPaddingTop() + getScrollY() + this.k0;
    }

    public static boolean r(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            return ((LayoutParams) layoutParams).e;
        }
        return false;
    }

    public static boolean s(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            return ((LayoutParams) layoutParams).c;
        }
        return false;
    }

    public static void z(View view) {
        int iC;
        do {
            int iG = com.donkingliang.consecutivescroller.a.g(view);
            if (iG > 0) {
                int iC2 = com.donkingliang.consecutivescroller.a.c(view);
                y(iG, view);
                iC = iC2 - com.donkingliang.consecutivescroller.a.c(view);
            } else {
                iC = 0;
            }
        } while (iC != 0);
    }

    public final void B(int i) {
        if (i >= 0 || Math.abs(i) <= Math.abs(this.e)) {
            int i2 = this.A;
            if (i > i2 && i > Math.abs(this.d) + i2) {
                int i3 = this.d;
                int i4 = this.A;
                if (i3 > 0) {
                    i4 += i3;
                }
                i = i4;
            }
        } else {
            int i5 = this.e;
            i = i5 <= 0 ? 0 : -i5;
        }
        super.scrollTo(0, i);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    public final void C(View view) {
        byte b2;
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild != -1) {
            int top = view.getTop() - g(view);
            if (getPaddingTop() + getScrollY() > top) {
                b2 = -1;
            } else {
                if (getPaddingTop() + getScrollY() < top) {
                    b2 = 1;
                } else if (com.donkingliang.consecutivescroller.a.b(-1, view)) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
            }
            if (b2 != 0) {
                this.a0 = iIndexOfChild;
                E();
                setScrollState(2);
                do {
                    if (b2 < 0) {
                        c(-200);
                    } else {
                        c(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
                    }
                    this.c0++;
                } while (this.a0 != -1);
            }
        }
    }

    public final void D(View view) {
        int iIndexOfChild = indexOfChild(view);
        byte b2 = -1;
        if (iIndexOfChild != -1) {
            int top = view.getTop() - g(view);
            if (getPaddingTop() + getScrollY() <= top) {
                if (getPaddingTop() + getScrollY() < top) {
                    b2 = 1;
                } else if (!com.donkingliang.consecutivescroller.a.b(-1, view)) {
                    b2 = 0;
                }
            }
            if (b2 != 0) {
                this.a0 = iIndexOfChild;
                E();
                setScrollState(2);
                if (b2 < 0) {
                    this.b0 = -50;
                } else {
                    this.b0 = 50;
                }
                invalidate();
            }
        }
    }

    public final void E() {
        OverScroller overScroller = this.B;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.abortAnimation();
        this.S.i(1);
        if (this.a0 == -1) {
            setScrollState(0);
        }
    }

    public final void a(int i, int i2, lcz lczVar, int i3) {
        if (i != i2) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                this.v.cancel();
                this.v = null;
            }
            this.w = null;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
            this.v = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(i3);
            this.v.setInterpolator(lczVar);
            this.v.addListener(new mva(this));
            this.v.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lva
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ConsecutiveScrollerLayout.a aVar = ConsecutiveScrollerLayout.v0;
                    int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    ConsecutiveScrollerLayout consecutiveScrollerLayout = this.a;
                    int iComputeVerticalScrollOffset = consecutiveScrollerLayout.computeVerticalScrollOffset();
                    consecutiveScrollerLayout.B(iIntValue);
                    int iComputeVerticalScrollOffset2 = consecutiveScrollerLayout.computeVerticalScrollOffset();
                    consecutiveScrollerLayout.z = iComputeVerticalScrollOffset2;
                    if (iComputeVerticalScrollOffset != iComputeVerticalScrollOffset2) {
                        consecutiveScrollerLayout.x(iComputeVerticalScrollOffset2, iComputeVerticalScrollOffset);
                    }
                }
            });
            this.v.setStartDelay(0L);
            this.v.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        List<View> scrolledViews;
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
        }
        super.addView(view, i, layoutParams);
        if (com.donkingliang.consecutivescroller.a.k(view)) {
            View viewH = com.donkingliang.consecutivescroller.a.h(view);
            viewH.setVerticalScrollBarEnabled(false);
            viewH.setHorizontalScrollBarEnabled(false);
            viewH.setOverScrollMode(2);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.m(viewH, false);
            if ((viewH instanceof osm) && (scrolledViews = ((osm) viewH).getScrolledViews()) != null && !scrolledViews.isEmpty()) {
                int size = scrolledViews.size();
                for (int i2 = 0; i2 < size; i2++) {
                    View view2 = scrolledViews.get(i2);
                    view2.setVerticalScrollBarEnabled(false);
                    view2.setHorizontalScrollBarEnabled(false);
                    view2.setOverScrollMode(2);
                    WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                    r6i0.d.m(view2, false);
                }
            }
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipToPadding(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(boolean z) {
        int iComputeVerticalScrollOffset;
        if (!this.N && this.B.isFinished() && this.a0 == -1) {
            int iComputeVerticalScrollOffset2 = computeVerticalScrollOffset();
            View viewE = e();
            if (viewE == null) {
                return;
            }
            int iIndexOfChild = indexOfChild(viewE);
            if (z) {
                while (true) {
                    int iG = com.donkingliang.consecutivescroller.a.g(viewE);
                    int top = viewE.getTop() - getScrollY();
                    if (iG <= 0 || top >= 0) {
                        break;
                    }
                    int iMin = Math.min(iG, -top);
                    B(getScrollY() - iMin);
                    y(iMin, viewE);
                }
            }
            for (int i = 0; i < iIndexOfChild; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8 && com.donkingliang.consecutivescroller.a.k(childAt)) {
                    View viewH = com.donkingliang.consecutivescroller.a.h(childAt);
                    if (viewH instanceof osm) {
                        List<View> scrolledViews = ((osm) viewH).getScrolledViews();
                        if (scrolledViews != null && !scrolledViews.isEmpty()) {
                            int size = scrolledViews.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                z(scrolledViews.get(i2));
                            }
                        }
                    } else {
                        z(viewH);
                    }
                }
            }
            while (true) {
                iIndexOfChild++;
                if (iIndexOfChild >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(iIndexOfChild);
                if (childAt2.getVisibility() != 8 && com.donkingliang.consecutivescroller.a.k(childAt2) && (iIndexOfChild != getChildCount() - 1 || childAt2.getHeight() >= getHeight() || getScrollY() < this.A)) {
                    View viewH2 = com.donkingliang.consecutivescroller.a.h(childAt2);
                    if (viewH2 instanceof osm) {
                        List<View> scrolledViews2 = ((osm) viewH2).getScrolledViews();
                        if (scrolledViews2 != null && !scrolledViews2.isEmpty()) {
                            int size2 = scrolledViews2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                A(scrolledViews2.get(i3));
                            }
                        }
                    } else {
                        A(viewH2);
                    }
                }
            }
            this.z = computeVerticalScrollOffset();
            if (z && iComputeVerticalScrollOffset2 != (iComputeVerticalScrollOffset = computeVerticalScrollOffset())) {
                x(iComputeVerticalScrollOffset, iComputeVerticalScrollOffset2);
            }
            w();
        }
    }

    public final void c(int i) {
        int top;
        int iC;
        int i2;
        int iMax;
        int i3;
        View bottomView;
        int top2;
        int i4;
        int iAbs;
        int[] iArr = this.T;
        int i5 = 1000;
        OverScroller overScroller = this.B;
        if (i > 0) {
            int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
            int i6 = i;
            do {
                int i7 = this.a0;
                if (i7 != -1) {
                    View childAt = getChildAt(i7);
                    top2 = childAt.getTop() - g(childAt);
                    if (this.c0 < 1000) {
                        if (getPaddingTop() + getScrollY() >= top2 || m()) {
                        }
                    }
                    this.a0 = -1;
                    this.b0 = 0;
                    this.c0 = 0;
                    setScrollState(0);
                    break;
                }
                top2 = 0;
                int scrollY = getScrollY();
                if (!m() && scrollY >= 0) {
                    View viewE = getScrollY() < this.A ? e() : getBottomView();
                    if (viewE != null) {
                        awakenScrollBars();
                        int iG = com.donkingliang.consecutivescroller.a.g(viewE);
                        if (iG > 0) {
                            iAbs = Math.min(i6, iG);
                            if (this.a0 != -1) {
                                iAbs = Math.min(iAbs, top2 - (getPaddingTop() + getScrollY()));
                            }
                            y(iAbs, viewE);
                        } else {
                            int iMin = Math.min(i6, (viewE.getBottom() - getPaddingTop()) - getScrollY());
                            int iMin2 = this.a0 != -1 ? Math.min(iMin, top2 - (getPaddingTop() + getScrollY())) : iMin;
                            B(scrollY + iMin2);
                            iAbs = iMin2;
                        }
                        this.z += iAbs;
                        i6 -= iAbs;
                    } else {
                        iAbs = 0;
                    }
                } else if (this.N) {
                    if (scrollY >= 0 || i6 <= Math.abs(scrollY)) {
                        this.S.d(0, 0, 0, i6, this.T, 0, null);
                        if (iArr[1] == 0 && this.c && this.d >= 0) {
                            u(i6);
                        }
                        iAbs = 0;
                        i6 = 0;
                    } else {
                        iAbs = i6 - Math.abs(scrollY);
                        i6 -= iAbs;
                        u(iAbs);
                    }
                } else if (overScroller.isFinished() || overScroller.getFinalY() <= 0 || scrollY >= 0) {
                    if (scrollY < 0) {
                        overScroller.forceFinished(true);
                    }
                    iAbs = 0;
                } else {
                    if (this.v != null) {
                        i(0);
                    }
                    if (i6 > Math.abs(scrollY)) {
                        int iAbs2 = i6 - Math.abs(scrollY);
                        int i8 = i6 - iAbs2;
                        i6 = iAbs2;
                        i4 = i8;
                    } else {
                        i4 = 0;
                    }
                    this.z += i6;
                    B(scrollY + i6);
                    iAbs = i6;
                    i6 = i4;
                }
                if (iAbs <= 0) {
                    break;
                }
            } while (i6 > 0);
            int iComputeVerticalScrollOffset2 = computeVerticalScrollOffset();
            if (iComputeVerticalScrollOffset != iComputeVerticalScrollOffset2) {
                x(iComputeVerticalScrollOffset2, iComputeVerticalScrollOffset);
                return;
            }
            return;
        }
        if (i < 0) {
            int iComputeVerticalScrollOffset3 = computeVerticalScrollOffset();
            int i9 = i;
            while (true) {
                int i10 = this.a0;
                if (i10 != -1) {
                    View childAt2 = getChildAt(i10);
                    top = childAt2.getTop() - g(childAt2);
                    int childCount = getChildCount();
                    iC = 0;
                    for (int i11 = this.a0; i11 < childCount; i11++) {
                        View childAt3 = getChildAt(i11);
                        if (childAt3.getVisibility() != 8 && com.donkingliang.consecutivescroller.a.k(childAt3)) {
                            iC += com.donkingliang.consecutivescroller.a.c(childAt3);
                        }
                    }
                    if (this.c0 < i5) {
                        if (getPaddingTop() + getScrollY() + iC <= top || n()) {
                        }
                    }
                    this.a0 = -1;
                    this.b0 = 0;
                    this.c0 = 0;
                    setScrollState(0);
                    break;
                }
                top = 0;
                iC = 0;
                int scrollY2 = getScrollY();
                if (!n() && scrollY2 <= (i3 = this.A) && scrollY2 >= 0) {
                    if (scrollY2 < i3) {
                        int scrollY3 = getScrollY() + (getHeight() - getPaddingBottom());
                        List<View> effectiveChildren = getEffectiveChildren();
                        int size = effectiveChildren.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                bottomView = null;
                                break;
                            }
                            bottomView = effectiveChildren.get(i12);
                            if (bottomView.getTop() < scrollY3 && bottomView.getBottom() >= scrollY3) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    } else {
                        bottomView = getBottomView();
                    }
                    View view = bottomView;
                    if (view != null) {
                        awakenScrollBars();
                        int iMin3 = (com.donkingliang.consecutivescroller.a.k(view) && com.donkingliang.consecutivescroller.a.b(-1, view)) ? Math.min(-com.donkingliang.consecutivescroller.a.c(view), -1) : 0;
                        if (iMin3 < 0) {
                            iMax = Math.max(i9, iMin3);
                            if (this.a0 != -1) {
                                iMax = Math.max(iMax, top - ((getPaddingTop() + getScrollY()) + iC));
                            }
                            y(iMax, view);
                        } else {
                            int iMax2 = Math.max(Math.max(i9, ((getPaddingBottom() + view.getTop()) - scrollY2) - getHeight()), -scrollY2);
                            if (this.a0 != -1) {
                                iMax2 = Math.max(iMax2, top - ((getPaddingTop() + getScrollY()) + iC));
                            }
                            B(scrollY2 + iMax2);
                            iMax = iMax2;
                        }
                        this.z += iMax;
                        i9 -= iMax;
                    } else {
                        iMax = 0;
                    }
                } else if (this.N) {
                    int i13 = this.A;
                    int i14 = scrollY2 - i13;
                    if (scrollY2 <= i13 || Math.abs(i9) <= i14) {
                        this.S.d(0, 0, 0, i9, this.T, 0, null);
                        int i15 = i9 + iArr[1];
                        if (i15 != 0) {
                            u(i15);
                        }
                        iMax = 0;
                        i9 = 0;
                    } else {
                        int i16 = -i14;
                        i9 -= i16;
                        u(i16);
                        iMax = i16;
                    }
                } else {
                    if (!overScroller.isFinished()) {
                        int finalY = overScroller.getFinalY();
                        int i17 = this.A;
                        if (finalY < i17 && scrollY2 > i17) {
                            if (this.v != null) {
                                i(0);
                            }
                            int i18 = this.A - scrollY2;
                            if (i9 < i18) {
                                int i19 = i9 - i18;
                                i9 = i18;
                                i2 = i19;
                            } else {
                                i2 = 0;
                            }
                            this.z += i9;
                            B(scrollY2 + i9);
                            iMax = i9;
                            i9 = i2;
                        }
                    }
                    if (scrollY2 > this.A) {
                        overScroller.forceFinished(true);
                    }
                    iMax = 0;
                }
                if (iMax >= 0 || i9 >= 0) {
                    break;
                } else {
                    i5 = 1000;
                }
            }
            int iComputeVerticalScrollOffset4 = computeVerticalScrollOffset();
            if (iComputeVerticalScrollOffset3 != iComputeVerticalScrollOffset4) {
                x(iComputeVerticalScrollOffset4, iComputeVerticalScrollOffset3);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return !(i > 0 ? m() : n());
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        int i;
        if (this.a0 != -1 && (i = this.b0) != 0) {
            if (i > 0 && i < 200) {
                i += 5;
                this.b0 = i;
            }
            if (i < 0 && i > -200) {
                i -= 5;
                this.b0 = i;
            }
            c(i);
            this.c0++;
            invalidate();
            return;
        }
        OverScroller overScroller = this.B;
        if (overScroller.computeScrollOffset()) {
            int currY = overScroller.getCurrY();
            int i2 = currY - this.f0;
            this.f0 = currY;
            int[] iArr = this.U;
            iArr[1] = 0;
            this.S.c(0, i2, 1, iArr, null);
            int i3 = i2 - iArr[1];
            int i4 = this.z;
            c(i3);
            int i5 = this.z - i4;
            int i6 = i3 - i5;
            if ((i6 < 0 && n()) || (i6 > 0 && m())) {
                this.S.d(0, i5, 0, i6, this.T, 1, null);
                i6 += this.T[1];
            }
            if ((i6 < 0 && n()) || (i6 > 0 && m())) {
                if (this.c) {
                    float currVelocity = overScroller.getFinalY() > 0 ? overScroller.getCurrVelocity() : -overScroller.getCurrVelocity();
                    if (this.v == null) {
                        if (currVelocity < 0.0f && this.e > 0) {
                            this.w = new c(currVelocity, 0);
                        } else if (currVelocity > 0.0f && this.d > 0) {
                            this.w = new c(currVelocity, this.A);
                        }
                    }
                    overScroller.forceFinished(true);
                } else {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) {
                        d();
                        if (i6 < 0) {
                            if (this.d0.isFinished()) {
                                this.d0.onAbsorb((int) overScroller.getCurrVelocity());
                            }
                        } else if (this.e0.isFinished()) {
                            this.e0.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    }
                    E();
                }
            }
            invalidate();
        }
        if (this.r0 == 2 && overScroller.isFinished()) {
            this.S.i(1);
            b(false);
            setScrollState(0);
        }
    }

    @Override // android.view.View, defpackage.yr70
    public final int computeVerticalScrollExtent() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.View, defpackage.yr70
    public final int computeVerticalScrollOffset() {
        int scrollY = getScrollY();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        for (int i = 0; i < size; i++) {
            View view = nonGoneChildren.get(i);
            if (com.donkingliang.consecutivescroller.a.k(view)) {
                scrollY = com.donkingliang.consecutivescroller.a.c(view) + scrollY;
            }
        }
        return scrollY;
    }

    @Override // android.view.View, defpackage.yr70
    public final int computeVerticalScrollRange() {
        int height;
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            View view = nonGoneChildren.get(i2);
            if (com.donkingliang.consecutivescroller.a.k(view) && com.donkingliang.consecutivescroller.a.k(view) && (com.donkingliang.consecutivescroller.a.b(1, view) || com.donkingliang.consecutivescroller.a.b(-1, view))) {
                View viewI = com.donkingliang.consecutivescroller.a.i(view);
                height = viewI.getPaddingBottom() + viewI.getPaddingTop() + com.donkingliang.consecutivescroller.a.d(viewI);
            } else {
                height = view.getHeight();
            }
            i = height + i;
        }
        return i;
    }

    public final void d() {
        if (getOverScrollMode() == 2) {
            this.d0 = null;
            this.e0 = null;
        } else if (this.d0 == null) {
            Context context = getContext();
            this.d0 = new EdgeEffect(context);
            this.e0 = new EdgeEffect(context);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.S.a(f2, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.S.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.S.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.S.d(i, i2, i3, i4, iArr, 0, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0222  */
    /* JADX WARN: Code duplicated, block: B:103:0x0245  */
    /* JADX WARN: Code duplicated, block: B:107:0x0260  */
    /* JADX WARN: Code duplicated, block: B:112:0x0273  */
    /* JADX WARN: Code duplicated, block: B:117:0x0281  */
    /* JADX WARN: Code duplicated, block: B:120:0x0291  */
    /* JADX WARN: Code duplicated, block: B:122:0x029f  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:149:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:152:0x032a  */
    /* JADX WARN: Code duplicated, block: B:153:0x0331  */
    /* JADX WARN: Code duplicated, block: B:157:0x035a  */
    /* JADX WARN: Code duplicated, block: B:161:0x0369  */
    /* JADX WARN: Code duplicated, block: B:162:0x036e  */
    /* JADX WARN: Code duplicated, block: B:168:0x038b  */
    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:170:0x039c  */
    /* JADX WARN: Code duplicated, block: B:173:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:? A[LOOP:0: B:33:0x00c7->B:174:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[LOOP:1: B:47:0x0139->B:177:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[LOOP:2: B:105:0x025a->B:180:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x02a5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[LOOP:4: B:155:0x0354->B:187:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:49:0x013f  */
    /* JADX WARN: Code duplicated, block: B:53:0x014e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0153  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:59:0x016f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0183  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0200  */
    /* JADX WARN: Code duplicated, block: B:93:0x0206  */
    /* JADX WARN: Code duplicated, block: B:96:0x020c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEventObtain;
        int actionMasked;
        View view;
        int[] iArr;
        boolean z;
        VelocityTracker velocityTracker;
        int iF;
        int i;
        boolean zK;
        int actionMasked2;
        VelocityTracker velocityTracker2;
        VelocityTracker velocityTracker3;
        int iE;
        int iF2;
        boolean z2;
        ArrayList arrayList;
        int size;
        int i2;
        boolean z3;
        int i3;
        View view2;
        int iFindPointerIndex;
        VelocityTracker velocityTrackerObtain;
        int y;
        int x;
        boolean z4;
        int i4;
        int i5;
        int iFindPointerIndex2;
        int iF3;
        int i6;
        boolean zK2;
        VelocityTracker velocityTrackerObtain2;
        VelocityTracker velocityTrackerObtain3;
        int i7;
        int iF4;
        int i8;
        boolean zK3;
        int i9;
        int actionIndex = motionEvent.getActionIndex();
        int i10 = this.O;
        HashMap<Integer, Float> map = this.L;
        if (i10 != 2 || (i9 = this.Q) == -1 || map.get(Integer.valueOf(i9)) == null) {
            motionEventObtain = MotionEvent.obtain(motionEvent);
            if (motionEventObtain.getActionMasked() == 0) {
                this.q0 = 0;
            }
            motionEventObtain.offsetLocation(0.0f, this.q0);
            i(motionEventObtain.getAction());
            actionMasked = motionEvent.getActionMasked();
            view = null;
            iArr = this.M;
            if (actionMasked != 0) {
                if (this.r0 == 2) {
                    z = true;
                } else {
                    z = false;
                }
                this.u0 = z;
                E();
                this.N = true;
                b(false);
                this.O = 0;
                int pointerId = motionEvent.getPointerId(actionIndex);
                this.Q = pointerId;
                map.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getY(actionIndex)));
                this.K = (int) motionEvent.getY(actionIndex);
                this.J = (int) motionEvent.getX(actionIndex);
                velocityTracker = this.D;
                if (velocityTracker == null) {
                    this.D = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.D.addMovement(motionEventObtain);
                this.S.h(2, 0);
                iArr[0] = com.donkingliang.consecutivescroller.a.e(this, motionEvent, actionIndex);
                iF = com.donkingliang.consecutivescroller.a.f(this, motionEvent, actionIndex);
                iArr[1] = iF;
                i = iArr[0];
                for (View view3 : getNonGoneChildren()) {
                    if (com.donkingliang.consecutivescroller.a.m(view3, i, iF)) {
                        view = view3;
                        break;
                    }
                }
                if (view != null) {
                    zK = com.donkingliang.consecutivescroller.a.k(view);
                } else {
                    zK = false;
                }
                this.t0 = zK;
                this.s0 = com.donkingliang.consecutivescroller.a.l(this, iArr[0], iArr[1]);
            } else if (actionMasked == 1) {
                velocityTracker2 = this.D;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEventObtain);
                    VelocityTracker velocityTracker4 = this.D;
                    int i11 = this.F;
                    velocityTracker4.computeCurrentVelocity(1000, i11);
                    int yVelocity = (int) this.D.getYVelocity();
                    this.E = Math.max(-i11, Math.min(yVelocity, i11));
                    velocityTracker3 = this.D;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.D = null;
                    }
                    iE = com.donkingliang.consecutivescroller.a.e(this, motionEvent, actionIndex);
                    iF2 = com.donkingliang.consecutivescroller.a.f(this, motionEvent, actionIndex);
                    for (View view4 : getNonGoneChildren()) {
                        if (com.donkingliang.consecutivescroller.a.m(view4, iE, iF2)) {
                            view = view4;
                            break;
                        }
                    }
                    if (com.donkingliang.consecutivescroller.a.k(view) || !(com.donkingliang.consecutivescroller.a.b(1, view) || com.donkingliang.consecutivescroller.a.b(-1, view))) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    arrayList = new ArrayList();
                    com.donkingliang.consecutivescroller.a.a(arrayList, this, iE, iF2);
                    size = arrayList.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            z3 = false;
                            break;
                        }
                        Object obj = arrayList.get(i2);
                        i2++;
                        view2 = (View) obj;
                        if (!view2.canScrollHorizontally(1) || view2.canScrollHorizontally(-1)) {
                            z3 = true;
                            break;
                        }
                    }
                    i3 = this.O;
                    int i12 = this.G;
                    if (i3 != 1 && z2 && Math.abs(yVelocity) >= i12 && !z3) {
                        motionEvent.setAction(3);
                    }
                    if (this.O != 1 && !com.donkingliang.consecutivescroller.a.j(this) && l(motionEvent) && Math.abs(yVelocity) >= i12 && (this.O == 0 || !z3)) {
                        f(-this.E);
                    }
                }
                this.K = 0;
                this.J = 0;
                this.N = false;
                iArr[0] = 0;
                iArr[1] = 0;
                this.s0 = false;
                this.t0 = false;
                v();
            } else if (actionMasked != 2) {
                iFindPointerIndex = motionEvent.findPointerIndex(this.Q);
                if (iFindPointerIndex >= 0 && iFindPointerIndex < motionEvent.getPointerCount()) {
                    velocityTrackerObtain = this.D;
                    if (velocityTrackerObtain == null) {
                        velocityTrackerObtain = VelocityTracker.obtain();
                        this.D = velocityTrackerObtain;
                    }
                    velocityTrackerObtain.addMovement(motionEventObtain);
                    y = ((int) motionEvent.getY(iFindPointerIndex)) - this.K;
                    x = ((int) motionEvent.getX(iFindPointerIndex)) - this.J;
                    if (this.O == 0 && (this.t0 || l(motionEvent))) {
                        z4 = this.h0;
                        i4 = this.H;
                        if (z4) {
                            if (Math.abs(y) >= i4) {
                                this.O = 1;
                            }
                        } else if (Math.abs(x) > Math.abs(y)) {
                            if (Math.abs(x) >= i4) {
                                this.O = 2;
                                i5 = this.Q;
                                if (i5 != -1 && map.get(Integer.valueOf(i5)) != null && (iFindPointerIndex2 = motionEvent.findPointerIndex(this.Q)) >= 0 && iFindPointerIndex < motionEvent.getPointerCount()) {
                                    motionEvent.offsetLocation(0.0f, map.get(Integer.valueOf(this.Q)).floatValue() - motionEvent.getY(iFindPointerIndex2));
                                }
                            }
                        } else if (Math.abs(y) >= i4) {
                            this.O = 1;
                        }
                        if (this.O == 0) {
                            return true;
                        }
                    }
                    this.K = (int) motionEvent.getY(iFindPointerIndex);
                    this.J = (int) motionEvent.getX(iFindPointerIndex);
                }
            } else if (actionMasked != 3) {
                velocityTracker2 = this.D;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEventObtain);
                    VelocityTracker velocityTracker5 = this.D;
                    int i13 = this.F;
                    velocityTracker5.computeCurrentVelocity(1000, i13);
                    int yVelocity2 = (int) this.D.getYVelocity();
                    this.E = Math.max(-i13, Math.min(yVelocity2, i13));
                    velocityTracker3 = this.D;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.D = null;
                    }
                    iE = com.donkingliang.consecutivescroller.a.e(this, motionEvent, actionIndex);
                    iF2 = com.donkingliang.consecutivescroller.a.f(this, motionEvent, actionIndex);
                    while (r7.hasNext()) {
                        if (com.donkingliang.consecutivescroller.a.m(view4, iE, iF2)) {
                            view = view4;
                            break;
                        }
                    }
                    if (com.donkingliang.consecutivescroller.a.k(view)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    arrayList = new ArrayList();
                    com.donkingliang.consecutivescroller.a.a(arrayList, this, iE, iF2);
                    size = arrayList.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            z3 = false;
                            break;
                        }
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        view2 = (View) obj2;
                        if (!view2.canScrollHorizontally(1)) {
                        }
                        z3 = true;
                        break;
                    }
                    i3 = this.O;
                    int i14 = this.G;
                    if (i3 != 1) {
                        motionEvent.setAction(3);
                    }
                    if (this.O != 1) {
                        f(-this.E);
                    }
                }
                this.K = 0;
                this.J = 0;
                this.N = false;
                iArr[0] = 0;
                iArr[1] = 0;
                this.s0 = false;
                this.t0 = false;
                v();
            } else if (actionMasked != 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                this.Q = pointerId2;
                map.put(Integer.valueOf(pointerId2), Float.valueOf(motionEvent.getY(actionIndex)));
                this.K = (int) motionEvent.getY(actionIndex);
                this.J = (int) motionEvent.getX(actionIndex);
                requestDisallowInterceptTouchEvent(false);
                iArr[0] = com.donkingliang.consecutivescroller.a.e(this, motionEvent, actionIndex);
                iF3 = com.donkingliang.consecutivescroller.a.f(this, motionEvent, actionIndex);
                iArr[1] = iF3;
                i6 = iArr[0];
                for (View view5 : getNonGoneChildren()) {
                    if (com.donkingliang.consecutivescroller.a.m(view5, i6, iF3)) {
                        view = view5;
                        break;
                    }
                }
                if (view != null) {
                    zK2 = com.donkingliang.consecutivescroller.a.k(view);
                } else {
                    zK2 = false;
                }
                this.t0 = zK2;
                this.s0 = com.donkingliang.consecutivescroller.a.l(this, iArr[0], iArr[1]);
                velocityTrackerObtain2 = this.D;
                if (velocityTrackerObtain2 == null) {
                    velocityTrackerObtain2 = VelocityTracker.obtain();
                    this.D = velocityTrackerObtain2;
                }
                velocityTrackerObtain2.addMovement(motionEventObtain);
            } else if (actionMasked == 6) {
                map.remove(Integer.valueOf(motionEvent.getPointerId(actionIndex)));
                if (this.Q == motionEvent.getPointerId(actionIndex)) {
                    if (actionIndex == 0) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    int pointerId3 = motionEvent.getPointerId(i7);
                    this.Q = pointerId3;
                    map.put(Integer.valueOf(pointerId3), Float.valueOf(motionEvent.getY(i7)));
                    this.K = (int) motionEvent.getY(i7);
                    this.J = (int) motionEvent.getX(i7);
                    iArr[0] = com.donkingliang.consecutivescroller.a.e(this, motionEvent, i7);
                    iF4 = com.donkingliang.consecutivescroller.a.f(this, motionEvent, i7);
                    iArr[1] = iF4;
                    i8 = iArr[0];
                    for (View view6 : getNonGoneChildren()) {
                        if (com.donkingliang.consecutivescroller.a.m(view6, i8, iF4)) {
                            view = view6;
                            break;
                        }
                    }
                    if (view != null) {
                        zK3 = com.donkingliang.consecutivescroller.a.k(view);
                    } else {
                        zK3 = false;
                    }
                    this.t0 = zK3;
                    this.s0 = com.donkingliang.consecutivescroller.a.l(this, iArr[0], iArr[1]);
                }
                velocityTrackerObtain3 = this.D;
                if (velocityTrackerObtain3 == null) {
                    velocityTrackerObtain3 = VelocityTracker.obtain();
                    this.D = velocityTrackerObtain3;
                }
                velocityTrackerObtain3.addMovement(motionEventObtain);
            }
            motionEventObtain.recycle();
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 != 1 || actionMasked2 == 3) {
                this.O = 0;
                this.E = 0;
                map.clear();
                this.Q = -1;
                if (this.B.isFinished()) {
                    setScrollState(0);
                }
            }
            return zDispatchTouchEvent;
        }
        int iFindPointerIndex3 = motionEvent.findPointerIndex(this.Q);
        if (iFindPointerIndex3 >= 0 && iFindPointerIndex3 < motionEvent.getPointerCount()) {
            motionEvent.offsetLocation(0.0f, map.get(Integer.valueOf(this.Q)).floatValue() - motionEvent.getY(iFindPointerIndex3));
            motionEventObtain = MotionEvent.obtain(motionEvent);
            if (motionEventObtain.getActionMasked() == 0) {
                this.q0 = 0;
            }
            motionEventObtain.offsetLocation(0.0f, this.q0);
            i(motionEventObtain.getAction());
            actionMasked = motionEvent.getActionMasked();
            view = null;
            iArr = this.M;
            if (actionMasked != 0) {
                if (this.r0 == 2) {
                    z = true;
                } else {
                    z = false;
                }
                this.u0 = z;
                E();
                this.N = true;
                b(false);
                this.O = 0;
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                this.Q = pointerId4;
                map.put(Integer.valueOf(pointerId4), Float.valueOf(motionEvent.getY(actionIndex)));
                this.K = (int) motionEvent.getY(actionIndex);
                this.J = (int) motionEvent.getX(actionIndex);
                velocityTracker = this.D;
                if (velocityTracker == null) {
                    this.D = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.D.addMovement(motionEventObtain);
                this.S.h(2, 0);
                iArr[0] = com.donkingliang.consecutivescroller.a.e(this, motionEvent, actionIndex);
                iF = com.donkingliang.consecutivescroller.a.f(this, motionEvent, actionIndex);
                iArr[1] = iF;
                i = iArr[0];
                while (r6.hasNext()) {
                    if (com.donkingliang.consecutivescroller.a.m(view3, i, iF)) {
                        view = view3;
                        break;
                    }
                }
                if (view != null) {
                    zK = com.donkingliang.consecutivescroller.a.k(view);
                } else {
                    zK = false;
                }
                this.t0 = zK;
                this.s0 = com.donkingliang.consecutivescroller.a.l(this, iArr[0], iArr[1]);
            } else if (actionMasked == 1) {
                velocityTracker2 = this.D;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEventObtain);
                    VelocityTracker velocityTracker6 = this.D;
                    int i15 = this.F;
                    velocityTracker6.computeCurrentVelocity(1000, i15);
                    int yVelocity3 = (int) this.D.getYVelocity();
                    this.E = Math.max(-i15, Math.min(yVelocity3, i15));
                    velocityTracker3 = this.D;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.D = null;
                    }
                    iE = com.donkingliang.consecutivescroller.a.e(this, motionEvent, actionIndex);
                    iF2 = com.donkingliang.consecutivescroller.a.f(this, motionEvent, actionIndex);
                    while (r7.hasNext()) {
                        if (com.donkingliang.consecutivescroller.a.m(view4, iE, iF2)) {
                            view = view4;
                            break;
                        }
                    }
                    if (com.donkingliang.consecutivescroller.a.k(view)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    arrayList = new ArrayList();
                    com.donkingliang.consecutivescroller.a.a(arrayList, this, iE, iF2);
                    size = arrayList.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            z3 = false;
                            break;
                        }
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        view2 = (View) obj3;
                        if (!view2.canScrollHorizontally(1)) {
                        }
                        z3 = true;
                        break;
                    }
                    i3 = this.O;
                    int i16 = this.G;
                    if (i3 != 1) {
                        motionEvent.setAction(3);
                    }
                    if (this.O != 1) {
                        f(-this.E);
                    }
                }
                this.K = 0;
                this.J = 0;
                this.N = false;
                iArr[0] = 0;
                iArr[1] = 0;
                this.s0 = false;
                this.t0 = false;
                v();
            } else if (actionMasked != 2) {
                iFindPointerIndex = motionEvent.findPointerIndex(this.Q);
                if (iFindPointerIndex >= 0) {
                    velocityTrackerObtain = this.D;
                    if (velocityTrackerObtain == null) {
                        velocityTrackerObtain = VelocityTracker.obtain();
                        this.D = velocityTrackerObtain;
                    }
                    velocityTrackerObtain.addMovement(motionEventObtain);
                    y = ((int) motionEvent.getY(iFindPointerIndex)) - this.K;
                    x = ((int) motionEvent.getX(iFindPointerIndex)) - this.J;
                    if (this.O == 0) {
                        z4 = this.h0;
                        i4 = this.H;
                        if (z4) {
                            if (Math.abs(y) >= i4) {
                                this.O = 1;
                            }
                        } else if (Math.abs(x) > Math.abs(y)) {
                            if (Math.abs(x) >= i4) {
                                this.O = 2;
                                i5 = this.Q;
                                if (i5 != -1) {
                                    motionEvent.offsetLocation(0.0f, map.get(Integer.valueOf(this.Q)).floatValue() - motionEvent.getY(iFindPointerIndex2));
                                }
                            }
                        } else if (Math.abs(y) >= i4) {
                            this.O = 1;
                        }
                        if (this.O == 0) {
                            return true;
                        }
                    }
                    this.K = (int) motionEvent.getY(iFindPointerIndex);
                    this.J = (int) motionEvent.getX(iFindPointerIndex);
                }
            } else if (actionMasked != 3) {
                velocityTracker2 = this.D;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEventObtain);
                    VelocityTracker velocityTracker7 = this.D;
                    int i17 = this.F;
                    velocityTracker7.computeCurrentVelocity(1000, i17);
                    int yVelocity4 = (int) this.D.getYVelocity();
                    this.E = Math.max(-i17, Math.min(yVelocity4, i17));
                    velocityTracker3 = this.D;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.D = null;
                    }
                    iE = com.donkingliang.consecutivescroller.a.e(this, motionEvent, actionIndex);
                    iF2 = com.donkingliang.consecutivescroller.a.f(this, motionEvent, actionIndex);
                    while (r7.hasNext()) {
                        if (com.donkingliang.consecutivescroller.a.m(view4, iE, iF2)) {
                            view = view4;
                            break;
                        }
                    }
                    if (com.donkingliang.consecutivescroller.a.k(view)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    arrayList = new ArrayList();
                    com.donkingliang.consecutivescroller.a.a(arrayList, this, iE, iF2);
                    size = arrayList.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            z3 = false;
                            break;
                        }
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        view2 = (View) obj4;
                        if (!view2.canScrollHorizontally(1)) {
                        }
                        z3 = true;
                        break;
                    }
                    i3 = this.O;
                    int i18 = this.G;
                    if (i3 != 1) {
                        motionEvent.setAction(3);
                    }
                    if (this.O != 1) {
                        f(-this.E);
                    }
                }
                this.K = 0;
                this.J = 0;
                this.N = false;
                iArr[0] = 0;
                iArr[1] = 0;
                this.s0 = false;
                this.t0 = false;
                v();
            } else if (actionMasked != 5) {
                int pointerId5 = motionEvent.getPointerId(actionIndex);
                this.Q = pointerId5;
                map.put(Integer.valueOf(pointerId5), Float.valueOf(motionEvent.getY(actionIndex)));
                this.K = (int) motionEvent.getY(actionIndex);
                this.J = (int) motionEvent.getX(actionIndex);
                requestDisallowInterceptTouchEvent(false);
                iArr[0] = com.donkingliang.consecutivescroller.a.e(this, motionEvent, actionIndex);
                iF3 = com.donkingliang.consecutivescroller.a.f(this, motionEvent, actionIndex);
                iArr[1] = iF3;
                i6 = iArr[0];
                while (r6.hasNext()) {
                    if (com.donkingliang.consecutivescroller.a.m(view5, i6, iF3)) {
                        view = view5;
                        break;
                    }
                }
                if (view != null) {
                    zK2 = com.donkingliang.consecutivescroller.a.k(view);
                } else {
                    zK2 = false;
                }
                this.t0 = zK2;
                this.s0 = com.donkingliang.consecutivescroller.a.l(this, iArr[0], iArr[1]);
                velocityTrackerObtain2 = this.D;
                if (velocityTrackerObtain2 == null) {
                    velocityTrackerObtain2 = VelocityTracker.obtain();
                    this.D = velocityTrackerObtain2;
                }
                velocityTrackerObtain2.addMovement(motionEventObtain);
            } else if (actionMasked == 6) {
                map.remove(Integer.valueOf(motionEvent.getPointerId(actionIndex)));
                if (this.Q == motionEvent.getPointerId(actionIndex)) {
                    if (actionIndex == 0) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    int pointerId6 = motionEvent.getPointerId(i7);
                    this.Q = pointerId6;
                    map.put(Integer.valueOf(pointerId6), Float.valueOf(motionEvent.getY(i7)));
                    this.K = (int) motionEvent.getY(i7);
                    this.J = (int) motionEvent.getX(i7);
                    iArr[0] = com.donkingliang.consecutivescroller.a.e(this, motionEvent, i7);
                    iF4 = com.donkingliang.consecutivescroller.a.f(this, motionEvent, i7);
                    iArr[1] = iF4;
                    i8 = iArr[0];
                    while (r6.hasNext()) {
                        if (com.donkingliang.consecutivescroller.a.m(view6, i8, iF4)) {
                            view = view6;
                            break;
                        }
                    }
                    if (view != null) {
                        zK3 = com.donkingliang.consecutivescroller.a.k(view);
                    } else {
                        zK3 = false;
                    }
                    this.t0 = zK3;
                    this.s0 = com.donkingliang.consecutivescroller.a.l(this, iArr[0], iArr[1]);
                }
                velocityTrackerObtain3 = this.D;
                if (velocityTrackerObtain3 == null) {
                    velocityTrackerObtain3 = VelocityTracker.obtain();
                    this.D = velocityTrackerObtain3;
                }
                velocityTrackerObtain3.addMovement(motionEventObtain);
            }
            motionEventObtain.recycle();
            boolean zDispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
            actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 != 1) {
                this.O = 0;
                this.E = 0;
                map.clear();
                this.Q = -1;
                if (this.B.isFinished()) {
                    setScrollState(0);
                }
            } else {
                this.O = 0;
                this.E = 0;
                map.clear();
                this.Q = -1;
                if (this.B.isFinished()) {
                    setScrollState(0);
                }
            }
            return zDispatchTouchEvent2;
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        int paddingTop;
        super.draw(canvas);
        if (this.o0 != getScrollY()) {
            this.o0 = getScrollY();
            w();
        }
        if (this.d0 != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.d0.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                if (getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    paddingLeft = getPaddingLeft();
                } else {
                    paddingLeft = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    paddingTop = getPaddingTop() + scrollY;
                } else {
                    paddingTop = scrollY;
                }
                canvas.translate(paddingLeft, paddingTop);
                this.d0.setSize(width, height);
                if (this.d0.draw(canvas)) {
                    WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(iSave);
            }
            if (this.e0.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int paddingBottom = scrollY + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                paddingLeft2 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                paddingBottom -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, paddingBottom);
            canvas.rotate(180.0f, width2, 0.0f);
            this.e0.setSize(width2, height2);
            if (this.e0.draw(canvas)) {
                WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave2);
        }
    }

    public final View e() {
        int paddingTop = getPaddingTop() + getScrollY();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i = 0; i < size; i++) {
            View view = effectiveChildren.get(i);
            if (view.getTop() <= paddingTop && view.getBottom() > paddingTop) {
                return view;
            }
        }
        return null;
    }

    public final void f(int i) {
        if (Math.abs(i) > this.G) {
            float f2 = i;
            qlx qlxVar = this.S;
            if (qlxVar.b(0.0f, f2)) {
                return;
            }
            dispatchNestedFling(0.0f, f2, (i < 0 && !n()) || (i > 0 && !m()));
            this.B.fling(0, this.z, 1, i, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Reader.READ_DONE);
            qlxVar.h(2, 1);
            setScrollState(2);
            this.f0 = this.z;
            invalidate();
        }
    }

    public final int g(View view) {
        if (this.i0 && view == getChildAt(getChildCount() - 1)) {
            return getAdjustHeight();
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.a = true;
        layoutParams.b = true;
        layoutParams.c = false;
        layoutParams.d = false;
        layoutParams.e = false;
        layoutParams.f = -1;
        layoutParams.g = LayoutParams.a.a;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.a = true;
        layoutParams2.b = true;
        layoutParams2.c = false;
        layoutParams2.d = false;
        layoutParams2.e = false;
        layoutParams2.f = -1;
        layoutParams2.g = LayoutParams.a.a;
        return layoutParams2;
    }

    public int getAdjustHeightOffset() {
        return this.j0;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int iIndexOfChild;
        ArrayList arrayList = this.p0;
        return (arrayList.size() <= i2 || (iIndexOfChild = indexOfChild((View) arrayList.get(i2))) == -1) ? super.getChildDrawingOrder(i, i2) : iIndexOfChild;
    }

    public View getCurrentStickyView() {
        return this.l0;
    }

    public List<View> getCurrentStickyViews() {
        return this.m0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.R.a();
    }

    public d getOnPermanentStickyChangeListener() {
        return null;
    }

    public f getOnStickyChangeListener() {
        return null;
    }

    public e getOnVerticalScrollChangeListener() {
        return this.P;
    }

    public int getOwnScrollY() {
        return computeVerticalScrollOffset();
    }

    public int getScrollState() {
        return this.r0;
    }

    public int getStickyOffset() {
        return this.k0;
    }

    @Override // defpackage.rlx
    public final void h(int i, View view) {
        tlx tlxVar = this.R;
        if (i == 1) {
            tlxVar.b = 0;
        } else {
            tlxVar.a = 0;
        }
        this.S.i(i);
        v();
    }

    public final void i(int i) {
        if (i == 0) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.setDuration(0L);
                this.v.cancel();
                this.v = null;
            }
            this.w = null;
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.S.d;
    }

    @Override // defpackage.rlx
    public final void j(View view, View view2, int i, int i2) {
        tlx tlxVar = this.R;
        if (i2 == 1) {
            tlxVar.b = i;
        } else {
            tlxVar.a = i;
        }
        b(false);
        this.S.h(2, i2);
        i(0);
    }

    @Override // defpackage.rlx
    public final void k(View view, int i, int i2, int[] iArr, int i3) {
        this.S.c(i, i2, i3, iArr, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a A[RETURN] */
    public final boolean l(MotionEvent motionEvent) {
        int iFindPointerIndex = motionEvent.findPointerIndex(this.Q);
        if (iFindPointerIndex < 0 || iFindPointerIndex >= motionEvent.getPointerCount()) {
            return true;
        }
        int iE = com.donkingliang.consecutivescroller.a.e(this, motionEvent, iFindPointerIndex);
        int iF = com.donkingliang.consecutivescroller.a.f(this, motionEvent, iFindPointerIndex);
        for (View view : getNonGoneChildren()) {
            if (com.donkingliang.consecutivescroller.a.m(view, iE, iF)) {
                if (view != null) {
                    return com.donkingliang.consecutivescroller.a.k(view);
                }
                return false;
            }
        }
        view = null;
        if (view != null) {
            return com.donkingliang.consecutivescroller.a.k(view);
        }
        return false;
    }

    public final boolean m() {
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        if (size <= 0) {
            return true;
        }
        boolean z = getScrollY() >= this.A && !com.donkingliang.consecutivescroller.a.b(1, (View) uts.a(1, effectiveChildren));
        if (z) {
            for (int i = size - 1; i >= 0; i--) {
                View view = effectiveChildren.get(i);
                if (com.donkingliang.consecutivescroller.a.k(view) && com.donkingliang.consecutivescroller.a.b(1, view)) {
                    return false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final boolean n() {
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        if (size <= 0) {
            return true;
        }
        boolean z = getScrollY() <= 0 && !com.donkingliang.consecutivescroller.a.b(-1, effectiveChildren.get(0));
        if (z) {
            for (int i = size - 1; i >= 0; i--) {
                View view = effectiveChildren.get(i);
                if (com.donkingliang.consecutivescroller.a.k(view) && com.donkingliang.consecutivescroller.a.b(-1, view)) {
                    return false;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001c, code lost:
    
        if (l(r4) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r3.O == 0) goto L22;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getActionMasked()
            if (r0 == 0) goto L2e
            r1 = 1
            if (r0 == r1) goto L1f
            r2 = 2
            if (r0 == r2) goto L10
            r2 = 3
            if (r0 == r2) goto L1f
            goto L41
        L10:
            int r0 = r3.O
            if (r0 == r2) goto L41
            boolean r0 = r3.t0
            if (r0 != 0) goto L2d
            boolean r0 = r3.l(r4)
            if (r0 == 0) goto L41
            goto L2d
        L1f:
            r0 = 0
            qlx r2 = r3.S
            r2.i(r0)
            boolean r0 = r3.u0
            if (r0 == 0) goto L41
            int r0 = r3.O
            if (r0 != 0) goto L41
        L2d:
            return r1
        L2e:
            android.view.VelocityTracker r0 = r3.C
            if (r0 != 0) goto L39
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r3.C = r0
            goto L3c
        L39:
            r0.clear()
        L3c:
            android.view.VelocityTracker r0 = r3.C
            r0.addMovement(r4)
        L41:
            boolean r3 = super.onInterceptTouchEvent(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        this.a = getResources().getDisplayMetrics().heightPixels;
        this.A = 0;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int measuredWidth2 = getMeasuredWidth();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i5 = 0;
        while (i5 < size) {
            View view = nonGoneChildren.get(i5);
            int measuredHeight = view.getMeasuredHeight() + paddingTop;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int iOrdinal = layoutParams.g.ordinal();
            if (iOrdinal != 1) {
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                measuredWidth = iOrdinal != 2 ? i6 + paddingLeft : i6 + paddingLeft + ((((((measuredWidth2 - view.getMeasuredWidth()) - paddingLeft) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - paddingRight) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) / 2);
            } else {
                measuredWidth = ((measuredWidth2 - view.getMeasuredWidth()) - paddingRight) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            }
            view.layout(measuredWidth, paddingTop, view.getMeasuredWidth() + measuredWidth, measuredHeight);
            this.A = view.getHeight() + this.A;
            i5++;
            paddingTop = measuredHeight;
        }
        int measuredHeight2 = this.A - ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        this.A = measuredHeight2;
        if (measuredHeight2 < 0) {
            this.A = 0;
        }
        int i7 = this.z;
        View view2 = this.V;
        if (view2 == null || !z) {
            B(getScrollY());
        } else if (indexOfChild(view2) != -1) {
            B(this.V.getTop() + this.W);
        }
        b(true);
        if (i7 != this.z && this.V != e()) {
            scrollTo(0, i7);
        }
        this.V = null;
        this.W = 0;
        Iterator<View> it = getNonGoneChildren().iterator();
        while (it.hasNext()) {
            it.next().setTranslationY(0.0f);
        }
        w();
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (!s(childAt) || r(childAt)) {
                arrayList.add(childAt);
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            if (s(childAt2) && !r(childAt2)) {
                arrayList.add(childAt2);
            }
        }
        ArrayList arrayList2 = this.p0;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View viewE = e();
        this.V = viewE;
        if (viewE != null) {
            this.W = getScrollY() - this.V.getTop();
        }
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i3 = 0;
        int iMax = 0;
        int measuredHeight = 0;
        while (i3 < size) {
            View view = nonGoneChildren.get(i3);
            ConsecutiveScrollerLayout consecutiveScrollerLayout = this;
            int i4 = i;
            int i5 = i2;
            consecutiveScrollerLayout.measureChildWithMargins(view, i4, 0, i5, this.g(view));
            int measuredWidth = view.getMeasuredWidth();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            iMax = Math.max(iMax, measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
            measuredHeight += view.getMeasuredHeight();
            i3++;
            this = consecutiveScrollerLayout;
            i = i4;
            i2 = i5;
        }
        ConsecutiveScrollerLayout consecutiveScrollerLayout2 = this;
        consecutiveScrollerLayout2.setMeasuredDimension(consecutiveScrollerLayout2.t(i, consecutiveScrollerLayout2.getPaddingRight() + consecutiveScrollerLayout2.getPaddingLeft() + iMax), consecutiveScrollerLayout2.t(i2, consecutiveScrollerLayout2.getPaddingBottom() + consecutiveScrollerLayout2.getPaddingTop() + measuredHeight));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        f((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.S.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.S.c(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.z;
        c(i4);
        int i6 = this.z - i5;
        this.S.d(0, i6, 0, i4 - i6, null, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        j(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return q(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(0, view);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e5  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int i;
        if (com.donkingliang.consecutivescroller.a.j(this) || this.s0) {
            return super.onTouchEvent(motionEvent);
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getActionMasked() == 0) {
            this.q0 = 0;
        }
        motionEventObtain.offsetLocation(0.0f, this.q0);
        int iFindPointerIndex = motionEvent.findPointerIndex(this.Q);
        if (iFindPointerIndex < 0 || iFindPointerIndex >= motionEvent.getPointerCount()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                EdgeEffect edgeEffect = this.d0;
                if (edgeEffect != null) {
                    edgeEffect.onRelease();
                    this.e0.onRelease();
                }
                this.I = 0;
                VelocityTracker velocityTracker2 = this.C;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEventObtain);
                    VelocityTracker velocityTracker3 = this.C;
                    int i2 = this.F;
                    velocityTracker3.computeCurrentVelocity(1000, i2);
                    int iMax = Math.max(-i2, Math.min((int) this.C.getYVelocity(), i2));
                    if (iMax == 0 && (i = this.E) != 0) {
                        iMax = i;
                    }
                    f(-iMax);
                    VelocityTracker velocityTracker4 = this.C;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.C = null;
                    }
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    EdgeEffect edgeEffect2 = this.d0;
                    if (edgeEffect2 != null) {
                        edgeEffect2.onRelease();
                        this.e0.onRelease();
                    }
                    this.I = 0;
                    VelocityTracker velocityTracker5 = this.C;
                    if (velocityTracker5 != null) {
                        velocityTracker5.recycle();
                        this.C = null;
                    }
                    setScrollState(0);
                } else if (actionMasked == 5 || actionMasked == 6) {
                }
            } else {
                if (this.I == 0) {
                    this.I = (int) motionEvent.getY(iFindPointerIndex);
                    return true;
                }
                int[] iArr = this.U;
                iArr[1] = 0;
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i3 = this.I - y;
                this.I = y;
                boolean zC = this.S.c(0, i3, 0, this.U, this.T);
                int[] iArr2 = this.T;
                if (zC) {
                    i3 -= iArr[1];
                    motionEvent.offsetLocation(0.0f, iArr2[1]);
                    int i4 = this.q0;
                    int i5 = iArr2[1];
                    this.q0 = i4 + i5;
                    this.I -= i5;
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i6 = this.z;
                if (this.r0 != 1 && ((!n() || !m() || this.c) && Math.abs(i3) > 0)) {
                    setScrollState(1);
                }
                if (this.r0 == 1) {
                    c(i3);
                }
                int i7 = this.z - i6;
                if (i7 != 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i8 = i3 - i7;
                if (this.S.d(0, i7, 0, i8, this.T, 0, null)) {
                    int i9 = iArr2[1];
                    i8 += i9;
                    this.I -= i9;
                    this.q0 += i9;
                    motionEvent.offsetLocation(0.0f, i9);
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i10 = i8;
                int scrollRange = getScrollRange();
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    d();
                    int i11 = i6 + i10;
                    if (i11 < 0 && this.e <= 0) {
                        alf.a.a(this.d0, i10 / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                        if (!this.e0.isFinished()) {
                            this.e0.onRelease();
                        }
                    } else if (i11 > scrollRange && this.d <= 0) {
                        alf.a.a(this.e0, i10 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                        if (!this.d0.isFinished()) {
                            this.d0.onRelease();
                        }
                    }
                    EdgeEffect edgeEffect3 = this.d0;
                    if (edgeEffect3 != null && (!edgeEffect3.isFinished() || !this.e0.isFinished())) {
                        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                        postInvalidateOnAnimation();
                    }
                }
            }
            velocityTracker = this.C;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEventObtain);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.S.h(2, 0);
        this.I = (int) motionEvent.getY(iFindPointerIndex);
        velocityTracker = this.C;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // defpackage.rlx
    public final void p(View view, int i, int i2, int i3, int i4, int i5) {
        int i6 = this.z;
        c(i4);
        int i7 = this.z - i6;
        this.S.d(0, i7, 0, i4 - i7, null, i5, null);
    }

    @Override // defpackage.rlx
    public final boolean q(View view, View view2, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return (layoutParams instanceof LayoutParams ? ((LayoutParams) layoutParams).b : false) && (i & 2) != 0;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        scrollTo(0, this.z + i2);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        c(i2 - this.z);
    }

    public void setAdjustHeightOffset(int i) {
        if (this.j0 != i) {
            this.j0 = i;
            super.requestLayout();
        }
    }

    public void setAutoAdjustHeightAtBottomView(boolean z) {
        if (this.i0 != z) {
            this.i0 = z;
            super.requestLayout();
        }
    }

    public void setDisableChildHorizontalScroll(boolean z) {
        this.h0 = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.S.g(z);
    }

    public void setOnPermanentStickyChangeListener(d dVar) {
    }

    @Override // android.view.View
    @Deprecated
    public void setOnScrollChangeListener(View.OnScrollChangeListener onScrollChangeListener) {
    }

    public void setOnStickyChangeListener(f fVar) {
    }

    public void setOnVerticalScrollChangeListener(e eVar) {
        this.P = eVar;
    }

    public void setOverDragMaxDistanceOfBottom(int i) {
        int i2;
        if (this.c || (i2 = this.e) > 0 || this.d > 0) {
            this.d = i;
            return;
        }
        this.c = true;
        this.e = i2;
        this.d = i;
    }

    public void setOverDragMaxDistanceOfTop(int i) {
        int i2;
        if (this.c || this.e > 0 || (i2 = this.d) > 0) {
            this.e = i;
            return;
        }
        this.c = true;
        this.e = i;
        this.d = i2;
    }

    public void setOverDragRate(float f2) {
        this.b = f2;
    }

    public void setPermanent(boolean z) {
        if (this.g0 != z) {
            this.g0 = z;
            if (this.i0) {
                super.requestLayout();
            } else {
                w();
            }
        }
    }

    public void setScrollState(int i) {
        if (i == this.r0) {
            return;
        }
        this.r0 = i;
        int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
        x(iComputeVerticalScrollOffset, iComputeVerticalScrollOffset);
    }

    public void setStickyOffset(int i) {
        if (this.k0 != i) {
            this.k0 = i;
            w();
        }
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.S.i(0);
    }

    public final int t(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            i2 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i2 = Math.min(i2, size);
        }
        return View.resolveSizeAndState(Math.max(i2, getSuggestedMinimumWidth()), i, 0);
    }

    public final void u(float f2) {
        double dMin;
        double dMax = Math.max(this.a / 2, getHeight());
        int i = this.d;
        if (f2 > 0.0f) {
            double d2 = i;
            double dMax2 = Math.max(0.0f, this.b * f2);
            double d3 = -dMax2;
            if (dMax == 0.0d) {
                dMax = 1.0d;
            }
            dMin = Math.min((1.0d - Math.pow(100.0d, d3 / dMax)) * d2, dMax2);
        } else {
            double d4 = i;
            double d5 = -Math.min(0.0f, this.b * f2);
            double d6 = -d5;
            if (dMax == 0.0d) {
                dMax = 1.0d;
            }
            dMin = -Math.min((1.0d - Math.pow(100.0d, d6 / dMax)) * d4, d5);
        }
        int i2 = (int) dMin;
        if (Math.abs(f2) >= 1.0f && i2 == 0) {
            i2 = (int) f2;
        }
        int scrollY = getScrollY() + i2;
        this.z += i2;
        B(scrollY);
    }

    public final void v() {
        int scrollY = getScrollY();
        int i = this.f;
        lcz lczVar = this.i;
        if (scrollY < 0) {
            if (this.v == null) {
                a(scrollY, 0, lczVar, i);
            }
        } else {
            int i2 = this.A;
            if (scrollY <= i2 || this.v != null) {
                return;
            }
            a(scrollY, i2, lczVar, i);
        }
    }

    public final void w() {
        View view;
        List<View> stickyChildren = getStickyChildren();
        boolean zIsEmpty = stickyChildren.isEmpty();
        ArrayList arrayList = this.m0;
        View view2 = null;
        if (zIsEmpty) {
            if (this.l0 != null) {
                this.l0 = null;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            arrayList.clear();
            return;
        }
        int size = stickyChildren.size();
        int iMax = 0;
        for (int i = 0; i < size; i++) {
            stickyChildren.get(i).setTranslationY(0.0f);
        }
        if (!this.g0) {
            if (!arrayList.isEmpty()) {
                arrayList.clear();
            }
            int i2 = size - 1;
            int i3 = i2;
            while (true) {
                if (i3 >= 0) {
                    View view3 = stickyChildren.get(i3);
                    int scrollY = getScrollY();
                    if ((scrollY >= 0 || view3.getTop() + scrollY > getStickyY()) && view3.getTop() > getStickyY()) {
                        i3--;
                    } else {
                        view = i3 != i2 ? stickyChildren.get(i3 + 1) : null;
                        view2 = view3;
                    }
                } else {
                    view = null;
                }
                View view4 = this.l0;
                if (view2 != null) {
                    if (view != null && !r(view2)) {
                        iMax = Math.max(0, view2.getHeight() - (view.getTop() - getStickyY()));
                    }
                    view2.setY(getStickyY() - iMax);
                    view2.setClickable(true);
                }
                if (view4 != view2) {
                    this.l0 = view2;
                    return;
                }
                return;
            }
        }
        if (this.l0 != null) {
            this.l0 = null;
        }
        ArrayList arrayList2 = this.n0;
        arrayList2.clear();
        for (int i4 = 0; i4 < stickyChildren.size(); i4++) {
            View view5 = stickyChildren.get(i4);
            int measuredHeight = 0;
            for (int i5 = 0; i5 < i4; i5++) {
                View view6 = stickyChildren.get(i5);
                if (!r(view6)) {
                    measuredHeight += view6.getMeasuredHeight();
                }
            }
            if (view5.getTop() <= getStickyY() + measuredHeight) {
                view5.setY(getStickyY() + measuredHeight);
                view5.setClickable(true);
                arrayList2.add(view5);
            }
        }
        if (arrayList2.size() == arrayList.size()) {
            int size2 = arrayList2.size();
            while (iMax < size2) {
                if (arrayList2.get(iMax) == arrayList.get(iMax)) {
                    iMax++;
                }
            }
            return;
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList2.clear();
    }

    public final void x(int i, int i2) {
        e eVar = this.P;
        if (eVar != null) {
            eVar.a(this.r0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    public static void y(int i, View view) {
        boolean z;
        View viewI = com.donkingliang.consecutivescroller.a.i(view);
        if (viewI instanceof AbsListView) {
            ((AbsListView) viewI).scrollListBy(i);
            return;
        }
        if (viewI instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) viewI;
            if ("InterceptRequestLayout".equals(recyclerView.getTag())) {
                try {
                    Method declaredMethod = RecyclerView.class.getDeclaredMethod(DZsoPoBl.KwqZzvWYNNwmN, null);
                    z = true;
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(recyclerView, null);
                } catch (Exception unused) {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        viewI.scrollBy(0, i);
        if (z) {
            RecyclerView recyclerView2 = (RecyclerView) viewI;
            recyclerView2.postDelayed(new b(recyclerView2), 0L);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public ConsecutiveScrollerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConsecutiveScrollerLayout(Context context) {
        this(context, null);
    }
}
