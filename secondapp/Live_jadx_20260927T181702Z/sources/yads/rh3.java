package yads;

import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rh3 implements qh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager f154974a;

    public rh3(WindowManager windowManager) {
        this.f154974a = windowManager;
    }

    @Override // yads.qh3
    public final void a() {
    }

    @Override // yads.qh3
    public final void a(ph3 ph3Var) {
        ph3Var.a(this.f154974a.getDefaultDisplay());
    }
}
