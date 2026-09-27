package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cf2 implements ig2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.u1 f147718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kf2 f147719b;

    public cf2(u4.u1 u1Var, kf2 kf2Var) {
        this.f147718a = u1Var;
        this.f147719b = kf2Var;
    }

    @Override // yads.ig2
    public final long a() {
        kf2 kf2Var = this.f147719b;
        u4.y4 y4Var = kf2Var.f151523b;
        return this.f147718a.getContentPosition() - (!y4Var.z() ? y4Var.m(0, kf2Var.f151522a).q() : 0L);
    }
}
