package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ez0 extends rr.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f148888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz0 f148889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f148890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez0(fz0 fz0Var, or.f fVar) {
        super(fVar);
        this.f148889c = fz0Var;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f148888b = obj;
        this.f148890d |= Integer.MIN_VALUE;
        return this.f148889c.a(false, this);
    }
}
