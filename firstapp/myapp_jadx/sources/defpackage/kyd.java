package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.usecase.DepositDropAlertUseCase", f = "DepositDropAlertUseCase.kt", l = {22}, m = "invoke", v = 2)
public final class kyd extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ lyd b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyd(lyd lydVar, x1b x1bVar) {
        super(x1bVar);
        this.b = lydVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(0, null, null, this);
    }
}
