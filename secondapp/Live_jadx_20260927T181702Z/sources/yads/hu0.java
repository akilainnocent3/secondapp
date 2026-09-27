package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hu0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu0 f150305a;

    public hu0(pu0 pu0Var) {
        this.f150305a = pu0Var;
    }

    @Override // yads.o0
    public final Object a(View view, m0 m0Var, u0 u0Var) {
        Context context = view.getContext();
        this.f150305a.a(context, (gu0) m0Var);
        return new o01(false, null);
    }
}
