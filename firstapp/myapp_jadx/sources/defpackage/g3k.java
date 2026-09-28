package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.GetBannerUseCase$invoke$$inlined$flatMapLatest$1", f = "GetBannerUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class g3k extends tje0 implements gaj<myh<? super jxp>, lk50<? extends kmq>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i3k d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3k(v1b v1bVar, i3k i3kVar) {
        super(3, v1bVar);
        this.d = i3kVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super jxp> myhVar, lk50<? extends kmq> lk50Var, v1b<? super Unit> v1bVar) {
        g3k g3kVar = new g3k(v1bVar, this.d);
        g3kVar.b = myhVar;
        g3kVar.c = lk50Var;
        return g3kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            kmq kmqVar = (kmq) bm50.i((lk50) this.c);
            lyh or60Var = kmqVar != null ? new or60(new h3k(kmqVar, this.d, null)) : new gzh(null);
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
