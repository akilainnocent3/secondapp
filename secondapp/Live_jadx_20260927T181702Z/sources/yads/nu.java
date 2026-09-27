package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nu implements ba3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x81 f153202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7 f153203b;

    public nu(x81 x81Var, b7 b7Var) {
        this.f153202a = x81Var;
        this.f153203b = b7Var;
    }

    @Override // yads.ba3
    public final void a(gq0 gq0Var, r91 r91Var) {
        gq0Var.setOnClickListener(this.f153202a);
        b7 b7Var = this.f153203b;
        float f10 = r91Var.f154821b;
        boolean z10 = r91Var.f154820a;
        pa1 pa1Var = b7Var.f147095a;
        if (z10) {
            f10 = 0.0f;
        }
        pa1Var.setVolume(f10);
    }

    @Override // yads.ba3
    public final void a(gq0 gq0Var) {
        gq0Var.setOnClickListener(null);
        gq0Var.setClickable(false);
    }
}
