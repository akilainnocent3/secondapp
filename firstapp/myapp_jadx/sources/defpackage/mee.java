package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmee;", "Lnq50;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$DeviceLogout;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mee extends nq50<OtpData.DeviceLogout> {
    public final pc80 H;
    public final ige I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mee(fq50 fq50Var, pc80 pc80Var, ige igeVar, rdd0 rdd0Var) {
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
        return b42.F1(this.I.i(str, z1().b, ((OtpData.DeviceLogout) B1()).d), new Function1() { // from class: lee
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                mee meeVar = this.a;
                meeVar.b = OtpData.DeviceLogout.a((OtpData.DeviceLogout) meeVar.B1(), oTPResult);
                return Unit.a;
            }
        });
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
        return this.H.a(otpSelection, z1().b, ((OtpData.DeviceLogout) B1()).c, ((OtpData.DeviceLogout) B1()).b, ((OtpData.DeviceLogout) B1()).a);
    }
}
