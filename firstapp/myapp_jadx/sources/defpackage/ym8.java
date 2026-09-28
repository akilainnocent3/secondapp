package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.common.framework.CompleteResultKt$asCompleteResults$4", f = "CompleteResult.kt", l = {32}, m = "invokeSuspend", v = 1)
public final class ym8 extends tje0 implements gaj<myh<? super an8<Object>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super an8<Object>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        ym8 ym8Var = new ym8(3, v1bVar);
        ym8Var.b = myhVar;
        ym8Var.c = th;
        return ym8Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            an8.b bVar = new an8.b(th);
            this.b = null;
            this.c = th;
            this.a = 1;
            if (myhVar.emit(bVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        itf0.a aVar = itf0.a;
        aVar.a(e40.a(aVar, "asResult", "Results Failure ", th), new Object[0]);
        return Unit.a;
    }
}
