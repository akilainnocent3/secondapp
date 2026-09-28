package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.limits.local.LimitsDataStoreImpl", f = "LimitsDataStoreImpl.kt", l = {79}, m = "setUnreportedAppUsage", v = 2)
public final class vds extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ nds b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vds(nds ndsVar, x1b x1bVar) {
        super(x1bVar);
        this.b = ndsVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(0, this);
    }
}
