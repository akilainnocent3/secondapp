package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class w62 implements ay0, m62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d62 f157222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tj2 f157223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sj2 f157224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u2 f157225d;

    public w62(d62 d62Var, x42 x42Var, sj2 sj2Var, u2 u2Var) {
        this.f157222a = d62Var;
        this.f157223b = x42Var;
        this.f157224c = sj2Var;
        this.f157225d = u2Var;
    }

    @Override // yads.m62
    public final void a(long j10, long j11) {
        long j12 = j11 + this.f157224c.f155460a;
        long jA = this.f157225d.a(j10);
        if (j12 < jA) {
            this.f157223b.a(jA, j12);
        } else {
            invalidate();
            this.f157223b.a();
        }
    }

    @Override // yads.m62
    public final void b() {
        this.f157223b.a();
        invalidate();
    }

    @Override // yads.ay0
    public final void invalidate() {
        this.f157222a.f148086a.remove(this);
    }

    @Override // yads.ay0
    public final void start() {
        this.f157222a.f148086a.add(this);
    }

    @Override // yads.m62
    public final void a() {
        this.f157223b.a();
        invalidate();
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }
}
