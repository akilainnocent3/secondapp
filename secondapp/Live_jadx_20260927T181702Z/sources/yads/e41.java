package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e41 implements tp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f148495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k41 f148496b;

    public e41(k41 k41Var, String str) {
        this.f148496b = k41Var;
        this.f148495a = str;
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        k41 k41Var = this.f148496b;
        String str = this.f148495a;
        g41 g41Var = (g41) k41Var.f151386c.remove(str);
        if (g41Var != null) {
            g41Var.f149388c = im3Var;
            k41Var.f151387d.put(str, g41Var);
            if (k41Var.f151389f == null) {
                f41 f41Var = new f41(k41Var);
                k41Var.f151389f = f41Var;
                k41Var.f151388e.postDelayed(f41Var, 100);
            }
        }
    }
}
