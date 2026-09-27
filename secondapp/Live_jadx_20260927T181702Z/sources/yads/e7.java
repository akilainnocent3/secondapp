package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e7 implements yv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7 f148539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f148540b;

    public e7(c7 c7Var, int i10) {
        this.f148539a = c7Var;
        this.f148540b = i10;
    }

    @Override // yads.yv
    public final boolean a() {
        return this.f148539a.f147607b <= this.f148540b;
    }
}
