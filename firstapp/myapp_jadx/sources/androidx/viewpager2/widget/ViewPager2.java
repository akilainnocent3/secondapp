package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import defpackage.a9i0;
import defpackage.c7;
import defpackage.fm20;
import defpackage.g9i0;
import defpackage.gk30;
import defpackage.hb5;
import defpackage.ib5;
import defpackage.l7;
import defpackage.p9h;
import defpackage.r6i0;
import defpackage.wxd0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public androidx.viewpager2.widget.d A;
    public androidx.viewpager2.widget.a B;
    public p9h C;
    public androidx.viewpager2.widget.c D;
    public RecyclerView.l E;
    public boolean F;
    public boolean G;
    public int H;
    public h I;
    public final Rect a;
    public final Rect b;
    public final androidx.viewpager2.widget.a c;
    public int d;
    public boolean e;
    public final a f;
    public f i;
    public int v;
    public Parcelable w;
    public k y;
    public j z;

    public class a extends e {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e, androidx.recyclerview.widget.RecyclerView.h
        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.e = true;
            viewPager2.A.l = true;
        }
    }

    public class b extends g {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void a(int i) {
            if (i == 0) {
                ViewPager2.this.g();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.d != i) {
                viewPager2.d = i;
                viewPager2.I.a();
            }
        }
    }

    public class c extends g {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.clearFocus();
            if (viewPager2.hasFocus()) {
                viewPager2.y.requestFocus(2);
            }
        }
    }

    public abstract class d {
    }

    public static abstract class e extends RecyclerView.h {
        @Override // androidx.recyclerview.widget.RecyclerView.h
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void b(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void c(int i, int i2, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void e(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void f(int i, int i2) {
            a();
        }
    }

    public class f extends LinearLayoutManager {
        public f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean E0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void U0(RecyclerView.z zVar, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.U0(zVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void k0(RecyclerView.u uVar, RecyclerView.z zVar, c7 c7Var) {
            super.k0(uVar, zVar, c7Var);
            ViewPager2.this.I.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void m0(RecyclerView.u uVar, RecyclerView.z zVar, View view, c7 c7Var) {
            int iU;
            ViewPager2 viewPager2 = ViewPager2.this;
            int iU2 = 0;
            if (viewPager2.getOrientation() == 1) {
                viewPager2.i.getClass();
                iU = RecyclerView.o.U(view);
            } else {
                iU = 0;
            }
            if (viewPager2.getOrientation() == 0) {
                viewPager2.i.getClass();
                iU2 = RecyclerView.o.U(view);
            }
            c7Var.n(c7.f.a(iU, 1, iU2, 1, false, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean z0(RecyclerView.u uVar, RecyclerView.z zVar, int i, Bundle bundle) {
            ViewPager2.this.I.getClass();
            return super.z0(uVar, zVar, i, bundle);
        }
    }

    public class h extends d {
        public final a a = new a();
        public final b b = new b();
        public androidx.viewpager2.widget.e c;

        public class a implements l7 {
            public a() {
            }

            @Override // defpackage.l7
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.G) {
                    viewPager2.e(currentItem, true);
                }
                return true;
            }
        }

        public class b implements l7 {
            public b() {
            }

            @Override // defpackage.l7
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.G) {
                    viewPager2.e(currentItem, true);
                }
                return true;
            }
        }

        public h() {
        }

        public final void a() {
            int itemCount;
            int i = R.id.accessibilityActionPageLeft;
            ViewPager2 viewPager2 = ViewPager2.this;
            r6i0.m(R.id.accessibilityActionPageLeft, viewPager2);
            r6i0.j(0, viewPager2);
            r6i0.m(R.id.accessibilityActionPageRight, viewPager2);
            r6i0.j(0, viewPager2);
            r6i0.m(R.id.accessibilityActionPageUp, viewPager2);
            r6i0.j(0, viewPager2);
            r6i0.m(R.id.accessibilityActionPageDown, viewPager2);
            r6i0.j(0, viewPager2);
            if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.G) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.b;
            a aVar = this.a;
            if (orientation != 0) {
                if (viewPager2.d < itemCount - 1) {
                    r6i0.n(viewPager2, new c7.a(R.id.accessibilityActionPageDown, (String) null), null, aVar);
                }
                if (viewPager2.d > 0) {
                    r6i0.n(viewPager2, new c7.a(R.id.accessibilityActionPageUp, (String) null), null, bVar);
                    return;
                }
                return;
            }
            boolean zB = viewPager2.b();
            int i2 = zB ? 16908360 : 16908361;
            if (zB) {
                i = 16908361;
            }
            if (viewPager2.d < itemCount - 1) {
                r6i0.n(viewPager2, new c7.a(i2, (String) null), null, aVar);
            }
            if (viewPager2.d > 0) {
                r6i0.n(viewPager2, new c7.a(i, (String) null), null, bVar);
            }
        }
    }

    public interface i {
        void a(View view, float f);
    }

    public class j extends d0 {
        public j() {
        }

        @Override // androidx.recyclerview.widget.d0, androidx.recyclerview.widget.j0
        public final View d(RecyclerView.o oVar) {
            androidx.viewpager2.widget.d dVar = ViewPager2.this.C.a;
            return super.d(oVar);
        }
    }

    public class k extends RecyclerView {
        public k(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.I.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.d);
            accessibilityEvent.setToIndex(viewPager2.d);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.G && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.G && super.onTouchEvent(motionEvent);
        }
    }

    public static class l implements Runnable {
        public final int a;
        public final RecyclerView b;

        public l(int i, k kVar) {
            this.a = i;
            this.b = kVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.s0(this.a);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new androidx.viewpager2.widget.a();
        this.e = false;
        this.f = new a();
        this.v = -1;
        this.E = null;
        this.F = false;
        this.G = true;
        this.H = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.I = new h();
        k kVar = new k(context);
        this.y = kVar;
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        kVar.setId(View.generateViewId());
        this.y.setDescendantFocusability(131072);
        f fVar = new f();
        this.i = fVar;
        this.y.setLayoutManager(fVar);
        this.y.setScrollingTouchSlop(1);
        int[] iArr = gk30.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        r6i0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.y.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            k kVar2 = this.y;
            a9i0 a9i0Var = new a9i0();
            ArrayList arrayList = kVar2.S;
            if (arrayList == null) {
                arrayList = new ArrayList();
                kVar2.S = arrayList;
            }
            arrayList.add(a9i0Var);
            androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this);
            this.A = dVar;
            this.C = new p9h(dVar);
            j jVar = new j();
            this.z = jVar;
            jVar.a(this.y);
            this.y.k(this.A);
            androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
            this.B = aVar;
            this.A.a = aVar;
            b bVar = new b();
            c cVar = new c();
            this.B.a.add(bVar);
            this.B.a.add(cVar);
            h hVar = this.I;
            k kVar3 = this.y;
            hVar.getClass();
            kVar3.setImportantForAccessibility(2);
            hVar.c = new androidx.viewpager2.widget.e(hVar);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            androidx.viewpager2.widget.a aVar2 = this.B;
            aVar2.a.add(this.c);
            androidx.viewpager2.widget.c cVar2 = new androidx.viewpager2.widget.c(this.i);
            this.D = cVar2;
            this.B.a.add(cVar2);
            k kVar4 = this.y;
            attachViewToParent(kVar4, 0, kVar4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean b() {
        return this.i.b.getLayoutDirection() == 1;
    }

    public final void c(g gVar) {
        this.c.a.add(gVar);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.y.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.y.canScrollVertically(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        RecyclerView.f adapter;
        if (this.v == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.w;
        if (parcelable != null) {
            if (adapter instanceof wxd0) {
                ((wxd0) adapter).e(parcelable);
            }
            this.w = null;
        }
        int iMax = Math.max(0, Math.min(this.v, adapter.getItemCount() - 1));
        this.d = iMax;
        this.v = -1;
        this.y.o0(iMax);
        this.I.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i2 = ((SavedState) parcelable).a;
            sparseArray.put(this.y.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e(int i2, boolean z) {
        androidx.viewpager2.widget.a aVar;
        RecyclerView.f adapter = getAdapter();
        if (adapter == null) {
            if (this.v != -1) {
                this.v = Math.max(i2, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i2, 0), adapter.getItemCount() - 1);
        int i3 = this.d;
        if (iMin == i3 && this.A.f == 0) {
            return;
        }
        if (iMin == i3 && z) {
            return;
        }
        double d2 = i3;
        this.d = iMin;
        this.I.a();
        androidx.viewpager2.widget.d dVar = this.A;
        if (dVar.f != 0) {
            dVar.e();
            androidx.viewpager2.widget.d.a aVar2 = dVar.g;
            d2 = ((double) aVar2.a) + ((double) aVar2.b);
        }
        androidx.viewpager2.widget.d dVar2 = this.A;
        dVar2.getClass();
        dVar2.e = z ? 2 : 3;
        boolean z2 = dVar2.i != iMin;
        dVar2.i = iMin;
        dVar2.c(2);
        if (z2 && (aVar = dVar2.a) != null) {
            aVar.c(iMin);
        }
        if (!z) {
            this.y.o0(iMin);
            return;
        }
        double d3 = iMin;
        double dAbs = Math.abs(d3 - d2);
        k kVar = this.y;
        if (dAbs <= 3.0d) {
            kVar.s0(iMin);
            return;
        }
        kVar.o0(d3 > d2 ? iMin - 3 : iMin + 3);
        k kVar2 = this.y;
        kVar2.post(new l(iMin, kVar2));
    }

    public final void f(g gVar) {
        this.c.a.remove(gVar);
    }

    public final void g() {
        j jVar = this.z;
        if (jVar == null) {
            ib5.a("Design assumption violated.");
            return;
        }
        View viewD = jVar.d(this.i);
        if (viewD == null) {
            return;
        }
        this.i.getClass();
        int iU = RecyclerView.o.U(viewD);
        if (iU != this.d && getScrollState() == 0) {
            this.B.c(iU);
        }
        this.e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.I.getClass();
        this.I.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.f getAdapter() {
        return this.y.getAdapter();
    }

    public int getCurrentItem() {
        return this.d;
    }

    public int getItemDecorationCount() {
        return this.y.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.H;
    }

    public int getOrientation() {
        return this.i.E == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        k kVar = this.y;
        if (getOrientation() == 0) {
            height = kVar.getWidth() - kVar.getPaddingLeft();
            paddingBottom = kVar.getPaddingRight();
        } else {
            height = kVar.getHeight() - kVar.getPaddingTop();
            paddingBottom = kVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.A.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            itemCount = viewPager2.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = viewPager2.getAdapter().getItemCount();
            itemCount = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c7.e.a(itemCount, itemCount2, 0).a);
        RecyclerView.f adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !viewPager2.G) {
            return;
        }
        if (viewPager2.d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.d < itemCount3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.y.getMeasuredWidth();
        int measuredHeight = this.y.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.a;
        rect.left = paddingLeft;
        rect.right = (i4 - i2) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i5 - i3) - getPaddingBottom();
        Rect rect2 = this.b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.y.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.e) {
            g();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        measureChild(this.y, i2, i3);
        int measuredWidth = this.y.getMeasuredWidth();
        int measuredHeight = this.y.getMeasuredHeight();
        int measuredState = this.y.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.v = savedState.b;
        this.w = savedState.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.y.getId();
        int i2 = this.v;
        if (i2 == -1) {
            i2 = this.d;
        }
        savedState.b = i2;
        Parcelable parcelable = this.w;
        if (parcelable != null) {
            savedState.c = parcelable;
            return savedState;
        }
        Object adapter = this.y.getAdapter();
        if (adapter instanceof wxd0) {
            savedState.c = ((wxd0) adapter).a();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i2, Bundle bundle) {
        this.I.getClass();
        if (i2 != 8192 && i2 != 4096) {
            return super.performAccessibilityAction(i2, bundle);
        }
        h hVar = this.I;
        hVar.getClass();
        ViewPager2 viewPager2 = ViewPager2.this;
        if (i2 != 8192 && i2 != 4096) {
            fm20.a();
            return false;
        }
        int currentItem = i2 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.G) {
            viewPager2.e(currentItem, true);
        }
        return true;
    }

    public void setAdapter(RecyclerView.f fVar) {
        RecyclerView.f adapter = this.y.getAdapter();
        h hVar = this.I;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(hVar.c);
        } else {
            hVar.getClass();
        }
        a aVar = this.f;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(aVar);
        }
        this.y.setAdapter(fVar);
        this.d = 0;
        d();
        h hVar2 = this.I;
        hVar2.a();
        if (fVar != null) {
            fVar.registerAdapterDataObserver(hVar2.c);
        }
        if (fVar != null) {
            fVar.registerAdapterDataObserver(aVar);
        }
    }

    public void setCurrentItem(int i2, boolean z) {
        androidx.viewpager2.widget.d dVar = this.C.a;
        e(i2, z);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.I.a();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            hb5.a("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.H = i2;
            this.y.requestLayout();
        }
    }

    public void setOrientation(int i2) {
        this.i.x1(i2);
        this.I.a();
    }

    public void setPageTransformer(i iVar) {
        boolean z = this.F;
        if (iVar != null) {
            if (!z) {
                this.E = this.y.getItemAnimator();
                this.F = true;
            }
            this.y.setItemAnimator(null);
        } else if (z) {
            this.y.setItemAnimator(this.E);
            this.E = null;
            this.F = false;
        }
        androidx.viewpager2.widget.c cVar = this.D;
        if (iVar == cVar.b) {
            return;
        }
        cVar.b = iVar;
        if (iVar == null) {
            return;
        }
        androidx.viewpager2.widget.d dVar = this.A;
        dVar.e();
        androidx.viewpager2.widget.d.a aVar = dVar.g;
        double d2 = ((double) aVar.a) + ((double) aVar.b);
        int i2 = (int) d2;
        float f2 = (float) (d2 - ((double) i2));
        this.D.b(f2, i2, Math.round(getPageSize() * f2));
    }

    public void setUserInputEnabled(boolean z) {
        this.G = z;
        this.I.a();
    }

    public void setCurrentItem(int i2) {
        setCurrentItem(i2, true);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;
        public int b;
        public Parcelable c;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel, null);
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt();
                savedState.c = parcel.readParcelable(null);
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState(parcel, classLoader);
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt();
                savedState.c = parcel.readParcelable(classLoader);
                return savedState;
            }
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new androidx.viewpager2.widget.a();
        this.e = false;
        this.f = new a();
        this.v = -1;
        this.E = null;
        this.F = false;
        this.G = true;
        this.H = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new androidx.viewpager2.widget.a();
        this.e = false;
        this.f = new a();
        this.v = -1;
        this.E = null;
        this.F = false;
        this.G = true;
        this.H = -1;
        a(context, attributeSet);
    }

    public static abstract class g {
        public void a(int i) {
        }

        public void c(int i) {
        }

        public void b(float f, int i, int i2) {
        }
    }
}
