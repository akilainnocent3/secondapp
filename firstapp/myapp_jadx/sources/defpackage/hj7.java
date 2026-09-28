package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.usecase.CheckTransactionStatusUseCase", f = "CheckTransactionStatusUseCase.kt", l = {13}, m = "invoke", v = 2)
public final class hj7 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ij7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj7(ij7 ij7Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ij7Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
