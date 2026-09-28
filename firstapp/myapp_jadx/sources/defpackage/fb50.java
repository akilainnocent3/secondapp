package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.account.international.data.model.INTRegisterResendResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.signup.domain.RequestNewEmailVerificationCodeUseCase$invoke$result$3", f = "RequestNewEmailVerificationCodeUseCase.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class fb50 extends tje0 implements gaj<myh<? super lk50<? extends INTRegisterResendResponse>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends INTRegisterResendResponse>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        fb50 fb50Var = new fb50(3, v1bVar);
        fb50Var.b = myhVar;
        fb50Var.c = th;
        return fb50Var.invokeSuspend(Unit.a);
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
