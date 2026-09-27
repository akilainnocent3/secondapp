package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class hx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pl2 f150334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f150335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f150336c;

    public hx2(pl2 pl2Var, long j10, long j11) {
        this.f150334a = pl2Var;
        this.f150335b = j10;
        this.f150336c = j11;
    }

    public pl2 a(lo2 lo2Var) {
        return this.f150334a;
    }

    public final long a() {
        return ib3.a(this.f150336c, 1000000L, this.f150335b);
    }
}
