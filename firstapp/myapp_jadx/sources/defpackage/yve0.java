package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$3", f = "TGInitDataFlowUseCase.kt", l = {121}, m = "invokeSuspend", v = 1)
public final class yve0 extends tje0 implements gaj<myh<? super q4l>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super q4l> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        yve0 yve0Var = new yve0(3, v1bVar);
        yve0Var.b = myhVar;
        yve0Var.c = th;
        return yve0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            q4l.a aVar = new q4l.a(th);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (myhVar.emit(aVar, this) == y5bVar) {
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
