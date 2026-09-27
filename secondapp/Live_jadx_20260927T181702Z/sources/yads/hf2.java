package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ua f150107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4 f150108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hh3 f150109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u6 f150110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f150111e;

    public hf2(ua uaVar, c4 c4Var, hh3 hh3Var, u6 u6Var) {
        this.f150107a = uaVar;
        this.f150108b = c4Var;
        this.f150109c = hh3Var;
        this.f150110d = u6Var;
    }

    public final void a(boolean z10, int i10) {
        ua uaVar = this.f150107a;
        sf2 sf2Var = uaVar.f156327a;
        if (sf2Var == null) {
            return;
        }
        l5 l5Var = sf2Var.f155408a;
        ua1 ua1Var = sf2Var.f155409b;
        if (u81.f156312b == uaVar.a(ua1Var)) {
            if (z10 && i10 == 2) {
                this.f150109c.b();
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.f150111e = true;
            this.f150110d.h(ua1Var);
        } else if (i10 == 3 && this.f150111e) {
            this.f150111e = false;
            this.f150110d.j(ua1Var);
        } else if (i10 == 4) {
            this.f150108b.a(l5Var, ua1Var);
        }
    }
}
