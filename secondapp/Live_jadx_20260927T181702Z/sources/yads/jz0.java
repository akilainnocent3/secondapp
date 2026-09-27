package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jz0 extends rr.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f151319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f151320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kz0 f151321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f151322e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(kz0 kz0Var, or.f fVar) {
        super(fVar);
        this.f151321d = kz0Var;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f151320c = obj;
        this.f151322e |= Integer.MIN_VALUE;
        return this.f151321d.a(null, false, this);
    }
}
