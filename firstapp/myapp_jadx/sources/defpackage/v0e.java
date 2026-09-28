package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv0e;", "Lnq50;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$PaymentCommonOtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v0e extends nq50<OtpData.PaymentCommonOtpData> {
    public final u0e H;
    public final ResourceUiText I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0e(fq50 fq50Var, u0e u0eVar, rdd0 rdd0Var) {
        super(fq50Var, rdd0Var);
        rdd0Var.getClass();
        this.H = u0eVar;
        this.I = new ResourceUiText(R.string.common_otp_verify__otp_verified);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq50
    public final lyh<lk50<Unit>> K1(String str) {
        str.getClass();
        String str2 = z1().b;
        OtpData.PaymentCommonOtpData paymentCommonOtpData = (OtpData.PaymentCommonOtpData) B1();
        this.H.getClass();
        return u0e.b(str, str2, paymentCommonOtpData);
    }

    @Override // defpackage.nq50
    /* JADX INFO: renamed from: N1, reason: from getter */
    public final ResourceUiText getI() {
        return this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq50
    public final lyh<lk50<OTPResponse>> Q1(OtpSelection otpSelection) {
        return this.H.a(otpSelection, z1().b, ((OtpData.PaymentCommonOtpData) B1()).b, ((OtpData.PaymentCommonOtpData) B1()).a);
    }
}
