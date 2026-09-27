package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jc3 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je3 f151029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yj3 f151030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final af3 f151031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fk3 f151032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f151033e;

    public jc3(je3 je3Var, zj3 zj3Var, af3 af3Var, fk3 fk3Var) {
        this.f151029a = je3Var;
        this.f151030b = zj3Var;
        this.f151031c = af3Var;
        this.f151032d = fk3Var;
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (this.f151033e || j11 <= 0 || !this.f151032d.a()) {
            return;
        }
        this.f151033e = true;
        this.f151030b.h();
        this.f151031c.f(this.f151029a);
    }

    public /* synthetic */ jc3(je3 je3Var, ek3 ek3Var, zj3 zj3Var, af3 af3Var) {
        this(je3Var, zj3Var, af3Var, new fk3(ek3Var));
    }
}
