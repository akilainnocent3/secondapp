package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e32 implements ay0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb2 f148480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic0 f148481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z3 f148482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tj2 f148483d;

    public e32(z3 z3Var, tj2 tj2Var, wb2 wb2Var, ic0 ic0Var) {
        this.f148480a = wb2Var;
        this.f148481b = ic0Var;
        this.f148482c = z3Var;
        this.f148483d = tj2Var;
    }

    @Override // yads.ay0
    public final void invalidate() {
        ((zb2) this.f148480a).a();
        ((zb2) this.f148480a).f158721e = null;
        this.f148482c = null;
        this.f148483d = null;
    }

    @Override // yads.ay0
    public final void pause() {
        ((zb2) this.f148480a).b();
    }

    @Override // yads.ay0
    public final void resume() {
        ((zb2) this.f148480a).d();
    }

    @Override // yads.ay0
    public final void start() {
        c32 c32Var = new c32(this);
        long jA = this.f148481b.a();
        d32 d32Var = new d32(this, jA);
        zb2 zb2Var = (zb2) this.f148480a;
        zb2Var.f158721e = d32Var;
        zb2Var.a(jA, c32Var);
    }

    public /* synthetic */ e32(z3 z3Var, k63 k63Var, tj2 tj2Var) {
        this(z3Var, tj2Var, vb2.a(false), k63Var.c());
    }
}
