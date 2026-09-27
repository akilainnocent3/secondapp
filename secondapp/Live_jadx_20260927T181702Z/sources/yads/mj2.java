package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mj2 implements uj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uj2 f152473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fe2 f152474b = fe2.f149078c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lv0 f152475c;

    public mj2(uj2 uj2Var) {
        this.f152473a = uj2Var;
    }

    @Override // yads.uj2
    public final fe2 a() {
        uj2 uj2Var = this.f152475c;
        if (uj2Var == null) {
            uj2Var = this.f152473a;
        }
        fe2 fe2VarA = uj2Var.a();
        this.f152474b = fe2VarA;
        return fe2VarA;
    }
}
