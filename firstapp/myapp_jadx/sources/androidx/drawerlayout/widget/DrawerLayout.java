package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import defpackage.c7;
import defpackage.ds1;
import defpackage.e6;
import defpackage.g9i0;
import defpackage.hb5;
import defpackage.hoc;
import defpackage.i7i0;
import defpackage.l7;
import defpackage.l8j0;
import defpackage.r6i0;
import defpackage.ymn;
import defpackage.zk30;
import defpackage.zqh0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] T = {R.attr.colorPrimaryDark};
    public static final int[] U = {R.attr.layout_gravity};
    public static final boolean V;
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public e G;
    public ArrayList H;
    public float I;
    public float J;
    public Drawable K;
    public CharSequence L;
    public CharSequence M;
    public Object N;
    public boolean O;
    public final ArrayList<View> P;
    public Rect Q;
    public Matrix R;
    public final a S;
    public float a;
    public final int b;
    public int c;
    public float d;
    public final Paint e;
    public final i7i0 f;
    public final i7i0 i;
    public final g v;
    public final g w;
    public int y;
    public boolean z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int a;
        public float b;
        public boolean c;
        public int d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.U);
            this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class a implements l7 {
        public a() {
        }

        @Override // defpackage.l7
        public final boolean a(View view) {
            if (!DrawerLayout.l(view)) {
                return false;
            }
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.h(view) == 2) {
                return false;
            }
            drawerLayout.c(view, true);
            return true;
        }
    }

    public class b implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class c extends e6 {
        public c() {
            new Rect();
        }

        @Override // defpackage.e6
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence charSequence;
            if (accessibilityEvent.getEventType() != 32) {
                return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewG = drawerLayout.g();
            if (viewG == null) {
                return true;
            }
            int i = drawerLayout.i(viewG);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            int absoluteGravity = Gravity.getAbsoluteGravity(i, drawerLayout.getLayoutDirection());
            if (absoluteGravity == 3) {
                charSequence = drawerLayout.L;
            } else {
                charSequence = absoluteGravity == 5 ? drawerLayout.M : null;
            }
            if (charSequence == null) {
                return true;
            }
            text.add(charSequence);
            return true;
        }

        @Override // defpackage.e6
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // defpackage.e6
        public final void d(View view, c7 c7Var) {
            int[] iArr = DrawerLayout.T;
            AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            c7Var.l("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfo.setFocusable(false);
            accessibilityNodeInfo.setFocused(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c7.a.e.a);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c7.a.f.a);
        }

        @Override // defpackage.e6
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            int[] iArr = DrawerLayout.T;
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public static final class d extends e6 {
        @Override // defpackage.e6
        public final void d(View view, c7 c7Var) {
            AccessibilityNodeInfo accessibilityNodeInfo = c7Var.a;
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            int[] iArr = DrawerLayout.T;
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            if (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) {
                c7Var.b = -1;
                accessibilityNodeInfo.setParent(null);
            }
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(View view, float f);
    }

    public static abstract class f implements e {
        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public final void c(View view, float f) {
        }
    }

    public class g extends i7i0.c {
        public final int a;
        public i7i0 b;
        public final a c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                View viewF;
                int width;
                g gVar = g.this;
                DrawerLayout drawerLayout = DrawerLayout.this;
                int i = gVar.b.o;
                int i2 = gVar.a;
                boolean z = i2 == 3;
                if (z) {
                    viewF = drawerLayout.f(3);
                    width = (viewF != null ? -viewF.getWidth() : 0) + i;
                } else {
                    viewF = drawerLayout.f(5);
                    width = drawerLayout.getWidth() - i;
                }
                if (viewF != null) {
                    if (((!z || viewF.getLeft() >= width) && (z || viewF.getLeft() <= width)) || drawerLayout.h(viewF) != 0) {
                        return;
                    }
                    LayoutParams layoutParams = (LayoutParams) viewF.getLayoutParams();
                    gVar.b.u(viewF, width, viewF.getTop());
                    layoutParams.c = true;
                    drawerLayout.invalidate();
                    View viewF2 = drawerLayout.f(i2 == 3 ? 5 : 3);
                    if (viewF2 != null) {
                        drawerLayout.c(viewF2, true);
                    }
                    if (drawerLayout.F) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        drawerLayout.getChildAt(i3).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.F = true;
                }
            }
        }

        public g(int i) {
            this.a = i;
        }

        @Override // i7i0.c
        public final int a(int i, View view) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.b(3, view)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // i7i0.c
        public final int b(int i, View view) {
            return view.getTop();
        }

        @Override // i7i0.c
        public final int c(View view) {
            if (DrawerLayout.m(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // i7i0.c
        public final void e(int i, int i2) {
            int i3 = i & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewF = i3 == 1 ? drawerLayout.f(3) : drawerLayout.f(5);
            if (viewF == null || drawerLayout.h(viewF) != 0) {
                return;
            }
            this.b.c(i2, viewF);
        }

        @Override // i7i0.c
        public final void f(int i) {
            DrawerLayout.this.postDelayed(this.c, 160L);
        }

        @Override // i7i0.c
        public final void g(int i, View view) {
            ((LayoutParams) view.getLayoutParams()).c = false;
            int i2 = this.a == 3 ? 5 : 3;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewF = drawerLayout.f(i2);
            if (viewF != null) {
                drawerLayout.c(viewF, true);
            }
        }

        @Override // i7i0.c
        public final void h(int i) {
            DrawerLayout.this.s(i, this.b.t);
        }

        @Override // i7i0.c
        public final void i(View view, int i, int i2) {
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            float width2 = (drawerLayout.b(3, view) ? i + width : drawerLayout.getWidth() - i) / width;
            drawerLayout.p(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            drawerLayout.invalidate();
        }

        @Override // i7i0.c
        public final void j(View view, float f, float f2) {
            int i;
            int[] iArr = DrawerLayout.T;
            float f3 = ((LayoutParams) view.getLayoutParams()).b;
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.b(3, view)) {
                i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = drawerLayout.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.s(i, view.getTop());
            drawerLayout.invalidate();
        }

        @Override // i7i0.c
        public final boolean k(int i, View view) {
            if (!DrawerLayout.m(view)) {
                return false;
            }
            int i2 = this.a;
            DrawerLayout drawerLayout = DrawerLayout.this;
            return drawerLayout.b(i2, view) && drawerLayout.h(view) == 0;
        }
    }

    static {
        V = Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new d();
        this.c = -1728053248;
        this.e = new Paint();
        this.A = true;
        this.B = 3;
        this.C = 3;
        this.D = 3;
        this.E = 3;
        this.S = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.b = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        g gVar = new g(3);
        this.v = gVar;
        g gVar2 = new g(5);
        this.w = gVar2;
        i7i0 i7i0Var = new i7i0(getContext(), this, gVar);
        i7i0Var.b = (int) (i7i0Var.b * 1.0f);
        this.f = i7i0Var;
        i7i0Var.q = 1;
        i7i0Var.n = f3;
        gVar.b = i7i0Var;
        i7i0 i7i0Var2 = new i7i0(getContext(), this, gVar2);
        i7i0Var2.b = (int) (1.0f * i7i0Var2.b);
        this.i = i7i0Var2;
        i7i0Var2.q = 2;
        i7i0Var2.n = f3;
        gVar2.b = i7i0Var2;
        setFocusableInTouchMode(true);
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        setImportantForAccessibility(1);
        r6i0.p(this, new c());
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(T);
            try {
                this.K = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, zk30.a, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.a = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.a = getResources().getDimension(com.sportybet.android.gp.tz.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.P = new ArrayList<>();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static String j(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean k(View view) {
        return ((LayoutParams) view.getLayoutParams()).a == 0;
    }

    public static boolean l(View view) {
        if (m(view)) {
            return (((LayoutParams) view.getLayoutParams()).d & 1) == 1;
        }
        zqh0.a(view, "View ", " is not a drawer");
        return false;
    }

    public static boolean m(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).a;
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final void a(e eVar) {
        if (eVar == null) {
            return;
        }
        ArrayList arrayList = this.H;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.H = arrayList;
        }
        arrayList.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ArrayList<View> arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.P;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!m(childAt)) {
                arrayList2.add(childAt);
            } else if (l(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if ((((LayoutParams) childAt.getLayoutParams()).d & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || m(view)) {
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
            view.setImportantForAccessibility(1);
        }
    }

    public final boolean b(int i, View view) {
        return (i(view) & i) == i;
    }

    public final void c(View view, boolean z) {
        if (!m(view)) {
            zqh0.a(view, "View ", " is not a sliding drawer");
            return;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.A) {
            layoutParams.b = 0.0f;
            layoutParams.d = 0;
        } else if (z) {
            layoutParams.d |= 4;
            if (b(3, view)) {
                this.f.u(view, -view.getWidth(), view.getTop());
            } else {
                this.i.u(view, getWidth(), view.getTop());
            }
        } else {
            float f2 = ((LayoutParams) view.getLayoutParams()).b;
            float width = view.getWidth();
            int i = ((int) (width * 0.0f)) - ((int) (f2 * width));
            if (!b(3, view)) {
                i = -i;
            }
            view.offsetLeftAndRight(i);
            p(view, 0.0f);
            s(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).b);
        }
        this.d = fMax;
        boolean zH = this.f.h();
        boolean zH2 = this.i.h();
        if (zH || zH2) {
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            postInvalidateOnAnimation();
        }
    }

    public final void d() {
        View viewF = f(8388613);
        if (viewF != null) {
            c(viewF, true);
        } else {
            hoc.a(j(8388613), "No drawer view found with gravity ");
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.d <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            Rect rect = this.Q;
            if (rect == null) {
                rect = new Rect();
                this.Q = rect;
            }
            childAt.getHitRect(rect);
            if (this.Q.contains((int) x, (int) y) && !k(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        Matrix matrix2 = this.R;
                        if (matrix2 == null) {
                            matrix2 = new Matrix();
                            this.R = matrix2;
                        }
                        matrix.invert(matrix2);
                        motionEventObtain.transform(this.R);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zK = k(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zK) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m(childAt) && childAt.getHeight() >= height) {
                    if (b(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f2 = this.d;
        if (f2 > 0.0f && zK) {
            int i4 = this.c;
            Paint paint = this.e;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f2)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final void e(boolean z) {
        int childCount = getChildCount();
        boolean zU = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m(childAt) && (!z || layoutParams.c)) {
                zU |= b(3, childAt) ? this.f.u(childAt, -childAt.getWidth(), childAt.getTop()) : this.i.u(childAt, getWidth(), childAt.getTop());
                layoutParams.c = false;
            }
        }
        g gVar = this.v;
        DrawerLayout.this.removeCallbacks(gVar.c);
        g gVar2 = this.w;
        DrawerLayout.this.removeCallbacks(gVar2.c);
        if (zU) {
            invalidate();
        }
    }

    public final View f(int i) {
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m(childAt)) {
                if (!m(childAt)) {
                    zqh0.a(childAt, "View ", " is not a drawer");
                    return null;
                }
                if (((LayoutParams) childAt.getLayoutParams()).b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.a = 0;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.a = 0;
            layoutParams3.a = layoutParams2.a;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.a = 0;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.a = 0;
        return layoutParams5;
    }

    public float getDrawerElevation() {
        return this.a;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.K;
    }

    public final int h(View view) {
        if (!m(view)) {
            zqh0.a(view, "View ", " is not a drawer");
            return 0;
        }
        int i = ((LayoutParams) view.getLayoutParams()).a;
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.B;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.D : this.E;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.C;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.E : this.D;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.D;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.B : this.C;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.E;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.C : this.B;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    public final int i(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).a;
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    public final void n(int i) {
        View viewF = f(i);
        if (viewF != null) {
            o(viewF);
        } else {
            hoc.a(j(i), "No drawer view found with gravity ");
        }
    }

    public final void o(View view) {
        if (!m(view)) {
            zqh0.a(view, "View ", " is not a sliding drawer");
            return;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.A) {
            layoutParams.b = 1.0f;
            layoutParams.d = 1;
            r(view, true);
            q(view);
        } else {
            layoutParams.d |= 2;
            if (b(3, view)) {
                this.f.u(view, 0, view.getTop());
            } else {
                this.i.u(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.O || this.K == null) {
            return;
        }
        Object obj = this.N;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.K.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.K.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewI;
        int actionMasked = motionEvent.getActionMasked();
        i7i0 i7i0Var = this.f;
        boolean zT = i7i0Var.t(motionEvent) | this.i.t(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                e(true);
                this.F = false;
            } else if (actionMasked == 2) {
                int length = i7i0Var.d.length;
                for (int i = 0; i < length; i++) {
                    if ((i7i0Var.k & (1 << i)) != 0) {
                        float f2 = i7i0Var.f[i] - i7i0Var.d[i];
                        float f3 = i7i0Var.g[i] - i7i0Var.e[i];
                        float f4 = (f3 * f3) + (f2 * f2);
                        int i2 = i7i0Var.b;
                        if (f4 > i2 * i2) {
                            g gVar = this.v;
                            DrawerLayout.this.removeCallbacks(gVar.c);
                            g gVar2 = this.w;
                            DrawerLayout.this.removeCallbacks(gVar2.c);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                e(true);
                this.F = false;
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.I = x;
            this.J = y;
            z = this.d > 0.0f && (viewI = i7i0Var.i((int) x, (int) y)) != null && k(viewI);
            this.F = false;
        }
        if (!zT && !z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (!((LayoutParams) getChildAt(i3).getLayoutParams()).c) {
                }
            }
            if (!this.F) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || g() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewG = g();
        if (viewG != null && h(viewG) == 0) {
            e(false);
        }
        return viewG != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f2;
        float f3;
        int i5;
        boolean z2 = true;
        this.z = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (k(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(3, childAt)) {
                        float f4 = measuredWidth;
                        f2 = layoutParams.b;
                        i5 = (-measuredWidth) + ((int) (f4 * f2));
                        f3 = (measuredWidth + i5) / f4;
                    } else {
                        float f5 = measuredWidth;
                        f2 = layoutParams.b;
                        int i9 = i6 - ((int) (f5 * f2));
                        f3 = (i6 - i9) / f5;
                        i5 = i9;
                    }
                    boolean z3 = f3 != f2 ? z2 : false;
                    int i10 = layoutParams.a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z3) {
                        p(childAt, f3);
                    }
                    int i18 = layoutParams.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (V && (rootWindowInsets = getRootWindowInsets()) != null) {
            ymn ymnVarK = l8j0.h(null, rootWindowInsets).a.k();
            i7i0 i7i0Var = this.f;
            i7i0Var.o = Math.max(i7i0Var.p, ymnVarK.a);
            i7i0 i7i0Var2 = this.i;
            i7i0Var2.o = Math.max(i7i0Var2.p, ymnVarK.c);
        }
        this.z = false;
        this.A = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                hb5.a("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
                return;
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.N != null) {
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.a, layoutDirection);
                    boolean fitsSystemWindows = childAt.getFitsSystemWindows();
                    Object obj = this.N;
                    if (fitsSystemWindows) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) obj;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) obj;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (k(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!m(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    float fE = r6i0.d.e(childAt);
                    float f2 = this.a;
                    if (fE != f2) {
                        r6i0.d.l(childAt, f2);
                    }
                    int i4 = i(childAt) & 7;
                    boolean z4 = i4 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        ds1.a(j(i4), "Child drawer has absolute gravity ", " but this DrawerLayout already has a drawer view along that edge");
                        return;
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.b + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewF;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        int i = savedState.c;
        if (i != 0 && (viewF = f(i)) != null) {
            o(viewF);
        }
        int i2 = savedState.d;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = savedState.e;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = savedState.f;
        if (i4 != 3) {
            setDrawerLockMode(i4, 8388611);
        }
        int i5 = savedState.i;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.c = layoutParams.a;
                break;
            }
        }
        savedState.d = this.B;
        savedState.e = this.C;
        savedState.f = this.D;
        savedState.i = this.E;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        i7i0 i7i0Var = this.f;
        i7i0Var.m(motionEvent);
        this.i.m(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.I = x;
            this.J = y;
            this.F = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            e(true);
            this.F = false;
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        View viewI = i7i0Var.i((int) x2, (int) y2);
        if (viewI != null && k(viewI)) {
            float f2 = x2 - this.I;
            float f3 = y2 - this.J;
            int i = i7i0Var.b;
            if ((f3 * f3) + (f2 * f2) < i * i) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i2);
                    if ((((LayoutParams) childAt.getLayoutParams()).d & 1) == 1) {
                        break;
                    }
                    i2++;
                }
                z = childAt == null || h(childAt) == 2;
            }
        }
        e(z);
        return true;
    }

    public final void p(View view, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 == layoutParams.b) {
            return;
        }
        layoutParams.b = f2;
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((e) this.H.get(size)).c(view, f2);
            }
        }
    }

    public final void q(View view) {
        c7.a aVar = c7.a.n;
        r6i0.m(aVar.a(), view);
        r6i0.j(0, view);
        if (!l(view) || h(view) == 2) {
            return;
        }
        r6i0.n(view, aVar, null, this.S);
    }

    public final void r(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m(childAt)) && !(z && childAt == view)) {
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            e(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.z) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i, View view) {
        int i2;
        View rootView;
        int i3 = this.f.a;
        int i4 = this.i.a;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f2 = ((LayoutParams) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if ((layoutParams.d & 1) == 1) {
                    layoutParams.d = 0;
                    ArrayList arrayList = this.H;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((e) this.H.get(size)).b(view);
                        }
                    }
                    r(view, false);
                    q(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f2 == 1.0f) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                if ((layoutParams2.d & 1) == 0) {
                    layoutParams2.d = 1;
                    ArrayList arrayList2 = this.H;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((e) this.H.get(size2)).a(view);
                        }
                    }
                    r(view, true);
                    q(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.y) {
            this.y = i2;
            ArrayList arrayList3 = this.H;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((e) this.H.get(size3)).getClass();
                }
            }
        }
    }

    public void setChildInsets(Object obj, boolean z) {
        this.N = obj;
        this.O = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f2) {
        this.a = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m(childAt)) {
                float f3 = this.a;
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                r6i0.d.l(childAt, f3);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        ArrayList arrayList;
        e eVar2 = this.G;
        if (eVar2 != null && (arrayList = this.H) != null) {
            arrayList.remove(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.G = eVar;
    }

    public void setDrawerLockMode(int i, int i2) {
        View viewF;
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.B = i;
        } else if (i2 == 5) {
            this.C = i;
        } else if (i2 == 8388611) {
            this.D = i;
        } else if (i2 == 8388613) {
            this.E = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f : this.i).b();
        }
        if (i != 1) {
            if (i == 2 && (viewF = f(absoluteGravity)) != null) {
                o(viewF);
                return;
            }
            return;
        }
        View viewF2 = f(absoluteGravity);
        if (viewF2 != null) {
            c(viewF2, true);
        }
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(getContext().getDrawable(i), i2);
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        if (absoluteGravity == 3) {
            this.L = charSequence;
        } else if (absoluteGravity == 5) {
            this.M = charSequence;
        }
    }

    public void setScrimColor(int i) {
        this.c = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.K = i != 0 ? getContext().getDrawable(i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.K = new ColorDrawable(i);
        invalidate();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int c;
        public int d;
        public int e;
        public int f;
        public int i;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = 0;
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.i = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.i);
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
    }

    public void setDrawerShadow(Drawable drawable, int i) {
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.K = drawable;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerLockMode(int i, View view) {
        if (m(view)) {
            setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).a);
        } else {
            zqh0.a(view, "View ", " is not a drawer with appropriate layout_gravity");
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sportybet.android.gp.tz.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }
}
