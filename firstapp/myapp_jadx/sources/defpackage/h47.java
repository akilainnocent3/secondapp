package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.avatar.ChangeAvatarViewModel$getAvatars$2", f = "ChangeAvatarViewModel.kt", l = {181}, m = "invokeSuspend", v = 2)
public final class h47 extends tje0 implements gaj<myh<? super lk50<? extends bp1>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends bp1>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        h47 h47Var = new h47(3, v1bVar);
        h47Var.b = myhVar;
        h47Var.c = th;
        return h47Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            lk50.a aVarA = gtc0.a(th, obj);
            this.b = null;
            this.c = th;
            this.a = 1;
            if (myhVar.emit(aVarA, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        itf0.a.a(a320.a("BO Config Error: ", th), new Object[0]);
        return Unit.a;
    }
}
