package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.usecase.GetPendingDepositsUseCase", f = "GetPendingDepositsUseCase.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "invoke-gIAlu-s", v = 2)
public final class oak extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ lak b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oak(lak lakVar, x1b x1bVar) {
        super(x1bVar);
        this.b = lakVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(0, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
