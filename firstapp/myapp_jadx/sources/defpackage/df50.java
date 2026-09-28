package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sportybet.android.account.international.data.model.INTResetPwdCheckResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.android.account.international.resetpwd.ResetPwdConfirmViewModel$intResetPwdConfirm$4", f = "ResetPwdConfirmViewModel.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class df50 extends tje0 implements gaj<myh<? super lk50<? extends BaseResponse<INTResetPwdCheckResponse>>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends BaseResponse<INTResetPwdCheckResponse>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        df50 df50Var = new df50(3, v1bVar);
        df50Var.b = myhVar;
        df50Var.c = th;
        return df50Var.invokeSuspend(Unit.a);
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
                ib5.a(yFmFZvuWxAYfEj.XirVGLNoAbjDSiX);
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
