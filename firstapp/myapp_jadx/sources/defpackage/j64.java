package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj64;", "Lp0g;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$BioAuth;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j64 extends p0g<OtpData.BioAuth> {
    public final v74 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j64(v74 v74Var, rdd0 rdd0Var) {
        super(rdd0Var);
        v74Var.getClass();
        rdd0Var.getClass();
        this.w = v74Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<OTPResponse>> M1(OtpSelection otpSelection) {
        return this.w.a(otpSelection, z1().b, (OtpData.BioAuth) B1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<Unit>> O1(String str) {
        return b42.F1(bm50.a(this.w.b((OtpData.BioAuth) B1(), str, z1().b)), new i64(this, 0));
    }
}
