package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nj2 implements vj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vj2 f153060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ge2 f153061b = ge2.f149581c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mv0 f153062c;

    public nj2(vj2 vj2Var) {
        this.f153060a = vj2Var;
    }

    @Override // yads.vj2
    public final ge2 a() {
        vj2 vj2Var = this.f153062c;
        if (vj2Var == null) {
            vj2Var = this.f153060a;
        }
        ge2 ge2VarA = vj2Var.a();
        this.f153061b = ge2VarA;
        return ge2VarA;
    }
}
