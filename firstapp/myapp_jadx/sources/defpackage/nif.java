package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawViewModel$initSavedAssetsState$1", f = "EFTWithdrawViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nif extends tje0 implements Function2<lk50<? extends List<? extends AssetData.AccountsBean>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ sif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nif(sif sifVar, v1b<? super nif> v1bVar) {
        super(2, v1bVar);
        this.b = sifVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nif nifVar = new nif(this.b, v1bVar);
        nifVar.a = obj;
        return nifVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends AssetData.AccountsBean>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((nif) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            sif sifVar = this.b;
            wwd0 wwd0Var = sifVar.Y0;
            Boolean boolValueOf = Boolean.valueOf(((List) ((lk50.c) lk50Var).a).isEmpty());
            wwd0Var.getClass();
            wwd0Var.k(null, boolValueOf);
            wwd0 wwd0Var2 = sifVar.a1;
            jo50 jo50Var = new jo50();
            wwd0Var2.getClass();
            wwd0Var2.k(null, jo50Var);
        }
        return Unit.a;
    }
}
