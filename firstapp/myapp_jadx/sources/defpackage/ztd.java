package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel", f = "DepositCardViewModel.kt", l = {546, 547}, m = "requestDeleteCard", v = 2)
public final class ztd extends x1b {
    public AssetData.CardsBean a;
    public tud b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tud d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztd(tud tudVar, x1b x1bVar) {
        super(x1bVar);
        this.d = tudVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.W1(null, this);
    }
}
