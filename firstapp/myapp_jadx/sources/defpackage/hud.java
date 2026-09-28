package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.pocket.deposit.CardStatusData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$savedCardDepositableFlow$1", f = "DepositCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hud extends tje0 implements kaj<AssetData.CardsBean, CardStatusData, String, lod, ncx, v1b<? super Boolean>, Object> {
    public /* synthetic */ AssetData.CardsBean a;
    public /* synthetic */ CardStatusData b;
    public /* synthetic */ String c;
    public /* synthetic */ lod d;
    public /* synthetic */ ncx e;

    public hud(v1b<? super hud> v1bVar) {
        super(6, v1bVar);
    }

    @Override // defpackage.kaj
    public final Object f(AssetData.CardsBean cardsBean, CardStatusData cardStatusData, String str, lod lodVar, ncx ncxVar, v1b<? super Boolean> v1bVar) {
        hud hudVar = new hud(v1bVar);
        hudVar.a = cardsBean;
        hudVar.b = cardStatusData;
        hudVar.c = str;
        hudVar.d = lodVar;
        hudVar.e = ncxVar;
        return hudVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        AssetData.CardsBean cardsBean = this.a;
        CardStatusData cardStatusData = this.b;
        String str = this.c;
        lod lodVar = this.d;
        ncx ncxVar = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (cardsBean == null) {
            return Boolean.FALSE;
        }
        if ((cardStatusData == null || !cardStatusData.getCardExisted()) && (str == null || str.length() != 3)) {
            return Boolean.FALSE;
        }
        if (Intrinsics.g(lodVar, lod.e.a)) {
            return ncxVar.b ? Boolean.FALSE : Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
