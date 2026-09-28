package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$special$$inlined$flatMapLatest$3", f = "LNPlaceBetViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class j3r extends tje0 implements gaj<myh<? super Boolean>, xsq.a, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f2r d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3r(v1b v1bVar, f2r f2rVar) {
        super(3, v1bVar);
        this.d = f2rVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Boolean> myhVar, xsq.a aVar, v1b<? super Unit> v1bVar) {
        j3r j3rVar = new j3r(v1bVar, this.d);
        j3rVar.b = myhVar;
        j3rVar.c = aVar;
        return j3rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh<Boolean> lyhVar = ((xsq.a) this.c).a;
            wwd0 wwd0Var = this.d.b0;
            u2r u2rVar = new u2r(3, null);
            this.b = null;
            this.c = null;
            this.a = 1;
            h99.a(myhVar);
            Object objA = r78.a(this, myhVar, new o1i(u2rVar, null), q1i.a, new lyh[]{lyhVar, wwd0Var});
            if (objA != obj2) {
                objA = Unit.a;
            }
            if (objA != obj2) {
                objA = Unit.a;
            }
            if (objA == obj2) {
                return obj2;
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
