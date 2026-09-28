package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.usecase.PaymentUseCase$getWithdrawInfo$4", f = "PaymentUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class la00 extends tje0 implements Function2<lk50<? extends BaseResponse<WithDrawInfo>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ Function1<lk50<? extends BaseResponse<WithDrawInfo>>, Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public la00(Function1<? super lk50<? extends BaseResponse<WithDrawInfo>>, Unit> function1, v1b<? super la00> v1bVar) {
        super(2, v1bVar);
        this.b = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        la00 la00Var = new la00(this.b, v1bVar);
        la00Var.a = obj;
        return la00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BaseResponse<WithDrawInfo>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((la00) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<? extends BaseResponse<WithDrawInfo>> lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.invoke(lk50Var);
        return Unit.a;
    }
}
