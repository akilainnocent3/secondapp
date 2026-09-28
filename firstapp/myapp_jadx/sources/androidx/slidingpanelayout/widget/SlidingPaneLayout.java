package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.customview.view.AbsSavedState;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.SidecarCompat;
import defpackage.a6i;
import defpackage.c7;
import defpackage.c8j0;
import defpackage.ci90;
import defpackage.d9j0;
import defpackage.e6;
import defpackage.ej5;
import defpackage.f8j0;
import defpackage.g9i0;
import defpackage.gf8;
import defpackage.i7i0;
import defpackage.jvd0;
import defpackage.l8j0;
import defpackage.ls60;
import defpackage.o0b;
import defpackage.r6i0;
import defpackage.w1i0;
import defpackage.w5b;
import defpackage.w7j0;
import defpackage.y3h;
import defpackage.y5i;
import defpackage.ymn;
import defpackage.z5i;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {
    public static final boolean N;
    public float A;
    public float B;
    public final CopyOnWriteArrayList C;
    public e D;
    public final i7i0 E;
    public boolean F;
    public boolean G;
    public final Rect H;
    public final ArrayList<c> I;
    public int J;
    public y5i K;
    public final a L;
    public a6i M;
    public int a;
    public int b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public View f;
    public float i;
    public float v;
    public int w;
    public boolean y;
    public int z;

    public class a {
        public a() {
        }
    }

    public class b extends e6 {
        public final Rect d = new Rect();

        public b() {
        }

        @Override // defpackage.e6
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // defpackage.e6
        public final void d(View view, c7 c7Var) {
            AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
            Rect rect = this.d;
            accessibilityNodeInfoObtain.getBoundsInScreen(rect);
            c7Var.k(rect);
            accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            c7Var.l(accessibilityNodeInfoObtain.getClassName());
            c7Var.o(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            accessibilityNodeInfo.setClickable(accessibilityNodeInfoObtain.isClickable());
            accessibilityNodeInfo.setFocusable(accessibilityNodeInfoObtain.isFocusable());
            accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
            accessibilityNodeInfo.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
            c7Var.a(accessibilityNodeInfoObtain.getActions());
            accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities());
            c7Var.l("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            c7Var.c = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                c7Var.b = -1;
                accessibilityNodeInfo.setParent((View) parentForAccessibility);
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = slidingPaneLayout.getChildAt(i);
                if (!slidingPaneLayout.a(childAt) && childAt.getVisibility() == 0) {
                    childAt.setImportantForAccessibility(1);
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }

        @Override // defpackage.e6
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (SlidingPaneLayout.this.a(view)) {
                return false;
            }
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class d extends i7i0.c {
        public d() {
        }

        @Override // i7i0.c
        public final int a(int i, View view) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f.getLayoutParams();
            if (!slidingPaneLayout.b()) {
                int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                return Math.min(Math.max(i, paddingLeft), slidingPaneLayout.w + paddingLeft);
            }
            int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
            return Math.max(Math.min(i, width), width - slidingPaneLayout.w);
        }

        @Override // i7i0.c
        public final int b(int i, View view) {
            return view.getTop();
        }

        @Override // i7i0.c
        public final int c(View view) {
            return SlidingPaneLayout.this.w;
        }

        @Override // i7i0.c
        public final void e(int i, int i2) {
            if (l()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.E.c(i2, slidingPaneLayout.f);
            }
        }

        @Override // i7i0.c
        public final void f(int i) {
            if (l()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.E.c(i, slidingPaneLayout.f);
            }
        }

        @Override // i7i0.c
        public final void g(int i, View view) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = slidingPaneLayout.getChildAt(i2);
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
            }
        }

        @Override // i7i0.c
        public final void h(int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.C;
            if (slidingPaneLayout.E.a == 0) {
                float f = slidingPaneLayout.i;
                View view = slidingPaneLayout.f;
                if (f != 1.0f) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).c();
                    }
                    slidingPaneLayout.sendAccessibilityEvent(32);
                    slidingPaneLayout.F = true;
                    return;
                }
                slidingPaneLayout.f(view);
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).b();
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.F = false;
            }
        }

        @Override // i7i0.c
        public final void i(View view, int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f == null) {
                slidingPaneLayout.i = 0.0f;
            } else {
                boolean zB = slidingPaneLayout.b();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f.getLayoutParams();
                int width = slidingPaneLayout.f.getWidth();
                if (zB) {
                    i = (slidingPaneLayout.getWidth() - i) - width;
                }
                float paddingRight = (i - ((zB ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (zB ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.w;
                slidingPaneLayout.i = paddingRight;
                if (slidingPaneLayout.z != 0) {
                    slidingPaneLayout.d(paddingRight);
                }
                Iterator it = slidingPaneLayout.C.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a();
                }
            }
            slidingPaneLayout.invalidate();
        }

        @Override // i7i0.c
        public final void j(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.b()) {
                int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f < 0.0f || (f == 0.0f && slidingPaneLayout.i > 0.5f)) {
                    paddingRight += slidingPaneLayout.w;
                }
                paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + slidingPaneLayout.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && slidingPaneLayout.i > 0.5f)) {
                    paddingLeft += slidingPaneLayout.w;
                }
            }
            slidingPaneLayout.E.s(paddingLeft, view.getTop());
            slidingPaneLayout.invalidate();
        }

        @Override // i7i0.c
        public final boolean k(int i, View view) {
            if (l()) {
                return ((LayoutParams) view.getLayoutParams()).b;
            }
            return false;
        }

        public final boolean l() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.y || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (slidingPaneLayout.c() && slidingPaneLayout.getLockMode() == 1) {
                return false;
            }
            return slidingPaneLayout.c() || slidingPaneLayout.getLockMode() != 2;
        }
    }

    public interface e {
        void a();

        void b();

        void c();
    }

    public static class f extends FrameLayout {
        @Override // android.view.View
        public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        N = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        w7j0 y3hVar;
        super(context, attributeSet, i);
        this.a = 0;
        this.i = 1.0f;
        this.C = new CopyOnWriteArrayList();
        this.G = true;
        this.H = new Rect();
        this.I = new ArrayList<>();
        this.L = new a();
        float f2 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        r6i0.p(this, new b());
        setImportantForAccessibility(1);
        i7i0 i7i0Var = new i7i0(getContext(), this, new d());
        i7i0Var.b = (int) (2.0f * i7i0Var.b);
        this.E = i7i0Var;
        i7i0Var.n = f2 * 400.0f;
        c8j0.a.getClass();
        d9j0 d9j0Var = d9j0.a;
        SidecarCompat sidecarCompat = null;
        try {
            ls60.a.getClass();
            WindowLayoutComponent windowLayoutComponentA = ls60.a();
            y3hVar = windowLayoutComponentA == null ? null : new y3h(windowLayoutComponentA);
        } catch (Throwable unused) {
        }
        if (y3hVar == null) {
            ci90 ci90Var = ci90.c;
            if (ci90.c == null) {
                ReentrantLock reentrantLock = ci90.d;
                reentrantLock.lock();
                try {
                    if (ci90.c == null) {
                        try {
                            w1i0 w1i0VarB = SidecarCompat.a.b();
                            if (w1i0VarB != null) {
                                w1i0 w1i0Var = w1i0.f;
                                w1i0Var.getClass();
                                Object value = w1i0VarB.e.getValue();
                                value.getClass();
                                Object value2 = w1i0Var.e.getValue();
                                value2.getClass();
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    SidecarCompat sidecarCompat2 = new SidecarCompat(context);
                                    if (sidecarCompat2.f()) {
                                        sidecarCompat = sidecarCompat2;
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                        ci90.c = new ci90(sidecarCompat);
                    }
                    Unit unit = Unit.a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            y3hVar = ci90.c;
            y3hVar.getClass();
        }
        f8j0 f8j0Var = new f8j0(d9j0Var, y3hVar);
        c8j0.a.b.getClass();
        setFoldingFeatureObserver(new a6i(f8j0Var, o0b.c(context)));
    }

    private ymn getSystemGestureInsets() {
        if (!N) {
            return null;
        }
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        l8j0 l8j0VarA = r6i0.e.a(this);
        if (l8j0VarA != null) {
            return l8j0VarA.a.k();
        }
        return null;
    }

    private void setFoldingFeatureObserver(a6i a6iVar) {
        this.M = a6iVar;
        a6iVar.getClass();
        a aVar = this.L;
        aVar.getClass();
        a6iVar.d = aVar;
    }

    public final boolean a(View view) {
        if (view == null) {
            return false;
        }
        return this.e && ((LayoutParams) view.getLayoutParams()).c && this.i > 0.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i, layoutParams);
            return;
        }
        f fVar = new f(view.getContext());
        fVar.addView(view);
        super.addView(fVar, i, layoutParams);
    }

    public final boolean b() {
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        return getLayoutDirection() == 1;
    }

    public final boolean c() {
        return !this.e || this.i == 0.0f;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        i7i0 i7i0Var = this.E;
        if (i7i0Var.h()) {
            if (!this.e) {
                i7i0Var.a();
            } else {
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                postInvalidateOnAnimation();
            }
        }
    }

    public final void d(float f2) {
        boolean zB = b();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f) {
                float f3 = 1.0f - this.v;
                int i2 = this.z;
                this.v = f2;
                int i3 = ((int) (f3 * i2)) - ((int) ((1.0f - f2) * i2));
                if (zB) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int right;
        super.draw(canvas);
        Drawable drawable = b() ? this.d : this.c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (b()) {
            right = childAt.getRight();
            i = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i2 = left - intrinsicWidth;
            i = left;
            right = i2;
        }
        drawable.setBounds(right, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zB = b() ^ c();
        i7i0 i7i0Var = this.E;
        if (zB) {
            i7i0Var.q = 1;
            ymn systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                i7i0Var.o = Math.max(i7i0Var.p, systemGestureInsets.a);
            }
        } else {
            i7i0Var.q = 2;
            ymn systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                i7i0Var.o = Math.max(i7i0Var.p, systemGestureInsets2.c);
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.e && !layoutParams.b && this.f != null) {
            Rect rect = this.H;
            canvas.getClipBounds(rect);
            if (b()) {
                rect.left = Math.max(rect.left, this.f.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public final boolean e(float f2) {
        int paddingLeft;
        if (this.e) {
            boolean zB = b();
            LayoutParams layoutParams = (LayoutParams) this.f.getLayoutParams();
            if (zB) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                paddingLeft = (int) (getWidth() - (((f2 * this.w) + paddingRight) + this.f.getWidth()));
            } else {
                paddingLeft = (int) ((f2 * this.w) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
            }
            View view = this.f;
            if (this.E.u(view, paddingLeft, view.getTop())) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    public final void f(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View view2 = view;
        boolean zB = b();
        int width = zB ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zB ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view2.isOpaque()) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt == view2) {
                return;
            }
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zB ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zB ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zB = zB;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.a = 0.0f;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.a = 0.0f;
        return layoutParams3;
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.b;
    }

    public final int getLockMode() {
        return this.J;
    }

    public int getParallaxDistance() {
        return this.z;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.G = true;
        if (this.M != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                a6i a6iVar = this.M;
                a6iVar.getClass();
                jvd0 jvd0Var = a6iVar.c;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
                a6iVar.c = ej5.c(w5b.a(gf8.a(a6iVar.b)), null, null, new z5i(a6iVar, activity, null), 3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        jvd0 jvd0Var;
        super.onDetachedFromWindow();
        this.G = true;
        a6i a6iVar = this.M;
        if (a6iVar != null && (jvd0Var = a6iVar.c) != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        ArrayList<c> arrayList = this.I;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = this.e;
        i7i0 i7i0Var = this.E;
        if (!z2 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            i7i0Var.getClass();
            this.F = i7i0.l(childAt, x, y);
        }
        if (!this.e || (this.y && actionMasked != 0)) {
            i7i0Var.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            i7i0Var.b();
            return false;
        }
        if (actionMasked == 0) {
            this.y = false;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.A = x2;
            this.B = y2;
            i7i0Var.getClass();
            if (i7i0.l(this.f, (int) x2, (int) y2) && a(this.f)) {
                z = true;
            }
            return !i7i0Var.t(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float fAbs = Math.abs(x3 - this.A);
            float fAbs2 = Math.abs(y3 - this.B);
            if (fAbs > i7i0Var.b && fAbs2 > fAbs) {
                i7i0Var.b();
                this.y = true;
                return false;
            }
        }
        z = false;
        if (i7i0Var.t(motionEvent)) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        y5i y5iVar;
        int iWidth;
        boolean zB = b();
        int i10 = i3 - i;
        int paddingRight = zB ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zB ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.G) {
            this.i = (this.e && this.F) ? 0.0f : 1.0f;
        }
        int i11 = paddingRight;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.b) {
                    int i13 = i10 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i13) - i11) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.w = iMin;
                    int i14 = zB ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.c = (measuredWidth / 2) + ((i11 + i14) + iMin) > i13;
                    float f2 = iMin;
                    int i15 = (int) (this.i * f2);
                    i5 = i14 + i15 + i11;
                    this.i = i15 / f2;
                } else {
                    if (!this.e || (i6 = this.z) == 0) {
                        i5 = paddingRight;
                    } else {
                        i7 = (int) ((1.0f - this.i) * i6);
                        i5 = paddingRight;
                    }
                    if (zB) {
                        i9 = (i10 - i5) + i7;
                        i8 = i9 - measuredWidth;
                    } else {
                        i8 = i5 - i7;
                        i9 = i8 + measuredWidth;
                    }
                    childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                    y5iVar = this.K;
                    if (y5iVar == null && y5iVar.a() == y5i.a.b && this.K.b()) {
                        iWidth = this.K.getBounds().width();
                    } else {
                        iWidth = 0;
                    }
                    paddingRight = Math.abs(iWidth) + childAt.getWidth() + paddingRight;
                    i11 = i5;
                }
                i7 = 0;
                if (zB) {
                    i9 = (i10 - i5) + i7;
                    i8 = i9 - measuredWidth;
                } else {
                    i8 = i5 - i7;
                    i9 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                y5iVar = this.K;
                if (y5iVar == null) {
                    iWidth = 0;
                } else {
                    iWidth = 0;
                }
                paddingRight = Math.abs(iWidth) + childAt.getWidth() + paddingRight;
                i11 = i5;
            }
        }
        if (this.G) {
            if (this.e && this.z != 0) {
                d(this.i);
            }
            f(this.f);
        }
        this.G = false;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0089 A[PHI: r17
      0x0089: PHI (r17v3 float) = (r17v1 float), (r17v4 float) binds: [B:19:0x007f, B:21:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ad  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int iMax;
        int iMakeMeasureSpec;
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        int minimumWidth;
        int iMax2;
        int i7;
        int iMakeMeasureSpec2;
        int measuredHeight;
        boolean z;
        int i8;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        ?? r7 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax3 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f = null;
        int i9 = 0;
        boolean z2 = false;
        int i10 = iMax3;
        float f2 = 0.0f;
        while (true) {
            i3 = 8;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.c = r7;
            } else {
                float f3 = layoutParams.a;
                if (f3 > 0.0f) {
                    f2 += f3;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width != 0) {
                        iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r7);
                        i7 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                        if (i7 == -2) {
                            if (mode == 0) {
                                i8 = mode;
                            } else {
                                i8 = Integer.MIN_VALUE;
                            }
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i8);
                        } else if (i7 == -1) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                        } else {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                        int measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (measuredHeight > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight;
                            }
                        }
                        i10 -= measuredWidth;
                        if (i9 != 0) {
                            if (i10 < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            layoutParams.b = z;
                            z2 |= z;
                            if (z) {
                                this.f = childAt;
                            }
                        }
                    }
                } else {
                    iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r7);
                    i7 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    if (i7 == -2) {
                        if (mode == 0) {
                            i8 = mode;
                        } else {
                            i8 = Integer.MIN_VALUE;
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i8);
                    } else if (i7 == -1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > iMin) {
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        } else if (mode2 == 0) {
                            iMin = measuredHeight;
                        }
                    }
                    i10 -= measuredWidth2;
                    if (i9 != 0) {
                        if (i10 < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        layoutParams.b = z;
                        z2 |= z;
                        if (z) {
                            this.f = childAt;
                        }
                    }
                }
            }
            i9++;
            r7 = 0;
        }
        int i11 = 1;
        if (z2 || f2 > 0.0f) {
            int i12 = 0;
            while (i12 < childCount) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getVisibility() == i3) {
                    i4 = i12;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    int i13 = ((ViewGroup.MarginLayoutParams) layoutParams2).width;
                    float f4 = layoutParams2.a;
                    int measuredWidth3 = (i13 != 0 || f4 <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z2) {
                        iMax = iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (f4 > 0.0f) {
                        iMax = ((int) ((f4 * Math.max(0, i10)) / f2)) + measuredWidth3;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth3;
                        iMakeMeasureSpec = 0;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                    i4 = i12;
                    int iMakeMeasureSpec3 = (((ViewGroup.MarginLayoutParams) layoutParams3).width != 0 || layoutParams3.a <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i2, paddingBottom, ((ViewGroup.MarginLayoutParams) layoutParams3).height);
                    if (measuredWidth3 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i12 = i4 + 1;
                i3 = 8;
            }
        }
        y5i y5iVar = this.K;
        if (y5iVar == null || !y5iVar.b() || this.K.getBounds().left == 0 || this.K.getBounds().top != 0) {
            arrayList = null;
        } else {
            y5i y5iVar2 = this.K;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i14 = iArr[0];
            Rect rect = new Rect(i14, iArr[1], getWidth() + i14, getWidth() + iArr[1]);
            Rect rect2 = new Rect(y5iVar2.getBounds());
            boolean zIntersect = rect2.intersect(rect);
            if (!(rect2.width() == 0 && rect2.height() == 0) && zIntersect) {
                rect2.offset(-iArr[0], -iArr[1]);
            } else {
                rect2 = null;
            }
            if (rect2 == null) {
                arrayList = null;
            } else {
                Rect rect3 = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                arrayList = new ArrayList(Arrays.asList(rect3, new Rect(Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
            }
        }
        if (arrayList != null && !z2) {
            int i15 = 0;
            while (i15 < childCount) {
                View childAt3 = getChildAt(i15);
                if (childAt3.getVisibility() != 8) {
                    Rect rect4 = (Rect) arrayList.get(i15);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    int i16 = ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin;
                    int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), iMakeMeasureSpec4);
                    if ((childAt3.getMeasuredWidthAndState() & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != i11) {
                        boolean z3 = childAt3 instanceof f;
                        if (z3) {
                            i6 = 0;
                            View childAt4 = ((f) childAt3).getChildAt(0);
                            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                            minimumWidth = childAt4.getMinimumWidth();
                        } else {
                            i6 = 0;
                            WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                            minimumWidth = childAt3.getMinimumWidth();
                        }
                        if (minimumWidth != 0) {
                            if (rect4.width() < (z3 ? ((f) childAt3).getChildAt(i6).getMinimumWidth() : childAt3.getMinimumWidth())) {
                            }
                        }
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), iMakeMeasureSpec4);
                    }
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i16, 1073741824), iMakeMeasureSpec4);
                    if (i15 != 0) {
                        i5 = 1;
                        layoutParams4.b = true;
                        this.f = childAt3;
                        z2 = true;
                    }
                    i15++;
                    i11 = i5;
                }
                i5 = 1;
                i15++;
                i11 = i5;
            }
        }
        boolean z4 = z2;
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + iMin);
        this.e = z4;
        i7i0 i7i0Var = this.E;
        if (i7i0Var.a == 0 || z4) {
            return;
        }
        i7i0Var.a();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        boolean z = savedState.c;
        boolean z2 = this.e;
        if (z) {
            if (!z2) {
                this.F = true;
            }
            if (this.G || e(0.0f)) {
                this.F = true;
            }
        } else {
            if (!z2) {
                this.F = false;
            }
            if (this.G || e(1.0f)) {
                this.F = false;
            }
        }
        this.F = savedState.c;
        setLockMode(savedState.d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.e ? c() : this.F;
        savedState.d = this.J;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.G = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e) {
            return super.onTouchEvent(motionEvent);
        }
        i7i0 i7i0Var = this.E;
        i7i0Var.m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.A = x;
            this.B = y;
            return true;
        }
        if (actionMasked == 1 && a(this.f)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f2 = x2 - this.A;
            float f3 = y2 - this.B;
            int i = i7i0Var.b;
            if ((f3 * f3) + (f2 * f2) < i * i && i7i0.l(this.f, (int) x2, (int) y2)) {
                if (!this.e) {
                    this.F = false;
                }
                if (this.G || e(1.0f)) {
                    this.F = false;
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof f) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.e) {
            return;
        }
        this.F = view == this.f;
    }

    @Deprecated
    public void setCoveredFadeColor(int i) {
        this.b = i;
    }

    public final void setLockMode(int i) {
        this.J = i;
    }

    @Deprecated
    public void setPanelSlideListener(e eVar) {
        e eVar2 = this.D;
        CopyOnWriteArrayList copyOnWriteArrayList = this.C;
        if (eVar2 != null) {
            copyOnWriteArrayList.remove(eVar2);
        }
        if (eVar != null) {
            copyOnWriteArrayList.add(eVar);
        }
        this.D = eVar;
    }

    public void setParallaxDistance(int i) {
        this.z = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.d = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(getContext().getDrawable(i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(getContext().getDrawable(i));
    }

    @Deprecated
    public void setSliderFadeColor(int i) {
        this.a = i;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean c;
        public int d;

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.c = parcel.readInt() != 0;
            this.d = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int[] d = {R.attr.layout_weight};
        public float a;
        public boolean b;
        public boolean c;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d);
            this.a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
            this.a = 0.0f;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }
}
