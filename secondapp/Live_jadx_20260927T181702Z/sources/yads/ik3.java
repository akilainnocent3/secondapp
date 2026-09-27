package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ik3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hk3 f150666a;

    public ik3(hk3 hk3Var) {
        this.f150666a = hk3Var;
    }

    public final void a() {
        View viewB = this.f150666a.b();
        if (viewB == null) {
            return;
        }
        this.f150666a.a(viewB);
    }

    public final void b(Object obj) {
        View viewB = this.f150666a.b();
        if (viewB == null) {
            return;
        }
        this.f150666a.b(viewB, obj);
        viewB.setVisibility(0);
    }

    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        if (this.f150666a.b() == null) {
            return;
        }
        this.f150666a.a(oiVar, kk3Var, obj);
    }

    public final boolean a(Object obj) {
        View viewB = this.f150666a.b();
        return viewB != null && this.f150666a.a(viewB, obj);
    }
}
