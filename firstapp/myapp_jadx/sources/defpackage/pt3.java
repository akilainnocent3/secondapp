package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.data.repository.BetslipRepositoryImpl", f = "BetslipRepositoryImpl.kt", l = {14}, m = "getBetslipStaleOddsResumePolicy", v = 2)
public final class pt3 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ qt3 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt3(qt3 qt3Var, x1b x1bVar) {
        super(x1bVar);
        this.b = qt3Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
