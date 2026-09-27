package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lh3 f153335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d42 f153336b;

    public o22(lh3 lh3Var, d42 d42Var) {
        this.f153335a = lh3Var;
        this.f153336b = d42Var;
    }

    public final p22 a() {
        d62 d62Var = this.f153336b.f148070a;
        if (d62Var != null) {
            return new p22(d62Var, this.f153335a);
        }
        return null;
    }
}
