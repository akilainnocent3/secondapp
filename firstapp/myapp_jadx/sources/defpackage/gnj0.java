package defpackage;

import com.sporty.android.core.model.security.otp.CheckIsTrustedDeviceResponse;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lgnj0;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$PaymentCommonOtpData;", "Lnxg0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gnj0 extends c7z<OtpData.PaymentCommonOtpData> implements nxg0 {
    public final rr10 A;
    public final inj0 B;
    public final oxg0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnj0(v8w v8wVar, rr10 rr10Var, inj0 inj0Var, oxg0 oxg0Var, rdd0 rdd0Var) {
        super(v8wVar, rdd0Var);
        v8wVar.getClass();
        oxg0Var.getClass();
        rdd0Var.getClass();
        this.A = rr10Var;
        this.B = inj0Var;
        this.C = oxg0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nxg0
    public final lyh<lk50<Unit>> J() {
        OtpData.PaymentCommonOtpData paymentCommonOtpData = (OtpData.PaymentCommonOtpData) B1();
        this.B.getClass();
        return new or60(new hnj0("", "", true, paymentCommonOtpData, null));
    }

    @Override // defpackage.c7z
    public final lyh<String> P1() {
        rr10 rr10Var = this.A;
        rr10Var.getClass();
        return ozh.c(new or60(new qr10(rr10Var, null)), rr10Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.B.a(otpSelection, z1().b, ((OtpData.PaymentCommonOtpData) B1()).b, ((OtpData.PaymentCommonOtpData) B1()).a);
    }

    @Override // defpackage.nxg0
    public final lyh<CheckIsTrustedDeviceResponse> z() {
        return this.C.a(j6c.WITHDRAW);
    }
}
