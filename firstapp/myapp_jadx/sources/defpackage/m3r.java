package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$special$$inlined$flatMapLatest$6", f = "LNPlaceBetViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class m3r extends tje0 implements gaj<myh<? super uf00<? extends zsq>>, List<? extends lyh<? extends zsq>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super uf00<? extends zsq>> myhVar, List<? extends lyh<? extends zsq>> list, v1b<? super Unit> v1bVar) {
        m3r m3rVar = new m3r(3, v1bVar);
        m3rVar.b = myhVar;
        m3rVar.c = list;
        return m3rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            List list = (List) this.c;
            lyh gzhVar = list.isEmpty() ? new gzh(n1a0.c) : new a3r((lyh[]) CollectionsKt.A0(list).toArray(new lyh[0]));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
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
