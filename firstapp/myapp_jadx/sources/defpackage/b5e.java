package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositOtherBanksViewModel$selectedSavedAssetFlow$1", f = "DepositOtherBanksViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b5e extends tje0 implements Function2<AssetData.AccountsBean, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ f5e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5e(f5e f5eVar, v1b<? super b5e> v1bVar) {
        super(2, v1bVar);
        this.b = f5eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b5e b5eVar = new b5e(this.b, v1bVar);
        b5eVar.a = obj;
        return b5eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AssetData.AccountsBean accountsBean, v1b<? super Unit> v1bVar) {
        return ((b5e) create(accountsBean, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String strA;
        AssetData.AccountsBean accountsBean = (AssetData.AccountsBean) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (accountsBean != null) {
            int i = kw1.a(accountsBean).a;
            f5e f5eVar = this.b;
            f5eVar.P1(i);
            wwd0 wwd0Var = f5eVar.E0;
            String accountNumber = accountsBean.getAccountNumber();
            if (accountNumber == null || (strA = fu5.a("\\d(?=\\d{4})", accountNumber, "*")) == null) {
                strA = "--";
            }
            wwd0Var.getClass();
            wwd0Var.k(null, strA);
            f5eVar.G0.setValue(accountsBean.getAccountName());
        }
        return Unit.a;
    }
}
