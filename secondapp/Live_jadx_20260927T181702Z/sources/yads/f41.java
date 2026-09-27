package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f41 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k41 f148967b;

    public f41(k41 k41Var) {
        this.f148967b = k41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (g41 g41Var : this.f148967b.f151387d.values()) {
            for (i41 i41Var : g41Var.f149389d) {
                j41 j41Var = i41Var.f150422b;
                if (j41Var != null) {
                    im3 im3Var = g41Var.f149388c;
                    if (im3Var == null) {
                        i41Var.f150421a = g41Var.f149387b;
                        j41Var.a(i41Var, false);
                    } else {
                        j41Var.a(im3Var);
                    }
                }
            }
        }
        this.f148967b.f151387d.clear();
        this.f148967b.f151389f = null;
    }
}
