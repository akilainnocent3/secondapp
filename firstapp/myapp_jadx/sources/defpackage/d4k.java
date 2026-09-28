package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.usecase.GetChannelAssetByChannelSendNameUseCase", f = "GetChannelAssetByChannelSendNameUseCase.kt", l = {51}, m = "getChannelAssetBySendName", v = 2)
public final class d4k extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c4k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4k(c4k c4kVar, x1b x1bVar) {
        super(x1bVar);
        this.c = c4kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
