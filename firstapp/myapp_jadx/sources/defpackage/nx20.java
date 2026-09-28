package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.betslip.ProcessOneUpPromoBetSuccessUseCase", f = "ProcessOneUpPromoBetSuccessUseCase.kt", l = {87}, m = "claimAttribution", v = 2)
public final class nx20 extends x1b {
    public c9p a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lx20 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx20(lx20 lx20Var, x1b x1bVar) {
        super(x1bVar);
        this.c = lx20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
