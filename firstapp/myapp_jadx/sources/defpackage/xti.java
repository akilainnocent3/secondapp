package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.domain.usecase.FormatCurrencyAmountUseCase", f = "FormatCurrencyAmountUseCase.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "getSymbolMap", v = 2)
public final class xti extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ uti b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xti(uti utiVar, x1b x1bVar) {
        super(x1bVar);
        this.b = utiVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
