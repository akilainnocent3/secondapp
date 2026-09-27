package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class in0 implements s00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ua f150707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vj2 f150708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y6 f150709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w6 f150710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u6 f150711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lf2 f150712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final of2 f150713g;

    public in0(ua uaVar, nj2 nj2Var, y6 y6Var, w6 w6Var, u6 u6Var, lf2 lf2Var, of2 of2Var) {
        this.f150707a = uaVar;
        this.f150708b = nj2Var;
        this.f150709c = y6Var;
        this.f150710d = w6Var;
        this.f150711e = u6Var;
        this.f150712f = lf2Var;
        this.f150713g = of2Var;
    }

    @Override // yads.s00
    public final void a(ua1 ua1Var) {
    }

    @Override // yads.s00
    public final void b(ua1 ua1Var) {
        try {
            this.f150709c.a(ua1Var);
        } catch (RuntimeException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.s00
    public final long c(ua1 ua1Var) {
        return this.f150708b.a().f149582a;
    }

    @Override // yads.s00
    public final void d(ua1 ua1Var) {
        try {
            this.f150710d.b(ua1Var);
        } catch (RuntimeException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.s00
    public final void e(ua1 ua1Var) {
        try {
            this.f150710d.e(ua1Var);
        } catch (RuntimeException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.s00
    public final void f(ua1 ua1Var) {
        try {
            this.f150710d.d(ua1Var);
        } catch (RuntimeException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.s00
    public final void g(ua1 ua1Var) {
        try {
            this.f150710d.c(ua1Var);
        } catch (RuntimeException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.s00
    public final boolean h(ua1 ua1Var) {
        return this.f150707a.a(ua1Var) != u81.f156312b && this.f150712f.f151970c;
    }

    @Override // yads.s00
    public final void i(ua1 ua1Var) {
        try {
            this.f150710d.a(ua1Var);
        } catch (RuntimeException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.s00
    public final float j(ua1 ua1Var) {
        re.l4 l4Var = this.f150713g.f153479a.f157940b;
        Float fValueOf = l4Var != null ? Float.valueOf(l4Var.getVolume()) : null;
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 0.0f;
    }

    @Override // yads.s00
    public final long k(ua1 ua1Var) {
        return this.f150708b.a().f149583b;
    }

    @Override // yads.s00
    public final void a(g81 g81Var) {
        this.f150711e.f156291b = g81Var;
    }

    @Override // yads.s00
    public final void a(ua1 ua1Var, float f10) {
        of2 of2Var = this.f150713g;
        if (of2Var.f153480b == null) {
            re.l4 l4Var = of2Var.f153479a.f157940b;
            of2Var.f153480b = l4Var != null ? Float.valueOf(l4Var.getVolume()) : null;
        }
        re.l4 l4Var2 = of2Var.f153479a.f157940b;
        if (l4Var2 != null) {
            l4Var2.setVolume(f10);
        }
        this.f150711e.a(ua1Var, f10);
    }
}
