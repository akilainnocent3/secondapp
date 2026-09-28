package defpackage;

import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeOtpVerificationRequest;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzyf;", "Lx2a0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$EmailChange;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zyf extends x2a0<OtpData.EmailChange> {
    public final pc80 B;
    public final c0i0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyf(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, pc80 pc80Var, c0i0 c0i0Var, rdd0 rdd0Var) {
        super(oddVar, rdd0Var);
        c0i0Var.getClass();
        rdd0Var.getClass();
        this.B = pc80Var;
        this.C = c0i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return this.B.a(otpSelection, z1().b, ((OtpData.EmailChange) B1()).c, ((OtpData.EmailChange) B1()).b, ((OtpData.EmailChange) B1()).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<Unit>> P1(String str) {
        EmailChangeOtpVerificationRequest emailChangeOtpVerificationRequest = new EmailChangeOtpVerificationRequest(str, z1().b, ((OtpData.EmailChange) B1()).d);
        c0i0 c0i0Var = this.C;
        c0i0Var.getClass();
        return b42.F1(bm50.a(c0i0Var.a.d(emailChangeOtpVerificationRequest)), new Function1() { // from class: yyf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                zyf zyfVar = this.a;
                zyfVar.b = OtpData.EmailChange.a((OtpData.EmailChange) zyfVar.B1(), oTPResult);
                return Unit.a;
            }
        });
    }
}
