package yads;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jy implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0[] f151309a;

    public jy(zf0... zf0VarArr) {
        this.f151309a = zf0VarArr;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        for (zf0 zf0Var : this.f151309a) {
            zf0Var.a(viewGroup);
        }
    }

    @Override // yads.zf0
    public final void c() {
        for (zf0 zf0Var : this.f151309a) {
            zf0Var.c();
        }
    }
}
