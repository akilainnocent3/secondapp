package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uf3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vf3 f156412b;

    public uf3(vf3 vf3Var) {
        this.f156412b = vf3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long adPosition = this.f156412b.f156949a.getAdPosition();
        this.f156412b.f156950b.a(this.f156412b.f156949a.b(), adPosition);
        vf3 vf3Var = this.f156412b;
        if (vf3Var.f156952d) {
            vf3Var.f156951c.postDelayed(this, 200L);
        }
    }
}
