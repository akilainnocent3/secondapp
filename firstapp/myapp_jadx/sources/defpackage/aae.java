package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.DepositWithdrawDelegateImpl", f = "DepositWithdrawDelegate.kt", l = {113}, m = "getTopHintMessage", v = 2)
public final class aae extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ w9e c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aae(w9e w9eVar, x1b x1bVar) {
        super(x1bVar);
        this.c = w9eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, this);
    }
}
