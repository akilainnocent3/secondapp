package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yi3 f156944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jm2 f156945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final im2 f156946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft1 f156947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f156948e;

    public vf2(yi3 yi3Var, jm2 jm2Var, im2 im2Var, ft1 ft1Var) {
        this.f156944a = yi3Var;
        this.f156945b = jm2Var;
        this.f156946c = im2Var;
        this.f156947d = ft1Var;
    }

    public final void a() {
        if (this.f156948e) {
            yi3 yi3Var = this.f156944a;
            yi3Var.f158359c = null;
            if (yi3Var.f158360d) {
                yi3Var.f158358b.removeCallbacksAndMessages(null);
                yi3Var.f158360d = false;
            }
            this.f156948e = false;
        }
    }
}
