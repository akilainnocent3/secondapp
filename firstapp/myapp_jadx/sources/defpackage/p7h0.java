package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$kycHintState$3", f = "TxListViewModel.kt", l = {195}, m = "invokeSuspend", v = 2)
public final class p7h0 extends tje0 implements gaj<myh<? super zsp>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super zsp> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        p7h0 p7h0Var = new p7h0(3, v1bVar);
        p7h0Var.b = myhVar;
        return p7h0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zsp zspVar = new zsp(null, 7);
            this.b = null;
            this.a = 1;
            if (myhVar.emit(zspVar, this) == y5bVar) {
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
