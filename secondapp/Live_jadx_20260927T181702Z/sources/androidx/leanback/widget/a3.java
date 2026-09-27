package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f12294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f12295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BrowseFrameLayout.b f12300g = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements BrowseFrameLayout.b {
        public a() {
        }

        @Override // androidx.leanback.widget.BrowseFrameLayout.b
        public View a(View view, int i10) {
            View view2 = a3.this.f12295b;
            if (view != view2 && i10 == 33) {
                return view2;
            }
            int i11 = view.getLayoutDirection() == 1 ? 17 : 66;
            if (!a3.this.f12295b.hasFocus()) {
                return null;
            }
            if (i10 == 130 || i10 == i11) {
                return a3.this.f12294a;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a3.this.f12295b.setVisibility(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a3.this.f12295b.setVisibility(4);
        }
    }

    public a3(ViewGroup viewGroup, View view) {
        if (viewGroup == null || view == null) {
            throw new IllegalArgumentException("Views may not be null");
        }
        this.f12294a = viewGroup;
        this.f12295b = view;
        a();
    }

    public final void a() {
        this.f12296c = androidx.leanback.transition.b.b(this.f12294a.getContext());
        this.f12297d = androidx.leanback.transition.b.a(this.f12294a.getContext());
        this.f12298e = androidx.leanback.transition.e.n(this.f12294a, new b());
        this.f12299f = androidx.leanback.transition.e.n(this.f12294a, new c());
    }

    public BrowseFrameLayout.b b() {
        return this.f12300g;
    }

    public ViewGroup c() {
        return this.f12294a;
    }

    public View d() {
        return this.f12295b;
    }

    public void e(boolean z10) {
        if (z10) {
            androidx.leanback.transition.e.G(this.f12298e, this.f12297d);
        } else {
            androidx.leanback.transition.e.G(this.f12299f, this.f12296c);
        }
    }
}
