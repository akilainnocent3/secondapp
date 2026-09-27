package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class a32 implements ay0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr2 f146630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw f146631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f146632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wb2 f146633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z22 f146634e;

    public /* synthetic */ a32(v9 v9Var, lr2 lr2Var, k63 k63Var) {
        this(lr2Var, k63Var.b(), b32.a(v9Var), vb2.a(false));
    }

    @Override // yads.ay0
    public final void invalidate() {
        ((zb2) this.f146633d).a();
    }

    @Override // yads.ay0
    public final void pause() {
        ((zb2) this.f146633d).b();
    }

    @Override // yads.ay0
    public final void resume() {
        ((zb2) this.f146633d).d();
    }

    @Override // yads.ay0
    public final void start() {
        long jMax = Math.max(0L, this.f146632c - this.f146631b.f152173a);
        zb2 zb2Var = (zb2) this.f146633d;
        zb2Var.f158721e = this.f146631b;
        zb2Var.a(jMax, this.f146634e);
    }

    public a32(lr2 lr2Var, lw lwVar, long j10, wb2 wb2Var) {
        this.f146630a = lr2Var;
        this.f146631b = lwVar;
        this.f146632c = j10;
        this.f146633d = wb2Var;
        this.f146634e = new z22(this);
    }
}
