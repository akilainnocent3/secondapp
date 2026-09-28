package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.domain.usecase.GetGiftDisplayDataUseCase$asResultCatching$2", f = "GetGiftDisplayDataUseCase.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class t6k extends tje0 implements gaj<myh<? super zi50<Object>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super zi50<Object>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        t6k t6kVar = new t6k(3, v1bVar);
        t6kVar.b = myhVar;
        t6kVar.c = th;
        return t6kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zi50.a aVar = zi50.b;
            zi50 zi50Var = new zi50(uj50.a(th));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (myhVar.emit(zi50Var, this) == y5bVar) {
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
