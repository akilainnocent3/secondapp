package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class b62 implements ay0, m62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d62 f147090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lr2 f147091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f147092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lw f147093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yv f147094e;

    public b62(d62 d62Var, lr2 lr2Var, Long l10, lw lwVar, yv yvVar) {
        this.f147090a = d62Var;
        this.f147091b = lr2Var;
        this.f147092c = l10;
        this.f147093d = lwVar;
        this.f147094e = yvVar;
    }

    @Override // yads.m62
    public final void a(long j10, long j11) {
        if (this.f147094e.a()) {
            lw lwVar = this.f147093d;
            lwVar.f152174b = j11;
            long j12 = j11 + lwVar.f152173a;
            Long l10 = this.f147092c;
            if (l10 == null || j12 < l10.longValue()) {
                return;
            }
            this.f147091b.a();
            c();
        }
    }

    @Override // yads.m62
    public final void b() {
        if (this.f147094e.a()) {
            this.f147091b.a();
            c();
        }
    }

    public final void c() {
        this.f147090a.f148086a.remove(this);
    }

    @Override // yads.ay0
    public final void invalidate() {
        c();
    }

    @Override // yads.ay0
    public final void start() {
        Long l10;
        this.f147090a.f148086a.add(this);
        if (!this.f147094e.a() || (l10 = this.f147092c) == null || this.f147093d.f152173a < l10.longValue()) {
            return;
        }
        this.f147091b.a();
        c();
    }

    @Override // yads.m62
    public final void a() {
        this.f147091b.a();
        c();
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }
}
