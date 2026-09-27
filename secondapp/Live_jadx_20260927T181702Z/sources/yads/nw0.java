package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nw0 extends rr.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rw0 f153232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dn2 f153233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f153234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rw0 f153235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f153236f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(rw0 rw0Var, or.f fVar) {
        super(fVar);
        this.f153235e = rw0Var;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f153234d = obj;
        this.f153236f |= Integer.MIN_VALUE;
        return this.f153235e.a(null, this);
    }
}
