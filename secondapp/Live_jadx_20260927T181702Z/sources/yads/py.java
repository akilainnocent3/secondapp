package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class py implements cn1, pk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f154186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bn1 f154187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ok0 f154188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry f154189d;

    public py(ry ryVar, Object obj) {
        this.f154189d = ryVar;
        this.f154187b = ryVar.b((ym1) null);
        this.f154188c = ryVar.a((ym1) null);
        this.f154186a = obj;
    }

    public final hm1 a(hm1 hm1Var) {
        ry ryVar = this.f154189d;
        long j10 = hm1Var.f150192f;
        ryVar.getClass();
        ry ryVar2 = this.f154189d;
        long j11 = hm1Var.f150193g;
        ryVar2.getClass();
        return (j10 == hm1Var.f150192f && j11 == hm1Var.f150193g) ? hm1Var : new hm1(hm1Var.f150187a, hm1Var.f150188b, hm1Var.f150189c, hm1Var.f150190d, hm1Var.f150191e, j10, j11);
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f154187b.a(a(hm1Var));
        }
    }

    @Override // yads.pk0
    public final void c(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f154188c.c();
        }
    }

    @Override // yads.pk0
    public final void d(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f154188c.b();
        }
    }

    public final boolean e(int i10, ym1 ym1Var) {
        ym1 ym1VarA;
        int i11;
        if (ym1Var != null) {
            ym1VarA = this.f154189d.a(this.f154186a, ym1Var);
            if (ym1VarA == null) {
                return false;
            }
        } else {
            ym1VarA = null;
        }
        ym1 ym1Var2 = ym1VarA;
        this.f154189d.getClass();
        bn1 bn1Var = this.f154187b;
        if (bn1Var.f147285a == i10 && ib3.a(bn1Var.f147286b, ym1Var2)) {
            i11 = i10;
        } else {
            i11 = i10;
            this.f154187b = new bn1(this.f154189d.f152578c.f147287c, i11, ym1Var2, 0L);
        }
        ok0 ok0Var = this.f154188c;
        if (ok0Var.f153518a == i11 && ib3.a(ok0Var.f153519b, ym1Var2)) {
            return true;
        }
        this.f154188c = new ok0(this.f154189d.f152579d.f153520c, i11, ym1Var2);
        return true;
    }

    @Override // yads.pk0
    public final void b(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f154188c.d();
        }
    }

    @Override // yads.cn1
    public final void c(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f154187b.a(vf1Var, a(hm1Var));
        }
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f154188c.a();
        }
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f154187b.c(vf1Var, a(hm1Var));
        }
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, int i11) {
        if (e(i10, ym1Var)) {
            this.f154188c.a(i11);
        }
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, Exception exc) {
        if (e(i10, ym1Var)) {
            this.f154188c.a(exc);
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f154187b.b(vf1Var, a(hm1Var));
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var, IOException iOException, boolean z10) {
        if (e(i10, ym1Var)) {
            this.f154187b.a(vf1Var, a(hm1Var), iOException, z10);
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f154187b.b(a(hm1Var));
        }
    }
}
