package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.editbet.presentation.viewmodel.EditBetHistoryPopupViewModel$getEditBetHistoryList$2", f = "EditBetHistoryPopupViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dnf extends tje0 implements Function2<lk50<? extends uf00<? extends vpf>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ enf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnf(enf enfVar, v1b<? super dnf> v1bVar) {
        super(2, v1bVar);
        this.b = enfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dnf dnfVar = new dnf(this.b, v1bVar);
        dnfVar.a = obj;
        return dnfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends uf00<? extends vpf>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((dnf) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, lk50Var));
        return Unit.a;
    }
}
