package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class np implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qp f153107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f153108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f153109c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f153110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f153111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f153112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f153113g;

    public np(qp qpVar, long j10, long j11, long j12, long j13, long j14) {
        this.f153107a = qpVar;
        this.f153108b = j10;
        this.f153110d = j11;
        this.f153111e = j12;
        this.f153112f = j13;
        this.f153113g = j14;
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f153108b;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        xw2 xw2Var = new xw2(j10, pp.a(this.f153107a.a(j10), this.f153109c, this.f153110d, this.f153111e, this.f153112f, this.f153113g));
        return new tw2(xw2Var, xw2Var);
    }
}
