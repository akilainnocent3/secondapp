package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.usecase.GetDepositPaybillItemsUseCase", f = "GetDepositPaybillItemsUseCase.kt", l = {38, 41}, m = "provideGhPaybillItems", v = 2)
public final class m5k extends x1b {
    public ChannelAsset a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l5k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5k(l5k l5kVar, x1b x1bVar) {
        super(x1bVar);
        this.c = l5kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
