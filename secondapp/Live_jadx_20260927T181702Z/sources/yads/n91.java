package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n91 implements pa1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je3 f152941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mw1 f152942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k91 f152943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zb2 f152944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f152945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f152946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kf3 f152947g;

    public /* synthetic */ n91(je3 je3Var, mw1 mw1Var) {
        this(je3Var, mw1Var, new k91(mw1Var));
    }

    public static final void a(n91 n91Var) {
        n91Var.f152945e = false;
        kf3 kf3Var = n91Var.f152947g;
        if (kf3Var != null) {
            kf3Var.d();
        }
    }

    @Override // yads.hf3
    public final long b() {
        return ((ua1) this.f152941a.f151064d).f156337h;
    }

    @Override // yads.hf3
    public final void c() {
        this.f152945e = true;
        this.f152944d.a(b(), new ac2() { // from class: yads.m64
            @Override // yads.ac2
            public final void a() {
                n91.a(this.f152338a);
            }
        });
        kf3 kf3Var = this.f152947g;
        if (kf3Var != null) {
            kf3Var.c();
        }
    }

    @Override // yads.pa1
    public final void d() {
        this.f152945e = false;
        kf3 kf3Var = this.f152947g;
        if (kf3Var != null) {
            kf3Var.g();
        }
        e();
    }

    public final void e() {
        zb2 zb2Var = this.f152944d;
        zb2Var.f158721e = null;
        zb2Var.a();
        this.f152945e = false;
        this.f152946f = 0L;
    }

    @Override // yads.hf3
    public final long getAdPosition() {
        return this.f152946f;
    }

    @Override // yads.hf3
    public final float getVolume() {
        return 0.0f;
    }

    @Override // yads.hf3
    public final boolean isPlayingAd() {
        return this.f152945e;
    }

    @Override // yads.hf3
    public final void pauseAd() {
        this.f152945e = false;
        kf3 kf3Var = this.f152947g;
        if (kf3Var != null) {
            kf3Var.i();
        }
        this.f152944d.b();
    }

    @Override // yads.hf3
    public final void resumeAd() {
        this.f152945e = true;
        kf3 kf3Var = this.f152947g;
        if (kf3Var != null) {
            kf3Var.f();
        }
        this.f152944d.d();
    }

    public n91(je3 je3Var, mw1 mw1Var, k91 k91Var) {
        this.f152941a = je3Var;
        this.f152942b = mw1Var;
        this.f152943c = k91Var;
        zb2 zb2VarA = vb2.a(false);
        this.f152944d = zb2VarA;
        ((ua1) je3Var.a()).b();
        zb2VarA.a(new l91(this));
    }

    @Override // yads.hf3
    public final void a(je3 je3Var) {
        rc1 rc1Var = (rc1) fr.r0.L2(je3Var.f151061a.f147020b);
        String str = rc1Var != null ? rc1Var.f154871a : null;
        if (str == null) {
            str = "";
        }
        k91 k91Var = this.f152943c;
        m91 m91Var = new m91(this);
        gw1 gw1VarA = k91Var.f151439a.a();
        gw1VarA.a(str, new j91(k91Var, m91Var));
        gw1VarA.setHtmlWebViewErrorListener(new i91(m91Var));
    }

    @Override // yads.hf3
    public final void a(ze3 ze3Var) {
        this.f152947g = ze3Var;
    }

    @Override // yads.hf3
    public final void a() {
        this.f152945e = false;
        kf3 kf3Var = this.f152947g;
        if (kf3Var != null) {
            kf3Var.e();
        }
        e();
    }

    @Override // yads.pa1
    public final void setVolume(float f10) {
    }
}
