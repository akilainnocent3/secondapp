package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.domain.usecase.WithdrawAlertHintUseCase", f = "WithdrawAlertHintUseCase.kt", l = {113}, m = "getWithdrawDropAlertConfig", v = 2)
public final class ohj0 extends x1b {
    public Function1 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ phj0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohj0(phj0 phj0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = phj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0, 0, null, null, null, null, this);
    }
}
