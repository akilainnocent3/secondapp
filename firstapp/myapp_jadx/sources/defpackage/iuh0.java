package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.domain.usecase.ValidateWithdrawAmountUseCase", f = "ValidateWithdrawAmountUseCase.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invoke", v = 2)
public final class iuh0 extends x1b {
    public BigDecimal a;
    public Integer b;
    public y300 c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ juh0 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuh0(juh0 juh0Var, x1b x1bVar) {
        super(x1bVar);
        this.f = juh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.b(null, null, null, this);
    }
}
