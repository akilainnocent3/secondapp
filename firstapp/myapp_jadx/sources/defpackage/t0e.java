package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.security.otp.TradingOTPResult;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.feature.payment.addNewNumber.DepositMomoAddNewNumberOtpUseCase$wrapResult$1", f = "DepositMomoAddNewNumberOtpUseCase.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class t0e extends tje0 implements Function2<myh<? super lk50<? extends Unit>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ OtpData.PaymentCommonOtpData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0e(String str, String str2, OtpData.PaymentCommonOtpData paymentCommonOtpData, v1b<? super t0e> v1bVar) {
        super(2, v1bVar);
        this.c = str;
        this.d = str2;
        this.e = paymentCommonOtpData;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t0e t0eVar = new t0e(this.c, this.d, this.e, v1bVar);
        t0eVar.b = obj;
        return t0eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends Unit>> myhVar, v1b<? super Unit> v1bVar) {
        return ((t0e) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.e.d = new OTPResult.Success(new TradingOTPResult(this.c, this.d, false, 4, null));
            lk50.c cVar = new lk50.c(Unit.a);
            this.b = null;
            this.a = 1;
            if (myhVar.emit(cVar, this) == y5bVar) {
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
