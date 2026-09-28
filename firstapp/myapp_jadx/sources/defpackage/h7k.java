package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.integrity.GetIntegrityVerdictUseCase", f = "GetIntegrityVerdictUseCase.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "invoke", v = 2)
public final class h7k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ g7k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7k(g7k g7kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = g7kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
