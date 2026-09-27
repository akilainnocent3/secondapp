package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c62 implements ay0, m62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d62 f147597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f147598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z3 f147599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tj2 f147600d;

    public c62(d62 d62Var, z3 z3Var, tj2 tj2Var, Long l10) {
        this.f147597a = d62Var;
        this.f147598b = l10;
        this.f147599c = z3Var;
        this.f147600d = tj2Var;
    }

    @Override // yads.m62
    public final void a(long j10, long j11) {
        tj2 tj2Var = this.f147600d;
        if (tj2Var != null) {
            tj2Var.a(j10, j11);
        }
        Long l10 = this.f147598b;
        if (l10 == null || j11 <= l10.longValue()) {
            return;
        }
        tj2 tj2Var2 = this.f147600d;
        if (tj2Var2 != null) {
            tj2Var2.a();
        }
        z3 z3Var = this.f147599c;
        if (z3Var != null) {
            z3Var.b();
        }
        this.f147597a.f148086a.remove(this);
        this.f147599c = null;
        this.f147600d = null;
    }

    @Override // yads.m62
    public final void b() {
        tj2 tj2Var = this.f147600d;
        if (tj2Var != null) {
            tj2Var.a();
        }
        z3 z3Var = this.f147599c;
        if (z3Var != null) {
            z3Var.b();
        }
        this.f147597a.f148086a.remove(this);
        this.f147599c = null;
        this.f147600d = null;
    }

    @Override // yads.ay0
    public final void invalidate() {
        this.f147597a.f148086a.remove(this);
        this.f147599c = null;
        this.f147600d = null;
    }

    @Override // yads.ay0
    public final void start() {
        this.f147597a.f148086a.add(this);
    }

    @Override // yads.m62
    public final void a() {
        z3 z3Var = this.f147599c;
        if (z3Var != null) {
            z3Var.a();
        }
        this.f147599c = null;
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }
}
