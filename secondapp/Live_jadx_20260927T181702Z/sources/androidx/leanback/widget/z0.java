package androidx.leanback.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class z0 extends y0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2 f13157a;

    public z0(r2 r2Var) {
        this.f13157a = r2Var;
    }

    @Override // androidx.leanback.widget.y0.e
    public View a(View view) {
        return this.f13157a.a(view.getContext());
    }

    @Override // androidx.leanback.widget.y0.e
    public void b(View view, View view2) {
        ((q2) view).j(view2);
    }
}
