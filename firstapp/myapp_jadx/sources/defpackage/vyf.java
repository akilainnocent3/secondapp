package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeOtpVerificationRequest;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvyf;", "Lnq50;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$EmailChange;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vyf extends nq50<OtpData.EmailChange> {
    public final pc80 H;
    public final c0i0 I;
    public final ResourceUiText J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyf(fq50 fq50Var, pc80 pc80Var, c0i0 c0i0Var, rdd0 rdd0Var) {
        super(fq50Var, rdd0Var);
        c0i0Var.getClass();
        rdd0Var.getClass();
        this.H = pc80Var;
        this.I = c0i0Var;
        this.J = new ResourceUiText(R.string.common_otp_verify__otp_verified);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq50
    public final lyh<lk50<Unit>> K1(String str) {
        str.getClass();
        EmailChangeOtpVerificationRequest emailChangeOtpVerificationRequest = new EmailChangeOtpVerificationRequest(str, z1().b, ((OtpData.EmailChange) B1()).d);
        c0i0 c0i0Var = this.I;
        c0i0Var.getClass();
        return b42.F1(bm50.a(c0i0Var.a.d(emailChangeOtpVerificationRequest)), new qd7(this, 2));
    }

    @Override // defpackage.nq50
    /* JADX INFO: renamed from: N1, reason: from getter */
    public final ResourceUiText getJ() {
        return this.J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq50
    public final lyh<lk50<OTPResponse>> Q1(OtpSelection otpSelection) {
        return this.H.a(otpSelection, z1().b, ((OtpData.EmailChange) B1()).c, ((OtpData.EmailChange) B1()).b, ((OtpData.EmailChange) B1()).a);
    }
}
