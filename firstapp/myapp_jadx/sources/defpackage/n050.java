package defpackage;

import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.validation.presentation.RegistrationValidationViewModel$handleSuccessfulOTPVerificationWithDeferredFacialRecognition$2", f = "RegistrationValidationViewModel.kt", l = {243}, m = "invokeSuspend", v = 2)
public final class n050 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ s050 b;
    public final /* synthetic */ OTPCompleteResult c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n050(s050 s050Var, OTPCompleteResult oTPCompleteResult, v1b<? super n050> v1bVar) {
        super(2, v1bVar);
        this.b = s050Var;
        this.c = oTPCompleteResult;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n050(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n050) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s050 s050Var = this.b;
            b390 b390Var = s050Var.c;
            String str = s050Var.z1().a;
            OTPCompleteResult oTPCompleteResult = this.c;
            k050.d dVar = new k050.d(new vqm(str, oTPCompleteResult.getUserId(), oTPCompleteResult.getAccessToken(), oTPCompleteResult.getRefreshToken(), (Long) null, (String) null, (Integer) null, oTPCompleteResult.getCountryCode(), oTPCompleteResult.getCurrency(), oTPCompleteResult.getLanguage(), oTPCompleteResult.getPhoneCountryCode(), 0L, 4208));
            this.a = 1;
            if (b390Var.emit(dVar, this) == y5bVar) {
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
