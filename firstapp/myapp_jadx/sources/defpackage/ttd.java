package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$insufficientFundsStateFlow$3", f = "DepositCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ttd extends tje0 implements jaj<DepositDropAlertStatus, AssetData.CardsBean, Boolean, Unit, v1b<? super Pair<? extends AssetData.CardsBean, ? extends Boolean>>, Object> {
    public /* synthetic */ AssetData.CardsBean a;
    public /* synthetic */ boolean b;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        AssetData.CardsBean cardsBean = this.a;
        boolean z = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(cardsBean, Boolean.valueOf(z));
    }

    @Override // defpackage.jaj
    public final Object l(DepositDropAlertStatus depositDropAlertStatus, AssetData.CardsBean cardsBean, Boolean bool, Unit unit, v1b<? super Pair<? extends AssetData.CardsBean, ? extends Boolean>> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        ttd ttdVar = new ttd(5, v1bVar);
        ttdVar.a = cardsBean;
        ttdVar.b = zBooleanValue;
        return ttdVar.invokeSuspend(Unit.a);
    }
}
