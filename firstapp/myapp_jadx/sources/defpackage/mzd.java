package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositEWalletViewModel$initDepositProcessResult$1", f = "DepositEWalletViewModel.kt", l = {295}, m = "invokeSuspend", v = 2)
public final class mzd extends tje0 implements Function2<x7e, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vzd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzd(vzd vzdVar, v1b<? super mzd> v1bVar) {
        super(2, v1bVar);
        this.c = vzdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mzd mzdVar = new mzd(this.c, v1bVar);
        mzdVar.b = obj;
        return mzdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x7e x7eVar, v1b<? super Unit> v1bVar) {
        return ((mzd) create(x7eVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        x7e x7eVar = (x7e) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            vzd vzdVar = this.c;
            if ((vzdVar.D0.a.getValue() instanceof xi7.b) && (x7eVar instanceof x7e.d) && !(x7eVar instanceof x7e.d.q)) {
                ku90<Unit> ku90Var = vzdVar.C0;
                Unit unit = Unit.a;
                this.b = null;
                this.a = 1;
                if (ku90Var.a.emit(unit, this) == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
