package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.usecase.CashOutSocketUseCase", f = "CashOutSocketUseCase.kt", l = {226}, m = "subscribeSocket", v = 2)
public final class tm6 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ sm6 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm6(sm6 sm6Var, x1b x1bVar) {
        super(x1bVar);
        this.b = sm6Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, this);
    }
}
