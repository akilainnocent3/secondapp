package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n72 implements ay0, p72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o72 f152912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z3 f152913b;

    public n72(o72 o72Var, z3 z3Var) {
        this.f152912a = o72Var;
        this.f152913b = z3Var;
    }

    @Override // yads.p72
    public final void a(boolean z10) {
    }

    @Override // yads.ay0
    public final void invalidate() {
        this.f152912a.f153379a.remove(this);
        this.f152913b = null;
    }

    @Override // yads.ay0
    public final void start() {
        this.f152912a.f153379a.add(this);
    }

    @Override // yads.p72
    public final void a() {
        z3 z3Var = this.f152913b;
        if (z3Var != null) {
            z3Var.b();
        }
        this.f152912a.f153379a.remove(this);
        this.f152913b = null;
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }
}
