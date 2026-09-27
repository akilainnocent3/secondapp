package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kr2 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mr2 f151662a;

    public kr2(mr2 mr2Var) {
        this.f151662a = mr2Var;
    }

    @Override // yads.c2
    public final void a() {
        ay0 ay0Var = this.f151662a.f152629i;
        if (ay0Var != null) {
            ay0Var.resume();
        }
    }

    @Override // yads.c2
    public final void b() {
        ay0 ay0Var = this.f151662a.f152629i;
        if (ay0Var != null) {
            ay0Var.pause();
        }
    }
}
