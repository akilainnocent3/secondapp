package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ez2 extends x43 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz2 f148891f;

    public ez2(fz2 fz2Var) {
        this.f148891f = fz2Var;
    }

    @Override // yads.ua0
    public final void b() {
        fz2 fz2Var = this.f148891f;
        synchronized (fz2Var.f146980b) {
            this.f155526b = 0;
            this.f157677d = null;
            ua0[] ua0VarArr = fz2Var.f146984f;
            int i10 = fz2Var.f146986h;
            fz2Var.f146986h = i10 + 1;
            ua0VarArr[i10] = this;
            fz2Var.f();
        }
    }
}
