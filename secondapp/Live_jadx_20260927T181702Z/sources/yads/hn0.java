package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hn0 implements s00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ta f150198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uj2 f150199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x6 f150200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v6 f150201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t6 f150202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kf2 f150203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nf2 f150204g;

    public hn0(ta taVar, mj2 mj2Var, x6 x6Var, v6 v6Var, t6 t6Var, kf2 kf2Var, nf2 nf2Var) {
        this.f150198a = taVar;
        this.f150199b = mj2Var;
        this.f150200c = x6Var;
        this.f150201d = v6Var;
        this.f150202e = t6Var;
        this.f150203f = kf2Var;
        this.f150204g = nf2Var;
    }

    @Override // yads.s00
    public final void a(ua1 ua1Var) {
    }

    @Override // yads.s00
    public final void b(ua1 ua1Var) {
        try {
            this.f150200c.a(ua1Var);
        } catch (RuntimeException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.s00
    public final long c(ua1 ua1Var) {
        return this.f150199b.a().f149079a;
    }

    @Override // yads.s00
    public final void d(ua1 ua1Var) {
        try {
            this.f150201d.b(ua1Var);
        } catch (RuntimeException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.s00
    public final void e(ua1 ua1Var) {
        try {
            this.f150201d.e(ua1Var);
        } catch (RuntimeException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.s00
    public final void f(ua1 ua1Var) {
        try {
            this.f150201d.d(ua1Var);
        } catch (RuntimeException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.s00
    public final void g(ua1 ua1Var) {
        try {
            this.f150201d.c(ua1Var);
        } catch (RuntimeException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.s00
    public final boolean h(ua1 ua1Var) {
        return this.f150198a.a(ua1Var) != t81.f155757b && this.f150203f.f151524c;
    }

    @Override // yads.s00
    public final void i(ua1 ua1Var) {
        try {
            this.f150201d.a(ua1Var);
        } catch (RuntimeException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.s00
    public final float j(ua1 ua1Var) {
        u4.u1 u1Var = this.f150204g.f153046a.f157458b;
        Float fValueOf = u1Var != null ? Float.valueOf(u1Var.getVolume()) : null;
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 0.0f;
    }

    @Override // yads.s00
    public final long k(ua1 ua1Var) {
        return this.f150199b.a().f149080b;
    }

    @Override // yads.s00
    public final void a(g81 g81Var) {
        this.f150202e.f155713b = g81Var;
    }

    @Override // yads.s00
    public final void a(ua1 ua1Var, float f10) {
        nf2 nf2Var = this.f150204g;
        if (nf2Var.f153047b == null) {
            u4.u1 u1Var = nf2Var.f153046a.f157458b;
            nf2Var.f153047b = u1Var != null ? Float.valueOf(u1Var.getVolume()) : null;
        }
        u4.u1 u1Var2 = nf2Var.f153046a.f157458b;
        if (u1Var2 != null) {
            u1Var2.setVolume(f10);
        }
        this.f150202e.a(ua1Var, f10);
    }
}
