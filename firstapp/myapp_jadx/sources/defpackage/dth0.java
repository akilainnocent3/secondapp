package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.usecase.ValidateDepositAmountUseCase", f = "ValidateDepositAmountUseCase.kt", l = {20, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invoke", v = 2)
public final class dth0 extends x1b {
    public BigDecimal a;
    public /* synthetic */ Object b;
    public final /* synthetic */ eth0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dth0(eth0 eth0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = eth0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
