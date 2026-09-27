package yads;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n22 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p22 f152851a;

    public n22(o22 o22Var) {
        this.f152851a = o22Var.a();
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        p22 p22Var = this.f152851a;
        if (p22Var != null) {
            p22Var.f153693a.f148086a.add(p22Var);
        }
    }

    @Override // yads.zf0
    public final void c() {
        p22 p22Var = this.f152851a;
        if (p22Var != null) {
            p22Var.f153693a.f148086a.remove(p22Var);
            p22Var.f153694b = null;
        }
    }

    public /* synthetic */ n22(d42 d42Var, lh3 lh3Var) {
        this(new o22(lh3Var, d42Var));
    }
}
