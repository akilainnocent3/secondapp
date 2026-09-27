package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gm3 implements to2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f149690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final to2 f149691b;

    public gm3(w5 w5Var, to2 to2Var) {
        this.f149690a = w5Var;
        this.f149691b = to2Var;
    }

    @Override // yads.to2
    public final void a(be3 be3Var) {
        this.f149690a.a(v5.f156764w);
        this.f149691b.a(be3Var);
    }

    @Override // yads.to2
    public final void onSuccess(Object obj) {
        this.f149690a.a(v5.f156764w);
        this.f149691b.onSuccess((am3) obj);
    }
}
