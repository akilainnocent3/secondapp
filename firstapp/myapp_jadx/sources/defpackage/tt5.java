package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.domain.usecase.CalculateWithdrawalFeeUseCase", f = "CalculateWithdrawalFeeUseCase.kt", l = {19}, m = "invoke", v = 2)
public final class tt5 extends x1b {
    public BigDecimal a;
    public Integer b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ut5 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt5(ut5 ut5Var, x1b x1bVar) {
        super(x1bVar);
        this.d = ut5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
