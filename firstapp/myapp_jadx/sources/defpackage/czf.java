package defpackage;

import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeOtpVerificationRequest;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lczf;", "Lecf0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$EmailChange;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class czf extends ecf0<OtpData.EmailChange> {
    public final c0i0 A;
    public final pc80 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czf(pc80 pc80Var, c0i0 c0i0Var, rdd0 rdd0Var) {
        super(rdd0Var);
        c0i0Var.getClass();
        rdd0Var.getClass();
        this.z = pc80Var;
        this.A = c0i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecf0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return this.z.a(otpSelection, z1().b, ((OtpData.EmailChange) B1()).c, ((OtpData.EmailChange) B1()).b, ((OtpData.EmailChange) B1()).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecf0
    public final lyh<lk50<Unit>> P1(String str) {
        EmailChangeOtpVerificationRequest emailChangeOtpVerificationRequest = new EmailChangeOtpVerificationRequest(str, z1().b, ((OtpData.EmailChange) B1()).d);
        c0i0 c0i0Var = this.A;
        c0i0Var.getClass();
        return b42.F1(bm50.a(c0i0Var.a.d(emailChangeOtpVerificationRequest)), new udb(this, 1));
    }
}
