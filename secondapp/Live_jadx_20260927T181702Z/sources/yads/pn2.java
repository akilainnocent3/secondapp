package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pn2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e72 f154002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final un2 f154003c;

    public pn2(e72 e72Var, un2 un2Var) {
        this.f154002b = e72Var;
        this.f154003c = un2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f154002b.f148546b.setVisibility(4);
        this.f154003c.f156520a.setVisibility(0);
    }
}
