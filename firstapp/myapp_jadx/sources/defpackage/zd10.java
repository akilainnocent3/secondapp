package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.PixDepositStatusPollingUseCase", f = "PixDepositStatusPollingUseCase.kt", l = {63}, m = "fetchBankTradeData", v = 2)
public final class zd10 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ yd10 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd10(yd10 yd10Var, x1b x1bVar) {
        super(x1bVar);
        this.b = yd10Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
