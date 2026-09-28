package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.security.otp.domain.usecase.VerifyBankTradeOtpUseCase", f = "VerifyBankTradeOtpUseCase.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 71}, m = "invoke", v = 2)
public final class jyh0 extends x1b {
    public Function1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kyh0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyh0(kyh0 kyh0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = kyh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, this);
    }
}
