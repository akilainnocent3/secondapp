package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u32 implements ay0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tj2 f156247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb2 f156248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sj2 f156249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u2 f156250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic0 f156251e;

    public u32(x42 x42Var, wb2 wb2Var, sj2 sj2Var, u2 u2Var, ic0 ic0Var) {
        this.f156247a = x42Var;
        this.f156248b = wb2Var;
        this.f156249c = sj2Var;
        this.f156250d = u2Var;
        this.f156251e = ic0Var;
    }

    @Override // yads.ay0
    public final void invalidate() {
        ((zb2) this.f156248b).a();
    }

    @Override // yads.ay0
    public final void pause() {
        ((zb2) this.f156248b).b();
    }

    @Override // yads.ay0
    public final void resume() {
        ((zb2) this.f156248b).d();
    }

    @Override // yads.ay0
    public final void start() {
        t32 t32Var = new t32(this);
        ((zb2) this.f156248b).a(this.f156251e.a(), t32Var);
        ((zb2) this.f156248b).f158721e = t32Var;
    }
}
