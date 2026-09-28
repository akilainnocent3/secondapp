package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import defpackage.c7;
import defpackage.d5d;
import defpackage.e6;
import defpackage.g9i0;
import defpackage.ib5;
import defpackage.l8j0;
import defpackage.loz;
import defpackage.lpd0;
import defpackage.r6i0;
import defpackage.rh6;
import defpackage.zk1;
import defpackage.zmy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] t0 = {R.attr.layout_gravity};
    public static final a u0 = new a();
    public static final Interpolator v0 = new b();
    public static final m w0 = new m();
    public k A;
    public int B;
    public Drawable C;
    public int D;
    public int E;
    public float F;
    public float G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public int V;
    public VelocityTracker W;
    public int a;
    public int a0;
    public final ArrayList<f> b;
    public int b0;
    public final f c;
    public int c0;
    public final Rect d;
    public int d0;
    public loz e;
    public EdgeEffect e0;
    public int f;
    public EdgeEffect f0;
    public boolean g0;
    public boolean h0;
    public int i;
    public int i0;
    public ArrayList j0;
    public i k0;
    public i l0;
    public ArrayList m0;
    public j n0;
    public int o0;
    public int p0;
    public ArrayList<View> q0;
    public final c r0;
    public int s0;
    public Parcelable v;
    public ClassLoader w;
    public Scroller y;
    public boolean z;

    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        public final int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.r();
        }
    }

    public class d implements zmy {
        public final Rect a = new Rect();

        public d() {
        }

        @Override // defpackage.zmy
        public final l8j0 b(View view, l8j0 l8j0Var) {
            l8j0 l8j0VarK = r6i0.k(view, l8j0Var);
            if (l8j0VarK.a.o()) {
                return l8j0VarK;
            }
            int iB = l8j0VarK.b();
            Rect rect = this.a;
            rect.left = iB;
            rect.top = l8j0VarK.d();
            rect.right = l8j0VarK.c();
            rect.bottom = l8j0VarK.a();
            ViewPager viewPager = ViewPager.this;
            int childCount = viewPager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                l8j0 l8j0VarB = r6i0.b(viewPager.getChildAt(i), l8j0VarK);
                rect.left = Math.min(l8j0VarB.b(), rect.left);
                rect.top = Math.min(l8j0VarB.d(), rect.top);
                rect.right = Math.min(l8j0VarB.c(), rect.right);
                rect.bottom = Math.min(l8j0VarB.a(), rect.bottom);
            }
            return l8j0VarK.f(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {
        public Object a;
        public int b;
        public boolean c;
        public float d;
        public float e;
    }

    public class g extends e6 {
        public g() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        @Override // defpackage.e6
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            loz lozVar;
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            loz lozVar2 = viewPager.e;
            if (lozVar2 != null) {
                z = lozVar2.c() > 1;
            }
            accessibilityEvent.setScrollable(z);
            if (accessibilityEvent.getEventType() != 4096 || (lozVar = viewPager.e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(lozVar.c());
            accessibilityEvent.setFromIndex(viewPager.f);
            accessibilityEvent.setToIndex(viewPager.f);
        }

        @Override // defpackage.e6
        public final void d(View view, c7 c7Var) {
            this.a.onInitializeAccessibilityNodeInfo(view, c7Var.a);
            c7Var.l(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            loz lozVar = viewPager.e;
            c7Var.t(lozVar != null && lozVar.c() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                c7Var.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                c7Var.a(8192);
            }
        }

        @Override // defpackage.e6
        public final boolean g(View view, int i, Bundle bundle) {
            if (super.g(view, i, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.f + 1);
                return true;
            }
            if (i != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.f - 1);
            return true;
        }
    }

    public interface h {
        void a(ViewPager viewPager, loz lozVar, loz lozVar2);
    }

    public interface i {
        void H(float f, int i, int i2);

        void K0(int i);

        void N0(int i);
    }

    public interface j {
        void a(View view, float f);
    }

    public class k extends DataSetObserver {
        public k() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.f();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.f();
        }
    }

    public static class m implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.a;
            if (z != layoutParams2.a) {
                return z ? 1 : -1;
            }
            return layoutParams.e - layoutParams2.e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.b = new ArrayList<>();
        this.c = new f();
        this.d = new Rect();
        this.i = -1;
        this.v = null;
        this.w = null;
        this.F = -3.4028235E38f;
        this.G = Float.MAX_VALUE;
        this.L = 1;
        this.V = -1;
        this.g0 = true;
        this.r0 = new c();
        this.s0 = 0;
        l();
    }

    public static boolean d(int i2, int i3, int i4, View view, boolean z) {
        int i5;
        if (!(view instanceof ViewGroup)) {
            return z ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i6 = i3 + scrollX;
            if (i6 < childAt.getLeft() || i6 >= childAt.getRight() || (i5 = i4 + scrollY) < childAt.getTop() || i5 >= childAt.getBottom() || !d(i2, i6 - childAt.getLeft(), i5 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z || !view.canScrollHorizontally(-i2)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.J != z) {
            this.J = z;
        }
    }

    public final f a(int i2, int i3) {
        f fVar = new f();
        fVar.b = i2;
        fVar.a = this.e.f(this, i2);
        this.e.getClass();
        fVar.d = 1.0f;
        ArrayList<f> arrayList = this.b;
        if (i3 < 0 || i3 >= arrayList.size()) {
            arrayList.add(fVar);
            return fVar;
        }
        arrayList.add(i3, fVar);
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f fVarI;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fVarI = i(childAt)) != null && fVarI.b == this.f) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        f fVarI;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarI = i(childAt)) != null && fVarI.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new LayoutParams();
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z = layoutParams2.a | (view.getClass().getAnnotation(e.class) != null);
        layoutParams2.a = z;
        if (!this.I) {
            super.addView(view, i2, layoutParams);
        } else if (z) {
            ib5.a("Cannot add pager decor view during layout");
        } else {
            layoutParams2.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public final void b(i iVar) {
        ArrayList arrayList = this.j0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.j0 = arrayList;
        }
        arrayList.add(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    public final boolean c(int i2) {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        boolean z = true;
        boolean zO = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.d;
            if (i2 == 17) {
                int i3 = h(rect, viewFindNextFocus).left;
                int i4 = h(rect, viewFindFocus).left;
                if (viewFindFocus == null || i3 < i4) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    int i5 = this.f;
                    if (i5 > 0) {
                        setCurrentItem(i5 - 1, true);
                    } else {
                        z = false;
                    }
                    zO = z;
                }
            } else if (i2 == 66) {
                zRequestFocus = (viewFindFocus == null || h(rect, viewFindNextFocus).left > h(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : o();
            }
            zO = zRequestFocus;
        } else if (i2 == 17 || i2 == 1) {
            int i6 = this.f;
            if (i6 > 0) {
                setCurrentItem(i6 - 1, true);
            } else {
                z = false;
            }
            zO = z;
        } else if (i2 == 66 || i2 == 2) {
            zO = o();
        }
        if (zO) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zO;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.F));
        }
        return i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.G));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.z = true;
        if (this.y.isFinished() || !this.y.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.y.getCurrX();
        int currY = this.y.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!p(currX)) {
                this.y.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zC;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zC = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        zC = keyEvent.hasModifiers(2) ? o() : c(66);
                    } else if (keyCode != 61) {
                        zC = false;
                    } else if (keyEvent.hasNoModifiers()) {
                        zC = c(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        zC = c(1);
                    } else {
                        zC = false;
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    int i2 = this.f;
                    if (i2 > 0) {
                        setCurrentItem(i2 - 1, true);
                        zC = true;
                    } else {
                        zC = false;
                    }
                } else {
                    zC = c(17);
                }
            }
            if (!zC) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarI;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarI = i(childAt)) != null && fVarI.b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        loz lozVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (lozVar = this.e) != null && lozVar.c() > 1)) {
            if (!this.e0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.F * width);
                this.e0.setSize(height, width);
                zDraw = this.e0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.G + 1.0f)) * width2);
                this.f0.setSize(height2, width2);
                zDraw |= this.f0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.e0.finish();
            this.f0.finish();
        }
        if (zDraw) {
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.C;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z) {
        boolean z2 = this.s0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.y.isFinished()) {
                this.y.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.y.getCurrX();
                int currY = this.y.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        p(currX);
                    }
                }
            }
        }
        this.K = false;
        int i2 = 0;
        while (true) {
            ArrayList<f> arrayList = this.b;
            if (i2 >= arrayList.size()) {
                break;
            }
            f fVar = arrayList.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z2 = true;
            }
            i2++;
        }
        if (z2) {
            c cVar = this.r0;
            if (!z) {
                cVar.run();
            } else {
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                postOnAnimation(cVar);
            }
        }
    }

    public final void f() {
        int iC = this.e.c();
        this.a = iC;
        ArrayList<f> arrayList = this.b;
        boolean z = arrayList.size() < (this.L * 2) + 1 && arrayList.size() < iC;
        int iMax = this.f;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < arrayList.size()) {
            f fVar = arrayList.get(i2);
            loz lozVar = this.e;
            Object obj = fVar.a;
            int iD = lozVar.d();
            if (iD != -1) {
                if (iD == -2) {
                    arrayList.remove(i2);
                    i2--;
                    if (!z2) {
                        this.e.k(this);
                        z2 = true;
                    }
                    this.e.a(this, fVar.b, fVar.a);
                    int i3 = this.f;
                    if (i3 == fVar.b) {
                        iMax = Math.max(0, Math.min(i3, iC - 1));
                    }
                } else {
                    int i4 = fVar.b;
                    if (i4 != iD) {
                        if (i4 == this.f) {
                            iMax = iD;
                        }
                        fVar.b = iD;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.e.b();
        }
        Collections.sort(arrayList, u0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.a) {
                    layoutParams.c = 0.0f;
                }
            }
            w(iMax, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i2) {
        i iVar = this.k0;
        if (iVar != null) {
            iVar.N0(i2);
        }
        ArrayList arrayList = this.j0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = (i) this.j0.get(i3);
                if (iVar2 != null) {
                    iVar2.N0(i2);
                }
            }
        }
        i iVar3 = this.l0;
        if (iVar3 != null) {
            iVar3.N0(i2);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public loz getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        if (this.p0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((LayoutParams) this.q0.get(i3).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.L;
    }

    public int getPageMargin() {
        return this.B;
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final f i(View view) {
        int i2 = 0;
        while (true) {
            ArrayList<f> arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            f fVar = arrayList.get(i2);
            if (this.e.g(view, fVar.a)) {
                return fVar;
            }
            i2++;
        }
    }

    public final f j() {
        f fVar;
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.B / clientWidth : 0.0f;
        int i3 = 0;
        boolean z = true;
        f fVar2 = null;
        int i4 = -1;
        float f4 = 0.0f;
        while (true) {
            ArrayList<f> arrayList = this.b;
            if (i3 >= arrayList.size()) {
                break;
            }
            f fVar3 = arrayList.get(i3);
            if (z || fVar3.b == (i2 = i4 + 1)) {
                fVar = fVar3;
            } else {
                float f5 = f2 + f4 + f3;
                f fVar4 = this.c;
                fVar4.e = f5;
                fVar4.b = i2;
                this.e.getClass();
                fVar4.d = 1.0f;
                i3--;
                fVar = fVar4;
            }
            f2 = fVar.e;
            float f6 = fVar.d + f2 + f3;
            if (!z && scrollX < f2) {
                break;
            }
            if (scrollX < f6 || i3 == arrayList.size() - 1) {
                return fVar;
            }
            int i5 = fVar.b;
            float f7 = fVar.d;
            i3++;
            f fVar5 = fVar;
            i4 = i5;
            f4 = f7;
            fVar2 = fVar5;
            z = false;
        }
        return fVar2;
    }

    public final f k(int i2) {
        int i3 = 0;
        while (true) {
            ArrayList<f> arrayList = this.b;
            if (i3 >= arrayList.size()) {
                return null;
            }
            f fVar = arrayList.get(i3);
            if (fVar.b == i2) {
                return fVar;
            }
            i3++;
        }
    }

    public final void l() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.y = new Scroller(context, v0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.Q = viewConfiguration.getScaledPagingTouchSlop();
        this.a0 = (int) (400.0f * f2);
        this.b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.e0 = new EdgeEffect(context);
        this.f0 = new EdgeEffect(context);
        this.c0 = (int) (25.0f * f2);
        this.d0 = (int) (2.0f * f2);
        this.O = (int) (f2 * 16.0f);
        r6i0.p(this, new g());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        r6i0.d.n(this, new d());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public final void m(float f2, int i2, int i3) {
        int iMax;
        int width;
        int left;
        if (this.i0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a) {
                    int i5 = layoutParams.b & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = iMax;
                    width = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        i iVar = this.k0;
        if (iVar != null) {
            iVar.H(f2, i2, i3);
        }
        ArrayList arrayList = this.j0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                i iVar2 = (i) this.j0.get(i7);
                if (iVar2 != null) {
                    iVar2.H(f2, i2, i3);
                }
            }
        }
        i iVar3 = this.l0;
        if (iVar3 != null) {
            iVar3.H(f2, i2, i3);
        }
        if (this.n0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((LayoutParams) childAt2.getLayoutParams()).a) {
                    this.n0.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.h0 = true;
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.V) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.R = motionEvent.getX(i2);
            this.V = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.W;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o() {
        loz lozVar = this.e;
        if (lozVar == null || this.f >= lozVar.c() - 1) {
            return false;
        }
        setCurrentItem(this.f + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.r0);
        Scroller scroller = this.y;
        if (scroller != null && !scroller.isFinished()) {
            this.y.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i2;
        float f2;
        super.onDraw(canvas);
        if (this.B <= 0 || this.C == null) {
            return;
        }
        ArrayList<f> arrayList = this.b;
        if (arrayList.size() <= 0 || this.e == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f3 = width;
        float f4 = this.B / f3;
        int i3 = 0;
        f fVar = arrayList.get(0);
        float f5 = fVar.e;
        int size = arrayList.size();
        int i4 = fVar.b;
        int i5 = arrayList.get(size - 1).b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = arrayList.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.e;
                float f7 = fVar.d;
                f2 = (f6 + f7) * f3;
                f5 = f6 + f7 + f4;
            } else {
                this.e.getClass();
                f2 = (f5 + 1.0f) * f3;
                f5 = 1.0f + f4 + f5;
            }
            if (this.B + f2 > scrollX) {
                this.C.setBounds(Math.round(f2), this.D, Math.round(this.B + f2), this.E);
                this.C.draw(canvas);
            }
            if (f2 > scrollX + width) {
                return;
            }
            i4++;
            arrayList = arrayList;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            u();
            return false;
        }
        if (action != 0) {
            if (this.M) {
                return true;
            }
            if (this.N) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.T = x;
            this.R = x;
            float y = motionEvent.getY();
            this.U = y;
            this.S = y;
            this.V = motionEvent.getPointerId(0);
            this.N = false;
            this.z = true;
            this.y.computeScrollOffset();
            if (this.s0 != 2 || Math.abs(this.y.getFinalX() - this.y.getCurrX()) <= this.d0) {
                e(false);
                this.M = false;
            } else {
                this.y.abortAnimation();
                this.K = false;
                r();
                this.M = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.V;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.R;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.U);
                if (f2 != 0.0f) {
                    float f3 = this.R;
                    if ((f3 >= this.P || f2 <= 0.0f) && ((f3 <= getWidth() - this.P || f2 >= 0.0f) && d((int) f2, (int) x2, (int) y2, this, false))) {
                        this.R = x2;
                        this.S = y2;
                        this.N = true;
                        return false;
                    }
                }
                float f4 = this.Q;
                if (fAbs > f4 && fAbs * 0.5f > fAbs2) {
                    this.M = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f5 = this.T;
                    float f6 = this.Q;
                    this.R = f2 > 0.0f ? f5 + f6 : f5 - f6;
                    this.S = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f4) {
                    this.N = true;
                }
                if (this.M && q(x2)) {
                    WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            n(motionEvent);
        }
        VelocityTracker velocityTrackerObtain = this.W;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.W = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        return this.M;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        f fVarI;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a) {
                    int i10 = layoutParams.b;
                    int i11 = i10 & 7;
                    int i12 = i10 & 112;
                    if (i11 != 1) {
                        if (i11 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i11 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i6 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i12 != 16) {
                            if (i12 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i12 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i13 = paddingLeft + scrollX;
                            childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, childAt.getMeasuredHeight() + paddingTop);
                            i8++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i14 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i14;
                        int i15 = paddingLeft + scrollX;
                        childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + paddingTop);
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i16;
                    if (i12 != 16) {
                        if (i12 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i12 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i17 = paddingLeft + scrollX;
                        childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + paddingTop);
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i18 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i18;
                    int i19 = paddingLeft + scrollX;
                    childAt.layout(i19, paddingTop, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + paddingTop);
                    i8++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i20 = (i6 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.a && (fVarI = i(childAt2)) != null) {
                    float f2 = i20;
                    int i22 = ((int) (fVarI.e * f2)) + paddingLeft;
                    if (layoutParams2.d) {
                        layoutParams2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * layoutParams2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.D = paddingTop;
        this.E = i7 - paddingBottom;
        this.i0 = i8;
        if (this.g0) {
            z2 = false;
            v(this.f, 0, false, false);
        } else {
            z2 = false;
        }
        this.g0 = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.P = Math.min(measuredWidth / 10, this.O);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.a) {
                int i7 = layoutParams2.b;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z2 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z2) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.H = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.I = true;
        r();
        this.I = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.c), 1073741824), this.H);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        f fVarI;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i5 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (fVarI = i(childAt)) != null && fVarI.b == this.f && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i5;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        ClassLoader classLoader = savedState.e;
        super.onRestoreInstanceState(savedState.a);
        loz lozVar = this.e;
        if (lozVar != null) {
            lozVar.h(savedState.d, classLoader);
            w(savedState.c, 0, false, true);
        } else {
            this.i = savedState.c;
            this.v = savedState.d;
            this.w = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.f;
        loz lozVar = this.e;
        if (lozVar != null) {
            savedState.d = lozVar.i();
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.B;
            t(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        loz lozVar;
        boolean zU = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (lozVar = this.e) == null || lozVar.c() == 0) {
            return false;
        }
        VelocityTracker velocityTrackerObtain = this.W;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.W = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.y.abortAnimation();
            this.K = false;
            r();
            float x = motionEvent.getX();
            this.T = x;
            this.R = x;
            float y = motionEvent.getY();
            this.U = y;
            this.S = y;
            this.V = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.R = motionEvent.getX(actionIndex);
                        this.V = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        n(motionEvent);
                        this.R = motionEvent.getX(motionEvent.findPointerIndex(this.V));
                    }
                } else if (this.M) {
                    v(this.f, 0, true, false);
                    zU = u();
                }
            } else if (!this.M) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.V);
                if (iFindPointerIndex == -1) {
                    zU = u();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x2 - this.R);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.S);
                    if (fAbs > this.Q && fAbs > fAbs2) {
                        this.M = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f2 = this.T;
                        float f3 = x2 - f2;
                        int i2 = this.Q;
                        this.R = f3 > 0.0f ? f2 + i2 : f2 - i2;
                        this.S = y2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.M) {
                        zU = q(motionEvent.getX(motionEvent.findPointerIndex(this.V)));
                    }
                }
            } else if (this.M) {
                zU = q(motionEvent.getX(motionEvent.findPointerIndex(this.V)));
            }
        } else if (this.M) {
            VelocityTracker velocityTracker = this.W;
            velocityTracker.computeCurrentVelocity(1000, this.b0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.V);
            this.K = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarJ = j();
            float f4 = clientWidth;
            float f5 = this.B / f4;
            int iMax = fVarJ.b;
            float f6 = ((scrollX / f4) - fVarJ.e) / (fVarJ.d + f5);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.V)) - this.T)) <= this.c0 || Math.abs(xVelocity) <= this.a0) {
                iMax += (int) (f6 + (iMax >= this.f ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList<f> arrayList = this.b;
            if (arrayList.size() > 0) {
                iMax = Math.max(arrayList.get(0).b, Math.min(iMax, ((f) rh6.a(1, arrayList)).b));
            }
            w(iMax, xVelocity, true, true);
            zU = u();
        }
        if (zU) {
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final boolean p(int i2) {
        if (this.b.size() == 0) {
            if (!this.g0) {
                this.h0 = false;
                m(0.0f, 0, 0);
                if (!this.h0) {
                    ib5.a("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        f fVarJ = j();
        int clientWidth = getClientWidth();
        int i3 = this.B;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = fVarJ.b;
        float f3 = ((i2 / f2) - fVarJ.e) / (fVarJ.d + (i3 / f2));
        this.h0 = false;
        m(f3, i5, (int) (i4 * f3));
        if (this.h0) {
            return true;
        }
        ib5.a("onPageScrolled did not call superclass implementation");
        return false;
    }

    public final boolean q(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.R - f2;
        this.R = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.F * clientWidth;
        float f5 = this.G * clientWidth;
        ArrayList<f> arrayList = this.b;
        boolean z3 = false;
        f fVar = arrayList.get(0);
        f fVar2 = (f) rh6.a(1, arrayList);
        if (fVar.b != 0) {
            f4 = fVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.b != this.e.c() - 1) {
            f5 = fVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.e0.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.f0.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.R = (scrollX - i2) + this.R;
        scrollTo(i2, getScrollY());
        p(i2);
        return z3;
    }

    public final void r() {
        s(this.f);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.I) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c7 A[PHI: r7 r11 r15
      0x00c7: PHI (r7v15 int) = (r7v14 int), (r7v4 int), (r7v18 int) binds: [B:64:0x00eb, B:61:0x00d7, B:52:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r11v32 int) = (r11v1 int), (r11v31 int), (r11v35 int) binds: [B:64:0x00eb, B:61:0x00d7, B:52:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:64:0x00eb, B:61:0x00d7, B:52:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0149 A[PHI: r3 r12
      0x0149: PHI (r3v22 float) = (r3v20 float), (r3v21 float), (r3v19 float) binds: [B:98:0x0170, B:95:0x015a, B:88:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r12v25 int) = (r12v23 int), (r12v24 int), (r12v22 int) binds: [B:98:0x0170, B:95:0x015a, B:88:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    public final void s(int i2) {
        f fVarK;
        String hexString;
        ArrayList<f> arrayList;
        f fVarA;
        float f2;
        f fVarI;
        f fVarI2;
        int i3;
        int i4;
        f fVar;
        f fVar2;
        f fVar3;
        int i5 = this.f;
        if (i5 != i2) {
            fVarK = k(i5);
            this.f = i2;
        } else {
            fVarK = null;
        }
        if (this.e == null) {
            x();
            return;
        }
        if (this.K) {
            x();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.e.k(this);
        int i6 = this.L;
        int iMax = Math.max(0, this.f - i6);
        int iC = this.e.c();
        int iMin = Math.min(iC - 1, this.f + i6);
        if (iC != this.a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            d5d.a(sb, this.a, ", found: ", iC, " Pager id: ");
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            lpd0.a(sb, this.e.getClass());
            return;
        }
        int i7 = 0;
        while (true) {
            arrayList = this.b;
            if (i7 < arrayList.size()) {
                fVarA = arrayList.get(i7);
                int i8 = fVarA.b;
                int i9 = this.f;
                if (i8 >= i9) {
                    if (i8 != i9) {
                        break;
                    } else {
                        break;
                    }
                }
                i7++;
            }
            fVarA = null;
            break;
        }
        if (fVarA == null && iC > 0) {
            fVarA = a(this.f, i7);
        }
        if (fVarA != null) {
            int i10 = i7 - 1;
            f fVar4 = i10 >= 0 ? arrayList.get(i10) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - fVarA.d);
            float f3 = 0.0f;
            for (int i11 = this.f - 1; i11 >= 0; i11--) {
                if (f3 < paddingLeft || i11 >= iMax) {
                    if (fVar4 == null || i11 != fVar4.b) {
                        f3 += a(i11, i10 + 1).d;
                        i7++;
                        if (i10 >= 0) {
                            fVar3 = arrayList.get(i10);
                        } else {
                            fVar3 = null;
                        }
                    } else {
                        f3 += fVar4.d;
                        i10--;
                        if (i10 >= 0) {
                            fVar3 = arrayList.get(i10);
                        } else {
                            fVar3 = null;
                        }
                    }
                    fVar4 = fVar3;
                } else {
                    if (fVar4 == null) {
                        break;
                    }
                    if (i11 == fVar4.b && !fVar4.c) {
                        arrayList.remove(i10);
                        this.e.a(this, i11, fVar4.a);
                        i10--;
                        i7--;
                        if (i10 >= 0) {
                            fVar3 = arrayList.get(i10);
                        } else {
                            fVar3 = null;
                        }
                        fVar4 = fVar3;
                    }
                }
            }
            f2 = 0.0f;
            float f4 = fVarA.d;
            int i12 = i7 + 1;
            if (f4 < 2.0f) {
                f fVar5 = i12 < arrayList.size() ? arrayList.get(i12) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i13 = i12;
                for (int i14 = this.f + 1; i14 < iC; i14++) {
                    if (f4 >= paddingRight && i14 > iMin) {
                        if (fVar5 == null) {
                            break;
                        }
                        if (i14 == fVar5.b && !fVar5.c) {
                            arrayList.remove(i13);
                            this.e.a(this, i14, fVar5.a);
                            if (i13 < arrayList.size()) {
                                fVar5 = arrayList.get(i13);
                            } else {
                                fVar5 = null;
                            }
                        }
                    } else if (fVar5 == null || i14 != fVar5.b) {
                        f fVarA2 = a(i14, i13);
                        i13++;
                        f4 += fVarA2.d;
                        if (i13 < arrayList.size()) {
                            fVar5 = arrayList.get(i13);
                        } else {
                            fVar5 = null;
                        }
                    } else {
                        f4 += fVar5.d;
                        i13++;
                        if (i13 < arrayList.size()) {
                            fVar5 = arrayList.get(i13);
                        } else {
                            fVar5 = null;
                        }
                    }
                }
            }
            int iC2 = this.e.c();
            int clientWidth2 = getClientWidth();
            float f5 = clientWidth2 > 0 ? this.B / clientWidth2 : 0.0f;
            if (fVarK != null) {
                int i15 = fVarK.b;
                int i16 = fVarA.b;
                if (i15 < i16) {
                    float f6 = fVarK.e + fVarK.d + f5;
                    int i17 = i15 + 1;
                    int i18 = 0;
                    while (i17 <= fVarA.b && i18 < arrayList.size()) {
                        f fVar6 = arrayList.get(i18);
                        while (true) {
                            fVar2 = fVar6;
                            if (i17 <= fVar2.b || i18 >= arrayList.size() - 1) {
                                break;
                            }
                            i18++;
                            fVar6 = arrayList.get(i18);
                        }
                        while (i17 < fVar2.b) {
                            this.e.getClass();
                            f6 += 1.0f + f5;
                            i17++;
                        }
                        fVar2.e = f6;
                        f6 += fVar2.d + f5;
                        i17++;
                    }
                } else if (i15 > i16) {
                    int size = arrayList.size() - 1;
                    float f7 = fVarK.e;
                    while (true) {
                        i15--;
                        if (i15 < fVarA.b || size < 0) {
                            break;
                        }
                        f fVar7 = arrayList.get(size);
                        while (true) {
                            fVar = fVar7;
                            if (i15 >= fVar.b || size <= 0) {
                                break;
                            }
                            size--;
                            fVar7 = arrayList.get(size);
                        }
                        while (i15 > fVar.b) {
                            this.e.getClass();
                            f7 -= 1.0f + f5;
                            i15--;
                        }
                        f7 -= fVar.d + f5;
                        fVar.e = f7;
                    }
                }
            }
            int size2 = arrayList.size();
            float f8 = fVarA.e;
            int i19 = fVarA.b;
            int i20 = i19 - 1;
            this.F = i19 == 0 ? f8 : -3.4028235E38f;
            int i21 = iC2 - 1;
            this.G = i19 == i21 ? (fVarA.d + f8) - 1.0f : Float.MAX_VALUE;
            int i22 = i7 - 1;
            while (i22 >= 0) {
                f fVar8 = arrayList.get(i22);
                while (true) {
                    i4 = fVar8.b;
                    if (i20 <= i4) {
                        break;
                    }
                    i20--;
                    this.e.getClass();
                    f8 -= 1.0f + f5;
                }
                f8 -= fVar8.d + f5;
                fVar8.e = f8;
                if (i4 == 0) {
                    this.F = f8;
                }
                i22--;
                i20--;
            }
            float f9 = fVarA.e + fVarA.d + f5;
            int i23 = fVarA.b;
            while (true) {
                i23++;
                if (i12 >= size2) {
                    break;
                }
                f fVar9 = arrayList.get(i12);
                while (true) {
                    i3 = fVar9.b;
                    if (i23 >= i3) {
                        break;
                    }
                    i23++;
                    this.e.getClass();
                    f9 += 1.0f + f5;
                }
                if (i3 == i21) {
                    this.G = (fVar9.d + f9) - 1.0f;
                }
                fVar9.e = f9;
                f9 += fVar9.d + f5;
                i12++;
            }
            this.e.j(this, this.f, fVarA.a);
        } else {
            f2 = 0.0f;
        }
        this.e.b();
        int childCount = getChildCount();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.f = i24;
            if (!layoutParams.a && layoutParams.c == f2 && (fVarI2 = i(childAt)) != null) {
                layoutParams.c = fVarI2.d;
                layoutParams.e = fVarI2.b;
            }
        }
        x();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                fVarI = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    fVarI = i(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        fVarI = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (fVarI == null || fVarI.b != this.f) {
                for (int i25 = 0; i25 < getChildCount(); i25++) {
                    View childAt2 = getChildAt(i25);
                    f fVarI3 = i(childAt2);
                    if (fVarI3 != null && fVarI3.b == this.f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void setAdapter(loz lozVar) {
        ArrayList<f> arrayList = this.b;
        loz lozVar2 = this.e;
        if (lozVar2 != null) {
            synchronized (lozVar2) {
            }
            this.e.k(this);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                f fVar = arrayList.get(i2);
                this.e.a(this, fVar.b, fVar.a);
            }
            this.e.b();
            arrayList.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f = 0;
            scrollTo(0, 0);
        }
        loz lozVar3 = this.e;
        this.e = lozVar;
        this.a = 0;
        if (lozVar != null) {
            if (this.A == null) {
                this.A = new k();
            }
            synchronized (this.e) {
            }
            this.K = false;
            boolean z = this.g0;
            this.g0 = true;
            this.a = this.e.c();
            if (this.i >= 0) {
                this.e.h(this.v, this.w);
                w(this.i, 0, false, true);
                this.i = -1;
                this.v = null;
                this.w = null;
            } else if (z) {
                requestLayout();
            } else {
                r();
            }
        }
        ArrayList arrayList2 = this.m0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.m0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((h) this.m0.get(i4)).a(this, lozVar3, lozVar);
        }
    }

    public void setCurrentItem(int i2) {
        this.K = false;
        w(i2, 0, !this.g0, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.L) {
            this.L = i2;
            r();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.k0 = iVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.B;
        this.B = i2;
        int width = getWidth();
        t(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.C = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, j jVar, int i2) {
        boolean z2 = jVar != null;
        boolean z3 = z2 != (this.n0 != null);
        this.n0 = jVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.p0 = z ? 2 : 1;
            this.o0 = i2;
        } else {
            this.p0 = 0;
        }
        if (z3) {
            r();
        }
    }

    public void setScrollState(int i2) {
        if (this.s0 == i2) {
            return;
        }
        this.s0 = i2;
        if (this.n0 != null) {
            boolean z = i2 != 0;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).setLayerType(z ? this.o0 : 0, null);
            }
        }
        i iVar = this.k0;
        if (iVar != null) {
            iVar.K0(i2);
        }
        ArrayList arrayList = this.j0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                i iVar2 = (i) this.j0.get(i4);
                if (iVar2 != null) {
                    iVar2.K0(i2);
                }
            }
        }
        i iVar3 = this.l0;
        if (iVar3 != null) {
            iVar3.K0(i2);
        }
    }

    public final void t(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.b.isEmpty()) {
            if (!this.y.isFinished()) {
                this.y.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        f fVarK = k(this.f);
        int iMin = (int) ((fVarK != null ? Math.min(fVarK.e, this.G) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            e(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public final boolean u() {
        this.V = -1;
        this.M = false;
        this.N = false;
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.W = null;
        }
        this.e0.onRelease();
        this.f0.onRelease();
        return this.e0.isFinished() || this.f0.isFinished();
    }

    public final void v(int i2, int i3, boolean z, boolean z2) {
        int iMax;
        int scrollX;
        int iAbs;
        f fVarK = k(i2);
        if (fVarK != null) {
            iMax = (int) (Math.max(this.F, Math.min(fVarK.e, this.G)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z) {
            if (z2) {
                g(i2);
            }
            e(false);
            scrollTo(iMax, 0);
            p(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.y;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                boolean z3 = this.z;
                Scroller scroller2 = this.y;
                scrollX = z3 ? scroller2.getCurrX() : scroller2.getStartX();
                this.y.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i4 = scrollX;
            int scrollY = getScrollY();
            int i5 = iMax - i4;
            int i6 = 0 - scrollY;
            if (i5 == 0 && i6 == 0) {
                e(false);
                r();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i7 = clientWidth / 2;
                float f2 = clientWidth;
                float f3 = i7;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i5) * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
                int iAbs2 = Math.abs(i3);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.e.getClass();
                    iAbs = (int) (((Math.abs(i5) / ((f2 * 1.0f) + this.B)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.z = false;
                this.y.startScroll(i4, scrollY, i5, i6, iMin);
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            g(i2);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.C;
    }

    public final void w(int i2, int i3, boolean z, boolean z2) {
        loz lozVar = this.e;
        if (lozVar == null || lozVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList<f> arrayList = this.b;
        if (!z2 && this.f == i2 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.e.c()) {
            i2 = this.e.c() - 1;
        }
        int i4 = this.L;
        int i5 = this.f;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                arrayList.get(i6).c = true;
            }
        }
        boolean z3 = this.f != i2;
        if (!this.g0) {
            s(i2);
            v(i2, i3, z, z3);
        } else {
            this.f = i2;
            if (z3) {
                g(i2);
            }
            requestLayout();
        }
    }

    public final void x() {
        if (this.p0 != 0) {
            ArrayList<View> arrayList = this.q0;
            if (arrayList == null) {
                this.q0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.q0.add(getChildAt(i2));
            }
            Collections.sort(this.q0, w0);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int c;
        public Parcelable d;
        public final ClassLoader e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.c = parcel.readInt();
            this.d = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return zk1.a(this.c, "}", sb);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
        }

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
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

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams();
    }

    public void setCurrentItem(int i2, boolean z) {
        this.K = false;
        w(i2, 0, z, false);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(getContext().getDrawable(i2));
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public boolean a;
        public final int b;
        public float c;
        public boolean d;
        public int e;
        public int f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.t0);
            this.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
            this.c = 0.0f;
        }
    }

    public void setPageTransformer(boolean z, j jVar) {
        setPageTransformer(z, jVar, 2);
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList<>();
        this.c = new f();
        this.d = new Rect();
        this.i = -1;
        this.v = null;
        this.w = null;
        this.F = -3.4028235E38f;
        this.G = Float.MAX_VALUE;
        this.L = 1;
        this.V = -1;
        this.g0 = true;
        this.r0 = new c();
        this.s0 = 0;
        l();
    }

    public static class l implements i {
        @Override // androidx.viewpager.widget.ViewPager.i
        public final void K0(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void H(float f, int i, int i2) {
        }
    }
}
