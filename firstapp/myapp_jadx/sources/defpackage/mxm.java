package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.account.international.data.model.INTRegisterResendResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.international.verify.INTVerifyViewModel$intRegisterResend$4", f = "INTVerifyViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class mxm extends tje0 implements gaj<myh<? super lk50<? extends BaseResponse<INTRegisterResendResponse>>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends BaseResponse<INTRegisterResendResponse>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        mxm mxmVar = new mxm(3, v1bVar);
        mxmVar.b = myhVar;
        mxmVar.c = th;
        return mxmVar.invokeSuspend(Unit.a);
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
            this.c = null;
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
        return Unit.a;
    }
}
