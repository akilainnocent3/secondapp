package defpackage;

import com.sporty.android.core.model.account.AccountInfo;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.EnsureBetslipPrerequisitesUseCase", f = "EnsureBetslipPrerequisitesUseCase.kt", l = {104}, m = "getCachedAccountOrNull", v = 2)
public final class q7g extends x1b {
    public AccountInfo a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n7g c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7g(n7g n7gVar, x1b x1bVar) {
        super(x1bVar);
        this.c = n7gVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(false, this);
    }
}
