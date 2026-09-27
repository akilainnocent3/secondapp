package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class df2 implements jg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re.l4 f148202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lf2 f148203b;

    public df2(re.l4 l4Var, lf2 lf2Var) {
        this.f148202a = l4Var;
        this.f148203b = lf2Var;
    }

    @Override // yads.jg2
    public final long a() {
        lf2 lf2Var = this.f148203b;
        re.y7 y7Var = lf2Var.f151969b;
        return this.f148202a.getContentPosition() - (!y7Var.w() ? y7Var.j(0, lf2Var.f151968a).r() : 0L);
    }
}
