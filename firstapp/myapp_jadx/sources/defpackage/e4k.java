package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.usecase.GetChannelAssetByChannelSendNameUseCase", f = "GetChannelAssetByChannelSendNameUseCase.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "getSupportChannels", v = 2)
public final class e4k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ c4k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4k(c4k c4kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = c4kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
