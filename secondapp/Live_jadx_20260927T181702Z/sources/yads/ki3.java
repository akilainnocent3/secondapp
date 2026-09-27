package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ki3 implements pf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s10 f151554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sj3 f151555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pi3 f151556c;

    public /* synthetic */ ki3(s10 s10Var) {
        this(s10Var, new sj3(), new pi3());
    }

    public final sj3 a() {
        return this.f151555b;
    }

    @Override // yads.pf2
    public final float getVolume() {
        return this.f151554a.getVolume();
    }

    public ki3(s10 s10Var, sj3 sj3Var, pi3 pi3Var) {
        this.f151554a = s10Var;
        this.f151555b = sj3Var;
        this.f151556c = pi3Var;
    }
}
