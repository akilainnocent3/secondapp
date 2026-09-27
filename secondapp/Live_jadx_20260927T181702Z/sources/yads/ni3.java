package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ni3 implements t10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t10 f153053a;

    @Override // yads.t10
    public final void onVideoCompleted() {
        t10 t10Var = this.f153053a;
        if (t10Var != null) {
            t10Var.onVideoCompleted();
        }
    }

    @Override // yads.t10
    public final void onVideoError() {
        t10 t10Var = this.f153053a;
        if (t10Var != null) {
            t10Var.onVideoError();
        }
    }

    @Override // yads.t10
    public final void onVideoPaused() {
        t10 t10Var = this.f153053a;
        if (t10Var != null) {
            t10Var.onVideoPaused();
        }
    }

    @Override // yads.t10
    public final void onVideoPrepared() {
        t10 t10Var = this.f153053a;
        if (t10Var != null) {
            t10Var.onVideoPrepared();
        }
    }

    @Override // yads.t10
    public final void onVideoResumed() {
        t10 t10Var = this.f153053a;
        if (t10Var != null) {
            t10Var.onVideoResumed();
        }
    }
}
