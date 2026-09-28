package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$special$$inlined$flatMapLatest$7", f = "LNPlaceBetViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class n3r extends tje0 implements gaj<myh<? super y5q>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f2r d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3r(v1b v1bVar, f2r f2rVar) {
        super(3, v1bVar);
        this.d = f2rVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super y5q> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        n3r n3rVar = new n3r(v1bVar, this.d);
        n3rVar.b = myhVar;
        n3rVar.c = bool;
        return n3rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh v2rVar = ((Boolean) this.c).booleanValue() ? new v2r(this.d.N) : new gzh(y5q.a.a);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, v2rVar, this) == y5bVar) {
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
