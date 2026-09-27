package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zn2 implements kf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao2 f158972a;

    public zn2(ao2 ao2Var) {
        this.f158972a = ao2Var;
    }

    @Override // yads.kf3
    public final void a() {
    }

    @Override // yads.kf3
    public final void c() {
        vf3 vf3Var = this.f158972a.f146882c;
        if (!vf3Var.f156952d) {
            vf3Var.f156952d = true;
            vf3Var.f156950b.a();
            vf3Var.f156951c.post(new uf3(vf3Var));
        }
        ef3 ef3Var = this.f158972a.f146884e;
        if (ef3Var != null) {
            ef3Var.c();
        }
    }

    @Override // yads.kf3
    public final void d() {
        this.f158972a.f146882c.a();
        this.f158972a.f146880a.a((kf3) null);
        ef3 ef3Var = this.f158972a.f146884e;
        if (ef3Var != null) {
            ef3Var.b();
        }
    }

    @Override // yads.kf3
    public final void e() {
        this.f158972a.f146882c.a();
        this.f158972a.f146880a.a((kf3) null);
    }

    @Override // yads.kf3
    public final void g() {
        this.f158972a.f146882c.a();
        this.f158972a.f146880a.a((kf3) null);
    }

    @Override // yads.kf3
    public final void h() {
        this.f158972a.f146880a.c();
    }

    @Override // yads.kf3
    public final void a(jf3 jf3Var) {
        this.f158972a.f146882c.a();
        this.f158972a.f146880a.a((kf3) null);
        this.f158972a.f146880a.e();
    }

    @Override // yads.kf3
    public final void b() {
    }

    @Override // yads.kf3
    public final void f() {
    }

    @Override // yads.kf3
    public final void i() {
    }

    @Override // yads.kf3
    public final void onInvalidate() {
    }

    @Override // yads.kf3
    public final void onVolumeChanged(float f10) {
    }
}
