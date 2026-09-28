package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.common.framework.CompleteResultKt$asCompleteResults$3", f = "CompleteResult.kt", l = {29}, m = "invokeSuspend", v = 1)
public final class xm8 extends tje0 implements gaj<myh<? super an8<Object>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super an8<Object>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        xm8 xm8Var = new xm8(3, v1bVar);
        xm8Var.b = myhVar;
        xm8Var.c = th;
        return xm8Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (th == null) {
                an8.a aVar = an8.a.a;
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(aVar, this) == y5bVar) {
                    return y5bVar;
                }
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
