package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ow2 implements s10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uj2 f153635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nf2 f153636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi3 f153637c;

    public ow2(mj2 mj2Var, nf2 nf2Var, oi3 oi3Var) {
        this.f153635a = mj2Var;
        this.f153636b = nf2Var;
        this.f153637c = oi3Var;
    }

    @Override // yads.s10
    public final void a(pi3 pi3Var) {
        this.f153637c.f153508a = pi3Var;
    }

    @Override // yads.s10
    public final long getVideoDuration() {
        return this.f153635a.a().f149080b;
    }

    @Override // yads.s10
    public final long getVideoPosition() {
        return this.f153635a.a().f149079a;
    }

    @Override // yads.s10
    public final float getVolume() {
        u4.u1 u1Var = this.f153636b.f153046a.f157458b;
        Float fValueOf = u1Var != null ? Float.valueOf(u1Var.getVolume()) : null;
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 0.0f;
    }

    @Override // yads.s10
    public final void pauseVideo() {
        this.f153637c.onVideoPaused();
    }

    @Override // yads.s10
    public final void prepareVideo() {
        this.f153637c.onVideoPrepared();
    }

    @Override // yads.s10
    public final void resumeVideo() {
        this.f153637c.onVideoResumed();
    }
}
