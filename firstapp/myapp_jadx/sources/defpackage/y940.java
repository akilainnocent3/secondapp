package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.BoostInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.realsports.RealSportsRepoImpl$getOddsBoostInfo$3", f = "RealSportsRepoImpl.kt", l = {109}, m = "invokeSuspend", v = 2)
public final class y940 extends tje0 implements gaj<myh<? super BaseResponse<BoostInfo>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super BaseResponse<BoostInfo>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        y940 y940Var = new y940(3, v1bVar);
        y940Var.b = myhVar;
        return y940Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            BaseResponse baseResponse = new BaseResponse();
            this.b = null;
            this.a = 1;
            if (myhVar.emit(baseResponse, this) == y5bVar) {
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
