package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.withdraw.momo.CommonWithdrawConfirmFragment$initViewModel$1$7", f = "CommonWithdrawConfirmFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yk8 extends tje0 implements Function2<pdd0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ zk8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk8(zk8 zk8Var, v1b<? super yk8> v1bVar) {
        super(2, v1bVar);
        this.b = zk8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yk8 yk8Var = new yk8(this.b, v1bVar);
        yk8Var.a = obj;
        return yk8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(pdd0 pdd0Var, v1b<? super Unit> v1bVar) {
        return ((yk8) create(pdd0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pdd0 pdd0Var = (pdd0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (pdd0Var instanceof ygj0) {
            rdd0 rdd0Var = this.b.i;
            if (rdd0Var == null) {
                Intrinsics.n("sportyTrackingUseCase");
                throw null;
            }
            rdd0Var.a(ygj0.e((ygj0) pdd0Var, gag.ME, "mobilemoney"), k00.d);
        }
        return Unit.a;
    }
}
