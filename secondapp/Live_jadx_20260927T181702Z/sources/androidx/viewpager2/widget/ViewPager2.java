package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import f2.z1;
import g2.n0;
import g2.u0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.e0;
import k.q0;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {
    public static final int A = -1;
    public static boolean B = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f19799v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f19800w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f19801x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f19802y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f19803z = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f19804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f19805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.viewpager2.widget.b f19806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView.j f19809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayoutManager f19810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Parcelable f19812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f19813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a0 f19814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.viewpager2.widget.g f19815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.viewpager2.widget.b f19816n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.viewpager2.widget.d f19817o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.viewpager2.widget.f f19818p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RecyclerView.m f19819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19820r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f19821s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19822t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e f19823u;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends g {
        public a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f19808f = true;
            viewPager2.f19815m.l();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends j {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageScrollStateChanged(int i10) {
            if (i10 == 0) {
                ViewPager2.this.y();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageSelected(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f19807e != i10) {
                viewPager2.f19807e = i10;
                viewPager2.f19823u.r();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends j {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageSelected(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f19813k.requestFocus(2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int i10) {
            return false;
        }

        public boolean c(int i10, Bundle bundle) {
            return false;
        }

        public boolean d() {
            return false;
        }

        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        public /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }

        public void n() {
        }

        public void q() {
        }

        public void r() {
        }

        public void s() {
        }

        public void t() {
        }

        public void e(@Nullable RecyclerView.h<?> hVar) {
        }

        public void f(@Nullable RecyclerView.h<?> hVar) {
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void j(@NonNull n0 n0Var) {
        }

        public void p(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        public void h(@NonNull androidx.viewpager2.widget.b bVar, @NonNull RecyclerView recyclerView) {
        }

        public void k(@NonNull View view, @NonNull n0 n0Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f extends e {
        public f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.l();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(@NonNull n0 n0Var) {
            if (ViewPager2.this.l()) {
                return;
            }
            n0Var.V0(n0.a.f85912s);
            n0Var.V0(n0.a.f85911r);
            n0Var.X1(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class g extends RecyclerView.j {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i10, int i11, @Nullable Object obj) {
            onChanged();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h extends LinearLayoutManager {
        public h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@NonNull RecyclerView.b0 b0Var, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(b0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.w wVar, @NonNull RecyclerView.b0 b0Var, @NonNull n0 n0Var) {
            super.onInitializeAccessibilityNodeInfo(wVar, b0Var, n0Var);
            ViewPager2.this.f19823u.j(n0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onInitializeAccessibilityNodeInfoForItem(@NonNull RecyclerView.w wVar, @NonNull RecyclerView.b0 b0Var, @NonNull View view, @NonNull n0 n0Var) {
            ViewPager2.this.f19823u.k(view, n0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean performAccessibilityAction(@NonNull RecyclerView.w wVar, @NonNull RecyclerView.b0 b0Var, int i10, @Nullable Bundle bundle) {
            return ViewPager2.this.f19823u.b(i10) ? ViewPager2.this.f19823u.l(i10) : super.performAccessibilityAction(wVar, b0Var, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @e0(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface i {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface k {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class l extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u0 f19834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u0 f19835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView.j f19836d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements u0 {
            public a() {
            }

            @Override // g2.u0
            public boolean a(@NonNull View view, @Nullable u0.a aVar) {
                l.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class b implements u0 {
            public b() {
            }

            @Override // g2.u0
            public boolean a(@NonNull View view, @Nullable u0.a aVar) {
                l.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class c extends g {
            public c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void onChanged() {
                l.this.y();
            }
        }

        public l() {
            super(ViewPager2.this, null);
            this.f19834b = new a();
            this.f19835c = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(@Nullable RecyclerView.h<?> hVar) {
            y();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f19836d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(@Nullable RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f19836d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(@NonNull androidx.viewpager2.widget.b bVar, @NonNull RecyclerView recyclerView) {
            z1.Y1(recyclerView, 2);
            this.f19836d = new c();
            if (z1.X(ViewPager2.this) == 0) {
                z1.Y1(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            n0 n0VarR2 = n0.r2(accessibilityNodeInfo);
            u(n0VarR2);
            w(n0VarR2);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void k(@NonNull View view, @NonNull n0 n0Var) {
            v(view, n0Var);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i10, Bundle bundle) {
            if (!c(i10, bundle)) {
                throw new IllegalStateException();
            }
            x(i10 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        public final void u(n0 n0Var) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.getAdapter() != null) {
                itemCount2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    itemCount2 = ViewPager2.this.getAdapter().getItemCount();
                    itemCount = 1;
                } else {
                    itemCount = ViewPager2.this.getAdapter().getItemCount();
                }
            } else {
                itemCount = 0;
                itemCount2 = 0;
            }
            n0Var.l1(n0.f.f(itemCount2, itemCount, false, 0));
        }

        public final void v(View view, n0 n0Var) {
            n0Var.m1(n0.g.j(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f19810h.getPosition(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f19810h.getPosition(view) : 0, 1, false, false));
        }

        public final void w(n0 n0Var) {
            int itemCount;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.l()) {
                return;
            }
            if (ViewPager2.this.f19807e > 0) {
                n0Var.a(8192);
            }
            if (ViewPager2.this.f19807e < itemCount - 1) {
                n0Var.a(4096);
            }
            n0Var.X1(true);
        }

        public void x(int i10) {
            if (ViewPager2.this.l()) {
                ViewPager2.this.t(i10, true);
            }
        }

        public void y() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            z1.w1(viewPager2, R.id.accessibilityActionPageLeft);
            z1.w1(viewPager2, R.id.accessibilityActionPageRight);
            z1.w1(viewPager2, R.id.accessibilityActionPageUp);
            z1.w1(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.l()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f19807e < itemCount - 1) {
                    z1.z1(viewPager2, new n0.a(R.id.accessibilityActionPageDown, null), null, this.f19834b);
                }
                if (ViewPager2.this.f19807e > 0) {
                    z1.z1(viewPager2, new n0.a(R.id.accessibilityActionPageUp, null), null, this.f19835c);
                    return;
                }
                return;
            }
            boolean zK = ViewPager2.this.k();
            int i11 = zK ? 16908360 : 16908361;
            if (zK) {
                i10 = 16908361;
            }
            if (ViewPager2.this.f19807e < itemCount - 1) {
                z1.z1(viewPager2, new n0.a(i11, null), null, this.f19834b);
            }
            if (ViewPager2.this.f19807e > 0) {
                z1.z1(viewPager2, new n0.a(i10, null), null, this.f19835c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface m {
        void transformPage(@NonNull View view, float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class n extends a0 {
        public n() {
        }

        @Override // androidx.recyclerview.widget.a0, androidx.recyclerview.widget.e0
        @Nullable
        public View findSnapView(RecyclerView.p pVar) {
            if (ViewPager2.this.j()) {
                return null;
            }
            return super.findSnapView(pVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class o extends RecyclerView {
        public o(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @t0(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f19823u.d() ? ViewPager2.this.f19823u.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f19807e);
            accessibilityEvent.setToIndex(ViewPager2.this.f19807e);
            ViewPager2.this.f19823u.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.l() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.l() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface p {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class q implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RecyclerView f19844c;

        public q(int i10, RecyclerView recyclerView) {
            this.f19843b = i10;
            this.f19844c = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19844c.smoothScrollToPosition(this.f19843b);
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.f19804b = new Rect();
        this.f19805c = new Rect();
        this.f19806d = new androidx.viewpager2.widget.b(3);
        this.f19808f = false;
        this.f19809g = new a();
        this.f19811i = -1;
        this.f19819q = null;
        this.f19820r = false;
        this.f19821s = true;
        this.f19822t = -1;
        h(context, null);
    }

    public void a(@NonNull RecyclerView.o oVar) {
        this.f19813k.addItemDecoration(oVar);
    }

    public void b(@NonNull RecyclerView.o oVar, int i10) {
        this.f19813k.addItemDecoration(oVar, i10);
    }

    public boolean c() {
        return this.f19817o.b();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f19813k.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f19813k.canScrollVertically(i10);
    }

    public boolean d() {
        return this.f19817o.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f19824b;
            sparseArray.put(this.f19813k.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        r();
    }

    public final RecyclerView.r e() {
        return new d();
    }

    public boolean f(@SuppressLint({"SupportAnnotationUsage"}) @q0 float f10) {
        return this.f19817o.e(f10);
    }

    @NonNull
    public RecyclerView.o g(int i10) {
        return this.f19813k.getItemDecorationAt(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    @t0(23)
    public CharSequence getAccessibilityClassName() {
        return this.f19823u.a() ? this.f19823u.g() : super.getAccessibilityClassName();
    }

    @Nullable
    public RecyclerView.h getAdapter() {
        return this.f19813k.getAdapter();
    }

    public int getCurrentItem() {
        return this.f19807e;
    }

    public int getItemDecorationCount() {
        return this.f19813k.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f19822t;
    }

    public int getOrientation() {
        return this.f19810h.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f19813k;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f19815m.f();
    }

    public final void h(Context context, AttributeSet attributeSet) {
        this.f19823u = B ? new l() : new f();
        o oVar = new o(context);
        this.f19813k = oVar;
        oVar.setId(z1.D());
        this.f19813k.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f19810h = hVar;
        this.f19813k.setLayoutManager(hVar);
        this.f19813k.setScrollingTouchSlop(1);
        u(context, attributeSet);
        this.f19813k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f19813k.addOnChildAttachStateChangeListener(e());
        androidx.viewpager2.widget.g gVar = new androidx.viewpager2.widget.g(this);
        this.f19815m = gVar;
        this.f19817o = new androidx.viewpager2.widget.d(this, gVar, this.f19813k);
        n nVar = new n();
        this.f19814l = nVar;
        nVar.attachToRecyclerView(this.f19813k);
        this.f19813k.addOnScrollListener(this.f19815m);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f19816n = bVar;
        this.f19815m.p(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f19816n.a(bVar2);
        this.f19816n.a(cVar);
        this.f19823u.h(this.f19816n, this.f19813k);
        this.f19816n.a(this.f19806d);
        androidx.viewpager2.widget.f fVar = new androidx.viewpager2.widget.f(this.f19810h);
        this.f19818p = fVar;
        this.f19816n.a(fVar);
        RecyclerView recyclerView = this.f19813k;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    public void i() {
        this.f19813k.invalidateItemDecorations();
    }

    public boolean j() {
        return this.f19817o.f();
    }

    public boolean k() {
        return this.f19810h.getLayoutDirection() == 1;
    }

    public boolean l() {
        return this.f19821s;
    }

    public final void m(@Nullable RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f19809g);
        }
    }

    public void n(@NonNull j jVar) {
        this.f19806d.a(jVar);
    }

    public void o(@NonNull RecyclerView.o oVar) {
        this.f19813k.removeItemDecoration(oVar);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f19823u.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f19813k.getMeasuredWidth();
        int measuredHeight = this.f19813k.getMeasuredHeight();
        this.f19804b.left = getPaddingLeft();
        this.f19804b.right = (i12 - i10) - getPaddingRight();
        this.f19804b.top = getPaddingTop();
        this.f19804b.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f19804b, this.f19805c);
        RecyclerView recyclerView = this.f19813k;
        Rect rect = this.f19805c;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f19808f) {
            y();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        measureChild(this.f19813k, i10, i11);
        int measuredWidth = this.f19813k.getMeasuredWidth();
        int measuredHeight = this.f19813k.getMeasuredHeight();
        int measuredState = this.f19813k.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f19811i = savedState.f19825c;
        this.f19812j = savedState.f19826d;
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f19824b = this.f19813k.getId();
        int i10 = this.f19811i;
        if (i10 == -1) {
            i10 = this.f19807e;
        }
        savedState.f19825c = i10;
        Parcelable parcelable = this.f19812j;
        if (parcelable != null) {
            savedState.f19826d = parcelable;
            return savedState;
        }
        Object adapter = this.f19813k.getAdapter();
        if (adapter instanceof androidx.viewpager2.adapter.b) {
            savedState.f19826d = ((androidx.viewpager2.adapter.b) adapter).d();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public void p(int i10) {
        this.f19813k.removeItemDecorationAt(i10);
    }

    @Override // android.view.View
    @t0(16)
    public boolean performAccessibilityAction(int i10, @Nullable Bundle bundle) {
        return this.f19823u.c(i10, bundle) ? this.f19823u.m(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void q() {
        if (this.f19818p.a() == null) {
            return;
        }
        double dE = this.f19815m.e();
        int i10 = (int) dE;
        float f10 = (float) (dE - ((double) i10));
        this.f19818p.onPageScrolled(i10, f10, Math.round(getPageSize() * f10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        RecyclerView.h adapter;
        if (this.f19811i == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f19812j;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                ((androidx.viewpager2.adapter.b) adapter).b(parcelable);
            }
            this.f19812j = null;
        }
        int iMax = Math.max(0, Math.min(this.f19811i, adapter.getItemCount() - 1));
        this.f19807e = iMax;
        this.f19811i = -1;
        this.f19813k.scrollToPosition(iMax);
        this.f19823u.n();
    }

    public void s(int i10, boolean z10) {
        if (j()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        t(i10, z10);
    }

    public void setAdapter(@Nullable RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f19813k.getAdapter();
        this.f19823u.f(adapter);
        w(adapter);
        this.f19813k.setAdapter(hVar);
        this.f19807e = 0;
        r();
        this.f19823u.e(hVar);
        m(hVar);
    }

    public void setCurrentItem(int i10) {
        s(i10, true);
    }

    @Override // android.view.View
    @t0(17)
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f19823u.q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f19822t = i10;
        this.f19813k.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f19810h.setOrientation(i10);
        this.f19823u.s();
    }

    public void setPageTransformer(@Nullable m mVar) {
        if (mVar != null) {
            if (!this.f19820r) {
                this.f19819q = this.f19813k.getItemAnimator();
                this.f19820r = true;
            }
            this.f19813k.setItemAnimator(null);
        } else if (this.f19820r) {
            this.f19813k.setItemAnimator(this.f19819q);
            this.f19819q = null;
            this.f19820r = false;
        }
        if (mVar == this.f19818p.a()) {
            return;
        }
        this.f19818p.b(mVar);
        q();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f19821s = z10;
        this.f19823u.t();
    }

    public void t(int i10, boolean z10) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f19811i != -1) {
                this.f19811i = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
        if (iMin == this.f19807e && this.f19815m.i()) {
            return;
        }
        int i11 = this.f19807e;
        if (iMin == i11 && z10) {
            return;
        }
        double dE = i11;
        this.f19807e = iMin;
        this.f19823u.r();
        if (!this.f19815m.i()) {
            dE = this.f19815m.e();
        }
        this.f19815m.n(iMin, z10);
        if (!z10) {
            this.f19813k.scrollToPosition(iMin);
            return;
        }
        double d10 = iMin;
        if (Math.abs(d10 - dE) <= 3.0d) {
            this.f19813k.smoothScrollToPosition(iMin);
            return;
        }
        this.f19813k.scrollToPosition(d10 > dE ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f19813k;
        recyclerView.post(new q(iMin, recyclerView));
    }

    public final void u(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z9.a.C1576a.f160901a);
        z1.E1(this, context, z9.a.C1576a.f160901a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(z9.a.C1576a.f160902b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void v() {
        View viewFindSnapView = this.f19814l.findSnapView(this.f19810h);
        if (viewFindSnapView == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = this.f19814l.calculateDistanceToFinalSnap(this.f19810h, viewFindSnapView);
        int i10 = iArrCalculateDistanceToFinalSnap[0];
        if (i10 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.f19813k.smoothScrollBy(i10, iArrCalculateDistanceToFinalSnap[1]);
    }

    public final void w(@Nullable RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f19809g);
        }
    }

    public void x(@NonNull j jVar) {
        this.f19806d.b(jVar);
    }

    public void y() {
        a0 a0Var = this.f19814l;
        if (a0Var == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = a0Var.findSnapView(this.f19810h);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f19810h.getPosition(viewFindSnapView);
        if (position != this.f19807e && getScrollState() == 0) {
            this.f19816n.onPageSelected(position);
        }
        this.f19808f = false;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Parcelable f19826d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @t0(24)
        @SuppressLint({"ClassVerificationFailure"})
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        public final void a(Parcel parcel, ClassLoader classLoader) {
            this.f19824b = parcel.readInt();
            this.f19825c = parcel.readInt();
            this.f19826d = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f19824b);
            parcel.writeInt(this.f19825c);
            parcel.writeParcelable(this.f19826d, i10);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19804b = new Rect();
        this.f19805c = new Rect();
        this.f19806d = new androidx.viewpager2.widget.b(3);
        this.f19808f = false;
        this.f19809g = new a();
        this.f19811i = -1;
        this.f19819q = null;
        this.f19820r = false;
        this.f19821s = true;
        this.f19822t = -1;
        h(context, attributeSet);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements RecyclerView.r {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void d(@NonNull View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width != -1 || ((ViewGroup.MarginLayoutParams) qVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(@NonNull View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class j {
        public void onPageScrollStateChanged(int i10) {
        }

        public void onPageSelected(int i10) {
        }

        public void onPageScrolled(int i10, float f10, @q0 int i11) {
        }
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19804b = new Rect();
        this.f19805c = new Rect();
        this.f19806d = new androidx.viewpager2.widget.b(3);
        this.f19808f = false;
        this.f19809g = new a();
        this.f19811i = -1;
        this.f19819q = null;
        this.f19820r = false;
        this.f19821s = true;
        this.f19822t = -1;
        h(context, attributeSet);
    }

    @t0(21)
    @SuppressLint({"ClassVerificationFailure"})
    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f19804b = new Rect();
        this.f19805c = new Rect();
        this.f19806d = new androidx.viewpager2.widget.b(3);
        this.f19808f = false;
        this.f19809g = new a();
        this.f19811i = -1;
        this.f19819q = null;
        this.f19820r = false;
        this.f19821s = true;
        this.f19822t = -1;
        h(context, attributeSet);
    }
}
