package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.EnsureBetslipPrerequisitesUseCase", f = "EnsureBetslipPrerequisitesUseCase.kt", l = {73}, m = "getCachedTaxConfigsOrNull", v = 2)
public final class s7g extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ n7g b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7g(n7g n7gVar, x1b x1bVar) {
        super(x1bVar);
        this.b = n7gVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
