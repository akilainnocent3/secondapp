package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwv40;", "Lnq50;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$Register;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wv40 extends nq50<OtpData.Register> {
    public final pc80 H;
    public final ku40 I;
    public final ResourceUiText J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv40(fq50 fq50Var, pc80 pc80Var, ku40 ku40Var, rdd0 rdd0Var) {
        super(fq50Var, rdd0Var);
        rdd0Var.getClass();
        this.H = pc80Var;
        this.I = ku40Var;
        this.J = new ResourceUiText(R.string.common_otp_verify__continue_account_creation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq50
    public final lyh<lk50<Unit>> K1(String str) {
        str.getClass();
        return b42.F1(bm50.a(this.I.a((OtpData.Register) B1(), z1(), str)), new Function1() { // from class: vv40
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                wv40 wv40Var = this.a;
                wv40Var.b = OtpData.Register.a((OtpData.Register) wv40Var.B1(), oTPResult);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.nq50
    /* JADX INFO: renamed from: N1, reason: from getter */
    public final ResourceUiText getJ() {
        return this.J;
    }

    @Override // defpackage.nq50
    public final void P1(cp50 cp50Var) {
        cp50Var.getClass();
        if (cp50Var instanceof cp50.m) {
            I1(new ts40.k(0), k00.d);
        }
        super.P1(cp50Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq50
    public final lyh<lk50<OTPResponse>> Q1(OtpSelection otpSelection) {
        return this.H.a(otpSelection, z1().b, j6c.REGISTER, ((OtpData.Register) B1()).a, ((OtpData.Register) B1()).b);
    }
}
