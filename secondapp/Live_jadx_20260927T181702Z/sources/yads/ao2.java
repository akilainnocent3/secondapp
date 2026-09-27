package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ao2 implements ye3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p52 f146880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je3 f146881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vf3 f146882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zn2 f146883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ef3 f146884e;

    public /* synthetic */ ao2(p52 p52Var, je3 je3Var, rf3 rf3Var) {
        this(p52Var, je3Var, new vf3(new r52(p52Var), rf3Var));
    }

    @Override // yads.ye3
    public final void a(zd2 zd2Var) {
        this.f146884e = zd2Var;
    }

    @Override // yads.ye3
    public final void play() {
        this.f146880a.a(this.f146883d);
        p52 p52Var = this.f146880a;
        je3 je3Var = this.f146881b;
        p52Var.a((n62) je3Var.f151064d, (n62) je3Var.f151065e);
    }

    @Override // yads.ye3
    public final void stop() {
        this.f146882c.a();
        this.f146880a.pauseAd();
        this.f146880a.a();
    }

    public ao2(p52 p52Var, je3 je3Var, vf3 vf3Var) {
        this.f146880a = p52Var;
        this.f146881b = je3Var;
        this.f146882c = vf3Var;
        this.f146883d = new zn2(this);
    }
}
