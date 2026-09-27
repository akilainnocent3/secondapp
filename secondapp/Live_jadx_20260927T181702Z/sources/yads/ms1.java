package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ms1 implements ns2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns2 f152634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f152635c;

    public ms1(ns2 ns2Var, long j10) {
        this.f152634b = ns2Var;
        this.f152635c = j10;
    }

    @Override // yads.ns2
    public final void a() {
        this.f152634b.a();
    }

    @Override // yads.ns2
    public final boolean isReady() {
        return this.f152634b.isReady();
    }

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        int iA = this.f152634b.a(nx0Var, sa0Var, i10);
        if (iA == -4) {
            sa0Var.f155334f = Math.max(0L, sa0Var.f155334f + this.f152635c);
        }
        return iA;
    }

    @Override // yads.ns2
    public final int a(long j10) {
        return this.f152634b.a(j10 - this.f152635c);
    }
}
