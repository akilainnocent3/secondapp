package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f1 extends ListView {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f7086o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f7087p = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f7088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f7094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f2.k2 f7098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.core.widget.l f7099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f7100n;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(21)
    public static class a {
        @k.t
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(30)
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Method f7101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f7102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Method f7103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f7104d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f7101a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f7102b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f7103c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f7104d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        public static boolean a() {
            return f7104d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static void b(f1 f1Var, int i10, View view) {
            try {
                f7101a.invoke(f1Var, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f7102b.invoke(f1Var, Integer.valueOf(i10));
                f7103c.invoke(f1Var, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(33)
    public static class c {
        @k.t
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @k.t
        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends o.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7105c;

        public d(Drawable drawable) {
            super(drawable);
            this.f7105c = true;
        }

        public void c(boolean z10) {
            this.f7105c = z10;
        }

        @Override // o.c, android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            if (this.f7105c) {
                super.draw(canvas);
            }
        }

        @Override // o.c, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f7105c) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // o.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f7105c) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // o.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f7105c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // o.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f7105c) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f7106a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f7106a = declaredField;
        }

        public static boolean a(AbsListView absListView) {
            Field field = f7106a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        public static void b(AbsListView absListView, boolean z10) {
            Field field = f7106a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f implements Runnable {
        public f() {
        }

        public void a() {
            f1 f1Var = f1.this;
            f1Var.f7100n = null;
            f1Var.removeCallbacks(this);
        }

        public void b() {
            f1.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 f1Var = f1.this;
            f1Var.f7100n = null;
            f1Var.drawableStateChanged();
        }
    }

    public f1(@NonNull Context context, boolean z10) {
        super(context, null, m.a.b.f105479p1);
        this.f7088b = new Rect();
        this.f7089c = 0;
        this.f7090d = 0;
        this.f7091e = 0;
        this.f7092f = 0;
        this.f7096j = z10;
        setCacheColorHint(0);
    }

    public final void a() {
        this.f7097k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f7093g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        f2.k2 k2Var = this.f7098l;
        if (k2Var != null) {
            k2Var.d();
            this.f7098l = null;
        }
    }

    public final void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.f7088b.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f7088b);
        selector.draw(canvas);
    }

    public int d(int i10, boolean z10) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z10) {
                    iMin = Math.max(0, i10);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i10, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i10 >= 0 && i10 < count) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f7100n != null) {
            return;
        }
        super.drawableStateChanged();
        k(true);
        o();
    }

    public int e(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean f(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean z11;
        androidx.core.widget.l lVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z10 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z10 = true;
                    z11 = false;
                } else {
                    z11 = false;
                    z10 = false;
                }
                if (z10 || z11) {
                    a();
                }
                if (z10) {
                    lVar = this.f7099m;
                    if (lVar != null) {
                        lVar.o(false);
                    }
                    return z10;
                }
                if (this.f7099m == null) {
                    this.f7099m = new androidx.core.widget.l(this);
                }
                this.f7099m.o(true);
                this.f7099m.onTouch(this, motionEvent);
                return z10;
            }
            z10 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z11 = false;
            z10 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z11 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                j(childAt, iPointToPosition, x10, y10);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z10 = true;
                z11 = false;
            }
        }
        if (z10) {
            a();
        } else {
            a();
        }
        if (z10) {
            lVar = this.f7099m;
            if (lVar != null) {
                lVar.o(false);
            }
            return z10;
        }
        if (this.f7099m == null) {
            this.f7099m = new androidx.core.widget.l(this);
        }
        this.f7099m.o(true);
        this.f7099m.onTouch(this, motionEvent);
        return z10;
    }

    public final void g(int i10, View view) {
        Rect rect = this.f7088b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f7089c;
        rect.top -= this.f7090d;
        rect.right += this.f7091e;
        rect.bottom += this.f7092f;
        boolean zL = l();
        if (view.isEnabled() != zL) {
            m(!zL);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void h(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        g(i10, view);
        if (z10) {
            Rect rect = this.f7088b;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            l1.d.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f7096j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f7096j || super.hasWindowFocus();
    }

    public final void i(int i10, View view, float f10, float f11) {
        h(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        l1.d.k(selector, f10, f11);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f7096j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f7096j && this.f7095i) || super.isInTouchMode();
    }

    public final void j(View view, int i10, float f10, float f11) {
        View childAt;
        this.f7097k = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f7093g;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f7093g = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(i10, view, f10, f11);
        k(false);
        refreshDrawableState();
    }

    public final void k(boolean z10) {
        d dVar = this.f7094h;
        if (dVar != null) {
            dVar.c(z10);
        }
    }

    public final boolean l() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    public final void m(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    public final boolean n() {
        return this.f7097k;
    }

    public final void o() {
        Drawable selector = getSelector();
        if (selector != null && n() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f7100n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f7100n == null) {
            f fVar = new f();
            this.f7100n = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !b.a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, iPointToPosition, childAt);
                }
            }
            o();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7093g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f7100n;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f7095i = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f7094h = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f7089c = rect.left;
        this.f7090d = rect.top;
        this.f7091e = rect.right;
        this.f7092f = rect.bottom;
    }
}
