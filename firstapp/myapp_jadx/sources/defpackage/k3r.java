package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$special$$inlined$flatMapLatest$4", f = "LNPlaceBetViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class k3r extends tje0 implements gaj<myh<? super Boolean>, xsq.a, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Boolean> myhVar, xsq.a aVar, v1b<? super Unit> v1bVar) {
        k3r k3rVar = new k3r(3, v1bVar);
        k3rVar.b = myhVar;
        k3rVar.c = aVar;
        return k3rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh<Boolean> lyhVar = ((xsq.a) this.c).b;
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
