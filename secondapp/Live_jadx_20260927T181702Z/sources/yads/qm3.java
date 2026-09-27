package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qm3 implements oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to2 f154526a;

    public qm3(to2 to2Var) {
        this.f154526a = to2Var;
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        if (this.f154526a != null) {
            this.f154526a.a(pm3.a(im3Var));
        }
    }

    @Override // yads.up2
    public final void a(Object obj) {
        to2 to2Var = this.f154526a;
        if (to2Var != null) {
            to2Var.onSuccess(obj);
        }
    }
}
