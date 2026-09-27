package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n33 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vw2 f152866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o33 f152867b;

    public n33(o33 o33Var, vw2 vw2Var) {
        this.f152867b = o33Var;
        this.f152866a = vw2Var;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        tw2 tw2VarB = this.f152866a.b(j10);
        xw2 xw2Var = tw2VarB.f156111a;
        long j11 = xw2Var.f158030a;
        long j12 = xw2Var.f158031b;
        long j13 = this.f152867b.f153341b;
        xw2 xw2Var2 = new xw2(j11, j12 + j13);
        xw2 xw2Var3 = tw2VarB.f156112b;
        return new tw2(xw2Var2, new xw2(xw2Var3.f158030a, xw2Var3.f158031b + j13));
    }

    @Override // yads.vw2
    public final long c() {
        return this.f152866a.c();
    }

    @Override // yads.vw2
    public final boolean b() {
        return this.f152866a.b();
    }
}
