package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class de0 implements zj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j33 f148186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ce0 f148187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ro f148188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zj1 f148189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f148190f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f148191g;

    public de0(ce0 ce0Var, f53 f53Var) {
        this.f148187c = ce0Var;
        this.f148186b = new j33(f53Var);
    }

    @Override // yads.zj1
    public final long a() {
        if (this.f148190f) {
            return this.f148186b.a();
        }
        zj1 zj1Var = this.f148189e;
        zj1Var.getClass();
        return zj1Var.a();
    }

    @Override // yads.zj1
    public final ee2 getPlaybackParameters() {
        zj1 zj1Var = this.f148189e;
        return zj1Var != null ? zj1Var.getPlaybackParameters() : this.f148186b.f150925f;
    }

    @Override // yads.zj1
    public final void a(ee2 ee2Var) {
        zj1 zj1Var = this.f148189e;
        if (zj1Var != null) {
            zj1Var.a(ee2Var);
            ee2Var = this.f148189e.getPlaybackParameters();
        }
        this.f148186b.a(ee2Var);
    }
}
