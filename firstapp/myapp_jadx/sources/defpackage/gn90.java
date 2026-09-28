package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.SimulationRepoImpl", f = "SimulationRepoImpl.kt", l = {22}, m = "createTicket-0E7RQCE", v = 2)
public final class gn90 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ln90 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn90(ln90 ln90Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ln90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
