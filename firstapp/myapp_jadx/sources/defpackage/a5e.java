package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositOtherBanksViewModel$savedAssetsStateFlow$2$2", f = "DepositOtherBanksViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a5e extends tje0 implements Function2<lk50<? extends List<? extends AssetData.AccountsBean>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ f5e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5e(f5e f5eVar, v1b<? super a5e> v1bVar) {
        super(2, v1bVar);
        this.b = f5eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a5e a5eVar = new a5e(this.b, v1bVar);
        a5eVar.a = obj;
        return a5eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends AssetData.AccountsBean>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((a5e) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list;
        String strA;
        f5e f5eVar = this.b;
        wwd0 wwd0Var = f5eVar.A0;
        wwd0 wwd0Var2 = f5eVar.y0;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar == null || (list = (List) cVar.a) == null) {
            return Unit.a;
        }
        AssetData.AccountsBean accountsBean = (AssetData.AccountsBean) wwd0Var2.getValue();
        if (accountsBean != null && !list.contains(accountsBean)) {
            f5eVar.N1();
        }
        AssetData.AccountsBean accountsBean2 = (AssetData.AccountsBean) CollectionsKt.firstOrNull(list);
        if (accountsBean2 != null) {
            wwd0 wwd0Var3 = f5eVar.E0;
            if (wwd0Var.getValue() == null && ((CharSequence) wwd0Var3.getValue()).length() == 0) {
                jw1 jw1VarA = kw1.a(accountsBean2);
                wwd0Var.getClass();
                wwd0Var.k(null, jw1VarA);
                String accountNumber = accountsBean2.getAccountNumber();
                if (accountNumber == null || (strA = fu5.a("\\d(?=\\d{4})", accountNumber, "*")) == null) {
                    strA = "--";
                }
                wwd0Var3.getClass();
                wwd0Var3.k(null, strA);
                wwd0Var2.getClass();
                wwd0Var2.k(null, accountsBean2);
            }
        }
        return Unit.a;
    }
}
