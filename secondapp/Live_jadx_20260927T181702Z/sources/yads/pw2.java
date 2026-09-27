package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pw2 implements s10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vj2 f154175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of2 f154176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ni3 f154177c;

    public pw2(nj2 nj2Var, of2 of2Var, ni3 ni3Var) {
        this.f154175a = nj2Var;
        this.f154176b = of2Var;
        this.f154177c = ni3Var;
    }

    @Override // yads.s10
    public final void a(pi3 pi3Var) {
        this.f154177c.f153053a = pi3Var;
    }

    @Override // yads.s10
    public final long getVideoDuration() {
        return this.f154175a.a().f149583b;
    }

    @Override // yads.s10
    public final long getVideoPosition() {
        return this.f154175a.a().f149582a;
    }

    @Override // yads.s10
    public final float getVolume() {
        re.l4 l4Var = this.f154176b.f153479a.f157940b;
        Float fValueOf = l4Var != null ? Float.valueOf(l4Var.getVolume()) : null;
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 0.0f;
    }

    @Override // yads.s10
    public final void pauseVideo() {
        this.f154177c.onVideoPaused();
    }

    @Override // yads.s10
    public final void prepareVideo() {
        this.f154177c.onVideoPrepared();
    }

    @Override // yads.s10
    public final void resumeVideo() {
        this.f154177c.onVideoResumed();
    }
}
