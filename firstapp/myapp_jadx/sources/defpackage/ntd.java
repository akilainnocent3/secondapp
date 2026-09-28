package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$depositableStateFlow$1", f = "DepositCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ntd extends tje0 implements iaj<List<? extends AssetData.CardsBean>, Boolean, Boolean, v1b<? super Boolean>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;

    @Override // defpackage.iaj
    public final Object d(List<? extends AssetData.CardsBean> list, Boolean bool, Boolean bool2, v1b<? super Boolean> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        ntd ntdVar = new ntd(4, v1bVar);
        ntdVar.a = list;
        ntdVar.b = zBooleanValue;
        ntdVar.c = zBooleanValue2;
        return ntdVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!list.isEmpty()) {
            z = z2;
        }
        return Boolean.valueOf(z);
    }
}
