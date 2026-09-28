package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltySessionDataHandlerImpl", f = "SportyPenaltySessionDataHandlerImpl.kt", l = {61}, m = "userCheck", v = 2)
public final class o1d0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ p1d0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1d0(p1d0 p1d0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = p1d0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
