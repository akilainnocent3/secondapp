package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta f149599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4 f149600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gh3 f149601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t6 f149602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f149603e;

    public gf2(ta taVar, b4 b4Var, gh3 gh3Var, t6 t6Var) {
        this.f149599a = taVar;
        this.f149600b = b4Var;
        this.f149601c = gh3Var;
        this.f149602d = t6Var;
    }

    public final void a(boolean z10, int i10) {
        ta taVar = this.f149599a;
        rf2 rf2Var = taVar.f155793a;
        if (rf2Var == null) {
            return;
        }
        k5 k5Var = rf2Var.f154942a;
        ua1 ua1Var = rf2Var.f154943b;
        if (t81.f155757b == taVar.a(ua1Var)) {
            if (z10 && i10 == 2) {
                this.f149601c.b();
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.f149603e = true;
            this.f149602d.h(ua1Var);
        } else if (i10 == 3 && this.f149603e) {
            this.f149603e = false;
            this.f149602d.j(ua1Var);
        } else if (i10 == 4) {
            this.f149600b.a(k5Var, ua1Var);
        }
    }
}
