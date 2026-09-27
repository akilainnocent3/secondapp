package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pd2 extends rr.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f153895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud2 f153896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f153897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd2(ud2 ud2Var, or.f fVar) {
        super(fVar);
        this.f153896c = ud2Var;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f153895b = obj;
        this.f153897d |= Integer.MIN_VALUE;
        return this.f153896c.a(0L, this);
    }
}
