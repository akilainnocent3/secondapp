package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zh1 implements e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai1 f158817a;

    public zh1(ai1 ai1Var) {
        this.f158817a = ai1Var;
    }

    @Override // yads.e3
    public final void a() {
        this.f158817a.f146814b.onInstreamAdBreakPrepared();
    }

    @Override // yads.e3
    public final void b() {
        this.f158817a.f146814b.onInstreamAdBreakStarted();
    }

    @Override // yads.e3
    public final void e() {
        this.f158817a.f146814b.onInstreamAdBreakCompleted();
    }

    @Override // yads.e3
    public final void g() {
        this.f158817a.f146814b.onInstreamAdBreakError("Ad player returned error");
    }

    @Override // yads.e3
    public final void d() {
    }
}
