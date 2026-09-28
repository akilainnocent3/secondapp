package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.usecase.GetDepositPaybillItemsUseCase", f = "GetDepositPaybillItemsUseCase.kt", l = {83}, m = "provideZmPayBillItems", v = 2)
public final class o5k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ l5k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5k(l5k l5kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = l5kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
