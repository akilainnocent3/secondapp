package yads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lb implements f32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ix0 f151913a;

    public lb(ix0 ix0Var) {
        this.f151913a = ix0Var;
    }

    @Override // yads.f32
    public final void a(x51 x51Var) {
        lm2 lm2Var = this.f151913a.f150850a;
        ns.o oVar = ix0.f150849b[0];
        lm2Var.getClass();
        lm2Var.f152056a = new WeakReference(x51Var);
    }
}
