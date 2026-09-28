package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.domain.usecase.ValidateWithdrawAmountUseCase", f = "ValidateWithdrawAmountUseCase.kt", l = {56, 58, 72}, m = "getValidation", v = 2)
public final class huh0 extends x1b {
    public BigDecimal a;
    public Integer b;
    public BigDecimal c;
    public BigDecimal d;
    public BigDecimal e;
    public BigDecimal f;
    public /* synthetic */ Object i;
    public final /* synthetic */ juh0 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huh0(juh0 juh0Var, x1b x1bVar) {
        super(x1bVar);
        this.v = juh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, null, null, null, this);
    }
}
