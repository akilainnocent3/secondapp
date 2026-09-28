package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import defpackage.g9i0;
import defpackage.h9i0;
import defpackage.ib5;
import defpackage.k5d;
import defpackage.l5d;
import defpackage.l8j0;
import defpackage.r6i0;
import defpackage.rlx;
import defpackage.slx;
import defpackage.tlx;
import defpackage.ymn;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements k5d, rlx, slx {
    public static final int[] R = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final l8j0 S;
    public static final Rect T;
    public int A;
    public final Rect B;
    public final Rect C;
    public final Rect D;
    public final Rect E;
    public l8j0 F;
    public l8j0 G;
    public l8j0 H;
    public l8j0 I;
    public d J;
    public OverScroller K;
    public ViewPropertyAnimator L;
    public final a M;
    public final b N;
    public final c O;
    public final tlx P;
    public final e Q;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public l5d e;
    public Drawable f;
    public boolean i;
    public boolean v;
    public boolean w;
    public boolean y;
    public int z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.L = null;
            actionBarOverlayLayout.y = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.L = null;
            actionBarOverlayLayout.y = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.l();
            actionBarOverlayLayout.L = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.M);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.l();
            actionBarOverlayLayout.L = actionBarOverlayLayout.d.animate().translationY(-actionBarOverlayLayout.d.getHeight()).setListener(actionBarOverlayLayout.M);
        }
    }

    public interface d {
    }

    public static final class e extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        l8j0.e bVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            bVar = new l8j0.d();
        } else if (i >= 30) {
            bVar = new l8j0.c();
        } else {
            bVar = i >= 29 ? new l8j0.b() : new l8j0.a();
        }
        bVar.g(ymn.c(0, 1, 0, 1));
        S = bVar.b();
        T = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.B = new Rect();
        this.C = new Rect();
        this.D = new Rect();
        this.E = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        l8j0 l8j0Var = l8j0.b;
        this.F = l8j0Var;
        this.G = l8j0Var;
        this.H = l8j0Var;
        this.I = l8j0Var;
        this.M = new a();
        this.N = new b();
        this.O = new c();
        m(context);
        this.P = new tlx();
        e eVar = new e(context);
        eVar.setWillNotDraw(true);
        this.Q = eVar;
        addView(eVar);
    }

    public static boolean i(View view, Rect rect, boolean z) {
        boolean z2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.k5d
    public final boolean a() {
        n();
        return this.e.a();
    }

    @Override // defpackage.k5d
    public final boolean b() {
        n();
        return this.e.b();
    }

    @Override // defpackage.k5d
    public final boolean c() {
        n();
        return this.e.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // defpackage.k5d
    public final boolean d() {
        n();
        return this.e.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f.setBounds(0, translationY, getWidth(), this.f.getIntrinsicHeight() + translationY);
            this.f.draw(canvas);
        }
    }

    @Override // defpackage.k5d
    public final boolean e() {
        n();
        return this.e.e();
    }

    @Override // defpackage.k5d
    public final void f(int i) {
        n();
        if (i == 2) {
            this.e.i();
        } else if (i == 5) {
            this.e.o();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.k5d
    public final void g() {
        n();
        this.e.k();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.P.a();
    }

    public CharSequence getTitle() {
        n();
        return this.e.getTitle();
    }

    @Override // defpackage.rlx
    public final void h(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.rlx
    public final void j(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.rlx
    public final void k(View view, int i, int i2, int[] iArr, int i3) {
    }

    public final void l() {
        removeCallbacks(this.N);
        removeCallbacks(this.O);
        ViewPropertyAnimator viewPropertyAnimator = this.L;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void m(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(R);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.K = new OverScroller(context);
    }

    public final void n() {
        l5d wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof l5d) {
                wrapper = (l5d) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    ib5.a("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    @Override // defpackage.slx
    public final void o(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        p(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        n();
        l8j0 l8j0VarH = l8j0.h(this, windowInsets);
        boolean zI = i(this.d, new Rect(l8j0VarH.b(), l8j0VarH.d(), l8j0VarH.c(), l8j0VarH.a()), false);
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        Rect rect = this.B;
        r6i0.d.b(this, l8j0VarH, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        l8j0.l lVar = l8j0VarH.a;
        l8j0 l8j0VarN = lVar.n(i, i2, i3, i4);
        this.F = l8j0VarN;
        boolean z = true;
        if (!this.G.equals(l8j0VarN)) {
            this.G = this.F;
            zI = true;
        }
        Rect rect2 = this.C;
        if (rect2.equals(rect)) {
            z = zI;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return lVar.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m(getContext());
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.c.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        l8j0 l8j0Var;
        int i3;
        l8j0.e aVar;
        n();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.d.getLayoutParams();
        int iMax = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.v && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.B;
        Rect rect2 = this.D;
        rect2.set(rect);
        this.H = this.F;
        if (this.i || z) {
            ymn ymnVarC = ymn.c(this.H.b(), this.H.d() + measuredHeight, this.H.c(), this.H.a());
            l8j0Var = this.H;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                aVar = new l8j0.d(l8j0Var);
            } else if (i3 >= 30) {
                aVar = new l8j0.c(l8j0Var);
            } else if (i3 >= 29) {
                aVar = new l8j0.b(l8j0Var);
            } else {
                aVar = new l8j0.a(l8j0Var);
            }
            aVar.g(ymnVarC);
            this.H = aVar.b();
        } else {
            e eVar = this.Q;
            l8j0 l8j0Var2 = S;
            Rect rect3 = this.E;
            r6i0.d.b(eVar, l8j0Var2, rect3);
            if (rect3.equals(T)) {
                ymn ymnVarC2 = ymn.c(this.H.b(), this.H.d() + measuredHeight, this.H.c(), this.H.a());
                l8j0Var = this.H;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 34) {
                    aVar = new l8j0.d(l8j0Var);
                } else if (i3 >= 30) {
                    aVar = new l8j0.c(l8j0Var);
                } else if (i3 >= 29) {
                    aVar = new l8j0.b(l8j0Var);
                } else {
                    aVar = new l8j0.a(l8j0Var);
                }
                aVar.g(ymnVarC2);
                this.H = aVar.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.H = this.H.a.n(0, measuredHeight, 0, 0);
            }
        }
        i(this.c, rect2, true);
        if (!this.I.equals(this.H)) {
            l8j0 l8j0Var3 = this.H;
            this.I = l8j0Var3;
            r6i0.b(this.c, l8j0Var3);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.w || !z) {
            return false;
        }
        this.K.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Reader.READ_DONE);
        if (this.K.getFinalY() > this.d.getHeight()) {
            l();
            this.O.run();
        } else {
            l();
            this.N.run();
        }
        this.y = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.z + i2;
        this.z = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        androidx.appcompat.app.e eVar;
        h9i0 h9i0Var;
        this.P.a = i;
        this.z = getActionBarHideOffset();
        l();
        d dVar = this.J;
        if (dVar == null || (h9i0Var = (eVar = (androidx.appcompat.app.e) dVar).t) == null) {
            return;
        }
        h9i0Var.a();
        eVar.t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.w;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.w || this.y) {
            return;
        }
        if (this.z <= this.d.getHeight()) {
            l();
            postDelayed(this.N, 600L);
        } else {
            l();
            postDelayed(this.O, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        n();
        int i2 = this.A ^ i;
        this.A = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        d dVar = this.J;
        if (dVar != null) {
            androidx.appcompat.app.e eVar = (androidx.appcompat.app.e) dVar;
            eVar.o = !z2;
            if (z || !z2) {
                if (eVar.q) {
                    eVar.q = false;
                    eVar.u(true);
                }
            } else if (!eVar.q) {
                eVar.q = true;
                eVar.u(true);
            }
        }
        if ((i2 & 256) == 0 || this.J == null) {
            return;
        }
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.c.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        d dVar = this.J;
        if (dVar != null) {
            ((androidx.appcompat.app.e) dVar).n = i;
        }
    }

    @Override // defpackage.rlx
    public final void p(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.rlx
    public final boolean q(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void setActionBarHideOffset(int i) {
        l();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.J = dVar;
        if (getWindowToken() != null) {
            ((androidx.appcompat.app.e) this.J).n = this.b;
            int i = this.A;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                r6i0.c.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.v = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.w) {
            this.w = z;
            if (z) {
                return;
            }
            l();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        n();
        this.e.setIcon(i);
    }

    public void setLogo(int i) {
        n();
        this.e.m(i);
    }

    @Override // defpackage.k5d
    public void setMenu(Menu menu, j.a aVar) {
        n();
        this.e.setMenu(menu, aVar);
    }

    @Override // defpackage.k5d
    public void setMenuPrepared() {
        n();
        this.e.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        this.i = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.k5d
    public void setWindowCallback(Window.Callback callback) {
        n();
        this.e.setWindowCallback(callback);
    }

    @Override // defpackage.k5d
    public void setWindowTitle(CharSequence charSequence) {
        n();
        this.e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setIcon(Drawable drawable) {
        n();
        this.e.setIcon(drawable);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
