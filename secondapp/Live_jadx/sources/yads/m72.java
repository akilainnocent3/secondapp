package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class m72 implements ay0, p72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o72 f152370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lr2 f152371b;

    public m72(o72 o72Var, lr2 lr2Var) {
        this.f152370a = o72Var;
        this.f152371b = lr2Var;
    }

    @Override // yads.p72
    public final void a() {
    }

    @Override // yads.ay0
    public final void invalidate() {
        this.f152370a.f153379a.remove(this);
    }

    @Override // yads.ay0
    public final void start() {
        this.f152370a.f153379a.add(this);
    }

    @Override // yads.p72
    public final void a(boolean z10) {
        if (z10) {
            return;
        }
        this.f152371b.a();
        this.f152370a.f153379a.remove(this);
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }
}
