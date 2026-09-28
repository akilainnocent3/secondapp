package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$special$$inlined$flatMapLatest$5", f = "LNPlaceBetViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class l3r extends tje0 implements gaj<myh<? super dqh0>, xsq.a, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super dqh0> myhVar, xsq.a aVar, v1b<? super Unit> v1bVar) {
        l3r l3rVar = new l3r(3, v1bVar);
        l3rVar.b = myhVar;
        l3rVar.c = aVar;
        return l3rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh<dqh0> lyhVar = ((xsq.a) this.c).c;
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVar, this) == y5bVar) {
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
