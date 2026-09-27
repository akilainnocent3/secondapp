package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ty0 implements py0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe1 f156125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f156126b;

    public ty0(xe1 xe1Var, kz kzVar) {
        this.f156125a = xe1Var;
        this.f156126b = kzVar;
    }

    @Override // yads.py0
    public final void c() {
        if (this.f156125a.a()) {
            return;
        }
        this.f156126b.e();
    }

    @Override // yads.py0
    public final void invalidate() {
        this.f156125a.b();
    }
}
