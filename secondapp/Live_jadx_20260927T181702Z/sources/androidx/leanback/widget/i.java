package androidx.leanback.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends RecyclerView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public static final int f12628m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public static final int f12629n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public static final int f12630o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f12631p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f12632q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f12633r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f12634s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f12635t = -1.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f12636u = -1.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f12637v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f12638w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f12639x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f12640y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f12641z = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GridLayoutManager f12642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0085i f12643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView.m f12646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f12647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f12648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f12649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f12650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12652l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements RecyclerView.x {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.x
        public void a(RecyclerView.f0 f0Var) {
            i.this.f12642b.Q0(f0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f12654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e3 f12655b;

        public b(int i10, e3 e3Var) {
            this.f12654a = i10;
            this.f12655b = e3Var;
        }

        @Override // androidx.leanback.widget.m1
        public void a(RecyclerView recyclerView, RecyclerView.f0 f0Var, int i10, int i11) {
            if (i10 == this.f12654a) {
                i.this.q(this);
                this.f12655b.a(f0Var);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends m1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f12657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e3 f12658b;

        public c(int i10, e3 e3Var) {
            this.f12657a = i10;
            this.f12658b = e3Var;
        }

        @Override // androidx.leanback.widget.m1
        public void b(RecyclerView recyclerView, RecyclerView.f0 f0Var, int i10, int i11) {
            if (i10 == this.f12657a) {
                i.this.q(this);
                this.f12658b.a(f0Var);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        boolean a(KeyEvent keyEvent);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        void a(RecyclerView.b0 b0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        boolean a(MotionEvent motionEvent);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g {
        boolean a(MotionEvent motionEvent);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface h {
        boolean a(KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0085i {
        int a(int i10, int i11);

        Interpolator b(int i10, int i11);
    }

    public i(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12644d = true;
        this.f12645e = true;
        this.f12651k = 4;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this);
        this.f12642b = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((androidx.recyclerview.widget.d0) getItemAnimator()).Y(false);
        super.addRecyclerListener(new a());
    }

    public void b(m1 m1Var) {
        this.f12642b.m(m1Var);
    }

    public final void c(e eVar) {
        this.f12642b.n(eVar);
    }

    public void d() {
        this.f12642b.S1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        f fVar = this.f12648h;
        if (fVar == null || !fVar.a(motionEvent)) {
            return super.dispatchGenericFocusedEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        d dVar = this.f12649i;
        if ((dVar != null && dVar.a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        h hVar = this.f12650j;
        return hVar != null && hVar.a(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g gVar = this.f12647g;
        if (gVar == null || !gVar.a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public void e() {
        this.f12642b.T1();
    }

    public void f(View view, int[] iArr) {
        this.f12642b.r0(view, iArr);
    }

    @Override // android.view.View
    public View focusSearch(int i10) {
        if (isFocused()) {
            GridLayoutManager gridLayoutManager = this.f12642b;
            View viewFindViewByPosition = gridLayoutManager.findViewByPosition(gridLayoutManager.c0());
            if (viewFindViewByPosition != null) {
                return focusSearch(viewFindViewByPosition, i10);
            }
        }
        return super.focusSearch(i10);
    }

    public boolean g(int i10) {
        return this.f12642b.C0(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        return this.f12642b.G(this, i10, i11);
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public int getExtraLayoutSpace() {
        return this.f12642b.J();
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public int getFocusScrollStrategy() {
        return this.f12642b.L();
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.f12642b.M();
    }

    public int getHorizontalSpacing() {
        return this.f12642b.M();
    }

    public int getInitialPrefetchItemCount() {
        return this.f12651k;
    }

    public int getItemAlignmentOffset() {
        return this.f12642b.N();
    }

    public float getItemAlignmentOffsetPercent() {
        return this.f12642b.O();
    }

    public int getItemAlignmentViewId() {
        return this.f12642b.P();
    }

    public h getOnUnhandledKeyListener() {
        return this.f12650j;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.f12642b.S.c();
    }

    public final int getSaveChildrenPolicy() {
        return this.f12642b.S.d();
    }

    public int getSelectedPosition() {
        return this.f12642b.c0();
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public int getSelectedSubPosition() {
        return this.f12642b.g0();
    }

    public InterfaceC0085i getSmoothScrollByBehavior() {
        return this.f12643c;
    }

    public final int getSmoothScrollMaxPendingMoves() {
        return this.f12642b.f12039b;
    }

    public final float getSmoothScrollSpeedFactor() {
        return this.f12642b.f12038a;
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.f12642b.i0();
    }

    public int getVerticalSpacing() {
        return this.f12642b.i0();
    }

    public int getWindowAlignment() {
        return this.f12642b.s0();
    }

    public int getWindowAlignmentOffset() {
        return this.f12642b.t0();
    }

    public float getWindowAlignmentOffsetPercent() {
        return this.f12642b.u0();
    }

    @SuppressLint({"CustomViewStyleable"})
    public void h(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d2.c.f12421a);
        this.f12642b.o1(typedArrayObtainStyledAttributes.getBoolean(d2.c.f12426f, false), typedArrayObtainStyledAttributes.getBoolean(d2.c.f12425e, false));
        this.f12642b.p1(typedArrayObtainStyledAttributes.getBoolean(d2.c.f12428h, true), typedArrayObtainStyledAttributes.getBoolean(d2.c.f12427g, true));
        this.f12642b.N1(typedArrayObtainStyledAttributes.getDimensionPixelSize(d2.c.f12424d, typedArrayObtainStyledAttributes.getDimensionPixelSize(d2.c.f12430j, 0)));
        this.f12642b.u1(typedArrayObtainStyledAttributes.getDimensionPixelSize(d2.c.f12423c, typedArrayObtainStyledAttributes.getDimensionPixelSize(d2.c.f12429i, 0)));
        if (typedArrayObtainStyledAttributes.hasValue(d2.c.f12422b)) {
            setGravity(typedArrayObtainStyledAttributes.getInt(d2.c.f12422b, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f12645e;
    }

    public boolean i() {
        return this.f12644d;
    }

    public final boolean j() {
        return isChildrenDrawingOrderEnabled();
    }

    public boolean k() {
        return super.isChildrenDrawingOrderEnabled();
    }

    public final boolean l() {
        return this.f12642b.E0();
    }

    public boolean m() {
        return this.f12642b.F0();
    }

    public boolean n() {
        return this.f12642b.H0();
    }

    public boolean o() {
        return this.f12642b.N.b().q();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.f12642b.R0(z10, i10, rect);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if ((this.f12652l & 1) == 1) {
            return false;
        }
        return this.f12642b.v0(this, i10, rect);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        GridLayoutManager gridLayoutManager = this.f12642b;
        if (gridLayoutManager != null) {
            gridLayoutManager.S0(i10);
        }
    }

    public boolean p() {
        return this.f12642b.N.b().r();
    }

    public void q(m1 m1Var) {
        this.f12642b.a1(m1Var);
    }

    public final void r(e eVar) {
        this.f12642b.b1(eVar);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        boolean z10 = view.hasFocus() && isFocusable();
        if (z10) {
            this.f12652l = 1 | this.f12652l;
            requestFocus();
        }
        super.removeView(view);
        if (z10) {
            this.f12652l ^= -2;
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        boolean zHasFocus = getChildAt(i10).hasFocus();
        if (zHasFocus) {
            this.f12652l |= 1;
            requestFocus();
        }
        super.removeViewAt(i10);
        if (zHasFocus) {
            this.f12652l ^= -2;
        }
    }

    public void s(int i10, int i11) {
        this.f12642b.I1(i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i10) {
        if (this.f12642b.I0()) {
            this.f12642b.M1(i10, 0, 0);
        } else {
            super.scrollToPosition(i10);
        }
    }

    public void setAnimateChildLayout(boolean z10) {
        if (this.f12644d != z10) {
            this.f12644d = z10;
            if (z10) {
                super.setItemAnimator(this.f12646f);
            } else {
                this.f12646f = getItemAnimator();
                super.setItemAnimator(null);
            }
        }
    }

    public void setChildrenVisibility(int i10) {
        this.f12642b.m1(i10);
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setExtraLayoutSpace(int i10) {
        this.f12642b.n1(i10);
    }

    public void setFocusDrawingOrderEnabled(boolean z10) {
        super.setChildrenDrawingOrderEnabled(z10);
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void setFocusScrollStrategy(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Invalid scrollStrategy");
        }
        this.f12642b.q1(i10);
        requestLayout();
    }

    public final void setFocusSearchDisabled(boolean z10) {
        setDescendantFocusability(z10 ? 393216 : 262144);
        this.f12642b.r1(z10);
    }

    public void setGravity(int i10) {
        this.f12642b.s1(i10);
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z10) {
        this.f12645e = z10;
    }

    @Deprecated
    public void setHorizontalMargin(int i10) {
        setHorizontalSpacing(i10);
    }

    public void setHorizontalSpacing(int i10) {
        this.f12642b.u1(i10);
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.f12651k = i10;
    }

    public void setItemAlignmentOffset(int i10) {
        this.f12642b.v1(i10);
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f10) {
        this.f12642b.w1(f10);
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z10) {
        this.f12642b.x1(z10);
        requestLayout();
    }

    public void setItemAlignmentViewId(int i10) {
        this.f12642b.y1(i10);
    }

    @Deprecated
    public void setItemMargin(int i10) {
        setItemSpacing(i10);
    }

    public void setItemSpacing(int i10) {
        this.f12642b.z1(i10);
        requestLayout();
    }

    public void setLayoutEnabled(boolean z10) {
        this.f12642b.A1(z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.p pVar) {
        if (pVar != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) pVar;
            this.f12642b = gridLayoutManager;
            gridLayoutManager.t1(this);
            super.setLayoutManager(pVar);
            return;
        }
        super.setLayoutManager(null);
        GridLayoutManager gridLayoutManager2 = this.f12642b;
        if (gridLayoutManager2 != null) {
            gridLayoutManager2.t1(null);
        }
        this.f12642b = null;
    }

    public void setOnChildLaidOutListener(k1 k1Var) {
        this.f12642b.C1(k1Var);
    }

    @SuppressLint({"ReferencesDeprecated"})
    public void setOnChildSelectedListener(l1 l1Var) {
        this.f12642b.D1(l1Var);
    }

    public void setOnChildViewHolderSelectedListener(m1 m1Var) {
        this.f12642b.E1(m1Var);
    }

    public void setOnKeyInterceptListener(d dVar) {
        this.f12649i = dVar;
    }

    public void setOnMotionInterceptListener(f fVar) {
        this.f12648h = fVar;
    }

    public void setOnTouchInterceptListener(g gVar) {
        this.f12647g = gVar;
    }

    public void setOnUnhandledKeyListener(h hVar) {
        this.f12650j = hVar;
    }

    public void setPruneChild(boolean z10) {
        this.f12642b.F1(z10);
    }

    public final void setSaveChildrenLimitNumber(int i10) {
        this.f12642b.S.m(i10);
    }

    public final void setSaveChildrenPolicy(int i10) {
        this.f12642b.S.n(i10);
    }

    public void setScrollEnabled(boolean z10) {
        this.f12642b.H1(z10);
    }

    public void setSelectedPosition(int i10) {
        this.f12642b.I1(i10, 0);
    }

    public void setSelectedPositionSmooth(int i10) {
        this.f12642b.K1(i10);
    }

    public final void setSmoothScrollByBehavior(InterfaceC0085i interfaceC0085i) {
        this.f12643c = interfaceC0085i;
    }

    public final void setSmoothScrollMaxPendingMoves(int i10) {
        this.f12642b.f12039b = i10;
    }

    public final void setSmoothScrollSpeedFactor(float f10) {
        this.f12642b.f12038a = f10;
    }

    @Deprecated
    public void setVerticalMargin(int i10) {
        setVerticalSpacing(i10);
    }

    public void setVerticalSpacing(int i10) {
        this.f12642b.N1(i10);
        requestLayout();
    }

    public void setWindowAlignment(int i10) {
        this.f12642b.O1(i10);
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i10) {
        this.f12642b.P1(i10);
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f10) {
        this.f12642b.Q1(f10);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z10) {
        this.f12642b.N.b().u(z10);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z10) {
        this.f12642b.N.b().v(z10);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(int i10, int i11) {
        InterfaceC0085i interfaceC0085i = this.f12643c;
        if (interfaceC0085i != null) {
            smoothScrollBy(i10, i11, interfaceC0085i.b(i10, i11), this.f12643c.a(i10, i11));
        } else {
            smoothScrollBy(i10, i11, null, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int i10) {
        if (this.f12642b.I0()) {
            this.f12642b.M1(i10, 0, 0);
        } else {
            super.smoothScrollToPosition(i10);
        }
    }

    public void t(int i10, e3 e3Var) {
        if (e3Var != null) {
            RecyclerView.f0 f0VarFindViewHolderForPosition = findViewHolderForPosition(i10);
            if (f0VarFindViewHolderForPosition == null || hasPendingAdapterUpdates()) {
                b(new c(i10, e3Var));
            } else {
                e3Var.a(f0VarFindViewHolderForPosition);
            }
        }
        setSelectedPosition(i10);
    }

    public void u(int i10, e3 e3Var) {
        if (e3Var != null) {
            RecyclerView.f0 f0VarFindViewHolderForPosition = findViewHolderForPosition(i10);
            if (f0VarFindViewHolderForPosition == null || hasPendingAdapterUpdates()) {
                b(new b(i10, e3Var));
            } else {
                e3Var.a(f0VarFindViewHolderForPosition);
            }
        }
        setSelectedPositionSmooth(i10);
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void v(int i10, int i11) {
        this.f12642b.L1(i10, i11);
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void w(int i10, int i11) {
        this.f12642b.M1(i10, i11, 0);
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void x(int i10, int i11, int i12) {
        this.f12642b.M1(i10, i11, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(int i10, int i11, Interpolator interpolator) {
        InterfaceC0085i interfaceC0085i = this.f12643c;
        if (interfaceC0085i != null) {
            smoothScrollBy(i10, i11, interpolator, interfaceC0085i.a(i10, i11));
        } else {
            smoothScrollBy(i10, i11, interpolator, Integer.MIN_VALUE);
        }
    }
}
