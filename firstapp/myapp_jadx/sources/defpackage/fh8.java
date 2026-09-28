package defpackage;

import com.sporty.android.core.model.pocket.common.PayHintData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.paybill.CommonPaybillViewModel$getPaybillContentConfigFromBo$1", f = "CommonPaybillViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fh8 extends tje0 implements Function2<lk50<? extends PayHintData.PayHintEntity>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hh8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh8(hh8 hh8Var, v1b<? super fh8> v1bVar) {
        super(2, v1bVar);
        this.b = hh8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fh8 fh8Var = new fh8(this.b, v1bVar);
        fh8Var.a = obj;
        return fh8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends PayHintData.PayHintEntity> lk50Var, v1b<? super Unit> v1bVar) {
        return ((fh8) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        PayHintData.PayHintEntity payHintEntity;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if ((lk50Var instanceof lk50.c) && (payHintEntity = (PayHintData.PayHintEntity) ((lk50.c) lk50Var).a) != null) {
            this.b.f.m(payHintEntity);
        }
        return Unit.a;
    }
}
