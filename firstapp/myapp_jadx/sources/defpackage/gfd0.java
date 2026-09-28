package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportytv.usecase.SportyTvUseCase$addNotification$4", f = "SportyTvUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gfd0 extends tje0 implements Function2<lk50<? extends BaseResponse<xdp>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ yzw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfd0(yzw yzwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = yzwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gfd0 gfd0Var = new gfd0(this.b, v1bVar);
        gfd0Var.a = obj;
        return gfd0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BaseResponse<xdp>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((gfd0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.invoke(lk50Var);
        return Unit.a;
    }
}
