package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fn0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final po2 f149179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vp2 f149180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f149181d;

    public fn0(po2 po2Var, vp2 vp2Var, sr srVar) {
        this.f149179b = po2Var;
        this.f149180c = vp2Var;
        this.f149181d = srVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tp2 tp2Var;
        if (this.f149179b.i()) {
            this.f149179b.c("canceled-at-delivery");
            return;
        }
        vp2 vp2Var = this.f149180c;
        im3 im3Var = vp2Var.f157054c;
        if (im3Var == null) {
            this.f149179b.a(vp2Var.f157052a);
        } else {
            po2 po2Var = this.f149179b;
            synchronized (po2Var.f154023f) {
                tp2Var = po2Var.f154024g;
            }
            if (tp2Var != null) {
                tp2Var.a(im3Var);
            }
        }
        if (this.f149180c.f157055d) {
            this.f149179b.a("intermediate-response");
        } else {
            this.f149179b.c("done");
        }
        Runnable runnable = this.f149181d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
