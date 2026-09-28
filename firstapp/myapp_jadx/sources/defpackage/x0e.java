package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx0e;", "Lx2a0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$PaymentCommonOtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x0e extends x2a0<OtpData.PaymentCommonOtpData> {
    public final u0e B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0e(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, u0e u0eVar, rdd0 rdd0Var) {
        super(oddVar, rdd0Var);
        rdd0Var.getClass();
        this.B = u0eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return this.B.a(otpSelection, z1().b, ((OtpData.PaymentCommonOtpData) B1()).b, ((OtpData.PaymentCommonOtpData) B1()).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<Unit>> P1(String str) {
        String str2 = z1().b;
        OtpData.PaymentCommonOtpData paymentCommonOtpData = (OtpData.PaymentCommonOtpData) B1();
        this.B.getClass();
        return u0e.b(str, str2, paymentCommonOtpData);
    }
}
