package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.GetLotteryFlowUseCase$invoke$$inlined$flatMapLatest$1", f = "GetLotteryFlowUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class y7k extends tje0 implements gaj<myh<? super avq>, avq, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b8k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7k(v1b v1bVar, b8k b8kVar) {
        super(3, v1bVar);
        this.d = b8kVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super avq> myhVar, avq avqVar, v1b<? super Unit> v1bVar) {
        y7k y7kVar = new y7k(v1bVar, this.d);
        y7kVar.b = myhVar;
        y7kVar.c = avqVar;
        return y7kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            or60 or60Var = this.d.a.f.d;
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, or60Var, this) == y5bVar) {
                return y5bVar;
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
