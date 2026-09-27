package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vl3 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf3 f157012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gk3 f157013b;

    public /* synthetic */ vl3(r52 r52Var, i72 i72Var) {
        this(r52Var, uw1.a(i72Var));
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (this.f157013b.a()) {
            if (this.f157012a.isPlayingAd()) {
                return;
            }
            this.f157012a.resumeAd();
        } else if (this.f157012a.isPlayingAd()) {
            this.f157012a.pauseAd();
        }
    }

    public vl3(r52 r52Var, gk3 gk3Var) {
        this.f157012a = r52Var;
        this.f157013b = gk3Var;
    }
}
