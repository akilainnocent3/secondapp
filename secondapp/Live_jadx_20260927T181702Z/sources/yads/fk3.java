package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ek3 f149146a;

    public fk3(ek3 ek3Var) {
        this.f149146a = ek3Var;
    }

    public final boolean a() {
        View view = this.f149146a.getView();
        return (view == null || kl3.b(view) || kl3.f151600a.a(view).f157907a < 1) ? false : true;
    }
}
