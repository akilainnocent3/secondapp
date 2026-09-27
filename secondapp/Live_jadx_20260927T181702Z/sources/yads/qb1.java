package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qb1 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pa1 f154389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jg3 f154390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gk3 f154391c;

    public /* synthetic */ qb1(pa1 pa1Var, ob1 ob1Var, jg3 jg3Var) {
        this(pa1Var, ob1Var, jg3Var, new uw1());
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        boolean zA = this.f154391c.a();
        if (this.f154390b.a() != hg3.f150123i) {
            if (zA) {
                if (this.f154389a.isPlayingAd()) {
                    return;
                }
                this.f154389a.resumeAd();
            } else if (this.f154389a.isPlayingAd()) {
                this.f154389a.pauseAd();
            }
        }
    }

    public qb1(pa1 pa1Var, ob1 ob1Var, jg3 jg3Var, uw1 uw1Var) {
        this.f154389a = pa1Var;
        this.f154390b = jg3Var;
        uw1Var.getClass();
        this.f154391c = uw1.a(ob1Var);
    }
}
