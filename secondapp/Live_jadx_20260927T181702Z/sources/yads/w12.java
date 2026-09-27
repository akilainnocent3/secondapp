package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class w12 implements yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j52 f157170a;

    public w12(j52 j52Var) {
        this.f157170a = j52Var;
    }

    @Override // yads.yb
    public final boolean a() {
        View viewA;
        l12 l12Var = ((k12) this.f157170a).f151359d;
        return (l12Var == null || (viewA = l12Var.f151835c.a()) == null || kl3.f151600a.a(viewA).f157907a < 1) ? false : true;
    }
}
