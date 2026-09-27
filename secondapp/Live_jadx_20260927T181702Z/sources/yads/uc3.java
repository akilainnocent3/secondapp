package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uc3 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj3 f156353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf3 f156354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3 f156355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f156356d;

    public uc3(zj3 zj3Var, hf3 hf3Var, fk3 fk3Var) {
        this.f156353a = zj3Var;
        this.f156354b = hf3Var;
        this.f156355c = fk3Var;
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (this.f156356d || j11 <= 0 || !this.f156355c.a()) {
            return;
        }
        this.f156356d = true;
        this.f156353a.a(this.f156354b.getVolume(), j10);
    }

    public /* synthetic */ uc3(ek3 ek3Var, zj3 zj3Var, hf3 hf3Var) {
        this(zj3Var, hf3Var, new fk3(ek3Var));
    }
}
