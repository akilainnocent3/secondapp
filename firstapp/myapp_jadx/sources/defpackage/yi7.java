package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.usecase.CheckLastTransactionUseCase", f = "CheckLastTransactionUseCase.kt", l = {19}, m = "invoke", v = 2)
public final class yi7 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ zi7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi7(zi7 zi7Var, x1b x1bVar) {
        super(x1bVar);
        this.b = zi7Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(0, 0, null, null, this);
    }
}
