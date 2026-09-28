package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$shouldShowMultiPhoneNewFeatHintFlow$1", f = "DepositCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jud extends tje0 implements gaj<List<? extends AssetData.CardsBean>, Boolean, v1b<? super Boolean>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ boolean b;

    @Override // defpackage.gaj
    public final Object invoke(List<? extends AssetData.CardsBean> list, Boolean bool, v1b<? super Boolean> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        jud judVar = new jud(3, v1bVar);
        judVar.a = list;
        judVar.b = zBooleanValue;
        return judVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = this.a;
        boolean z = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(!list.isEmpty() && z);
    }
}
