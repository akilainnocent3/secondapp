package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.domain.usecase.TxDateRangeNewFeatureAlertUseCase$getNewFeatureHintUiState$1", f = "TxDateRangeNewFeatureAlertUseCase.kt", l = {20}, m = "invokeSuspend", v = 2)
public final class z0h0 extends tje0 implements gaj<myh<? super Boolean>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Boolean> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        z0h0 z0h0Var = new z0h0(3, v1bVar);
        z0h0Var.b = myhVar;
        return z0h0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Boolean bool = Boolean.FALSE;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(bool, this) == y5bVar) {
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
