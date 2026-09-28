package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.DepositWithdrawDelegateImpl", f = "DepositWithdrawDelegate.kt", l = {191}, m = "refreshAmountLimits", v = 2)
public final class eae extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ w9e b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eae(w9e w9eVar, x1b x1bVar) {
        super(x1bVar);
        this.b = w9eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, this);
    }
}
