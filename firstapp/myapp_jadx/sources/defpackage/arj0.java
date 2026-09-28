package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.domain.usecase.WithdrawUseCaseLegacy", f = "WithdrawUseCaseLegacy.kt", l = {RuntimeVersion.MINOR, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 43, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invoke", v = 2)
public final class arj0 extends x1b {
    public WithdrawRequest a;
    public Object b;
    public BaseResponse c;
    public xoj0.b.g d;
    public /* synthetic */ Object e;
    public final /* synthetic */ brj0 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arj0(brj0 brj0Var, x1b x1bVar) {
        super(x1bVar);
        this.f = brj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, null, null, this);
    }
}
