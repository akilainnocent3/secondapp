package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.domain.usecase.hint.GetShouldShowDeviceManagementHintInProfileUseCaseImpl$invoke$3", f = "GetShouldShowDeviceManagementHintInProfileUseCaseImpl.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class udk extends tje0 implements gaj<myh<? super Boolean>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Boolean> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        udk udkVar = new udk(3, v1bVar);
        udkVar.b = myhVar;
        udkVar.c = th;
        return udkVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            itf0.a.d(inm.a("Tooltip check failed: ", th.getMessage()), new Object[0]);
            Boolean bool = Boolean.FALSE;
            this.b = null;
            this.c = null;
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
