package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.customview.view.AbsSavedState;
import androidx.media3.session.fe;
import e2.s;
import e2.w;
import f2.a1;
import f2.b1;
import f2.d1;
import f2.e1;
import f2.f0;
import f2.q3;
import f2.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k.c0;
import k.h1;
import k.k;
import k.u;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements a1, b1 {
    public static final ThreadLocal<Map<String, Constructor<c>>> A;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final Comparator<View> E;
    public static final w.a<Rect> F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f8937v = "CoordinatorLayout";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f8938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f8939x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f8940y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Class<?>[] f8941z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<View> f8942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0.b<View> f8943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<View> f8944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<View> f8945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f8946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f8947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f8948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f8951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f8952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f8953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f8954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q3 f8956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f8958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f8959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e1 f8960t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d1 f8961u;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements e1 {
        public a() {
        }

        @Override // f2.e1
        public q3 a(View view, q3 q3Var) {
            return CoordinatorLayout.this.b0(q3Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        @NonNull
        c getBehavior();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class c<V extends View> {
        public c() {
        }

        @Nullable
        public static Object getTag(@NonNull View view) {
            return ((g) view.getLayoutParams()).f8982r;
        }

        public static void setTag(@NonNull View view, @Nullable Object obj) {
            ((g) view.getLayoutParams()).f8982r = obj;
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
            return getScrimOpacity(coordinatorLayout, v10) > 0.0f;
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull Rect rect) {
            return false;
        }

        @k
        public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
            return -16777216;
        }

        @k.w(from = 0.0d, to = 1.0d)
        public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view) {
            return false;
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view) {
            return false;
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
            return false;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10) {
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull Rect rect, boolean z10) {
            return false;
        }

        @Nullable
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view) {
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
            if (i12 == 0) {
                onNestedPreScroll(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                onNestedScroll(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10, int i11) {
            if (i11 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v10, view, view2, i10);
            }
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10, int i11) {
            if (i11 == 0) {
                return onStartNestedScroll(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10) {
            if (i10 == 0) {
                onStopNestedScroll(coordinatorLayout, v10, view);
            }
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            onNestedScroll(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        public void onAttachedToLayoutParams(@NonNull g gVar) {
        }

        public void onDetachedFromLayoutParams() {
        }

        @NonNull
        public q3 onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull q3 q3Var) {
            return q3Var;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view) {
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull Parcelable parcelable) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f implements ViewGroup.OnHierarchyChangeListener {
        public f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f8959s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.M(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f8959s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h implements ViewTreeObserver.OnPreDrawListener {
        public h() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.M(0);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fI0 = z1.I0(view);
            float fI1 = z1.I0(view2);
            if (fI0 > fI1) {
                return -1;
            }
            return fI0 < fI1 ? 1 : 0;
        }
    }

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        f8938w = r10 != null ? r10.getName() : null;
        E = new i();
        f8941z = new Class[]{Context.class, AttributeSet.class};
        A = new ThreadLocal<>();
        F = new w.c(12);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c P(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(fe.F)) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f8938w;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + kj.e.f102543c + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = A;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f8941z);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    public static void T(@NonNull Rect rect) {
        rect.setEmpty();
        F.b(rect);
    }

    public static int W(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    public static int X(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    public static int Y(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    @NonNull
    public static Rect e() {
        Rect rectA = F.a();
        return rectA == null ? new Rect() : rectA;
    }

    private static int g(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public final void A(View view, int i10, Rect rect, Rect rect2, g gVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int iD = f0.d(W(gVar.f8967c), i10);
        int iD2 = f0.d(X(gVar.f8968d), i10);
        int i13 = iD & 7;
        int i14 = iD & 112;
        int i15 = iD2 & 7;
        int i16 = iD2 & 112;
        if (i15 != 1) {
            iWidth = i15 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i16 != 16) {
            iHeight = i16 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    public final int B(int i10) {
        int[] iArr = this.f8951k;
        if (iArr == null) {
            Log.e(f8937v, "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e(f8937v, "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    public void C(View view, Rect rect) {
        rect.set(((g) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g D(View view) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.f8966b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e(f8937v, "Attached behavior class is null");
                }
                gVar.q(behavior);
                gVar.f8966b = true;
                return gVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    gVar.q(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e(f8937v, "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            gVar.f8966b = true;
        }
        return gVar;
    }

    public final void E(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = E;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean F(View view) {
        return this.f8943c.j(view);
    }

    public boolean G(@NonNull View view, int i10, int i11) {
        Rect rectE = e();
        y(view, rectE);
        try {
            return rectE.contains(i10, i11);
        } finally {
            T(rectE);
        }
    }

    public final void H(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        Rect rectE = e();
        rectE.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        if (this.f8956p != null && z1.W(this) && !z1.W(view)) {
            rectE.left += this.f8956p.p();
            rectE.top += this.f8956p.r();
            rectE.right -= this.f8956p.q();
            rectE.bottom -= this.f8956p.o();
        }
        Rect rectE2 = e();
        f0.b(X(gVar.f8967c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectE, rectE2, i10);
        view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        T(rectE);
        T(rectE2);
    }

    public final void I(View view, View view2, int i10) {
        Rect rectE = e();
        Rect rectE2 = e();
        try {
            y(view2, rectE);
            z(view, i10, rectE, rectE2);
            view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        } finally {
            T(rectE);
            T(rectE2);
        }
    }

    public final void J(View view, int i10, int i11) {
        int i12;
        g gVar = (g) view.getLayoutParams();
        int iD = f0.d(Y(gVar.f8967c), i11);
        int i13 = iD & 7;
        int i14 = iD & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iB = B(i10) - measuredWidth;
        if (i13 == 1) {
            iB += measuredWidth / 2;
        } else if (i13 == 5) {
            iB += measuredWidth;
        }
        if (i14 != 16) {
            i12 = i14 != 80 ? 0 : measuredHeight;
        } else {
            i12 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(iB, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    public final void K(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (z1.Y0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            g gVar = (g) view.getLayoutParams();
            c cVarF = gVar.f();
            Rect rectE = e();
            Rect rectE2 = e();
            rectE2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.getInsetDodgeRect(this, view, rectE)) {
                rectE.set(rectE2);
            } else if (!rectE2.contains(rectE)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectE.toShortString() + " | Bounds:" + rectE2.toShortString());
            }
            T(rectE2);
            if (rectE.isEmpty()) {
                T(rectE);
                return;
            }
            int iD = f0.d(gVar.f8972h, i10);
            boolean z12 = true;
            if ((iD & 48) != 48 || (i15 = (rectE.top - ((ViewGroup.MarginLayoutParams) gVar).topMargin) - gVar.f8974j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                a0(view, i16 - i15);
                z10 = true;
            }
            if ((iD & 80) == 80 && (height = ((getHeight() - rectE.bottom) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) + gVar.f8974j) < (i14 = rect.bottom)) {
                a0(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                a0(view, 0);
            }
            if ((iD & 3) != 3 || (i12 = (rectE.left - ((ViewGroup.MarginLayoutParams) gVar).leftMargin) - gVar.f8973i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                Z(view, i13 - i12);
                z11 = true;
            }
            if ((iD & 5) != 5 || (width = ((getWidth() - rectE.right) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin) + gVar.f8973i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                Z(view, width - i11);
            }
            if (!z12) {
                Z(view, 0);
            }
            T(rectE);
        }
    }

    public void L(View view, int i10) {
        c cVarF;
        g gVar = (g) view.getLayoutParams();
        if (gVar.f8975k != null) {
            Rect rectE = e();
            Rect rectE2 = e();
            Rect rectE3 = e();
            y(gVar.f8975k, rectE);
            v(view, false, rectE2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            A(view, i10, rectE, rectE3, gVar, measuredWidth, measuredHeight);
            boolean z10 = (rectE3.left == rectE2.left && rectE3.top == rectE2.top) ? false : true;
            h(gVar, rectE3, measuredWidth, measuredHeight);
            int i11 = rectE3.left - rectE2.left;
            int i12 = rectE3.top - rectE2.top;
            if (i11 != 0) {
                z1.h1(view, i11);
            }
            if (i12 != 0) {
                z1.i1(view, i12);
            }
            if (z10 && (cVarF = gVar.f()) != null) {
                cVarF.onDependentViewChanged(this, view, gVar.f8975k);
            }
            T(rectE);
            T(rectE2);
            T(rectE3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    public final void M(int i10) {
        int i11;
        c cVarF;
        boolean zOnDependentViewChanged;
        int iC0 = z1.c0(this);
        int size = this.f8942b.size();
        Rect rectE = e();
        Rect rectE2 = e();
        Rect rectE3 = e();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.f8942b.get(i12);
            g gVar = (g) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (gVar.f8976l == this.f8942b.get(i13)) {
                        L(view, iC0);
                    }
                }
                v(view, true, rectE2);
                if (gVar.f8971g != 0 && !rectE2.isEmpty()) {
                    int iD = f0.d(gVar.f8971g, iC0);
                    int i14 = iD & 112;
                    if (i14 == 48) {
                        rectE.top = Math.max(rectE.top, rectE2.bottom);
                    } else if (i14 == 80) {
                        rectE.bottom = Math.max(rectE.bottom, getHeight() - rectE2.top);
                    }
                    int i15 = iD & 7;
                    if (i15 == 3) {
                        rectE.left = Math.max(rectE.left, rectE2.right);
                    } else if (i15 == 5) {
                        rectE.right = Math.max(rectE.right, getWidth() - rectE2.left);
                    }
                }
                if (gVar.f8972h != 0 && view.getVisibility() == 0) {
                    K(view, rectE, iC0);
                }
                if (i10 != 2) {
                    C(view, rectE3);
                    if (!rectE3.equals(rectE2)) {
                        S(view, rectE2);
                        for (i11 = i12 + 1; i11 < size; i11++) {
                            View view2 = this.f8942b.get(i11);
                            g gVar2 = (g) view2.getLayoutParams();
                            cVarF = gVar2.f();
                            if (cVarF == null && cVarF.layoutDependsOn(this, view2, view)) {
                                if (i10 == 0 && gVar2.g()) {
                                    gVar2.l();
                                } else {
                                    if (i10 != 2) {
                                        zOnDependentViewChanged = cVarF.onDependentViewChanged(this, view2, view);
                                    } else {
                                        cVarF.onDependentViewRemoved(this, view2, view);
                                        zOnDependentViewChanged = true;
                                    }
                                    if (i10 == 1) {
                                        gVar2.r(zOnDependentViewChanged);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i11 < size) {
                        View view3 = this.f8942b.get(i11);
                        g gVar3 = (g) view3.getLayoutParams();
                        cVarF = gVar3.f();
                        if (cVarF == null) {
                        }
                    }
                }
            }
        }
        T(rectE);
        T(rectE2);
        T(rectE3);
    }

    public void N(@NonNull View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        if (gVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = gVar.f8975k;
        if (view2 != null) {
            I(view, view2, i10);
            return;
        }
        int i11 = gVar.f8969e;
        if (i11 >= 0) {
            J(view, i11, i10);
        } else {
            H(view, i10);
        }
    }

    public void O(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    public final boolean Q(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f8944d;
        E(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            g gVar = (g) view.getLayoutParams();
            c cVarF = gVar.f();
            if (!(zOnInterceptTouchEvent || z10) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && cVarF != null) {
                    if (i10 == 0) {
                        zOnInterceptTouchEvent = cVarF.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zOnInterceptTouchEvent = cVarF.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.f8952l = view;
                    }
                }
                boolean zC = gVar.c();
                boolean zJ = gVar.j(this, view);
                z10 = zJ && !zC;
                if (zJ && !z10) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    cVarF.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    cVarF.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    public final void R() {
        this.f8942b.clear();
        this.f8943c.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            g gVarD = D(childAt);
            gVarD.d(this, childAt);
            this.f8943c.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (gVarD.b(this, childAt, childAt2)) {
                        if (!this.f8943c.d(childAt2)) {
                            this.f8943c.b(childAt2);
                        }
                        this.f8943c.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f8942b.addAll(this.f8943c.i());
        Collections.reverse(this.f8942b);
    }

    public void S(View view, Rect rect) {
        ((g) view.getLayoutParams()).s(rect);
    }

    public void U() {
        if (this.f8950j && this.f8954n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f8954n);
        }
        this.f8955o = false;
    }

    public final void V(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarF = ((g) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVarF.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    cVarF.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((g) getChildAt(i11).getLayoutParams()).n();
        }
        this.f8952l = null;
        this.f8949i = false;
    }

    public final void Z(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int i11 = gVar.f8973i;
        if (i11 != i10) {
            z1.h1(view, i10 - i11);
            gVar.f8973i = i10;
        }
    }

    public final void a0(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int i11 = gVar.f8974j;
        if (i11 != i10) {
            z1.i1(view, i10 - i11);
            gVar.f8974j = i10;
        }
    }

    public final q3 b0(q3 q3Var) {
        if (s.a(this.f8956p, q3Var)) {
            return q3Var;
        }
        this.f8956p = q3Var;
        boolean z10 = false;
        boolean z11 = q3Var != null && q3Var.r() > 0;
        this.f8957q = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        q3 q3VarI = i(q3Var);
        requestLayout();
        return q3VarI;
    }

    public final void c0() {
        if (!z1.W(this)) {
            z1.j2(this, null);
            return;
        }
        if (this.f8960t == null) {
            this.f8960t = new a();
        }
        z1.j2(this, this.f8960t);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        g gVar = (g) view.getLayoutParams();
        c cVar = gVar.f8965a;
        if (cVar != null) {
            float scrimOpacity = cVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.f8946f == null) {
                    this.f8946f = new Paint();
                }
                this.f8946f.setColor(gVar.f8965a.getScrimColor(this, view));
                this.f8946f.setAlpha(g(Math.round(scrimOpacity * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f8946f);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8958r;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void f() {
        if (this.f8950j) {
            if (this.f8954n == null) {
                this.f8954n = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f8954n);
        }
        this.f8955o = true;
    }

    @h1
    public final List<View> getDependencySortedChildren() {
        R();
        return Collections.unmodifiableList(this.f8942b);
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public final q3 getLastWindowInsets() {
        return this.f8956p;
    }

    @Override // android.view.ViewGroup, f2.c1
    public int getNestedScrollAxes() {
        return this.f8961u.a();
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.f8958r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final void h(g gVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    public final q3 i(q3 q3Var) {
        c cVarF;
        if (q3Var.A()) {
            return q3Var;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (z1.W(childAt) && (cVarF = ((g) childAt.getLayoutParams()).f()) != null) {
                q3Var = cVarF.onApplyWindowInsets(this, childAt, q3Var);
                if (q3Var.A()) {
                    return q3Var;
                }
            }
        }
        return q3Var;
    }

    @Override // f2.a1
    public void j(View view, View view2, int i10, int i11) {
        c cVarF;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f8961u.c(view, view2, i10, i11);
        this.f8953m = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i11) && (cVarF = gVar.f()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                cVarF.onNestedScrollAccepted(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // f2.a1
    public void k(View view, int i10) {
        this.f8961u.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i10)) {
                c cVarF = gVar.f();
                if (cVarF != null) {
                    cVarF.onStopNestedScroll(this, childAt, view, i10);
                }
                gVar.m(i10);
                gVar.l();
            }
        }
        this.f8953m = null;
    }

    public void l(@NonNull View view) {
        List listG = this.f8943c.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < listG.size(); i10++) {
            View view2 = (View) listG.get(i10);
            c cVarF = ((g) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.onDependentViewChanged(this, view2, view);
            }
        }
    }

    @Override // f2.a1
    public void m(View view, int i10, int i11, int i12, int i13, int i14) {
        q(view, i10, i11, i12, i13, 0, this.f8948h);
    }

    public boolean n(@NonNull View view, @NonNull View view2) {
        boolean z10 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectE = e();
        v(view, view.getParent() != this, rectE);
        Rect rectE2 = e();
        v(view2, view2.getParent() != this, rectE2);
        try {
            if (rectE.left <= rectE2.right && rectE.top <= rectE2.bottom && rectE.right >= rectE2.left && rectE.bottom >= rectE2.top) {
                z10 = true;
            }
            return z10;
        } finally {
            T(rectE);
            T(rectE2);
        }
    }

    @Override // f2.a1
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i12) && (cVarF = gVar.f()) != null) {
                    int[] iArr2 = this.f8947g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.onNestedPreScroll(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f8947g;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f8947g;
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            M(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        V(false);
        if (this.f8955o) {
            if (this.f8954n == null) {
                this.f8954n = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f8954n);
        }
        if (this.f8956p == null && z1.W(this)) {
            z1.A1(this);
        }
        this.f8950j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        V(false);
        if (this.f8955o && this.f8954n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f8954n);
        }
        View view = this.f8953m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f8950j = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f8957q || this.f8958r == null) {
            return;
        }
        q3 q3Var = this.f8956p;
        int iR = q3Var != null ? q3Var.r() : 0;
        if (iR > 0) {
            this.f8958r.setBounds(0, 0, getWidth(), iR);
            this.f8958r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            V(true);
        }
        boolean zQ = Q(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zQ;
        }
        V(true);
        return zQ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVarF;
        int iC0 = z1.c0(this);
        int size = this.f8942b.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f8942b.get(i14);
            if (view.getVisibility() != 8 && ((cVarF = ((g) view.getLayoutParams()).f()) == null || !cVarF.onLayoutChild(this, view, iC0))) {
                N(view, iC0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVarF;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        View view;
        int i22;
        int i23;
        boolean zOnMeasureChild;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.R();
        coordinatorLayout.p();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iC0 = z1.c0(coordinatorLayout);
        boolean z10 = iC0 == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z11 = coordinatorLayout.f8956p != null && z1.W(coordinatorLayout);
        int size3 = coordinatorLayout.f8942b.size();
        int i26 = 0;
        int iCombineMeasuredStates = 0;
        while (i26 < size3) {
            View view2 = coordinatorLayout.f8942b.get(i26);
            int i27 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i17 = size3;
                i13 = i26;
                i18 = paddingLeft;
                i15 = iC0;
                suggestedMinimumWidth = i27;
                i22 = paddingRight;
            } else {
                g gVar = (g) view2.getLayoutParams();
                int i28 = gVar.f8969e;
                if (i28 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                } else {
                    int iB = coordinatorLayout.B(i28);
                    int iD = f0.d(Y(gVar.f8967c), iC0) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((iD != 3 || z10) && !(iD == 5 && z10)) {
                        if ((iD == 5 && !z10) || (iD == 3 && z10)) {
                            iMax = Math.max(0, iB - paddingLeft);
                        }
                        if (z11 || z1.W(view2)) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int iP = coordinatorLayout.f8956p.p() + coordinatorLayout.f8956p.q();
                            int iR = coordinatorLayout.f8956p.r() + coordinatorLayout.f8956p.o();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iP, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iR, mode2);
                        }
                        cVarF = gVar.f();
                        if (cVarF != null) {
                            i17 = size3;
                            int i29 = iMakeMeasureSpec;
                            view = view2;
                            int i30 = i12;
                            i15 = iC0;
                            i16 = i30;
                            i18 = paddingLeft;
                            i19 = i27;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                            int i31 = iMakeMeasureSpec2;
                            zOnMeasureChild = cVarF.onMeasureChild(this, view, i29, i14, i31, 0);
                            i21 = i29;
                            i20 = i31;
                            if (zOnMeasureChild) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                            int iMax2 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            int i32 = i12;
                            i15 = iC0;
                            i16 = i32;
                            i17 = size3;
                            i18 = paddingLeft;
                            i19 = i27;
                            i20 = iMakeMeasureSpec2;
                            i21 = iMakeMeasureSpec;
                            view = view2;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.O(view3, i21, i14, i20, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                        int iMax3 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iB);
                    }
                    int i33 = i26;
                    i14 = iMax;
                    i13 = i33;
                    if (z11) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    cVarF = gVar.f();
                    if (cVarF != null) {
                        i17 = size3;
                        int i210 = iMakeMeasureSpec;
                        view = view2;
                        int i34 = i12;
                        i15 = iC0;
                        i16 = i34;
                        i18 = paddingLeft;
                        i19 = i27;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                        int i35 = iMakeMeasureSpec2;
                        zOnMeasureChild = cVarF.onMeasureChild(this, view, i210, i14, i35, 0);
                        i21 = i210;
                        i20 = i35;
                        if (zOnMeasureChild) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                        int iMax4 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        int i36 = i12;
                        i15 = iC0;
                        i16 = i36;
                        i17 = size3;
                        i18 = paddingLeft;
                        i19 = i27;
                        i20 = iMakeMeasureSpec2;
                        i21 = iMakeMeasureSpec;
                        view = view2;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.O(view4, i21, i14, i20, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                    int iMax5 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i13 = i26;
                i14 = 0;
                if (z11) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                cVarF = gVar.f();
                if (cVarF != null) {
                    i17 = size3;
                    int i211 = iMakeMeasureSpec;
                    view = view2;
                    int i37 = i12;
                    i15 = iC0;
                    i16 = i37;
                    i18 = paddingLeft;
                    i19 = i27;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                    int i38 = iMakeMeasureSpec2;
                    zOnMeasureChild = cVarF.onMeasureChild(this, view, i211, i14, i38, 0);
                    i21 = i211;
                    i20 = i38;
                    if (zOnMeasureChild) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                    int iMax6 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    int i39 = i12;
                    i15 = iC0;
                    i16 = i39;
                    i17 = size3;
                    i18 = paddingLeft;
                    i19 = i27;
                    i20 = iMakeMeasureSpec2;
                    i21 = iMakeMeasureSpec;
                    view = view2;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.O(view5, i21, i14, i20, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                int iMax7 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i26 = i13 + 1;
            paddingLeft = i18;
            paddingRight = i22;
            iC0 = i15;
            size3 = i17;
        }
        int i40 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i40), View.resolveSizeAndState(suggestedMinimumHeight, i11, i40 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c cVarF;
        View view2;
        float f12;
        float f13;
        boolean z11;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zOnNestedFling = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
                z11 = z10;
            } else {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (cVarF = gVar.f()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                    zOnNestedFling |= cVarF.onNestedFling(this, childAt, view2, f12, f13, z11);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
            z10 = z11;
        }
        if (zOnNestedFling) {
            M(1);
        }
        return zOnNestedFling;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c cVarF;
        View view2;
        float f12;
        float f13;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zOnNestedPreFling = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
            } else {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (cVarF = gVar.f()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    zOnNestedPreFling |= cVarF.onNestedPreFling(this, childAt, view2, f12, f13);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        j(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        SparseArray<Parcelable> sparseArray = savedState.f8962d;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarF = D(childAt).f();
            if (id2 != -1 && cVarF != null && (parcelable2 = sparseArray.get(id2)) != null) {
                cVarF.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarF = ((g) childAt.getLayoutParams()).f();
            if (id2 != -1 && cVarF != null && (parcelableOnSaveInstanceState = cVarF.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id2, parcelableOnSaveInstanceState);
            }
        }
        savedState.f8962d = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return r(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, f2.c1
    public void onStopNestedScroll(View view) {
        k(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zQ;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8952l == null) {
            zQ = Q(motionEvent, 1);
            if (!zQ) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.f8952l == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zQ) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zOnTouchEvent;
            }
            V(false);
            return zOnTouchEvent;
        }
        zQ = false;
        c cVarF = ((g) this.f8952l.getLayoutParams()).f();
        if (cVarF != null) {
            zOnTouchEvent = cVarF.onTouchEvent(this, this.f8952l, motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        motionEventObtain = null;
        if (this.f8952l == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
        } else if (zQ) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        V(false);
        return zOnTouchEvent;
    }

    public void p() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (F(getChildAt(i10))) {
                z10 = true;
                break;
            }
        }
        if (z10 != this.f8955o) {
            if (z10) {
                f();
            } else {
                U();
            }
        }
    }

    @Override // f2.b1
    public void q(@NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        c cVarF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i14) && (cVarF = gVar.f()) != null) {
                    int[] iArr2 = this.f8947g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.onNestedScroll(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f8947g;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f8947g;
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            M(1);
        }
    }

    @Override // f2.a1
    public boolean r(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                c cVarF = gVar.f();
                if (cVarF != null) {
                    boolean zOnStartNestedScroll = cVarF.onStartNestedScroll(this, childAt, view, view2, i10, i11);
                    z10 |= zOnStartNestedScroll;
                    gVar.t(i11, zOnStartNestedScroll);
                } else {
                    gVar.t(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVarF = ((g) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.onRequestChildRectangleOnScreen(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f8949i) {
            return;
        }
        V(false);
        this.f8949i = true;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        c0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f8959s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f8958r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f8958r = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f8958r.setState(getDrawableState());
                }
                l1.d.m(this.f8958r, z1.c0(this));
                this.f8958r.setVisible(getVisibility() == 0, false);
                this.f8958r.setCallback(this);
            }
            z1.s1(this);
        }
    }

    public void setStatusBarBackgroundColor(@k int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(@u int i10) {
        setStatusBarBackground(i10 != 0 ? f1.d.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f8958r;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f8958r.setVisible(z10, false);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public void v(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            y(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8958r;
    }

    @NonNull
    public List<View> w(@NonNull View view) {
        List<View> listH = this.f8943c.h(view);
        this.f8945e.clear();
        if (listH != null) {
            this.f8945e.addAll(listH);
        }
        return this.f8945e;
    }

    @NonNull
    public List<View> x(@NonNull View view) {
        List listG = this.f8943c.g(view);
        this.f8945e.clear();
        if (listG != null) {
            this.f8945e.addAll(listG);
        }
        return this.f8945e;
    }

    public void y(View view, Rect rect) {
        z0.c.a(this, view, rect);
    }

    public void z(View view, int i10, Rect rect, Rect rect2) {
        g gVar = (g) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        A(view, i10, rect, rect2, gVar, measuredWidth, measuredHeight);
        h(gVar, rect2, measuredWidth, measuredHeight);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, y0.a.C1534a.f145720b);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @k.f int i10) {
        TypedArray typedArrayObtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i10);
        this.f8942b = new ArrayList();
        this.f8943c = new z0.b<>();
        this.f8944d = new ArrayList();
        this.f8945e = new ArrayList();
        this.f8947g = new int[2];
        this.f8948h = new int[2];
        this.f8961u = new d1(this);
        if (i10 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.j.f145849g, 0, y0.a.i.f145842h);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.j.f145849g, i10, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, y0.a.j.f145849g, attributeSet, typedArray, 0, y0.a.i.f145842h);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, y0.a.j.f145849g, attributeSet, typedArray, i10, 0);
        }
        int resourceId = typedArray.getResourceId(y0.a.j.f145850h, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f8951k = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f8951k.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = coordinatorLayout.f8951k;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        coordinatorLayout.f8958r = typedArray.getDrawable(y0.a.j.f145851i);
        typedArray.recycle();
        c0();
        super.setOnHierarchyChangeListener(new f());
        if (z1.X(this) == 0) {
            z1.Y1(this, 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SparseArray<Parcelable> f8962d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f8962d = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f8962d.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f8962d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f8962d.keyAt(i11);
                parcelableArr[i11] = this.f8962d.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f8965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8968d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8969e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8970f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8971g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8972h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8973i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8974j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public View f8975k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public View f8976l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f8977m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f8978n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f8979o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f8980p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Rect f8981q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f8982r;

        public g(int i10, int i11) {
            super(i10, i11);
            this.f8966b = false;
            this.f8967c = 0;
            this.f8968d = 0;
            this.f8969e = -1;
            this.f8970f = -1;
            this.f8971g = 0;
            this.f8972h = 0;
            this.f8981q = new Rect();
        }

        public boolean a() {
            return this.f8975k == null && this.f8970f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f8976l || u(view2, z1.c0(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f8965a;
            return cVar != null && cVar.layoutDependsOn(coordinatorLayout, view, view2);
        }

        public boolean c() {
            if (this.f8965a == null) {
                this.f8977m = false;
            }
            return this.f8977m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f8970f == -1) {
                this.f8976l = null;
                this.f8975k = null;
                return null;
            }
            if (this.f8975k == null || !v(view, coordinatorLayout)) {
                o(view, coordinatorLayout);
            }
            return this.f8975k;
        }

        @c0
        public int e() {
            return this.f8970f;
        }

        @Nullable
        public c f() {
            return this.f8965a;
        }

        public boolean g() {
            return this.f8980p;
        }

        public Rect h() {
            return this.f8981q;
        }

        public void i() {
            this.f8976l = null;
            this.f8975k = null;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f8977m;
            if (z10) {
                return true;
            }
            c cVar = this.f8965a;
            boolean zBlocksInteractionBelow = (cVar != null ? cVar.blocksInteractionBelow(coordinatorLayout, view) : false) | z10;
            this.f8977m = zBlocksInteractionBelow;
            return zBlocksInteractionBelow;
        }

        public boolean k(int i10) {
            if (i10 == 0) {
                return this.f8978n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f8979o;
        }

        public void l() {
            this.f8980p = false;
        }

        public void m(int i10) {
            t(i10, false);
        }

        public void n() {
            this.f8977m = false;
        }

        public final void o(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f8970f);
            this.f8975k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f8976l = null;
                    this.f8975k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f8970f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f8976l = null;
                this.f8975k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f8976l = null;
                    this.f8975k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f8976l = viewFindViewById;
        }

        public void p(@c0 int i10) {
            i();
            this.f8970f = i10;
        }

        public void q(@Nullable c cVar) {
            c cVar2 = this.f8965a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.onDetachedFromLayoutParams();
                }
                this.f8965a = cVar;
                this.f8982r = null;
                this.f8966b = true;
                if (cVar != null) {
                    cVar.onAttachedToLayoutParams(this);
                }
            }
        }

        public void r(boolean z10) {
            this.f8980p = z10;
        }

        public void s(Rect rect) {
            this.f8981q.set(rect);
        }

        public void t(int i10, boolean z10) {
            if (i10 == 0) {
                this.f8978n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f8979o = z10;
            }
        }

        public final boolean u(View view, int i10) {
            int iD = f0.d(((g) view.getLayoutParams()).f8971g, i10);
            return iD != 0 && (f0.d(this.f8972h, i10) & iD) == iD;
        }

        public final boolean v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f8975k.getId() != this.f8970f) {
                return false;
            }
            View view2 = this.f8975k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f8976l = null;
                    this.f8975k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f8976l = view2;
            return true;
        }

        public g(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8966b = false;
            this.f8967c = 0;
            this.f8968d = 0;
            this.f8969e = -1;
            this.f8970f = -1;
            this.f8971g = 0;
            this.f8972h = 0;
            this.f8981q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.j.f145852j);
            this.f8967c = typedArrayObtainStyledAttributes.getInteger(y0.a.j.f145853k, 0);
            this.f8970f = typedArrayObtainStyledAttributes.getResourceId(y0.a.j.f145854l, -1);
            this.f8968d = typedArrayObtainStyledAttributes.getInteger(y0.a.j.f145855m, 0);
            this.f8969e = typedArrayObtainStyledAttributes.getInteger(y0.a.j.f145859q, -1);
            this.f8971g = typedArrayObtainStyledAttributes.getInt(y0.a.j.f145858p, 0);
            this.f8972h = typedArrayObtainStyledAttributes.getInt(y0.a.j.f145857o, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(y0.a.j.f145856n);
            this.f8966b = zHasValue;
            if (zHasValue) {
                this.f8965a = CoordinatorLayout.P(context, attributeSet, typedArrayObtainStyledAttributes.getString(y0.a.j.f145856n));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f8965a;
            if (cVar != null) {
                cVar.onAttachedToLayoutParams(this);
            }
        }

        public g(g gVar) {
            super((ViewGroup.MarginLayoutParams) gVar);
            this.f8966b = false;
            this.f8967c = 0;
            this.f8968d = 0;
            this.f8969e = -1;
            this.f8970f = -1;
            this.f8971g = 0;
            this.f8972h = 0;
            this.f8981q = new Rect();
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8966b = false;
            this.f8967c = 0;
            this.f8968d = 0;
            this.f8969e = -1;
            this.f8970f = -1;
            this.f8971g = 0;
            this.f8972h = 0;
            this.f8981q = new Rect();
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8966b = false;
            this.f8967c = 0;
            this.f8968d = 0;
            this.f8969e = -1;
            this.f8970f = -1;
            this.f8971g = 0;
            this.f8972h = 0;
            this.f8981q = new Rect();
        }
    }
}
