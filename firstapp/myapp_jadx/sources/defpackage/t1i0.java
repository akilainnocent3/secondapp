package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.security.sportypin.domain.usecase.VerifySportyPinForWithdrawBankUseCase", f = "VerifySportyPinForWithdrawBankUseCase.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 54}, m = "invoke", v = 2)
public final class t1i0 extends x1b {
    public boolean a;
    public Function1 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ u1i0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1i0(u1i0 u1i0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = u1i0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(false, null, this);
    }
}
