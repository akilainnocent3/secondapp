package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yn0 implements dn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f158424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s63 f158425b;

    public yn0(ti1 ti1Var, Object obj) {
        this.f158424a = obj;
        this.f158425b = ti1Var;
    }

    @Override // yads.dn1
    public final s63 a() {
        return this.f158425b;
    }

    @Override // yads.dn1
    public final Object getUid() {
        return this.f158424a;
    }
}
