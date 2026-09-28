package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldce;", "Lnq50;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$DeviceBlocking;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dce extends nq50<OtpData.DeviceBlocking> {
    public final pc80 H;
    public final ige I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dce(fq50 fq50Var, pc80 pc80Var, ige igeVar, rdd0 rdd0Var) {
        super(fq50Var, rdd0Var);
        igeVar.getClass();
        rdd0Var.getClass();
        this.H = pc80Var;
        this.I = igeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq50
    public final lyh<lk50<Unit>> K1(String str) {
        str.getClass();
        return b42.F1(this.I.c(str, z1().b, ((OtpData.DeviceBlocking) B1()).d), new cce(this, 0));
    }

    @Override // defpackage.nq50
    /* JADX INFO: renamed from: N1 */
    public final ResourceUiText getI() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_otp_verify__otp_reverse_verify_success_general_content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq50
    public final lyh<lk50<OTPResponse>> Q1(OtpSelection otpSelection) {
        return this.H.a(otpSelection, z1().b, ((OtpData.DeviceBlocking) B1()).c, ((OtpData.DeviceBlocking) B1()).b, ((OtpData.DeviceBlocking) B1()).a);
    }
}
