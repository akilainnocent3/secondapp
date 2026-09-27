package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class le0 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ me0 f151952a;

    public le0(me0 me0Var) {
        this.f151952a = me0Var;
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        me0 me0Var = this.f151952a;
        return (me0Var.f152425f * 1000000) / ((long) me0Var.f152423d.f158595i);
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        me0 me0Var = this.f151952a;
        long j11 = (((long) me0Var.f152423d.f158595i) * j10) / 1000000;
        long j12 = me0Var.f152421b;
        long j13 = me0Var.f152422c;
        int i10 = ib3.f150516a;
        xw2 xw2Var = new xw2(j10, Math.max(j12, Math.min(((((j13 - j12) * j11) / me0Var.f152425f) + j12) - 30000, j13 - 1)));
        return new tw2(xw2Var, xw2Var);
    }
}
