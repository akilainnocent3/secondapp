package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x42 implements tj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y42 f157676a;

    public x42(y42 y42Var) {
        this.f157676a = y42Var;
    }

    @Override // yads.tj2
    public final void a(long j10, long j11) {
        y42 y42Var = this.f157676a;
        View view = y42Var.f158136c;
        if (view != null) {
            y42Var.f158134a.a(view, j10, j11);
        }
    }

    @Override // yads.tj2
    public final void a() {
        View view = this.f157676a.f158136c;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }
}
