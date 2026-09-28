package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.security.graylist.domain.usecase.CheckAuditStatusUseCase$getGrayListFlow$2", f = "CheckAuditStatusUseCase.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class yh7 extends tje0 implements gaj<myh<? super ng50<AssetsInfo>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super ng50<AssetsInfo>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        yh7 yh7Var = new yh7(3, v1bVar);
        yh7Var.b = myhVar;
        return yh7Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ng50.a aVar = new ng50.a("api failed", 6, null);
            this.b = null;
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
