package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f6 f149614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oi3 f149615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh3 f149616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f149617d;

    public gh3(f6 f6Var, oi3 oi3Var, eh3 eh3Var) {
        this.f149614a = f6Var;
        this.f149615b = oi3Var;
        this.f149616c = eh3Var;
    }

    public final void a() {
        if (this.f149617d) {
            return;
        }
        this.f149617d = true;
        u4.b bVarR = this.f149614a.f148986b;
        int i10 = bVarR.f138064b;
        for (int i11 = 0; i11 < i10; i11++) {
            u4.b.C1433b c1433bH = bVarR.h(i11);
            if (c1433bH.f138081a != Long.MIN_VALUE) {
                if (c1433bH.f138082b < 0) {
                    bVarR = bVarR.r(i11, 1);
                }
                bVarR = bVarR.R(i11);
                this.f149614a.a(bVarR);
            }
        }
        this.f149615b.onVideoCompleted();
    }

    public final void b() {
        eh3 eh3Var = this.f149616c;
        long j10 = eh3Var.f148707a.f151104a;
        if (j10 != -9223372036854775807L) {
            cf2 cf2Var = eh3Var.f148708b.f151536b;
            if ((cf2Var != null ? cf2Var.a() : -1L) + 1000 >= j10) {
                a();
            }
        }
    }
}
