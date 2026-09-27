package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o33 implements pq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f153341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pq0 f153342c;

    public o33(long j10, pq0 pq0Var) {
        this.f153341b = j10;
        this.f153342c = pq0Var;
    }

    @Override // yads.pq0
    public final void a() {
        this.f153342c.a();
    }

    @Override // yads.pq0
    public final void a(vw2 vw2Var) {
        this.f153342c.a(new n33(this, vw2Var));
    }

    @Override // yads.pq0
    public final m73 a(int i10, int i11) {
        return this.f153342c.a(i10, i11);
    }
}
