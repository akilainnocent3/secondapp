package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositFragment$initViewModel$1$14", f = "CommonMobileMoneyDepositFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ve8 extends tje0 implements Function2<uw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ re8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve8(re8 re8Var, v1b<? super ve8> v1bVar) {
        super(2, v1bVar);
        this.b = re8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ve8 ve8Var = new ve8(this.b, v1bVar);
        ve8Var.a = obj;
        return ve8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(uw uwVar, v1b<? super Unit> v1bVar) {
        return ((ve8) create(uwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        uw uwVar = (uw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        re8.a aVar = re8.P;
        re8 re8Var = this.b;
        re8Var.n0().C.E(uwVar.a);
        re8Var.n0().C.setVisibility(uwVar.b ? 0 : 8);
        return Unit.a;
    }
}
