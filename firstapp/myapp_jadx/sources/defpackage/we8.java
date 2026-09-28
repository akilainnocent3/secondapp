package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositFragment$initViewModel$1$3", f = "CommonMobileMoneyDepositFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class we8 extends tje0 implements Function2<pdd0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ re8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we8(re8 re8Var, v1b<? super we8> v1bVar) {
        super(2, v1bVar);
        this.b = re8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        we8 we8Var = new we8(this.b, v1bVar);
        we8Var.a = obj;
        return we8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(pdd0 pdd0Var, v1b<? super Unit> v1bVar) {
        return ((we8) create(pdd0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pdd0 pdd0Var = (pdd0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (pdd0Var instanceof qnd) {
            re8 re8Var = this.b;
            rdd0 rdd0Var = re8Var.D;
            if (rdd0Var == null) {
                Intrinsics.n("sportyTrackingUseCase");
                throw null;
            }
            rdd0Var.a(qnd.e((qnd) pdd0Var, tj5.b(re8Var), "mobilemoney", null, null, null, null, 16373), k00.d);
        }
        return Unit.a;
    }
}
