package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class t32 implements ac2, w63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u32 f155690a;

    public t32(u32 u32Var) {
        this.f155690a = u32Var;
    }

    @Override // yads.ac2
    public final void a() {
        this.f155690a.f156247a.a();
    }

    @Override // yads.w63
    public final void a(long j10, long j11) {
        long jA = this.f155690a.f156251e.a() - j10;
        u32 u32Var = this.f155690a;
        long j12 = jA + u32Var.f156249c.f155460a;
        this.f155690a.f156247a.a(u32Var.f156250d.a(), j12);
    }
}
