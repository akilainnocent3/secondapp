package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ze3 implements kf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je3 f158786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf3 f158787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vf3 f158788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yf3 f158789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jg3 f158790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w5 f158791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yj3 f158792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final af3 f158793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f158794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gf3 f158795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f158796k;

    public ze3(je3 je3Var, hf3 hf3Var, vf3 vf3Var, yf3 yf3Var, jg3 jg3Var, w5 w5Var, zj3 zj3Var, af3 af3Var, boolean z10) {
        this.f158786a = je3Var;
        this.f158787b = hf3Var;
        this.f158788c = vf3Var;
        this.f158789d = yf3Var;
        this.f158790e = jg3Var;
        this.f158791f = w5Var;
        this.f158792g = zj3Var;
        this.f158793h = af3Var;
        this.f158794i = z10;
    }

    @Override // yads.kf3
    public final void a() {
        if (this.f158796k) {
            this.f158790e.a(hg3.f150119e);
            this.f158792g.j();
        }
    }

    @Override // yads.kf3
    public final void b() {
        if (this.f158796k) {
            this.f158790e.a(hg3.f150123i);
            this.f158792g.f();
        }
    }

    @Override // yads.kf3
    public final void c() {
        this.f158796k = true;
        this.f158790e.a(hg3.f150119e);
        vf3 vf3Var = this.f158788c;
        if (!vf3Var.f156952d) {
            vf3Var.f156952d = true;
            vf3Var.f156950b.a();
            vf3Var.f156951c.post(new uf3(vf3Var));
        }
        this.f158795j = new gf3(this.f158787b, this.f158792g);
        this.f158793h.b(this.f158786a);
    }

    @Override // yads.kf3
    public final void d() {
        this.f158796k = false;
        this.f158790e.a(hg3.f150121g);
        if (this.f158794i) {
            this.f158792g.b();
        }
        this.f158788c.a();
        this.f158789d.b();
        this.f158793h.c(this.f158786a);
        this.f158787b.a((ze3) null);
        this.f158793h.g(this.f158786a);
    }

    @Override // yads.kf3
    public final void e() {
        this.f158792g.g();
        this.f158796k = false;
        this.f158790e.a(hg3.f150120f);
        this.f158788c.a();
        this.f158789d.b();
        this.f158793h.h(this.f158786a);
        this.f158787b.a((ze3) null);
        this.f158793h.g(this.f158786a);
    }

    @Override // yads.kf3
    public final void f() {
        this.f158790e.a(hg3.f150119e);
        if (this.f158796k) {
            this.f158792g.c();
        }
        vf3 vf3Var = this.f158788c;
        if (!vf3Var.f156952d) {
            vf3Var.f156952d = true;
            vf3Var.f156950b.a();
            vf3Var.f156951c.post(new uf3(vf3Var));
        }
        this.f158793h.d(this.f158786a);
    }

    @Override // yads.kf3
    public final void g() {
        this.f158792g.e();
        this.f158796k = false;
        this.f158790e.a(hg3.f150120f);
        this.f158788c.a();
        this.f158789d.b();
        this.f158793h.e(this.f158786a);
        this.f158787b.a((ze3) null);
        this.f158793h.g(this.f158786a);
    }

    @Override // yads.kf3
    public final void h() {
        this.f158790e.a(hg3.f150118d);
        this.f158791f.a(v5.f156763v);
        this.f158793h.j(this.f158786a);
    }

    @Override // yads.kf3
    public final void i() {
        this.f158790e.a(hg3.f150122h);
        if (this.f158796k) {
            this.f158792g.d();
        }
        this.f158793h.k(this.f158786a);
    }

    @Override // yads.kf3
    public final void onInvalidate() {
        if (this.f158790e.a() == hg3.f150117c) {
            this.f158790e.a(hg3.f150116b);
            this.f158791f.a(v5.f156763v);
        }
    }

    @Override // yads.kf3
    public final void onVolumeChanged(float f10) {
        this.f158792g.a(f10);
        gf3 gf3Var = this.f158795j;
        if (gf3Var != null) {
            if (f10 == 0.0f) {
                if (!gf3Var.f149605b) {
                    gf3Var.f149605b = true;
                    gf3Var.f149604a.l();
                }
            } else if (gf3Var.f149605b) {
                gf3Var.f149605b = false;
                gf3Var.f149604a.a();
            }
        }
        this.f158793h.a(this.f158786a, f10);
    }

    @Override // yads.kf3
    public final void a(jf3 jf3Var) {
        hg3 hg3Var;
        this.f158796k = false;
        jg3 jg3Var = this.f158790e;
        if (jg3Var.f151099a.contains(hg3.f150118d)) {
            hg3Var = hg3.f150124j;
        } else {
            hg3Var = hg3.f150125k;
        }
        this.f158790e.a(hg3Var);
        this.f158788c.a();
        this.f158789d.a(jf3Var);
        this.f158792g.a(jf3Var);
        this.f158793h.a(this.f158786a, jf3Var);
        this.f158787b.a((ze3) null);
        this.f158793h.g(this.f158786a);
    }
}
