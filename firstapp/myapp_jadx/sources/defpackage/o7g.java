package defpackage;

import com.sporty.android.core.model.account.AccountInfo;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.EnsureBetslipPrerequisitesUseCase", f = "EnsureBetslipPrerequisitesUseCase.kt", l = {110, 115, 118, 128}, m = "getAccount", v = 2)
public final class o7g extends x1b {
    public boolean a;
    public String b;
    public AccountInfo c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ n7g f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7g(n7g n7gVar, x1b x1bVar) {
        super(x1bVar);
        this.f = n7gVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(false, this);
    }
}
