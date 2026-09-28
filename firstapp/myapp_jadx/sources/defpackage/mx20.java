package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.betslip.ProcessOneUpPromoBetSuccessUseCase", f = "ProcessOneUpPromoBetSuccessUseCase.kt", l = {105}, m = "claim", v = 2)
public final class mx20 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ lx20 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx20(lx20 lx20Var, x1b x1bVar) {
        super(x1bVar);
        this.b = lx20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
