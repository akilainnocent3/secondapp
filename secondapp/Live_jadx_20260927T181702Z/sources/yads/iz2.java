package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class iz2 implements da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3 f150864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ea f150865b;

    public iz2(d3 d3Var) {
        this.f150864a = d3Var;
        d3Var.a(new hz2(this));
    }

    @Override // yads.da
    public final void a(za1 za1Var) {
        this.f150864a.f148029d.f157667f.f156922a = za1Var;
    }

    @Override // yads.da
    public final void c() {
        this.f150864a.a();
    }

    @Override // yads.da
    public final void f() {
        this.f150864a.b();
    }

    @Override // yads.da
    public final void prepare() {
        this.f150864a.c();
    }

    @Override // yads.da
    public final void resume() {
        this.f150864a.d();
    }

    @Override // yads.da
    public final void start() {
        this.f150864a.e();
    }

    @Override // yads.da
    public final void a(ea eaVar) {
        this.f150865b = eaVar;
    }
}
