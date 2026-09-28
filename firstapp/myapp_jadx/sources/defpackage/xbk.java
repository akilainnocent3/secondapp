package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetPlaceBetConfigFlowUseCase$invoke$refreshTriggers$4", f = "GetPlaceBetConfigFlowUseCase.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class xbk extends tje0 implements gaj<myh<? super qcn<? extends g7q>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super qcn<? extends g7q>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        xbk xbkVar = new xbk(3, v1bVar);
        xbkVar.b = myhVar;
        return xbkVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            n1a0 n1a0Var = n1a0.c;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(n1a0Var, this) == y5bVar) {
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
