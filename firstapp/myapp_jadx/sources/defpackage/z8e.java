package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.DepositUiProcess", f = "DepositUiProcess.kt", l = {413}, m = "processTradeStatusRedirect", v = 2)
public final class z8e extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ f9e b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8e(f9e f9eVar, x1b x1bVar) {
        super(x1bVar);
        this.b = f9eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(null, this);
    }
}
